package org.myfly.platform.core3.metadata.internal;

import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core3.metadata.builder.BuildInFlyViewModelBuilder;
import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.core3.metadata.service.IFlyDataModelService;
import org.myfly.platform.core3.metadata.service.IFlyViewModel;
import org.myfly.platform.core3.metadata.service.IFlyViewModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlyViewModelService implements IFlyViewModelService {
	@Autowired
	private IFlyDataModelService dataModelService;

	@Autowired
	private IJpaDataAccessService dataService;

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
		FlyDataModel dataModel = dataModelService.getFlyDataModel(entityName);
		IFlyViewModel viewModel = new BuildInFlyViewModelBuilder(dataModel);
		return viewModel;
	}

	@Override
	public IFlyViewModel getFlyViewModelByUid(String uid) {
		return dataService.findOne(IFlyViewModelService.IMPLCLASS_FLY_VIEW_MODEL, uid);
	}

}
