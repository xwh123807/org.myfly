package org.myfly.platform.core.datamodel.internal;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.datamodel.define.FlyDataModel;
import org.myfly.platform.core.datamodel.define.FlyMemoryDataModel;
import org.myfly.platform.core.datamodel.service.IFlyDataModelService;
import org.myfly.platform.core.domain.IFlyEntity;
import org.myfly.platform.core.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.mapping.JpaMetamodelMappingContext;
import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ClassUtils;

@Service
public class FlyDataModelService implements IFlyDataModelService {
	private static Log log = LogFactory.getLog(FlyDataModelService.class);
	@Autowired
	private JpaMetamodelMappingContext mappingContext;

	@Autowired
	private FlySystemResource systemResource;

	@Override
	public List<Class<? extends IFlyEntity>> getAllEntityClasses() {
		List<Class<? extends IFlyEntity>> entityClasses = new ArrayList<>();
		for (JpaPersistentEntity<?> entity : mappingContext.getPersistentEntities()) {
			if (entity.findAnnotation(Entity.class) != null) {
				entityClasses.add((Class<? extends IFlyEntity>) entity.getType());
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
	public FlyDataModel getFlyDataModel(String entityNameOrClassName) {
		return FlyMemoryDataModel.getInstance().getFlyDataModel(entityNameOrClassName);
	}

	private void updateFlyEntity(IFlyEntity flyEntity) {
		flyEntity.setIsActive(true);
		flyEntity.setCreated(DateUtil.nowSqlTimestamp());
		flyEntity.setCreatedBy(systemResource.getSystemUserID());
		flyEntity.setUpdated(DateUtil.nowSqlTimestamp());
		flyEntity.setUpdatedBy(systemResource.getSystemUserID());
		flyEntity.setClientID(systemResource.getSystemClientID());
		flyEntity.setOrgID(systemResource.getAllOrgID());
	}
}
