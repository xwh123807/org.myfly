package org.myfly.platform.core.application;

import org.myfly.platform.core.domain.AppStartLevel;
import org.myfly.platform.core.metadata.service.IMetaDataRegister;
import org.myfly.platform.core.starter.IAppConfigEvent;
import org.myfly.platform.core.system.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CoreAppConfigEvent implements IAppConfigEvent {
	@Autowired
	private TestModelGenerator testModelGenerator;

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
		testModelGenerator.initAllTestModel();
	}

	@Override
	public void registerExternalMetaData(IMetaDataRegister metaDataRegister) {

	}

}
