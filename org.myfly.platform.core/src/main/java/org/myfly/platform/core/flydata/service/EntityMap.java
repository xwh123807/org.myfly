package org.myfly.platform.core.flydata.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.entity.MDRelationFieldDefinition;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.ClassUtil;
import org.myfly.platform.core.utils.EntityClassUtil;
import org.springframework.util.Assert;
import org.springframework.util.Base64Utils;

/**
 * 用于实体新增，修改时传递属性值，而不是字段名称
 * 
 * @author xiangwanhong
 *
 * @param <T>
 */
public class EntityMap extends LinkedHashMap<String, String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8541813318000368514L;

	public EntityMap() {
	}

	/**
	 * 批量增加值对
	 * 
	 * @param keys
	 * @param values
	 */
	public EntityMap(String[] keys, String values[]) {
		Assert.notEmpty(keys);
		Assert.notEmpty(values);
		Assert.isTrue(keys.length == values.length);
		for (int index = 0; index < keys.length; index++) {
			put(keys[index], values[index]);
		}
	}

	public EntityMap(Map<String, String> values) {
		super(values);
	}

	/**
	 * 从Form表单提交数据中构建实体EntityMap
	 * 
	 * @param params
	 * @return
	 */
	public static EntityMap build(Map<String, String[]> params) {
		EntityMap map = new EntityMap();
		for (Map.Entry<String, String[]> param : params.entrySet()) {
			if (ArrayUtils.isNotEmpty(param.getValue())) {
				map.put(param.getKey(), param.getValue()[0]);
			} else {
				map.put(param.getKey(), null);
			}
		}
		return map;
	}

	/**
	 * 从实体对象中构建实体EntityMap
	 * 
	 * @param entity
	 * @return
	 */
	public static EntityMap build(Object entity) {
		EntityMap map = new EntityMap();
		EntityClassUtil.getEntityFieldInfo(entity.getClass()).values().forEach(field -> {
			Object value = null;
			try {
				value = field.getGetter().invoke(entity);
			} catch (Exception e) {
			}
			if (value != null) {
				String toStr = null;
				if (value instanceof byte[]) {
					toStr = Base64Utils.encodeToString((byte[]) value);
				} else {
					toStr = ClassUtil.convertValueToString(value);
				}
				map.put(field.getField().getName(), toStr);
			}
		});
		return map;
	}

	public <T> T newEntity(final String entityName, final String uid) {
		Assert.hasLength(entityName);
		return newEntity(getEntityMetaData(entityName), uid);
	}

	private EntityMetaData getEntityMetaData(String entityName) {
		Assert.hasLength(entityName);
		return AppUtil.getEntityMetaData(entityName);
	}

	/**
	 * 根据值对创建实体类
	 * 
	 * @param metaData
	 * @return
	 */
	public <T> T newEntity(EntityMetaData metaData, final String uid) {
		Assert.notNull(metaData);
		T entity = metaData.newEntityInstance();

		for (EntityFieldDefinition field : metaData.getAllFields()) {
			if (containsKey(field.getName())) {
				field.getValueHandler().setFieldValue(entity, get(field.getName()));
			}
		}

		if (StringUtils.isNotBlank(uid)) {
			metaData.getPkFieldDefinition().getValueHandler().setFieldValue(entity, uid);
		}

		return entity;
	}

	public <T> T newSubEntity(final String entityName, String uid, String subTableAttr, String subUid) {
		Assert.hasLength(entityName);
		Assert.hasLength(uid);
		Assert.hasLength(subTableAttr);
		return newSubEntity(getEntityMetaData(entityName), uid, subTableAttr, subUid);
	}

	/**
	 * 根据值对创建子实体
	 * 
	 * @param metaData
	 * @param uid
	 * @param subTableAttr
	 * @param subUid
	 * @return
	 */
	public <T> T newSubEntity(EntityMetaData metaData, String uid, String subTableAttr, String subUid) {
		EntityMetaData subMetaData = metaData.getSubEntityMetaData(subTableAttr);
		MDRelationFieldDefinition subField = metaData.getField(subTableAttr);
		T entity = newEntity(subMetaData, subUid);
		T master = newEntity(metaData, uid);
		subMetaData.getField(subField.getRelationField()).getValueHandler().setFieldValue(entity, master);
		return entity;
	}

	public <T> void mergeEntity(String entityName, T entity) {
		mergeEntity(getEntityMetaData(entityName), entity);
	}

	/**
	 * 将值对合并到entity中
	 * 
	 * @param entityName
	 * @param entity
	 */
	public <T> void mergeEntity(EntityMetaData metaData, T entity) {
		for (EntityFieldDefinition field : metaData.getAllFields()) {
			if (containsKey(field.getName())) {
				field.getValueHandler().setFieldValue(entity, get(field.getName()));
			}
		}
	}
}
