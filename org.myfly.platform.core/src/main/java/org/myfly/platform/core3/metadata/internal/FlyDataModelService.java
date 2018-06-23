package org.myfly.platform.core3.metadata.internal;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.transaction.Transactional;

import org.myfly.platform.core3.metadata.builder.EntityFlyTableBuilder;
import org.myfly.platform.core3.metadata.builder.PTTableFlyTableBuilder;
import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.core3.metadata.define.FlyTableDefinition;
import org.myfly.platform.core3.metadata.repository.IPTableRepository;
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
	@Autowired
	private JpaMetamodelMappingContext mappingContext;

	@Autowired
	private IPTableRepository tableRepos;

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
	public FlyDataModel getFlyDataModel(String entityNameOrClassName) {
		FlyDataModel flyTable = getFlyDataModelFromDB(entityNameOrClassName);
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

	@Transactional
	private FlyDataModel getFlyDataModelFromDB(String entityName) {
		PTable table = tableRepos.findByApiName(entityName);
		if (table != null) {
			FlyDataModel flyTable = new FlyDataModel(new PTTableFlyTableBuilder(table));
			flyTable.validate();
			return flyTable;
		} else {
			return null;
		}
	}

	@Override
	@Cacheable(cacheNames = "datamodel", key = "#entityClass.getName()")
	public FlyDataModel getFlyDataModelFromEntityClass(Class<?> entityClass) {
		Assert.notNull(entityClass, "参数[entityClass]不能为空");
		FlyDataModel flyTable = new FlyDataModel(new EntityFlyTableBuilder(entityClass));
		flyTable.validate();
		return flyTable;
	}

	@Transactional
	@Override
	public List<String> importDataModelFromAllEntityClass() {
		List<String> logs = new ArrayList<>();
		getAllEntityClasses().forEach(entityClass -> {
			FlyTableDefinition flyTable = getFlyDataModelFromEntityClass(entityClass);
			PTable table = PTTableFlyTableBuilder.toPTable(flyTable);
			tableRepos.save(table);
			logs.add("import data model for " + flyTable.getApiName());
		});
		return logs;
	}
}
