package org.myfly.platform.core.starter;

import java.util.List;

import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.metadata.define.FDataType;
import org.myfly.platform.core3.metadata.define.FElement;
import org.myfly.platform.core3.metadata.define.FEntityType;
import org.myfly.platform.core3.metadata.define.FRefTable;
import org.myfly.platform.core3.metadata.define.FlyDataModel;

public interface ICodeLevelModelRegister {
	void registerElements(List<FElement> elements, boolean override);

	void registerElementsFromEnumClass(Class<? extends Enum<?>> enumClass, boolean override);

	void registerEntityTypes(List<FEntityType> entityTypes);

	void registerEntityTypesFromEnumClass(Class<? extends Enum<?>> enumClass);

	void registerRefListsFromEnumClass(Class<? extends Enum<?>> enumClass);

	List<String> registerFlyDataModelFromPackage(String packageName);

	List<String> registerFlyDataModelFromEntityClass(Class<? extends IFlyEntity> entityClass);

	List<String> registerFlyDataModels(List<FlyDataModel> flyDataModels);

	void registerRefTablesFromEntityClass(Class<? extends IFlyEntity> entityClass);

	void registerRefTablesFromPackage(String packageName);

	void registerRefTables(List<FRefTable> refTables);

	void registerDataTypesFromEnumClass(Class<FlyDataType> enumClass);

	void registerDataTypes(List<FDataType> dataTypes);
}
