package org.myfly.platform.core.flydata.service;

import java.util.HashMap;
import java.util.Map;

import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.entity.RelationFieldDefinition;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.JSONUtil;

/**
 * 数据查询结果集<br>
 * 1、字段为实体属性，而非数据库字段；<br>
 * 2、对数据类型增强，增加返回字段，如枚举、关联；增强字段都为对象类型，附加其他属性；<br>
 * 3、支持对象级联，包含1对1、1对多；<br>
 * 4、子表是否级联取数，可以通过参数控制；<br>
 * 
 * @author xiangwanhong
 *
 */
public class FlyEntityResult extends HashMap<String, Object> {

	/**
	 * @param from
	 */
	public FlyEntityResult(HashMap<String, Object> from) {
		putAll(from);
	}
	
	public FlyEntityResult() {
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -2325038605071598391L;

	/**
	 * 序列化为json
	 * 
	 * @return
	 */
	public String toJson() {
		return JSONUtil.toJSON(this);
	}
	
	/**
	 * 同clone
	 * @return
	 */
	public FlyEntityResult copy() {
		return JSONUtil.fromJSON(toJson(), FlyEntityResult.class);
	}

	/**
	 * 打印json
	 */
	public void printJson() {
		System.out.println(toJson());
	}

	/**
	 * 将FlyEntity转换为实体类
	 * 
	 * @param entityName
	 * @return
	 */
	public <T> T toEntity(String entityName) {
		EntityMetaData metaData = AppUtil.getEntityMetaData(entityName);
		return toEntity(metaData, this);
	}

	/**
	 * 将实体json反序列化为实体对象
	 * 
	 * @param metaData
	 * @param jsonEntity
	 * @return
	 */
	public static <T> T toEntity(EntityMetaData metaData, String jsonEntity) {
		FlyEntityResult result = JSONUtil.fromJSON(jsonEntity, FlyEntityResult.class);
		return toEntity(metaData, result);
	}

	/**
	 * 将FlyEntity转化为实体类对象
	 * 
	 * @param metaData
	 * @param flyEntity
	 * @return
	 */
	public static <T> T toEntity(EntityMetaData metaData, FlyEntityResult flyEntity) {
		return toEntity(metaData, (Map<String, Object>) flyEntity, true);
	}

	@SuppressWarnings("rawtypes")
	private static ThreadLocal<Map> localEntityCache = new ThreadLocal<Map>() {
		protected Map initialValue() {
			return new HashMap<>();
		};
	};
	
	/**
	 * 清除所有线程缓存实体
	 */
	private static void clearCachedEntity() {
		localEntityCache.get().clear();
	}

	/**
	 * 从缓存中获取实体，key为entityName-uid
	 * 
	 * @param metaData
	 * @param entity
	 * @param isNew
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private static <T> T getCachedEntity(EntityMetaData metaData, T entity, boolean isNew) {
		String uid = metaData.getPkFieldDefinition().getPKValue(entity);
		String key = metaData.getEntityName() + "_" + uid;
		if (isNew || !localEntityCache.get().containsKey(key)) {
			//新增模式或缓存中不存在
			localEntityCache.get().put(key, entity);
			return null;
		} else {
			return (T) localEntityCache.get().get(key);
		}
	}

	/**
	 * 更新缓存，修改和合并实体时，需要刷新缓存
	 * @param metaData
	 * @param entity
	 */
	@SuppressWarnings("unchecked")
	private static <T> void mergeCachedEntity(EntityMetaData metaData, T entity) {
		String uid = metaData.getPkFieldDefinition().getPKValue(entity);
		String key = metaData.getEntityName() + "_" + uid;
		localEntityCache.get().put(key, entity);
	}

	/**
	 * 将Map转换为实体类对象
	 * 
	 * @param metaData
	 * @param flyEntity
	 * @param isNew	是新增模式调用，还是修改模式调用
	 * @return
	 */
	public static <T> T toEntity(EntityMetaData metaData, Map<String, Object> flyEntity, boolean isNew) {
		T entity = metaData.newEntityInstance(flyEntity);
		T cacheEntity = getCachedEntity(metaData, entity, isNew);
		if (cacheEntity != null) {
			return cacheEntity;
		}
		metaData.getFieldMap().values().forEach(field -> {
			// 主键字段已经在对象构建时设置了值，此处跳过不重复设置
			if (!field.isIdField() && flyEntity.containsKey(field.getName())) {
				Object value = flyEntity.get(field.getName());
				field.getValueHandler().setFieldValue(entity, value);
			}
		});
		return entity;
	}

	/**
	 * 合并实体，用于实体修改场景构造修改实体
	 * 
	 * @param metaData
	 * @param entity
	 *            原实体
	 * @param flyEntity
	 *            需合并覆盖的属性
	 * @param isAllMerge
	 *            是否全覆盖，没有的属性设为null
	 * @return
	 */
	public static <T> T mergeEntity(EntityMetaData metaData, T entity, Map flyEntity, boolean isAllMerge) {
		mergeCachedEntity(metaData, entity);
		metaData.getFieldMap().values().forEach(field -> {
			// 主键字段已经在对象构建时设置了值，此处跳过不重复设置
			if (!field.isIdField()) {
				if (isAllMerge || flyEntity.containsKey(field.getName())) {
					// 全覆盖或属性有修改
					Object value = flyEntity.get(field.getName());
					// Object oldValue = field.getValueHandler().getFieldValue(entity);
					field.getValueHandler().setFieldValue(entity, value);
				}
			}
		});
		return entity;
	}

	/**
	 * 只处理健值，其他属性忽略
	 * 
	 * @param metaData
	 * @param flyEntity
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T toSearchRelationEntity(EntityMetaData metaData, Map<String, Object> flyEntity) {
		T entity = metaData.newEntityInstance(flyEntity);
		String uid = metaData.getPkFieldDefinition().getPKValue(entity);
		String key = metaData.getEntityName() + "_" + uid;
		if (localEntityCache.get().containsKey(key)) {
			return (T) localEntityCache.get().get(key);
		} else {
			localEntityCache.get().put(key, entity);
		}
		return entity;
	}

	/**
	 * 将实体类转换为FlyEntityResult
	 * 
	 * @param metaData
	 * @param entityObj
	 * @return
	 */
	public static FlyEntityResult fromEntity(EntityMetaData metaData, Object entityObj) {
		FlyEntityResult result = new FlyEntityResult();
		for (EntityFieldDefinition field : metaData.getFieldMap().values()) {
			result.put(field.getName(), field.getValueHandler().getFieldValue(entityObj));
		}
		return result;
	}

	/**
	 * 将实体类转换为FlyEntityResult
	 * 
	 * @param entityObj
	 * @return
	 */
	public static FlyEntityResult fromEntity(Object entityObj) {
		return fromEntity(AppUtil.getEntityMetaData(entityObj.getClass().getName()), entityObj);
	}

	/**
	 * 将SearchRelation关联实体转换为FlyEntityResult
	 * 
	 * @param field
	 * @param relEntity
	 * @return
	 */
	public static FlyEntityResult formSearchRelationEntity(RelationFieldDefinition field, Object relEntity) {
		FlyEntityResult result = new FlyEntityResult();
		result.put("uid", field.getRelationEntityMetaData().getPkFieldDefinition().getPKValue(relEntity));
		result.put("title", field.getRelationEntityLabelField().getValueHandler().getFieldValue(relEntity));
		return result;
	}

	/**
	 * 合并
	 * 
	 * @param entity1
	 * @param entity2
	 * @return
	 */
	public static FlyEntityResult merge(FlyEntityResult entity1, FlyEntityResult entity2) {
		FlyEntityResult result = new FlyEntityResult(entity1);
		result.putAll(entity2);
		return result;
	}
}
