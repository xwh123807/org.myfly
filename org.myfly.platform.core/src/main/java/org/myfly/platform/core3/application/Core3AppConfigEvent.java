package org.myfly.platform.core3.application;

import org.myfly.platform.core.domain.AppStartLevel;
import org.myfly.platform.core.metadata.service.IMetaDataRegister;
import org.myfly.platform.core.starter.IAppConfigEvent;
import org.myfly.platform.core.system.service.IMenuService;
import org.myfly.platform.core3.dbinit.DBInit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Core3AppConfigEvent implements IAppConfigEvent {
	@Autowired
	private DBInit dbInit;

	/**
	 * 是否初始化数据库
	 */
	private boolean initDB = true;

	@Override
	public AppStartLevel getAppStartLevel() {
		return AppStartLevel.LEVEL_0;
	}

	@Override
	public void registerMenus(IMenuService menuService) {

	}

	@Override
	public void initSysData() {
		if (initDB) {
			dbInit.dbInit();
		}
	}

	@Override
	public void initSampleData() {

	}

	@Override
	public void registerExternalMetaData(IMetaDataRegister metaDataRegister) {

	}

}
