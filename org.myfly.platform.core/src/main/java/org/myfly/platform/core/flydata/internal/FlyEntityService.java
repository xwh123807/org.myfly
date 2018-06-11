package org.myfly.platform.core.flydata.internal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.collections4.CollectionUtils;
import org.myfly.platform.core.flydata.service.FlyEntityResult;
import org.myfly.platform.core.flydata.service.IFlyEntityService;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.service.IEntityMetaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class FlyEntityService implements IFlyEntityService {
	@Autowired
	private IJpaDataAccessService jpaService;
	@Autowired
	private IEntityMetaDataService metaService;

	@Override
	public String saveEntity(String entityName, String viewName, String jsonEntity) {
		EntityMetaData metaData = metaService.getEntityMetaData(entityName);
		return jpaService.saveEntity(FlyEntityResult.toEntity(metaData, jsonEntity));
	}

	@Override
	public FlyEntityResult find(String entityName, String uid, String viewName, boolean hasSubTable,
			String[] subTableAttrs) {
		EntityMetaData metaData = metaService.getEntityMetaData(entityName);
		Serializable pkValue = metaData.getPkFieldDefinition().buildPK(uid);
		Object obj = jpaService.findOne(metaData.getEntityClass(), pkValue);
		return FlyEntityResult.fromEntity(metaData, obj);
	}

	@Override
	public void updateEntity(String entityName, String uid, String viewName, String jsonEntity) {
		EntityMetaData metaData = metaService.getEntityMetaData(entityName);
		Serializable pkValue = metaData.getPkFieldDefinition().buildPK(uid);
		jpaService.updateEntity(pkValue, FlyEntityResult.toEntity(metaData, jsonEntity));
	}

	@Override
	public List<FlyEntityResult> findAll(String entityName, String listViewName) {
		EntityMetaData metaData = metaService.getEntityMetaData(entityName);
		List<?> list = jpaService.findAll(metaData.getEntityClass());
		if (CollectionUtils.isNotEmpty(list)) {
			List<FlyEntityResult> results = new ArrayList<>();
			list.forEach(item -> {
				results.add(FlyEntityResult.fromEntity(metaData, item));
			});
			return results;
		}
		return null;
	}

}
