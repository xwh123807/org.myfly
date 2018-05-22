package org.myfly.platform.core.test;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.flydata.service.EntityMap;
import org.myfly.platform.core.flydata.service.FlyEntityMap;
import org.myfly.platform.core.flydata.service.IFlyDataAccessService;
import org.myfly.platform.core.flydata.service.IJdbcDataAccessService;
import org.myfly.platform.core.metadata.define.FieldDefinition;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.service.IEntityMetaDataService;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.ClassUtil;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes = CoreApplication.class)
public abstract class FlyDataAccessTestCase extends ServiceTestCase {
	@Autowired
	private IJdbcDataAccessService jdbcDataAccessService;

	@Autowired
	private IEntityMetaDataService entityMetaDataService;

	public IJdbcDataAccessService getJdbcDataAccessService() {
		return jdbcDataAccessService;
	}

	public IEntityMetaDataService getEntityMetaDataService() {
		return entityMetaDataService;
	}

	/**
	 * 获取实体增强数据访问服务
	 * 
	 * @return
	 */
	public IFlyDataAccessService getFlyDataAccessService() {
		return AppUtil.getFlyDataAccessService(getEntityName());
	}

	/**
	 * 获取测试实体名
	 * 
	 * @return
	 */
	public abstract String getEntityName();

	/**
	 * 获取实体元模型
	 * 
	 * @param entityName
	 * @return
	 */
	public EntityMetaData getEntityMetaData(String entityName) {
		return getEntityMetaDataService().getEntityMetaData(entityName);
	}

	/**
	 * 获取测试实体表名
	 * 
	 * @return
	 */
	public String getTableName() {
		return getEntityMetaData(getEntityName()).getTableDefinition().getTableName();
	}

	/**
	 * 判断表中是否有记录
	 * 
	 * @return
	 */
	public boolean tableIsEmpty() {
		int count = getJdbcDataAccessService().count(null, getTableName(), (Map<String, Object>) null);
		return count == 0;
	}

	/**
	 * 从数据表中获取一条记录
	 * 
	 * @return
	 */
	public Map<String, Object> findOneForDB() {
		List<Map<String, Object>> list = getJdbcDataAccessService().findAll(null, getTableName(),
				(Map<String, Object>) null, 0, 1, null);
		if (CollectionUtils.isNotEmpty(list)) {
			return list.get(0);
		} else {
			return null;
		}
	}

	/**
	 * 验证fly entity（已经做了数据扩展后的）
	 * 
	 * @param metaData
	 * @param flyEntity
	 */
	private void checkFlyEntity(EntityMetaData metaData, Map<String, Object> dbEntity, Map<String, String> flyEntity) {
		for (FieldDefinition fieldDefinition : metaData.getAllFields()) {
			if (flyEntity.containsKey(fieldDefinition.getName())
					&& dbEntity.containsKey(fieldDefinition.getFieldName())) {
				String value = flyEntity.get(fieldDefinition.getName());
				Assert.assertNotNull("属性" + fieldDefinition.getName(), value);
				// 验证从增强数据访问服务获取的数据和直接从数据库获取的数据是否一致
				String dbValue = ClassUtil.convertValueToString(dbEntity.get(fieldDefinition.getFieldName()));
				// Assert.assertEquals("属性" + fieldDefinition.getName(),
				// dbValue, value);
				String labelField = fieldDefinition.getName() + "__label";
				String linkField = fieldDefinition.getName() + "__link";
				if (FieldDataType.SYSENUM.equals(fieldDefinition.getDataType())) {
					Assert.assertNotNull("属性" + labelField, flyEntity.get(labelField));
				} else if (FieldDataType.SEARCHRELATION.equals(fieldDefinition.getDataType())) {
					Assert.assertNotNull("属性" + labelField, flyEntity.get(labelField));
					Assert.assertNotNull("属性" + linkField, flyEntity.get(linkField));
				} else if (FieldDataType.AUTORELATION.equals(fieldDefinition.getDataType())) {
					Assert.assertNotNull("属性" + fieldDefinition.getName(), flyEntity.get(fieldDefinition.getName()));
				}
			} else if (!flyEntity.containsKey(fieldDefinition.getName())
					&& !dbEntity.containsKey(fieldDefinition.getFieldName())) {
				// 字段值为null场景
			} else {
				Assert.fail("属性" + fieldDefinition + "值不一致");
			}
		}
	}

	/**
	 * 验证实体查询从数据库返回，不做任何扩展的数据
	 * 
	 * @param metaData
	 * @param dbEntity
	 */
	private void checkDBMap(EntityMetaData metaData, Map<String, Object> dbEntity) {
		for (String dbFieldName : dbEntity.keySet()) {
			Object dbValue = dbEntity.get(dbFieldName);
			String dbValueStr = ClassUtil.convertValueToString(dbValue);
			Assert.assertNotNull("字段" + dbFieldName, dbValueStr);
			// 验证字段是否在元模型中有定义
			FieldDefinition fieldDefinition = metaData.getFieldByFieldName(dbFieldName);
			Assert.assertNotNull(fieldDefinition);
		}
	}

	@Test
	public void testFindOneWithUid() {
		// 从数据库中随机获取一条记录
		Map<String, Object> dbEntity = findOneForDB();
		Assert.assertNotNull(dbEntity);
		EntityMetaData metaData = getEntityMetaData(getEntityName());

		// 获取主键值
		String uid = metaData.getPKFieldDefinition().getPKValue(dbEntity);
		Assert.assertNotNull(uid);
		Map<String, String> flyEntity = getFlyDataAccessService().findOne(getEntityName(), uid, "all", false);
		Assert.assertNotNull(flyEntity);
		//
		checkDBMap(metaData, dbEntity);
		//
		checkFlyEntity(metaData, dbEntity, flyEntity);
	}

	@Test
	public void testFindOneWithMeta() {
		// 从数据库中随机获取一条记录
		Map<String, Object> dbEntity = findOneForDB();
		Assert.assertNotNull(dbEntity);
		EntityMetaData metaData = getEntityMetaData(getEntityName());
		// 获取主键值
		String pkValue = metaData.getPKFieldDefinition().getPKValue(dbEntity);
		Assert.assertNotNull(pkValue);
		// 获取使用模型扩展后的数据
		Map<String, String> flyEntity = getFlyDataAccessService().findOne(getEntityName(), pkValue, "all", false);
		Assert.assertNotNull(flyEntity);
		//
		checkDBMap(metaData, dbEntity);
		checkFlyEntity(metaData, dbEntity, flyEntity);
	}

	/**
	 * 获取新增实体，用于测试使用
	 * 
	 * @return
	 */
	public abstract EntityMap getNewEntity();

	/**
	 * 检查新增实体
	 * 
	 * @param entity
	 */
	public abstract void checkNewEntity(FlyEntityMap entity);

	@Test
	public void newEntity() {
		EntityMap params = getNewEntity();
		Assert.assertNotNull(params);
		String uid = getFlyDataAccessService().saveEntity(getEntityName(), null, params);
		Assert.assertNotNull(uid);
		FlyEntityMap entity = getFlyDataAccessService().findOne(getEntityName(), uid, null, false);
		Assert.assertNotNull(entity);
		internalCheckEntity(params, entity, true);
		checkNewEntity(entity);
	}

	/**
	 * 检验保存前实体属性和保存后实体对应属性是否一致
	 * 
	 * @param params
	 * @param entity
	 */
	private void internalCheckEntity(EntityMap params, Map<String, String> entity, boolean isNew) {
		for (Map.Entry<String, String> item : params.entrySet()) {
			Assert.assertEquals("属性[" + item.getKey() + "]", item.getValue(), entity.get(item.getKey()));
		}
		if (isNew) {
			Assert.assertNotNull(entity.get("uid"));
			Assert.assertNotNull(entity.get("created"));
			Assert.assertNotNull(entity.get("createdBy"));
			Assert.assertNotNull(entity.get("tenant"));
		} else {
			Assert.assertNotNull(entity.get("created"));
			Assert.assertNotNull(entity.get("createdBy"));
			Assert.assertNotNull(entity.get("tenant"));
			Assert.assertNotNull(entity.get("updated"));
			Assert.assertNotNull(entity.get("updatedBy"));
		}
	}

	/**
	 * 获取修改实体，用于修改测试用
	 * 
	 * @return
	 */
	public abstract EntityMap getUpdateEntity();

	@Test
	public void updateEntity() {
		EntityMap params = getNewEntity();
		Assert.assertNotNull(params);
		String uid = getFlyDataAccessService().saveEntity(getEntityName(), null, params);
		EntityMap params2 = getUpdateEntity();
		getFlyDataAccessService().mergeEntity(getEntityName(), uid, null, params2);
		Assert.assertNotNull(uid);
		FlyEntityMap entity = getFlyDataAccessService().findOne(getEntityName(), uid, null, false);
		Assert.assertNotNull(entity);
		internalCheckEntity(params2, entity, false);
		checkUpdateEntity(entity, params, params2);
	}

	public abstract void checkUpdateEntity(FlyEntityMap entity, EntityMap newEntity, EntityMap updateEntity);

	/**
	 * 获取子表数据
	 * 
	 * @param subTableAttr
	 * @return
	 */
	public List checkSubEntity(String subTableAttr, int recordCount) {
		EntityMetaData entityMetaData = getEntityMetaData(getEntityName());
		List<FlyEntityMap> list = getFlyDataAccessService().findAll(getEntityName(), null, null, 0, 1, false);
		Assert.assertNotNull(list);
		Assert.assertEquals(1, list.size());
		Map<String, String> flyEntity = list.get(0);
		String uid = entityMetaData.getPKFieldDefinition().getPKValue(flyEntity);
		Assert.assertNotNull(uid);
		List<FlyEntityMap> flySubEntities = getFlyDataAccessService().findAllForSubEntity(getEntityName(), uid,
				subTableAttr, null, null, false);
		Assert.assertEquals(true, CollectionUtils.isNotEmpty(flySubEntities));
		Assert.assertEquals(recordCount, flySubEntities.size());
		// for (Map flyEntity2 : flySubEntities) {
		// checkFlyEntity(entityMetaData, null, flyEntity2);
		// }
		long count = getFlyDataAccessService().count(getEntityName(), uid, subTableAttr, null, null);
		Assert.assertEquals(recordCount, count);
		return flySubEntities;
	}
}
