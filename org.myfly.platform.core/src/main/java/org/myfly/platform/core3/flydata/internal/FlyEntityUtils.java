package org.myfly.platform.core3.flydata.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import org.apache.commons.lang3.ArrayUtils;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.flydata.service.FlyEntityMap;
import org.myfly.platform.core3.metadata.define.ValueHandlerFactory;
import org.myfly.platform.core3.metadata.service.IFlyColumn;
import org.myfly.platform.core3.metadata.service.IFlyDataModel;

public class FlyEntityUtils {
	/**
	 * 将实体json反序列化为实体对象
	 * 
	 * @param metaData
	 * @param jsonEntity
	 * @return
	 */
	public static IFlyEntity toEntity(IFlyDataModel metaData, String jsonEntity) {
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
	public static IFlyEntity toEntity(IFlyDataModel metaData, FlyEntityMap flyEntity) {
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
	private static IFlyEntity getCachedEntity(IFlyDataModel metaData, IFlyEntity entity, boolean isNew) {
		String uid = ((IFlyEntity) entity).getUid();
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
	private static void mergeCachedEntity(IFlyDataModel metaData, IFlyEntity entity) {
		String uid = ((IFlyEntity) entity).getUid();
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
	public static IFlyEntity toEntity(IFlyDataModel metaData, Map<String, Object> flyEntity, boolean isNew) {
		IFlyEntity entity = FlyEntityUtils.newInstance(metaData.getApiName());
		metaData.getColumns().forEach(field -> {
			// 主键字段已经在对象构建时设置了值，此处跳过不重复设置
			if (flyEntity.containsKey(field.getApiName())) {
				Object value = flyEntity.get(field.getApiName());
				AppUtil.getColumnValueHandler(field).setFieldValue(entity, value);
			}
		});
		return entity;

		// IFlyEntity entity = metaData.newEntityInstance(flyEntity);
		// IFlyEntity cacheEntity = getCachedEntity(metaData, entity, isNew);
		// if (cacheEntity != null) {
		// return cacheEntity;
		// }
		// metaData.getFlyFields().values().forEach(field -> {
		// // 主键字段已经在对象构建时设置了值，此处跳过不重复设置
		// if (flyEntity.containsKey(field.getApiName())) {
		// Object value = flyEntity.get(field.getApiName());
		// field.getValueHandler().setFieldValue(entity, value);
		// }
		// });
		// return entity;
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
	public static IFlyEntity mergeEntity(IFlyDataModel metaData, IFlyEntity entity, Map flyEntity, boolean isAllMerge) {
		mergeCachedEntity(metaData, entity);
		metaData.getColumns().forEach(field -> {
			// 主键字段已经在对象构建时设置了值，此处跳过不重复设置
			if (isAllMerge || flyEntity.containsKey(field.getApiName())) {
				// 全覆盖或属性有修改
				Object value = flyEntity.get(field.getApiName());
				// Object oldValue = field.getValueHandler().getFieldValue(entity);
				AppUtil.getColumnValueHandler(field).setFieldValue(entity, value);
			}
		});
		return entity;
	}

	/**
	 * 判断子表是否需要转换处理
	 * 
	 * @param dataModel
	 * @param hasSubTable
	 * @param subTableAttrs
	 * @return
	 */
	public static Map<String, Boolean> subTableNeedConvert(IFlyDataModel dataModel, boolean hasSubTable,
			String[] subTableAttrs) {
		Map<String, Boolean> result = new HashMap<>();
		dataModel.getColumns().stream().filter(column -> FlyDataType.SubTable.equals(column.getDataType()))
				.forEach(subTable -> {
					boolean isNotNeed = !hasSubTable
							|| (hasSubTable && !ArrayUtils.contains(subTableAttrs, subTable.getApiName()));
					if (!isNotNeed) {
						result.put(subTable.getApiName(), false);
					}
				});
		return result;
	}

	/**
	 * 将实体类转换为FlyEntityMap
	 * 
	 * @param dataModel
	 * @param item
	 * @param hasSubTable
	 *            是否转换子表
	 * @param subTableAttrs
	 *            需要转换的子表，为空表示所有子表
	 * @return
	 */
	public static FlyEntityMap fromEntity(IFlyDataModel dataModel, Object entityObj, boolean hasSubTable,
			String[] subTableAttrs) {
		if (entityObj == null) {
			return null;
		}
		FlyEntityMap result = new FlyEntityMap();
		for (IFlyColumn field : dataModel.getColumns()) {
			boolean isNeed = true;
			if (FlyDataType.SubTable.equals(field.getDataType())) {
				isNeed = hasSubTable
						&& (subTableAttrs == null || ArrayUtils.contains(subTableAttrs, field.getApiName()));
			}
			// 是子表类型，且hasSubTable=false或者hasSubTable=true且不需要处理
			if (isNeed) {
				result.put(field.getApiName(), AppUtil.getColumnValueHandler(field).getFieldValue(entityObj));
			}
		}
		return result;
	}

	/**
	 * 将实体类转换为FlyEntityResult3
	 * 
	 * @param metaData
	 * @param entityObj
	 * @return
	 */
	public static FlyEntityMap fromEntity(IFlyDataModel dataModel, Object entityObj) {
		if (entityObj == null) {
			return null;
		}
		FlyEntityMap result = new FlyEntityMap();
		for (IFlyColumn field : dataModel.getColumns()) {
			result.put(field.getApiName(), AppUtil.getColumnValueHandler(field).getFieldValue(entityObj));
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

	/**
	 * 创建实体类
	 * 
	 * @param entityClass
	 * @return
	 */
	public static <T extends IFlyEntity> T newInstance(String entityClassName) {
		try {
			return (T) Class.forName(entityClassName).newInstance();
		} catch (Exception e) {
			throw new IllegalArgumentException("创建实体类[" + entityClassName + "]失败，错误信息: " + e.getMessage());
		}
	}

	/**
	 * 创建实体类
	 * 
	 * @param entityClass
	 * @return
	 */
	public static <T extends IFlyEntity> T newInstance(Class<T> entityClass) {
		try {
			return (T) entityClass.newInstance();
		} catch (Exception e) {
			throw new IllegalArgumentException(
					"创建实体类[" + entityClass.getClass().getName() + "]失败，错误信息: " + e.getMessage());
		}
	}

	/**
	 * 创建新实体，从from中复制基本属性
	 * 
	 * @param entityClass
	 * @param from
	 */
	@SuppressWarnings("unchecked")
	public static <T extends IFlyEntity> T newFlyEntity(Class<T> entityClass, IFlyEntity from) {
		IFlyEntity entity = newInstance(entityClass);
		entity.setUid(UUIDUtil.newUUID());
		entity.setClient(from.getClient());
		entity.setOrg(from.getOrg());
		entity.setCreated(DateUtil.nowSqlTimestamp());
		entity.setCreatedBy(from.getCreatedBy());
		entity.setUpdated(DateUtil.nowSqlTimestamp());
		entity.setUpdatedBy(from.getUpdatedBy());
		entity.setIsActive(true);
		return (T) entity;
	}
}
