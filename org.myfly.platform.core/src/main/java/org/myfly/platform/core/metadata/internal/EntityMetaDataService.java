package org.myfly.platform.core.metadata.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.entity.MDRelationFieldDefinition;
import org.myfly.platform.core.metadata.service.IEntityMetaDataService;
import org.myfly.platform.core.metadata.service.JsonEntityMetaData;
import org.myfly.platform.core.utils.AssertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.jpa.mapping.JpaMetamodelMappingContext;
import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ClassUtils;

@Service
@CacheConfig(cacheNames = "entity-metadata-service")
public class EntityMetaDataService implements IEntityMetaDataService {
	@Autowired
	private JpaMetamodelMappingContext mappingContext;

	/**
	 * 缓存所有已经加载的元模型
	 */
	private static Map<String, EntityMetaData> cachedEntityMetaDatas = new ConcurrentHashMap<>();

	@Override
	public List<Class<?>> getAllEntityClasses() {
		List<Class<?>> list = new ArrayList<>();
		for (JpaPersistentEntity<?> entity : mappingContext.getPersistentEntities()) {
			list.add(entity.getType());
		}
		return list;
	}

	@Override
	public <T> T getEntityClass(String entityNameOrClassName) {
		AssertUtil.parameterEmpty(entityNameOrClassName, "entityNameOrClassName");
		Class<?> entityClass = null;
		for (JpaPersistentEntity<?> entity : mappingContext.getPersistentEntities()) {
			if (entity.getName().equals(entityNameOrClassName)) {
				entityClass = entity.getType();
				break;
			} else {
				String shortName = ClassUtils.getShortName(entity.getName());
				if (shortName.equalsIgnoreCase(entityNameOrClassName)) {
					entityClass = entity.getType();
					break;
				}
			}
		}
		return (T) entityClass;
	}

	@Override
	public EntityMetaData getEntityMetaData(String entityNameOrClassName) {
		AssertUtil.parameterEmpty(entityNameOrClassName, "entityNameOrClassName");
		if (cachedEntityMetaDatas.containsKey(entityNameOrClassName)) {
			return cachedEntityMetaDatas.get(entityNameOrClassName);
		}
		Class<?> entityClass = getEntityClass(entityNameOrClassName);
		return new EntityMetaData(entityClass);
	}

	@Override
	public EntityMetaData getSubEntityMetaData(String table, String subTableAttr) {
		MDRelationFieldDefinition field = getEntityMetaData(table).getField(subTableAttr);
		String subTable = field.getRelationTable();
		return getEntityMetaData(subTable);
	}

	@Override
	public JsonEntityMetaData getJsonEntityMetaData(String entityNameOrClassName) {
		return null;
	}

}
