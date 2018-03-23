package org.myfly.apps.mdm.internal;

import java.net.URL;

import org.myfly.platform.system.core.service.AppStartLevel;
import org.myfly.platform.system.core.service.IAppConfigEvent;
import org.myfly.platform.system.core.service.IMenuService;
import org.myfly.platform.system.metadata.internal.FileMetaDataRegister;
import org.springframework.stereotype.Component;

@Component
public class MdmDataInitConfigEvent implements IAppConfigEvent{

	@Override
	public AppStartLevel getAppStartLevel() {
		return AppStartLevel.LEVEL_1;
	}

	@Override
	public void registerMenus(IMenuService menuService) {
		URL url = getClass().getResource("/config/mdmMenuConfig.json");
		menuService.registerMenus(url);		
	}

	@Override
	public void initSysData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initSampleData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerExternalMetaData(FileMetaDataRegister fileMetaDataRegister) {
		// TODO Auto-generated method stub
		
	}

}
