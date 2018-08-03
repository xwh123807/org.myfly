package org.myfly.platform.core.viewmodel.application;

import org.myfly.platform.core.domain.AppStartLevel;
import org.myfly.platform.core.starter.IAppConfigEvent;
import org.myfly.platform.core.starter.ICodeLevelDataModelRegister;
import org.myfly.platform.core.starter.ICodeLevelViewModelRegister;
import org.myfly.platform.core.viewmodel.internal.FlyViewModelImporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ViewModelAppConfigEvent implements IAppConfigEvent {
	@Autowired
	private FlyViewModelImporter viewModelImporter;

	@Override
	public AppStartLevel getAppStartLevel() {
		return AppStartLevel.LEVEL_1;
	}

	@Override
	public void initSysData() {
		viewModelImporter.importAll();
	}

	@Override
	public void initSampleData() {

	}

	@Override
	public void loadCodeLevelDataModels(ICodeLevelDataModelRegister modelRegister) {
		//modelRegister.registerRefTableAndFlyDataModelFromPackage("org.myfly.platform.core.viewmodel.model");
	}

	@Override
	public void loadCodeLevelViewModels(ICodeLevelViewModelRegister modelRegister) {
		modelRegister.registerFlyViewModelsFromEnumClass(MyFlyViewModel_zh_CN.class);
	}

}
