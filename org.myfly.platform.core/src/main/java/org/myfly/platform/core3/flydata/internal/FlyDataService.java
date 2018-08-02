package org.myfly.platform.core3.flydata.internal;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.collections4.CollectionUtils;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.flydata.service.FlyEntityMap;
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

	/**
	 * 获取实体类
	 * 
	 * @param entityName
	 * @return
	 */
	private Class<?> getEntityClass(String entityName) {
		return dataModelService.getEntityClass(entityName);
	}

	/**
	 * 获取实体数据模型
	 * 
	 * @param entityName
	 * @return
	 */
	private FlyDataModel getFlyDataModel(String entityName) {
		return dataModelService.getFlyDataModel(entityName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.flydata.service.IFlyDataService#findOne(java.lang.
	 * String, java.lang.String)
	 */
	@Override
	public FlyEntityMap findOne(String entityName, String uid) {
		IFlyEntity entity = (IFlyEntity) jpaService.findOne(getEntityClass(entityName), uid);
		if (entity != null) {
			return FlyEntityUtils.fromEntity(getFlyDataModel(entityName), entity);
		} else {
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.flydata.service.IFlyDataService#delOne(java.lang.
	 * String, java.lang.String)
	 */
	@Override
	public void delOne(String entityName, String uid) {
		jpaService.delOne(getEntityClass(entityName), uid);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.flydata.service.IFlyDataService#saveEntity(java.lang
	 * .String, org.myfly.platform.core3.flydata.service.FlyEntityResult3)
	 */
	@Override
	public String saveEntity(String entityName, FlyEntityMap flyEntity) {
		FlyDataModel dataModel = getFlyDataModel(entityName);
		IFlyEntity entity = jpaService.saveEntity(FlyEntityUtils.toEntity(dataModel, flyEntity));
		return dataModel.getPKValue(entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.flydata.service.IFlyDataService#saveEntityAndReturn(
	 * java.lang.String, org.myfly.platform.core3.flydata.service.FlyEntityResult3)
	 */
	@Override
	public FlyEntityMap saveEntityAndReturn(String entityName, FlyEntityMap flyEntity) {
		String uid = saveEntity(entityName, flyEntity);
		return find(entityName, uid, true, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.flydata.service.IFlyDataService#updateEntity(java.
	 * lang.String, java.lang.String,
	 * org.myfly.platform.core3.flydata.service.FlyEntityResult3)
	 */
	@Override
	public void updateEntity(String entityName, String uid, FlyEntityMap flyEntity) {
		IFlyEntity entity = FlyEntityUtils.toEntity(getFlyDataModel(entityName), flyEntity);
		jpaService.updateEntity(uid, entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.flydata.service.IFlyDataService#
	 * updateEntityAndReturn(java.lang.String, java.lang.String,
	 * org.myfly.platform.core3.flydata.service.FlyEntityMap)
	 */
	@Override
	public FlyEntityMap updateEntityAndReturn(String entityName, String uid, FlyEntityMap flyEntity) {
		updateEntity(entityName, uid, flyEntity);
		return find(entityName, uid, true, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.flydata.service.IFlyDataService#mergeEntity(java.
	 * lang.String, java.lang.String,
	 * org.myfly.platform.core3.flydata.service.FlyEntityResult3)
	 */
	@Override
	public void mergeEntity(String entityName, String uid, FlyEntityMap flyEntity) {
		Object obj = jpaService.findOne(getEntityClass(entityName), uid);
		// 合并实体，只覆盖部分属性
		Object mergedObj = FlyEntityUtils.mergeEntity(getFlyDataModel(entityName), (IFlyEntity) obj, flyEntity, false);
		jpaService.updateEntity(mergedObj);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.flydata.service.IFlyDataService#mergeEntityAndReturn
	 * (java.lang.String, java.lang.String,
	 * org.myfly.platform.core3.flydata.service.FlyEntityMap)
	 */
	@Override
	public FlyEntityMap mergeEntityAndReturn(String entityName, String uid, FlyEntityMap flyEntity) {
		mergeEntity(entityName, uid, flyEntity);
		return find(entityName, uid, true, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.flydata.service.IFlyDataService#findAll(java.lang.
	 * String)
	 */
	@Override
	public List<FlyEntityMap> findAll(String entityName) {
		FlyDataModel dataModel = getFlyDataModel(entityName);
		List<?> list = jpaService.findAll(getEntityClass(entityName));
		if (CollectionUtils.isNotEmpty(list)) {
			List<FlyEntityMap> results = new ArrayList<>();
			list.forEach(item -> {
				results.add(FlyEntityUtils.fromEntity(dataModel, item));
			});
			return results;
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.flydata.service.IFlyDataService#find(java.lang.
	 * String, java.lang.String, boolean, java.lang.String[])
	 */
	@Override
	public FlyEntityMap find(String entityName, String uid, boolean hasSubTable, String[] subTableAttrs) {
		Object obj = jpaService.findOne(getEntityClass(entityName), uid);
		if (obj != null) {
			return FlyEntityUtils.fromEntity(getFlyDataModel(entityName), obj);
		} else {
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.core3.flydata.service.IFlyDataService#findAll(java.lang.
	 * String, boolean, java.lang.String[])
	 */
	@Override
	public List<FlyEntityMap> findAll(String entityName, boolean hasSubTable, String[] subTableAttrs) {
		FlyDataModel dataModel = getFlyDataModel(entityName);
		List<?> list = jpaService.findAll(getEntityClass(entityName));
		return toFlyEntityMapList(dataModel, list, hasSubTable, subTableAttrs);
	}

	private List<FlyEntityMap> toFlyEntityMapList(FlyDataModel dataModel, List<?> list, boolean hasSubTable,
			String[] subTableAttrs) {
		List<FlyEntityMap> results = new ArrayList<>();
		if (CollectionUtils.isNotEmpty(list)) {
			list.forEach(item -> {
				results.add(FlyEntityUtils.fromEntity(dataModel, item));
			});
		}
		return results;
	}

	@Override
	public List<FlyEntityMap> findByExample(String entityName, FlyEntityMap example) {
		List<?> list = jpaService.findAll(getEntityClass(entityName), example);
		return toFlyEntityMapList(getFlyDataModel(entityName), list, false, null);
	}

}
