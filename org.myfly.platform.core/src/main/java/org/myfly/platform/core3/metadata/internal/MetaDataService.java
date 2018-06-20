package org.myfly.platform.core3.metadata.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.persistence.Entity;
import javax.transaction.Transactional;

import org.myfly.platform.core3.metadata.builder.EntityFlyTableBuilder;
import org.myfly.platform.core3.metadata.builder.PTTableFlyTableBuilder;
import org.myfly.platform.core3.metadata.define.FlyTableDefinition;
import org.myfly.platform.core3.metadata.model.PTable;
import org.myfly.platform.core3.metadata.repository.IPTableRepository;
import org.myfly.platform.core3.metadata.service.IMetaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.mapping.JpaMetamodelMappingContext;
import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ClassUtils;

@Service
public class MetaDataService implements IMetaDataService {
	@Autowired
	private JpaMetamodelMappingContext mappingContext;

	@Autowired
	private IPTableRepository tableRepos;

	/**
	 * 缓存实体类
	 */
	private static List<Class<?>> entityClasses;

	/**
	 * 缓存所有已经加载的元模型
	 */
	private static Map<String, FlyTableDefinition> cachedEntityMetaDatas = new ConcurrentHashMap<>();

	@Override
	public List<Class<?>> getAllEntityClasses() {
		if (entityClasses == null) {
			entityClasses = new ArrayList<>();
			for (JpaPersistentEntity<?> entity : mappingContext.getPersistentEntities()) {
				if (entity.findAnnotation(Entity.class) != null) {
					entityClasses.add(entity.getType());
				}
			}
		}
		return entityClasses;
	}

	@SuppressWarnings("unchecked")
	private <T> T getEntityClass(String entityNameOrClassName) {
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
	public FlyTableDefinition getFlyTableDefinition(String entityNameOrClassName) {
		if (cachedEntityMetaDatas.containsKey(entityNameOrClassName)) {
			return cachedEntityMetaDatas.get(entityNameOrClassName);
		} else {
			FlyTableDefinition flyTable = getFlyTableDefinitionFromDB(entityNameOrClassName);
			if (flyTable == null) {
				Class<?> entityClass = getEntityClass(entityNameOrClassName);
				flyTable = getFlyTableDefinitionFromEntityClass(entityClass);
			}
			cachedEntityMetaDatas.put(entityNameOrClassName, flyTable);
			return flyTable;
		}
	}

	@Transactional
	private FlyTableDefinition getFlyTableDefinitionFromDB(String entityName) {
		PTable table = tableRepos.findByApiName(entityName);
		if (table != null) {
			FlyTableDefinition flyTable = new FlyTableDefinition(new PTTableFlyTableBuilder(table));
			return flyTable;
		} else {
			return null;
		}
	}

	@Override
	public FlyTableDefinition getFlyTableDefinitionFromEntityClass(Class<?> entityClass) {
		FlyTableDefinition flyTable = new FlyTableDefinition(new EntityFlyTableBuilder(entityClass));
		return flyTable;
	}

	@Transactional
	@Override
	public List<String> importDataModelFromAllEntityClass() {
		List<String> logs = new ArrayList<>();
		getAllEntityClasses().forEach(entityClass -> {
			FlyTableDefinition flyTable = getFlyTableDefinitionFromEntityClass(entityClass);
			PTable table = PTTableFlyTableBuilder.toPTable(flyTable);
			tableRepos.save(table);
			logs.add("import data model for " + flyTable.getApiName());
		});
		return logs;
	}
}
