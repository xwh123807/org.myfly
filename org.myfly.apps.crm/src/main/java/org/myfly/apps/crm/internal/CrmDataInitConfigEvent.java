package org.myfly.apps.crm.internal;

import java.net.URL;

import org.myfly.platform.system.core.service.AppStartLevel;
import org.myfly.platform.system.core.service.IAppConfigEvent;
import org.myfly.platform.system.core.service.IMenuService;
import org.myfly.platform.system.metadata.internal.FileMetaDataRegister;
import org.springframework.stereotype.Component;

@Component
public class CrmDataInitConfigEvent implements IAppConfigEvent{

	@Override
	public AppStartLevel getAppStartLevel() {
		return AppStartLevel.LEVEL_2;
	}

	@Override
	public void registerMenus(IMenuService menuService) {
		URL url = getClass().getResource("/config/crmMenuConfig.json");
		menuService.registerMenus(url);
	}

	@Override
	public void initSysData() {
		
	}

	@Override
	public void initSampleData() {
		
	}

	@Override
	public void registerExternalMetaData(FileMetaDataRegister fileMetaDataRegister) {
		
	}

}
