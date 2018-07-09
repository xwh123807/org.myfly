package org.myfly.platform.core.starter;

import java.util.List;

import org.myfly.platform.core3.domain.FlyDataType;

public interface ICodeLevelDataModelRegister {
	/**
	 * 注册系统元素
	 * 
	 * @param elements
	 * @param override
	 */
//	void registerElements(List<FElement> elements, boolean override);

	/**
	 * 从枚举类中注册系统元素
	 * 
	 * @param enumClass
	 * @param override
	 */
	void registerElementsFromEnumClass(Class<? extends Enum<?>> enumClass, boolean override);

	/**
	 * 注册实体类型
	 * 
	 * @param entityTypes
	 */
//	void registerEntityTypes(List<FEntityType> entityTypes);

	/**
	 * 从枚举类中注册实体类型
	 * 
	 * @param enumClass
	 */
	void registerEntityTypesFromEnumClass(Class<? extends Enum<?>> enumClass);

	/**
	 * 从枚举类注册引用列表
	 * 
	 * @param enumClass
	 */
	void registerRefListsFromEnumClass(Class<? extends Enum<?>> enumClass);

	/**
	 * 从枚举类注册系统数据类型
	 * 
	 * @param enumClass
	 */
	void registerDataTypesFromEnumClass(Class<FlyDataType> enumClass);

	/**
	 * 注册数据类型
	 * 
	 * @param dataTypes
	 */
//	void registerDataTypes(List<FDataType> dataTypes);

	/**
	 * 注册包下所有的实体引用及实体
	 * 
	 * @param packageName
	 * @return
	 */
	List<String> registerRefTableAndFlyDataModelFromPackage(String packageName);

//	List<String> registerRefTableAndFlyDataModelFromEntityClass(Class<? extends IFlyEntity> entityClass);

//	List<String> registerFlyDataModels(List<FlyDataModel> flyDataModels);
}
