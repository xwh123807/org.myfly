package org.myfly.platform.core.application;

import org.myfly.platform.core.domain.AppStartLevel;
import org.myfly.platform.core.starter.IAppConfigEvent;
import org.myfly.platform.core.starter.ICodeLevelDataModelRegister;
import org.myfly.platform.core.starter.ICodeLevelViewModelRegister;
import org.springframework.stereotype.Component;

@Component
public class CoreAppConfigEvent implements IAppConfigEvent {
	@Override
	public AppStartLevel getAppStartLevel() {
		return AppStartLevel.LEVEL_1;
	}

	@Override
	public void initSysData() {

	}

	@Override
	public void initSampleData() {
		// testModelGenerator.initAllTestModel();
	}

	@Override
	public void loadCodeLevelDataModels(ICodeLevelDataModelRegister modelRegister) {
	}

	@Override
	public void loadCodeLevelViewModels(ICodeLevelViewModelRegister modelRegister) {
		// TODO Auto-generated method stub

	}

}
