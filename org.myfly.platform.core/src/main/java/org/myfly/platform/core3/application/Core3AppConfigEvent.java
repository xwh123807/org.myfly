package org.myfly.platform.core3.application;

import org.myfly.platform.core.domain.AppStartLevel;
import org.myfly.platform.core.metadata.service.IMetaDataRegister;
import org.myfly.platform.core.starter.IAppConfigEvent;
import org.myfly.platform.core.starter.ICodeLevelModelRegister;
import org.myfly.platform.core.system.service.IMenuService;
import org.myfly.platform.core3.dbinit.Core3SystemData;
import org.myfly.platform.core3.dbinit.FlyDataModelImporter;
import org.myfly.platform.core3.dbinit.resources.Element;
import org.myfly.platform.core3.dbinit.resources.EntityType;
import org.myfly.platform.core3.dbinit.resources.RefLists;
import org.myfly.platform.core3.domain.FlyDataType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Core3AppConfigEvent implements IAppConfigEvent {
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
	public void registerMenus(IMenuService menuService) {

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
	public void registerExternalMetaData(IMetaDataRegister metaDataRegister) {
	}

	@Override
	public void loadCodeLevelModels(ICodeLevelModelRegister modelRegister) {
		modelRegister.registerDataTypesFromEnumClass(FlyDataType.class);
		modelRegister.registerEntityTypesFromEnumClass(EntityType.class);
		modelRegister.registerElementsFromEnumClass(Element.class);
		modelRegister.registerRefListsFromEnumClass(RefLists.class);
		modelRegister.registerRefTablesFromPackage("org.myfly.platform.core3");
		modelRegister.registerFlyDataModelFromPackage("org.myfly.platform.core3");
	}

}
