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
	public String saveEntity(String entityName, String formViewName, FlyEntityResult flyEntity) {
		EntityMetaData metaData = metaService.getEntityMetaData(entityName);
		Object entity = jpaService.saveEntity(FlyEntityResult.toEntity(metaData, flyEntity));
		return metaData.getPkFieldDefinition().getPKValue(entity);
	}

	@Override
	public FlyEntityResult saveEntityAndReturn(String entityName, String formViewName, FlyEntityResult flyEntity) {
		String uid = saveEntity(entityName, formViewName, flyEntity);
		return find(entityName, uid, formViewName, true, null);
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
	public void updateEntity(String entityName, String uid, String viewName, FlyEntityResult flyEntity) {
		EntityMetaData metaData = metaService.getEntityMetaData(entityName);
		Serializable pkValue = metaData.getPkFieldDefinition().buildPK(uid);
		Object entity = FlyEntityResult.toEntity(metaData, flyEntity);
		jpaService.updateEntity(pkValue, entity);
//		Object obj = jpaService.findOne(metaData.getEntityClass(), pkValue);
//		//合并实体，全覆盖，没有赋值的设为null
//		Object mergedObj = FlyEntityResult.mergeEntity(metaData, obj, flyEntity, true);
//		jpaService.updateEntity(mergedObj);
	}
	
	@Override
	public void mergeEntity(String entityName, String uid, String viewName, FlyEntityResult flyEntity) {
		EntityMetaData metaData = metaService.getEntityMetaData(entityName);
		Serializable pkValue = metaData.getPkFieldDefinition().buildPK(uid);
		Object obj = jpaService.findOne(metaData.getEntityClass(), pkValue);
		//合并实体，只覆盖部分属性
		Object mergedObj = FlyEntityResult.mergeEntity(metaData, obj, flyEntity, false);
		jpaService.updateEntity(mergedObj);
	}

	@Override
	public void del(String entityName, String uid) {
		EntityMetaData metaData = metaService.getEntityMetaData(entityName);
		Serializable pkValue = metaData.getPkFieldDefinition().buildPK(uid);
		jpaService.delOne(metaData.getEntityClass(), pkValue);
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
