package org.myfly.platform.system.tpcc.internal;

import java.net.URL;

import org.myfly.platform.core.domain.AppStartLevel;
import org.myfly.platform.core.metadata.service.IMetaDataRegister;
import org.myfly.platform.core.starter.IAppConfigEvent;
import org.myfly.platform.core.user.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TpccAppConfigEvent implements IAppConfigEvent {
	@Autowired
	private TpccDataService tpccDataService;

	@Override
	public void initSampleData() {
		// 初始化tpcc测试数据
		tpccDataService.setScale(2);
		tpccDataService.generateDimensionDatas(1);
		tpccDataService.generateOrderDatas(1);
	}

	@Override
	public void initSysData() {

	}

	@Override
	public void registerExternalMetaData(IMetaDataRegister metaDataRegister) {

	}

	@Override
	public AppStartLevel getAppStartLevel() {
		return AppStartLevel.LEVEL_1;
	}

	@Override
	public void registerMenus(IMenuService menuService) {
		URL url = getClass().getResource("/config/stdtestMenuConfig.json");
		menuService.registerMenus(url);
	}


}
