package org.myfly.platform.core.starter;

import org.myfly.platform.core.domain.AppStartLevel;

/**
 * 微服务配置接口，需要初始化时，微服务实现此接口
 * @author xiangwanhong
 *
 */
public interface IAppConfigEvent {
	/**
	 * 获取App启动级别，系统将先启动AppStartLevel值低的
	 * @return
	 */
	AppStartLevel getAppStartLevel();
	
	/**
	 * 初始化系统数据
	 */
	void initSysData();
	
	/**
	 * 初始样例数据
	 */
	void initSampleData();
	
	/**
	 * 加载代码级数据模型
	 */
	void loadCodeLevelDataModels(ICodeLevelDataModelRegister modelRegister);
	
	/**
	 * 加载代码级显示模型
	 * @param modelRegister
	 */
	void loadCodeLevelViewModels(ICodeLevelModelRegister modelRegister);
	
	/**
	 * 加载代码级过程模型
	 * @param modelRegister
	 */
	void loadCodeLevelProcessModels(ICodeLevelModelRegister modelRegister);
}
