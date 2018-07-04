package org.myfly.platform.core.starter;

import java.util.List;

import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.metadata.define.FElement;
import org.myfly.platform.core3.metadata.define.FEntityType;
import org.myfly.platform.core3.metadata.define.FRefTable;
import org.myfly.platform.core3.metadata.define.FlyDataModel;

public interface ICodeLevelModelRegister {
	void registerElements(List<FElement> elements);

	void registerElementsFromEnumClass(Class<? extends Enum<?>> enumClass);

	void registerEntityTypes(List<FEntityType> entityTypes);

	void registerEntityTypesFromEnumClass(Class<? extends Enum<?>> enumClass);

	void registerRefListsFromEnumClass(Class<? extends Enum<?>> enumClass);

	void registerFlyDataModelFromPackage(String packageName);

	void registerFlyDataModelFromEntityClass(Class<? extends IFlyEntity> entityClass);
	
	 void registerFlyDataModels(List<FlyDataModel> flyDataModels);
	
	void registerRefTablesFromEntityClass(Class<? extends IFlyEntity> entityClass);

	void registerRefTablesFromPackage(String packageName);
	
	void registerRefTables(List<FRefTable> refTables);
}
