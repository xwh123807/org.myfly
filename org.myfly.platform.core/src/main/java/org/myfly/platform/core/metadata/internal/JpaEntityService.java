package org.myfly.platform.core.metadata.internal;

import java.util.List;
import java.util.function.Function;

import org.myfly.platform.core.metadata.service.IJpaEntityService;
import org.myfly.platform.core.metadata.service.JpaEntityInfo;
import org.myfly.platform.core.utils.FuncUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.mapping.JpaMetamodelMappingContext;
import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.mapping.Association;
import org.springframework.data.mapping.PersistentProperty;
import org.springframework.data.mapping.SimpleAssociationHandler;
import org.springframework.data.mapping.SimplePropertyHandler;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "jpa-entity-service")
public class JpaEntityService implements IJpaEntityService {
	@Autowired
	private JpaMetamodelMappingContext mappingContext;

	@Override
	@Cacheable(key = "'getJpaEntityInfos'")
	public List<JpaEntityInfo> getJpaEntityInfos() {

		return FuncUtil.convertCollection(mappingContext.getPersistentEntities(), new Function() {

			@Override
			public JpaEntityInfo apply(Object item) {
				return buildJpaEntityInfo((JpaPersistentEntity<?>) item);
			}

		});
	}

	@Override
	public JpaEntityInfo getJpaEntityInfo(String name) {
		return null;
	}

	private JpaEntityInfo buildJpaEntityInfo(JpaPersistentEntity<?> entity) {
		final JpaEntityInfo info = new JpaEntityInfo();
		info.setName(entity.getName());
		info.setType(entity.getType());
		entity.doWithProperties(new SimplePropertyHandler() {

			@Override
			public void doWithPersistentProperty(PersistentProperty<?> property) {
				info.addProperty(property);
			}
		});
		entity.doWithAssociations(new SimpleAssociationHandler() {

			@Override
			public void doWithAssociation(Association<? extends PersistentProperty<?>> association) {
				info.addProperty((PersistentProperty<?>) association);
			}
		});
		return info;
	}
}
