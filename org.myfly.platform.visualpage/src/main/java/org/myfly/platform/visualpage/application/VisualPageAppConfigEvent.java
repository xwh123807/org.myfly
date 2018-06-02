package org.myfly.platform.visualpage.application;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.domain.AppStartLevel;
import org.myfly.platform.core.metadata.service.IMetaDataRegister;
import org.myfly.platform.core.starter.IAppConfigEvent;
import org.myfly.platform.core.system.service.IMenuService;
import org.myfly.platform.visualpage.config.FlyVPProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VisualPageAppConfigEvent implements IAppConfigEvent {
	private static Log log = LogFactory.getLog(VisualPageAppConfigEvent.class);
	@Autowired
	private FlyVPProperties vpProperties;

	@Override
	public AppStartLevel getAppStartLevel() {
		return AppStartLevel.LEVEL_1;
	}

	@Override
	public void initSysData() {
		if (vpProperties.isClearWorkTemplatePath()) {
			doClearVPWorkTemplatePath();
		}
	}

	@Override
	public void registerExternalMetaData(IMetaDataRegister metaDataRegister) {

	}

	@Override
	public void initSampleData() {

	}

	@Override
	public void registerMenus(IMenuService menuService) {
	}

	/**
	 * 清除动态产生的页面模板工作目录。只有在临时目录下才清除，避免误操作
	 */
	public void doClearVPWorkTemplatePath() {
		if (vpProperties.getWorkTemplatePath().contains(FileUtils.getTempDirectory().getAbsolutePath())) {
			if (log.isInfoEnabled()) {
				log.info("清除目录，" + vpProperties.getWorkTemplatePath());
			}
			FileUtils.deleteQuietly(new File(vpProperties.getWorkTemplatePath()));
		}
	}
}
