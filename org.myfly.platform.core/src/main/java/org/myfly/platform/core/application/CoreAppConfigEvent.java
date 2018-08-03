package org.myfly.platform.core.application;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.myfly.platform.core.dbinit.Core3SystemData;
import org.myfly.platform.core.dbinit.FlyDataModelImporter;
import org.myfly.platform.core.dbinit.resources.Element_zh_CN;
import org.myfly.platform.core.dbinit.resources.EntityType;
import org.myfly.platform.core.dbinit.resources.MyElement_zh_CN;
import org.myfly.platform.core.dbinit.resources.MyRefLists_zh_CN;
import org.myfly.platform.core.domain.AppStartLevel;
import org.myfly.platform.core.domain.FlyDataType;
import org.myfly.platform.core.starter.IAppConfigEvent;
import org.myfly.platform.core.starter.ICodeLevelDataModelRegister;
import org.myfly.platform.core.starter.ICodeLevelViewModelRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CoreAppConfigEvent implements IAppConfigEvent {
	@Autowired
	private FlyDataModelImporter flyDataModelImporter;

	@Autowired
	private Core3SystemData systemData;

	/**
	 * 是否初始化数据库
	 */
	private boolean initDB = true;

	@Override
	public AppStartLevel getAppStartLevel() {
		return AppStartLevel.LEVEL_0;
	}

	@Override
	public void initSysData() {
		if (initDB) {
			systemData.initCore3SystemData();
			flyDataModelImporter.importAll();
		}
	}

	@Override
	public void initSampleData() {

	}

	@Override
	public void loadCodeLevelDataModels(ICodeLevelDataModelRegister modelRegister) {
		List<String> errors = new ArrayList<>();
		modelRegister.registerDataTypesFromEnumClass(FlyDataType.class);
		modelRegister.registerEntityTypesFromEnumClass(EntityType.class);
		modelRegister.registerElementsFromEnumClass(Element_zh_CN.class, false);
		modelRegister.registerElementsFromEnumClass(MyElement_zh_CN.class, true);
		modelRegister.registerRefListsFromEnumClass(MyRefLists_zh_CN.class);
		errors.addAll(modelRegister.registerRefTableAndFlyDataModelFromPackage("org.myfly.platform.core"));
		if (CollectionUtils.isNotEmpty(errors)) {
			errors.forEach(item -> System.err.println(item));
			//throw new RuntimeException("数据模型校验失败");
		}
	}

	@Override
	public void loadCodeLevelViewModels(ICodeLevelViewModelRegister modelRegister) {

	}

}
