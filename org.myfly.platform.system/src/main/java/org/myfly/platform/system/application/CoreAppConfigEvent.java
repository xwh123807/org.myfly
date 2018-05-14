package org.myfly.platform.system.application;

import java.net.URL;

import org.myfly.platform.core.context.SystemContext;
import org.myfly.platform.core.context.UserContext;
import org.myfly.platform.core.context.UserSession;
import org.myfly.platform.core.domain.AppStartLevel;
import org.myfly.platform.core.metadata.service.IMetaDataRegister;
import org.myfly.platform.core.starter.IAppConfigEvent;
import org.myfly.platform.core.system.domain.ITenant;
import org.myfly.platform.core.system.domain.IUser;
import org.myfly.platform.core.system.service.IMenuService;
import org.myfly.platform.system.domain.Tenant;
import org.myfly.platform.system.domain.User;
import org.myfly.platform.system.internal.SystemDataInitial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CoreAppConfigEvent implements IAppConfigEvent {
	@Autowired
	private SystemDataInitial systemDataInitial;

	@Override
	public AppStartLevel getAppStartLevel() {
		return AppStartLevel.LEVEL_0;
	}

	@Override
	public void registerMenus(IMenuService menuService) {
		URL url = CoreAppConfigEvent.class.getResource("/config/coreMenuConfig.json");
		menuService.registerMenus(url);
	}

	@Override
	public void initSysData() {
		initUserSession();
		systemDataInitial.initSystemInternalData();
	}

	@Override
	public void initSampleData() {

	}

	@Override
	public void registerExternalMetaData(IMetaDataRegister metaDataRegister) {

	}

	private void initUserSession() {
		// TODO 系统初始化时填值，仅用于开发不登录不验证用户身份
		UserSession userSession = new UserSession();
		userSession.setTokenuid(SystemContext.SYS_SUSER_UID);
		IUser user = new User();
		user.setUid(SystemContext.SYS_SUSER_UID);
		userSession.setUser(user);
		ITenant tenant = new Tenant();
		tenant.setUid(SystemContext.SYS_STENANT_UID);
		userSession.setTenant(tenant);
		userSession.setLayoutName("default");
		UserContext.addUserSession(userSession);
	}
}
