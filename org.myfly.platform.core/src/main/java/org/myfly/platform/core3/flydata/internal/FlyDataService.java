package org.myfly.platform.core3.flydata.internal;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.collections4.CollectionUtils;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core3.domain.IAuditable;
import org.myfly.platform.core3.flydata.service.FlyEntityResult3;
import org.myfly.platform.core3.flydata.service.IFlyDataService;
import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.core3.metadata.service.IFlyDataModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class FlyDataService implements IFlyDataService {
	@Autowired
	private IJpaDataAccessService jpaService;
	@Autowired
	private IFlyDataModelService dataModelService;

	private Class<?> getEntityClass(String entityName) {
		return dataModelService.getEntityClass(entityName);
	}

	private FlyDataModel getFlyDataModel(String entityName) {
		return dataModelService.getFlyDataModel(entityName);
	}

	@Override
	public FlyEntityResult3 findOne(String entityName, String uid) {
		IAuditable entity = (IAuditable) jpaService.findOne(getEntityClass(entityName), uid);
		return FlyEntityResult3.fromEntity(getFlyDataModel(entityName), entity);
	}

	@Override
	public void delOne(String entityName, String uid) {
		jpaService.delOne(getEntityClass(entityName), uid);
	}

	@Override
	public String saveEntity(String entityName, FlyEntityResult3 flyEntity) {
		IAuditable entity = jpaService.saveEntity(FlyEntityResult3.toEntity(getFlyDataModel(entityName), flyEntity));
		return entity.getUid();
	}

	@Override
	public FlyEntityResult3 saveEntityAndReturn(String entityName, FlyEntityResult3 flyEntity) {
		String uid = saveEntity(entityName, flyEntity);
		return find(entityName, uid, true, null);
	}

	@Override
	public void updateEntity(String entityName, String uid, FlyEntityResult3 flyEntity) {
		IAuditable entity = FlyEntityResult3.toEntity(getFlyDataModel(entityName), flyEntity);
		jpaService.updateEntity(uid, entity);
	}

	@Override
	public void mergeEntity(String entityName, String uid, FlyEntityResult3 flyEntity) {
		Object obj = jpaService.findOne(getEntityClass(entityName), uid);
		// 合并实体，只覆盖部分属性
		Object mergedObj = FlyEntityResult3.mergeEntity(getFlyDataModel(entityName), (IAuditable)obj, flyEntity, false);
		jpaService.updateEntity(mergedObj);
	}

	@Override
	public List<FlyEntityResult3> findAll(String entityName) {
		FlyDataModel dataModel = getFlyDataModel(entityName);
		List<?> list = jpaService.findAll(getEntityClass(entityName));
		if (CollectionUtils.isNotEmpty(list)) {
			List<FlyEntityResult3> results = new ArrayList<>();
			list.forEach(item -> {
				results.add(FlyEntityResult3.fromEntity(dataModel, item));
			});
			return results;
		}
		return null;
	}

	@Override
	public FlyEntityResult3 find(String entityName, String uid, boolean hasSubTable, String[] subTableAttrs) {
		Object obj = jpaService.findOne(getEntityClass(entityName), uid);
		return FlyEntityResult3.fromEntity(getFlyDataModel(entityName), obj);
	}

}
