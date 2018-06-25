package org.myfly.platform.core3.metadata.internal;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.metadata.repository.IPTableRepository;
import org.myfly.platform.core3.metadata.service.IFlyDataModel;
import org.myfly.platform.core3.metadata.service.IFlyDataModelService;
import org.myfly.platform.core3.model.data.PTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.mapping.JpaMetamodelMappingContext;
import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;

@Service
public class FlyDataModelService implements IFlyDataModelService {
	private static Log log = LogFactory.getLog(FlyDataModelService.class);
	@Autowired
	private JpaMetamodelMappingContext mappingContext;

	@Autowired
	private IPTableRepository tableRepos;

	@Autowired
	private FlySystemResource systemResource;

	@Override
	public List<Class<?>> getAllEntityClasses() {
		List<Class<?>> entityClasses = new ArrayList<>();
		for (JpaPersistentEntity<?> entity : mappingContext.getPersistentEntities()) {
			if (entity.findAnnotation(Entity.class) != null) {
				entityClasses.add(entity.getType());
			}
		}
		return entityClasses;
	}

	@SuppressWarnings("unchecked")
	@Cacheable(cacheNames = "entity-class")
	@Override
	public <T> T getEntityClass(String entityNameOrClassName) {
		Class<?> entityClass = null;
		for (Class<?> entity : getAllEntityClasses()) {
			if (entity.getName().equalsIgnoreCase(entityNameOrClassName)) {
				entityClass = entity;
				break;
			} else {
				String shortName = ClassUtils.getShortName(entity.getName());
				if (shortName.equalsIgnoreCase(entityNameOrClassName)) {
					entityClass = entity;
					break;
				}
			}
		}
		return (T) entityClass;
	}

	@Override
	@Cacheable(cacheNames = "datamodel")
	@Transactional
	public IFlyDataModel getFlyDataModel(String entityNameOrClassName) {
		IFlyDataModel flyTable = tableRepos.findByApiName(entityNameOrClassName);
		if (flyTable == null) {
			Class<?> entityClass = getEntityClass(entityNameOrClassName);
			if (entityClass != null) {
				flyTable = getFlyDataModelFromEntityClass(entityClass);
			} else {
				throw new IllegalArgumentException("找不到名称为[" + entityNameOrClassName + "]的数据模型");
			}
		}
		return flyTable;
	}

	@Override
	@Cacheable(cacheNames = "datamodel", key = "#entityClass.getName()")
	public IFlyDataModel getFlyDataModelFromEntityClass(Class<?> entityClass) {
		Assert.notNull(entityClass, "参数[entityClass]不能为空");
		return FlyMetaDataUtils.newFlyDataModelFromEntityClass(entityClass);
	}

	@Transactional
	@Override
	public List<String> importDataModelFromAllEntityClasses() {
		List<String> list = new ArrayList<>();
		getAllEntityClasses().forEach(entityClass -> {
			String info = "导入数据模型：" + entityClass.getName();
			if (log.isInfoEnabled()) {
				log.info(info);
			}
			list.add(info);
			IFlyDataModel dataModel = getFlyDataModelFromEntityClass(entityClass);
			updateFlyEntity(dataModel);
			dataModel.getColumns().forEach(column -> {
				updateFlyEntity(column);
			});
			tableRepos.save((PTable) dataModel);
		});
		return list;
	}

	private void updateFlyEntity(IFlyEntity flyEntity) {
		flyEntity.setUid(UUIDUtil.newUUID());
		flyEntity.setIsActive(true);
		flyEntity.setCreated(DateUtil.nowSqlTimestamp());
		flyEntity.setCreatedBy(systemResource.getSystemUser());
		flyEntity.setUpdated(DateUtil.nowSqlTimestamp());
		flyEntity.setUpdatedBy(systemResource.getSystemUser());
		flyEntity.setClient(systemResource.getSystemClient());
		flyEntity.setOrg(systemResource.getAllOrg());
	}
}
