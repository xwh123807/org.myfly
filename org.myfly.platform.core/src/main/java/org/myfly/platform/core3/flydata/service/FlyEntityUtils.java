package org.myfly.platform.core3.flydata.service;

import java.util.HashMap;
import java.util.Map;

import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.core3.metadata.define.FlyFieldDefinition;

public class FlyEntityUtils {
	/**
	 * 将实体json反序列化为实体对象
	 * 
	 * @param metaData
	 * @param jsonEntity
	 * @return
	 */
	public static IFlyEntity toEntity(FlyDataModel metaData, String jsonEntity) {
		FlyEntityMap result = JSONUtil.fromJSON(jsonEntity, FlyEntityMap.class);
		return toEntity(metaData, result);
	}

	/**
	 * 将FlyEntity转化为实体类对象
	 * 
	 * @param metaData
	 * @param flyEntity
	 * @return
	 */
	public static IFlyEntity toEntity(FlyDataModel metaData, FlyEntityMap flyEntity) {
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
	private static IFlyEntity getCachedEntity(FlyDataModel metaData, IFlyEntity entity, boolean isNew) {
		String uid = ((IFlyEntity)entity).getUid();
		String key = metaData.getApiName() + "_" + uid;
		if (isNew || !localEntityCache.get().containsKey(key)) {
			// 新增模式或缓存中不存在
			localEntityCache.get().put(key, entity);
			return null;
		} else {
			return (IFlyEntity) localEntityCache.get().get(key);
		}
	}

	/**
	 * 更新缓存，修改和合并实体时，需要刷新缓存
	 * 
	 * @param metaData
	 * @param entity
	 */
	@SuppressWarnings("unchecked")
	private static void mergeCachedEntity(FlyDataModel metaData, IFlyEntity entity) {
		String uid = ((IFlyEntity)entity).getUid();
		String key = metaData.getApiName() + "_" + uid;
		localEntityCache.get().put(key, entity);
	}

	/**
	 * 将Map转换为实体类对象
	 * 
	 * @param metaData
	 * @param flyEntity
	 * @param isNew
	 *            是新增模式调用，还是修改模式调用
	 * @return
	 */
	public static IFlyEntity toEntity(FlyDataModel metaData, Map<String, Object> flyEntity, boolean isNew) {
		IFlyEntity entity = metaData.newEntityInstance();
		metaData.getFlyFields().values().forEach(field -> {
			// 主键字段已经在对象构建时设置了值，此处跳过不重复设置
			if (flyEntity.containsKey(field.getApiName())) {
				Object value = flyEntity.get(field.getApiName());
				field.getValueHandler().setFieldValue(entity, value);
			}
		});
		return entity;
		
		
//		IFlyEntity entity = metaData.newEntityInstance(flyEntity);
//		IFlyEntity cacheEntity = getCachedEntity(metaData, entity, isNew);
//		if (cacheEntity != null) {
//			return cacheEntity;
//		}
//		metaData.getFlyFields().values().forEach(field -> {
//			// 主键字段已经在对象构建时设置了值，此处跳过不重复设置
//			if (flyEntity.containsKey(field.getApiName())) {
//				Object value = flyEntity.get(field.getApiName());
//				field.getValueHandler().setFieldValue(entity, value);
//			}
//		});
//		return entity;
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
	public static IFlyEntity mergeEntity(FlyDataModel metaData, IFlyEntity entity, Map flyEntity, boolean isAllMerge) {
		mergeCachedEntity(metaData, entity);
		metaData.getFlyFields().values().forEach(field -> {
			// 主键字段已经在对象构建时设置了值，此处跳过不重复设置
			if (isAllMerge || flyEntity.containsKey(field.getApiName())) {
				// 全覆盖或属性有修改
				Object value = flyEntity.get(field.getApiName());
				// Object oldValue = field.getValueHandler().getFieldValue(entity);
				field.getValueHandler().setFieldValue(entity, value);
			}
		});
		return entity;
	}

	/**
	 * 将实体类转换为FlyEntityResult3
	 * 
	 * @param metaData
	 * @param entityObj
	 * @return
	 */
	public static FlyEntityMap fromEntity(FlyDataModel metaData, Object entityObj) {
		FlyEntityMap result = new FlyEntityMap();
		for (FlyFieldDefinition field : metaData.getFlyFields().values()) {
			result.put(field.getApiName(), field.getValueHandler().getFieldValue(entityObj));
		}
		return result;
	}

	/**
	 * 将实体类转换为FlyEntityResult3
	 * 
	 * @param entityObj
	 * @return
	 */
	public static FlyEntityMap fromEntity(Object entityObj) {
		return fromEntity(AppUtil.getFlyDataModel(entityObj.getClass().getName()), entityObj);
	}

	/**
	 * 合并
	 * 
	 * @param entity1
	 * @param entity2
	 * @return
	 */
	public static FlyEntityMap merge(FlyEntityMap entity1, FlyEntityMap entity2) {
		FlyEntityMap result = new FlyEntityMap(entity1);
		result.putAll(entity2);
		return result;
	}

}