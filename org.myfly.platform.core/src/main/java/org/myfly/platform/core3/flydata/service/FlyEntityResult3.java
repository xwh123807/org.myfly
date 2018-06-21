package org.myfly.platform.core3.flydata.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.domain.IAuditable;
import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.core3.metadata.define.FlyFieldDefinition;

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
public class FlyEntityResult3 extends HashMap<String, Object> {

	/**
	 * @param from
	 */
	public FlyEntityResult3(HashMap<String, Object> from) {
		putAll(from);
	}

	public FlyEntityResult3() {
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
	 * 
	 * @return
	 */
	public FlyEntityResult3 copy() {
		return JSONUtil.fromJSON(toJson(), FlyEntityResult3.class);
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
		FlyDataModel metaData = AppUtil.getFlyDataModel(entityName);
		return toEntity(metaData, this);
	}

	/**
	 * 将实体json反序列化为实体对象
	 * 
	 * @param metaData
	 * @param jsonEntity
	 * @return
	 */
	public static <T> T toEntity(FlyDataModel metaData, String jsonEntity) {
		FlyEntityResult3 result = JSONUtil.fromJSON(jsonEntity, FlyEntityResult3.class);
		return toEntity(metaData, result);
	}

	/**
	 * 将FlyEntity转化为实体类对象
	 * 
	 * @param metaData
	 * @param flyEntity
	 * @return
	 */
	public static <T> T toEntity(FlyDataModel metaData, FlyEntityResult3 flyEntity) {
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
	private static <T extends IAuditable> T getCachedEntity(FlyDataModel metaData, T entity, boolean isNew) {
		String uid = entity.getUid();
		String key = metaData.getApiName() + "_" + uid;
		if (isNew || !localEntityCache.get().containsKey(key)) {
			// 新增模式或缓存中不存在
			localEntityCache.get().put(key, entity);
			return null;
		} else {
			return (T) localEntityCache.get().get(key);
		}
	}

	/**
	 * 更新缓存，修改和合并实体时，需要刷新缓存
	 * 
	 * @param metaData
	 * @param entity
	 */
	@SuppressWarnings("unchecked")
	private static <T extends IAuditable> void mergeCachedEntity(FlyDataModel metaData, T entity) {
		String uid = entity.getUid();
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
	public static <T extends IAuditable> T toEntity(FlyDataModel metaData, Map<String, Object> flyEntity, boolean isNew) {
		T entity = metaData.newEntityInstance(flyEntity);
		T cacheEntity = getCachedEntity(metaData, entity, isNew);
		if (cacheEntity != null) {
			return cacheEntity;
		}
		metaData.getFlyFields().values().forEach(field -> {
			// 主键字段已经在对象构建时设置了值，此处跳过不重复设置
			if (flyEntity.containsKey(field.getName())) {
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
	public static <T extends IAuditable> T mergeEntity(FlyDataModel metaData, T entity, Map flyEntity, boolean isAllMerge) {
		mergeCachedEntity(metaData, entity);
		metaData.getFlyFields().values().forEach(field -> {
			// 主键字段已经在对象构建时设置了值，此处跳过不重复设置
			if (isAllMerge || flyEntity.containsKey(field.getName())) {
				// 全覆盖或属性有修改
				Object value = flyEntity.get(field.getName());
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
	public static FlyEntityResult3 fromEntity(FlyDataModel metaData, Object entityObj) {
		FlyEntityResult3 result = new FlyEntityResult3();
		for (FlyFieldDefinition field : metaData.getFlyFields().values()) {
			result.put(field.getName(), field.getValueHandler().getFieldValue(entityObj));
		}
		return result;
	}

	/**
	 * 将实体类转换为FlyEntityResult3
	 * 
	 * @param entityObj
	 * @return
	 */
	public static FlyEntityResult3 fromEntity(Object entityObj) {
		return fromEntity(AppUtil.getFlyDataModel(entityObj.getClass().getName()), entityObj);
	}

	/**
	 * 合并
	 * 
	 * @param entity1
	 * @param entity2
	 * @return
	 */
	public static FlyEntityResult3 merge(FlyEntityResult3 entity1, FlyEntityResult3 entity2) {
		FlyEntityResult3 result = new FlyEntityResult3(entity1);
		result.putAll(entity2);
		return result;
	}

	/**
	 * 合并
	 * 
	 * @param entityb
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public FlyEntityResult3 merge(Map entityb) {
		entityb.keySet().forEach(name -> {
			if (entityb.get(name) instanceof Collection) {
				// 集合属性
				if (this.containsKey(name)) {
					((Collection) this.get(name)).addAll((Collection) entityb.get(name));
				} else {
					this.put((String) name, entityb.get(name));
				}
			} else {
				this.put((String) name, entityb.get(name));
			}
		});
		return this;
	}
}
