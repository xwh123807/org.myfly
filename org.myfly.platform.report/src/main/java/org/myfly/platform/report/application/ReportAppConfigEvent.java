package org.myfly.platform.report.application;

import org.myfly.platform.core.domain.AppStartLevel;
import org.myfly.platform.core.metadata.service.IMetaDataRegister;
import org.myfly.platform.core.starter.IAppConfigEvent;
import org.myfly.platform.core.starter.ICodeLevelDataModelRegister;
import org.myfly.platform.core.starter.ICodeLevelViewModelRegister;
import org.myfly.platform.core.system.service.IMenuService;
import org.springframework.stereotype.Component;

@Component
public class ReportAppConfigEvent implements IAppConfigEvent {

	@Override
	public AppStartLevel getAppStartLevel() {
		return AppStartLevel.LEVEL_1;
	}

	@Override
	public void registerMenus(IMenuService menuService) {

	}

	@Override
	public void initSysData() {
	}

	@Override
	public void initSampleData() {

	}

	@Override
	public void registerExternalMetaData(IMetaDataRegister metaDataRegister) {

	}

	@Override
	public void loadCodeLevelDataModels(ICodeLevelDataModelRegister modelRegister) {
		modelRegister.registerRefTableAndFlyDataModelFromPackage("org.myfly.platform.report.model");
	}

	@Override
	public void loadCodeLevelViewModels(ICodeLevelViewModelRegister modelRegister) {
	}

}
