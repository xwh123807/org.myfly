package org.myfly.platform.core.datamodel.internal;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.datamodel.builder.DataTypeBuilder;
import org.myfly.platform.core.datamodel.builder.ElementBuilder;
import org.myfly.platform.core.datamodel.builder.EntityTypeBuilder;
import org.myfly.platform.core.datamodel.builder.FlyDataModelBuilder;
import org.myfly.platform.core.datamodel.builder.RefListBuilder;
import org.myfly.platform.core.datamodel.builder.RefTableBuilder;
import org.myfly.platform.core.datamodel.define.FDataType;
import org.myfly.platform.core.datamodel.define.FElement;
import org.myfly.platform.core.datamodel.define.FEntityType;
import org.myfly.platform.core.datamodel.define.FRefList;
import org.myfly.platform.core.datamodel.define.FRefTable;
import org.myfly.platform.core.datamodel.define.FlyDataModel;
import org.myfly.platform.core.datamodel.define.FlyMemoryDataModel;
import org.myfly.platform.core.domain.FlyDataType;
import org.myfly.platform.core.domain.IFlyEntity;
import org.myfly.platform.core.starter.ICodeLevelDataModelRegister;
import org.myfly.platform.core.utils.EntityClassUtil;
import org.springframework.stereotype.Component;

@Component
public class CodeLevelDataModelRegister implements ICodeLevelDataModelRegister {
	private static Log log = LogFactory.getLog(CodeLevelDataModelRegister.class);

	private FlyMemoryDataModel getFlyMemoryDataModel() {
		return FlyMemoryDataModel.getInstance();
	}

	public void registerElements(List<FElement> elements, boolean override) {
		getFlyMemoryDataModel().addElements(elements, override);
	}

	@Override
	public void registerElementsFromEnumClass(Class<? extends Enum<?>> enumClass, boolean override) {
		log.info("注册Element，" + enumClass.getName());
		ElementBuilder builder = new ElementBuilder();
		List<FElement> list = builder.loadFromEnumClass(enumClass);
		registerElements(list, override);
	}

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
	public List<String> registerRefTableAndFlyDataModelFromPackage(String packageName) {
		registerRefTablesFromPackage(packageName);
		
		List<String> errors = new ArrayList<>();
		List<Class<?>> classes = EntityClassUtil.getEntityClasses(packageName);
		if (CollectionUtils.isNotEmpty(classes)) {
			classes.forEach(
					item -> errors.addAll(registerRefTableAndFlyDataModelFromEntityClass((Class<? extends IFlyEntity>) item)));
		}
		return errors;
	}

	public List<String> registerRefTableAndFlyDataModelFromEntityClass(Class<? extends IFlyEntity> entityClass) {
		log.info("注册FlyDataModel，" + entityClass.getName());
		FlyDataModelBuilder builder = new FlyDataModelBuilder();
		List<FlyDataModel> list = builder.loadFromEntityClass(entityClass);
		return registerFlyDataModels(list);
	}

	public List<String> registerFlyDataModels(List<FlyDataModel> flyDataModels) {
		return getFlyMemoryDataModel().addFlyDataModels(flyDataModels);
	}

	@SuppressWarnings("unchecked")
	public void registerRefTablesFromPackage(String packageName) {
		List<Class<?>> classes = EntityClassUtil.getEntityClasses(packageName);
		if (CollectionUtils.isNotEmpty(classes)) {
			classes.forEach(item -> registerRefTablesFromEntityClass((Class<? extends IFlyEntity>) item));
		}
	}

	public void registerRefTables(List<FRefTable> refTables) {
		getFlyMemoryDataModel().addRefTables(refTables);
	}

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

	public void registerDataTypes(List<FDataType> dataTypes) {
		getFlyMemoryDataModel().addDataTypes(dataTypes);
	}

}
