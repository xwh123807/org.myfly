package org.myfly.platform.core.starter;

public interface ICodeLevelViewModelRegister {
	/**
	 * 从枚举类注册显示模型
	 * 
	 * @param enumClass
	 */
	void registerFlyViewModelsFromEnumClass(Class<? extends Enum<?>> enumClass);
}
