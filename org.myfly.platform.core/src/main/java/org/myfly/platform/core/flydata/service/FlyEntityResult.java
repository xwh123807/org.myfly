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
	 * 打印json
	 */
	public void printJson() {
		System.out.println(toJson());
	}
	
	/**
	 * 将FlyEntity转换为实体类
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
	 * @param metaData
	 * @param flyEntity
	 * @return
	 */
	public static <T> T toEntity(EntityMetaData metaData, FlyEntityResult flyEntity) {
		return toEntity(metaData, (Map<String, Object>)flyEntity, true);
	}
	
	private static ThreadLocal<Map> localEntityCache = new ThreadLocal<Map>() {
		protected Map initialValue() {
			return new HashMap<>();
		};
	};
	
	/**
	 * 将Map转换为实体类对象
	 * @param metaData
	 * @param flyEntity
	 * @param isNewThread
	 * @return
	 */
	public static <T> T toEntity(EntityMetaData metaData, Map<String, Object> flyEntity, boolean isNewThread) {
		T entity = metaData.newEntityInstance(flyEntity);
		String uid = metaData.getPkFieldDefinition().getPKValue(entity);
		String key = metaData.getEntityName() + "_" + uid;
		if (isNewThread) {
			localEntityCache.get().clear();
		}
		if (localEntityCache.get().containsKey(key)) {
			return (T) localEntityCache.get().get(key);
		}else {
			localEntityCache.get().put(key, entity);
		}
		metaData.getFieldMap().values().forEach(field -> {
			//主键字段已经在对象构建时设置了值，此处跳过不重复设置
			if (!field.isIdField() && flyEntity.containsKey(field.getName())) {
				Object value = flyEntity.get(field.getName());
				if (value != null) {
					field.getValueHandler().setFieldValue(entity, value);
				}
			}
		});
		return entity;
	}
	
	/**
	 * 只处理健值，其他属性忽略
	 * @param metaData
	 * @param flyEntity
	 * @return
	 */
	public static <T> T toSearchRelationEntity(EntityMetaData metaData, Map<String, Object> flyEntity) {
		T entity = metaData.newEntityInstance(flyEntity);
		String uid = metaData.getPkFieldDefinition().getPKValue(entity);
		String key = metaData.getEntityName() +"_" + uid;
		if (localEntityCache.get().containsKey(key)) {
			return (T) localEntityCache.get().get(key);
		}else {
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
}
