package org.myfly.platform.system.application;

import java.net.URL;

import org.myfly.platform.core.domain.AppStartLevel;
import org.myfly.platform.core.metadata.service.IMetaDataRegister;
import org.myfly.platform.core.starter.IAppConfigEvent;
import org.myfly.platform.core.system.service.IMenuService;
import org.springframework.stereotype.Component;

@Component
public class SystemAppConfigEvent implements IAppConfigEvent {
	@Override
	public AppStartLevel getAppStartLevel() {
		return AppStartLevel.LEVEL_1;
	}

	@Override
	public void initSysData() {
		
	}

	@Override
	public void registerExternalMetaData(IMetaDataRegister metaDataRegister) {

	}

	@Override
	public void initSampleData() {
		
	}

	@Override
	public void registerMenus(IMenuService menuService) {
		URL url = SystemAppConfigEvent.class.getResource("/config/sysMenuConfig.json");
		menuService.registerMenus(url);
	}

}
