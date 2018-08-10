package org.myfly.platform.report.application;

import org.myfly.platform.core.domain.AppStartLevel;
import org.myfly.platform.core.starter.IAppConfigEvent;
import org.myfly.platform.core.starter.ICodeLevelDataModelRegister;
import org.myfly.platform.core.starter.ICodeLevelModelRegister;
import org.springframework.stereotype.Component;

@Component
public class ReportAppConfigEvent implements IAppConfigEvent {

	@Override
	public AppStartLevel getAppStartLevel() {
		return AppStartLevel.LEVEL_1;
	}

	@Override
	public void initSysData() {
	}

	@Override
	public void initSampleData() {

	}

	@Override
	public void loadCodeLevelDataModels(ICodeLevelDataModelRegister modelRegister) {
		modelRegister.registerRefTableAndFlyDataModelFromPackage("org.myfly.platform.report.model");
	}

	@Override
	public void loadCodeLevelViewModels(ICodeLevelModelRegister modelRegister) {
	}

	@Override
	public void loadCodeLevelProcessModels(ICodeLevelModelRegister modelRegister) {

	}

}
