package org.myfly.platform.core.starter;

/**
 * 代码级模型注册器
 * 
 * @author xiangwanhong
 *
 */
public interface ICodeLevelModelRegister {
	/**
	 * 从枚举类注册显示模型
	 * 
	 * @param enumClass
	 */
	void registerFlyViewModelsFromEnumClass(Class<? extends Enum<?>> enumClass);

	/**
	 * 注册指定包下的过程模型
	 * 
	 * @param packageName
	 */
	void registerFlyProcessModelsFromPackage(String packageName);

	/**
	 * 注册指定包下的报告模型
	 * 
	 * @param packageName
	 */
	void registerFlyReportModelsFromPackage(String packageName);
}
