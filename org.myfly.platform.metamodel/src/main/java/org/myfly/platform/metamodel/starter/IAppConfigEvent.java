package org.myfly.platform.metamodel.starter;

import org.myfly.platform.metamodel.domain.AppStartLevel;
import org.myfly.platform.metamodel.service.IMenuService;
import org.myfly.platform.metamodel.service.IMetaDataRegister;

/**
 * 微服务配置接口，需要初始化时，微服务实现此接口
 * @author xiangwanhong
 *
 */
public interface IAppConfigEvent {
	/**
	 * 获取App启动级别
	 * @return
	 */
	AppStartLevel getAppStartLevel();
	
	/**
	 * 注册菜单
	 */
	void registerMenus(IMenuService menuService);
	
	/**
	 * 初始化系统数据
	 */
	void initSysData();
	
	/**
	 * 初始样例数据
	 */
	void initSampleData();
	
	/**
	 * 注册扩展元模型
	 * @param fileMetaDataRegister
	 */
	void registerExternalMetaData(final IMetaDataRegister metaDataRegister);
}
