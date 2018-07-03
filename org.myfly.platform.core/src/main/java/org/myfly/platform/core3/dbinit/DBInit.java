package org.myfly.platform.core3.dbinit;

import javax.transaction.Transactional;

import org.myfly.platform.core3.dbinit.resources.Element;
import org.myfly.platform.core3.dbinit.resources.EntityType;
import org.myfly.platform.core3.dbinit.resources.RefList;
import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.metadata.service.IFlyDataModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBInit {
	@Autowired
	private IFlyDataModelService dataModelService;

	@Autowired
	private Core3SystemData systemData;

	@Autowired
	private EntityTypeImporter entityTypeImporter;

	@Autowired
	private DataTypeImporter dataTypeImporter;

	@Autowired
	private ElementImporter elementImporter;

	@Autowired
	private RefListImporter refListImporter;

	@Autowired
	private TableImporter tableImporter;

	@Transactional
	public void dbInit() {
		importSystemData();
		importEntityType();
		importDataType();
		importElement();
		importRefList();
		importTables();
	}

	private void importSystemData() {
		systemData.initCore3SystemData();
	}

	private void importEntityType() {
		entityTypeImporter.load(EntityType.class);
		entityTypeImporter.save();
	}

	private void importDataType() {
		dataTypeImporter.load(FlyDataType.class);
		dataTypeImporter.save();
	}

	private void importElement() {
		elementImporter.load(Element.class);
		elementImporter.save();
	}

	private void importRefList() {
		refListImporter.load(RefList.class);
		refListImporter.save();
	}

	private void importTables() {
		dataModelService.getAllEntityClasses().forEach(entityClass -> {
			try {
				tableImporter.load((Class<? extends IFlyEntity>) entityClass);
				tableImporter.save();
			} catch (Exception e) {
				throw new RuntimeException("[" + entityClass.getName() + "]保存失败, " + e.getMessage());
			}
		});
	}
}
