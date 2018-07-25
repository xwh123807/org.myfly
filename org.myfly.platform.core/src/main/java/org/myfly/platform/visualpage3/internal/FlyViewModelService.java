package org.myfly.platform.visualpage3.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.core3.metadata.service.IFlyDataModel;
import org.myfly.platform.core3.metadata.service.IFlyDataModelService;
import org.myfly.platform.visualpage3.define.FlyMemoryViewModel;
import org.myfly.platform.visualpage3.define.FlyViewModel;
import org.myfly.platform.visualpage3.define.FlyViewModelBuilder;
import org.myfly.platform.visualpage3.service.IFlyViewModel;
import org.myfly.platform.visualpage3.service.IFlyViewModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlyViewModelService implements IFlyViewModelService {
	private Log log = LogFactory.getLog(FlyViewModelService.class);
	@Autowired
	private IFlyDataModelService dataModelService;

	@Autowired
	private IJpaDataAccessService dataService;

	private FlyMemoryViewModel getFlyMemoryViewModel() {
		return FlyMemoryViewModel.getInstance();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.metadata.service.IFlyViewModelService#
	 * getFlyViewModel(java.lang.String)
	 */
	@Override
	public IFlyViewModel getFlyViewModel(String windowName) {
		return getFlyMemoryViewModel().getFlyViewModel(windowName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.myfly.platform.core3.metadata.service.IFlyViewModelService#
	 * getFlyViewModelFromBuildIn(java.lang.String)
	 */
	@Override
	public IFlyViewModel getFlyViewModelFromBuildIn(String entityName) {
		IFlyViewModel viewModel = getFlyViewModel(entityName);
		if (viewModel == null) {
			IFlyDataModel dataModel = dataModelService.getFlyDataModel(entityName);
			if (dataModel != null) {
				FlyViewModelBuilder builder = new FlyViewModelBuilder();
				viewModel = builder.loadFromFlyDataModel((FlyDataModel) dataModel);
				getFlyMemoryViewModel().addViewModel((FlyViewModel) viewModel);
			}
		}
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
}
