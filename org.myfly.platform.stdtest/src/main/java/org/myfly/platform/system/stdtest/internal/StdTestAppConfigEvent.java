package org.myfly.platform.system.stdtest.internal;

import java.net.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.domain.AppStartLevel;
import org.myfly.platform.core.metadata.service.IMetaDataRegister;
import org.myfly.platform.core.starter.IAppConfigEvent;
import org.myfly.platform.core.user.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StdTestAppConfigEvent implements IAppConfigEvent {
	private Log log = LogFactory.getLog(getClass());
	@Autowired
	private StdTestDataService stdTestUtil;

	/**
	 * 初始化测试数据记录条数
	 */
	private int initStdTestDataCount = 25;

	@Override
	public AppStartLevel getAppStartLevel() {
		return AppStartLevel.LEVEL_1;
	}

	@Override
	public void initSysData() {
	}

	@Override
	public void initSampleData() {
		if (initStdTestDataCount > 0) {
			// 初始化基准测试数据
			if (log.isDebugEnabled()) {
				log.debug("初始基准测试数据，记录数：" + initStdTestDataCount);
			}
			stdTestUtil.initTestData(initStdTestDataCount);
		}
	}

	@Override
	public void registerExternalMetaData(IMetaDataRegister metaDataRegister) {
		URL url = getClass().getResource("/config/metadata/std_test_employee.json");
		metaDataRegister.registerMeta("xwh_std_test_employee", url);
	}

	@Override
	public void registerMenus(IMenuService menuService) {
		// TODO Auto-generated method stub
		
	}


}
