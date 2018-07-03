package org.myfly.platform.core3.metadata.internal;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.metadata.service.IFlyDataModel;
import org.myfly.platform.core3.metadata.service.IFlyDataModelService;
import org.myfly.platform.core3.metadata.service.IFlyViewModel;
import org.myfly.platform.core3.metadata.service.IFlyViewModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlyViewModelService implements IFlyViewModelService {
	private Log log = LogFactory.getLog(FlyViewModelService.class);
	@Autowired
	private IFlyDataModelService dataModelService;

	@Autowired
	private IJpaDataAccessService dataService;

	@Autowired
	private FlySystemResource systemResource;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.metadata.service.IFlyViewModelService#
	 * getFlyViewModel(java.lang.String)
	 */
	@Override
	public IFlyViewModel getFlyViewModel(String entityName) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.metadata.service.IFlyViewModelService#
	 * getFlyViewModelFromBuildIn(java.lang.String)
	 */
	@Override
	public IFlyViewModel getFlyViewModelFromBuildIn(String entityName) {
		IFlyDataModel dataModel = dataModelService.getFlyDataModel(entityName);
		IFlyViewModel viewModel = FlyMetaDataUtils.newFlyViewModelFromDataModel(dataModel);
		return viewModel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.metadata.service.IFlyViewModelService#
	 * getFlyViewModelByUid(java.lang.String)
	 */
	@Override
	public IFlyViewModel getFlyViewModelByUid(String uid) {
		return dataService.findOne(IFlyViewModelService.IMPLCLASS_FLY_VIEW_MODEL, uid);
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.metadata.service.IFlyViewModelService#
	 * importBuildInViewModelFromAllDataModels()
	 */
	@Override
	public List<String> importBuildInViewModelFromAllDataModels() {
		List<String> list = new ArrayList<>();
//		dataModelService.getAllEntityClasses().stream().map(entityClass -> entityClass.getName())
//				.forEach(entityName -> {
//					String info = "导入显示模型：" + entityName;
//					if (log.isInfoEnabled()) {
//						log.info(info);
//					}
//					list.add(info);
//					IFlyViewModel viewModel = getFlyViewModelFromBuildIn(entityName);
//					updateFlyEntity(viewModel);
//					viewModel.getTabs().forEach(tab -> {
//						updateFlyEntity(tab);
//						tab.getFields().forEach(field -> {
//							updateFlyEntity(field);
//						});
//					});
//					dataService.saveEntity(viewModel);
//				});
		return list;
	}

}
