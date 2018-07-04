package org.myfly.platform.core3.metadata.internal;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.starter.ICodeLevelModelRegister;
import org.myfly.platform.core.utils.EntityClassUtil;
import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.metadata.builder.DataTypeBuilder;
import org.myfly.platform.core3.metadata.builder.ElementBuilder;
import org.myfly.platform.core3.metadata.builder.EntityTypeBuilder;
import org.myfly.platform.core3.metadata.builder.FlyDataModelBuilder;
import org.myfly.platform.core3.metadata.builder.RefListBuilder;
import org.myfly.platform.core3.metadata.builder.RefTableBuilder;
import org.myfly.platform.core3.metadata.define.FDataType;
import org.myfly.platform.core3.metadata.define.FElement;
import org.myfly.platform.core3.metadata.define.FEntityType;
import org.myfly.platform.core3.metadata.define.FRefList;
import org.myfly.platform.core3.metadata.define.FRefTable;
import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.core3.metadata.define.FlyMemoryDataModel;
import org.springframework.stereotype.Component;

@Component
public class CodeLevelModelRegister implements ICodeLevelModelRegister {
	private static Log log = LogFactory.getLog(CodeLevelModelRegister.class);

	private FlyMemoryDataModel getFlyMemoryDataModel() {
		return FlyMemoryDataModel.getInstance();
	}

	@Override
	public void registerElements(List<FElement> elements) {
		getFlyMemoryDataModel().addElements(elements);
	}

	@Override
	public void registerElementsFromEnumClass(Class<? extends Enum<?>> enumClass) {
		log.info("注册Element，" + enumClass.getName());
		ElementBuilder builder = new ElementBuilder();
		List<FElement> list = builder.loadFromEnumClass(enumClass);
		registerElements(list);
	}

	@Override
	public void registerEntityTypes(List<FEntityType> entityTypes) {
		getFlyMemoryDataModel().addEntityTypes(entityTypes);
	}

	@Override
	public void registerEntityTypesFromEnumClass(Class<? extends Enum<?>> enumClass) {
		log.info("注册EntityType，" + enumClass.getName());
		EntityTypeBuilder builder = new EntityTypeBuilder();
		List<FEntityType> list = builder.loadFromEnumClass(enumClass);
		registerEntityTypes(list);
	}

	@Override
	public void registerRefListsFromEnumClass(Class<? extends Enum<?>> enumClass) {
		log.info("注册RefList，" + enumClass.getName());
		RefListBuilder builder = new RefListBuilder();
		List<FRefList> list = builder.loadFromEnumClass(enumClass);
		registerRefLists(list);
	}

	public void registerRefLists(List<FRefList> list) {
		getFlyMemoryDataModel().addRefLists(list);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void registerFlyDataModelFromPackage(String packageName) {
		List<Class<?>> classes = EntityClassUtil.getEntityClasses(packageName);
		if (CollectionUtils.isNotEmpty(classes)) {
			classes.forEach(item -> registerFlyDataModelFromEntityClass((Class<? extends IFlyEntity>) item));
		}
	}

	@Override
	public void registerFlyDataModelFromEntityClass(Class<? extends IFlyEntity> entityClass) {
		log.info("注册FlyDataModel，" + entityClass.getName());
		FlyDataModelBuilder builder = new FlyDataModelBuilder();
		List<FlyDataModel> list = builder.loadFromEntityClass(entityClass);
		registerFlyDataModels(list);
	}

	@Override
	public void registerFlyDataModels(List<FlyDataModel> flyDataModels) {
		getFlyMemoryDataModel().addFlyDataModels(flyDataModels);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void registerRefTablesFromPackage(String packageName) {
		List<Class<?>> classes = EntityClassUtil.getEntityClasses(packageName);
		if (CollectionUtils.isNotEmpty(classes)) {
			classes.forEach(item -> registerRefTablesFromEntityClass((Class<? extends IFlyEntity>) item));
		}
	}

	@Override
	public void registerRefTables(List<FRefTable> refTables) {
		getFlyMemoryDataModel().addRefTables(refTables);
	}

	@Override
	public void registerRefTablesFromEntityClass(Class<? extends IFlyEntity> entityClass) {
		log.info("注册FlyRefTable，" + entityClass.getName());
		RefTableBuilder builder = new RefTableBuilder();
		List<FRefTable> list = builder.loadFromEntityClass(entityClass);
		registerRefTables(list);
	}

	@Override
	public void registerDataTypesFromEnumClass(Class<FlyDataType> enumClass) {
		log.info("注册FlyDataType，" + enumClass.getName());
		DataTypeBuilder builder = new DataTypeBuilder();
		List<FDataType> list = builder.loadFromEnumClass(enumClass);
		registerDataTypes(list);
	}

	@Override
	public void registerDataTypes(List<FDataType> dataTypes) {
		getFlyMemoryDataModel().addDataTypes(dataTypes);
	}

}
