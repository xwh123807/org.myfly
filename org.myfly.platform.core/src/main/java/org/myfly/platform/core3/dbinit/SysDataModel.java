package org.myfly.platform.core3.dbinit;

import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.core3.metadata.builder.EntityFlyTableBuilder;
import org.myfly.platform.core3.metadata.builder.PTTableFlyTableBuilder;
import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.core3.metadata.service.IFlyDataModelService;
import org.myfly.platform.core3.model.data.PTable;
import org.myfly.platform.core3.model.security.PClient;
import org.myfly.platform.core3.model.security.POrg;
import org.myfly.platform.core3.model.security.PUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysDataModel {
	private Log log = LogFactory.getLog(SysDataModel.class);
	@Autowired
	private IFlyDataModelService dataModelService;
	@Autowired
	private IJpaDataAccessService dataService;

	private PClient getSystemClient() {
		return dataService.findOne(PClient.class, Core3SystemConstants.UID_SYSTEM_CLIENT);
	}

	private POrg getAllOrg() {
		return dataService.findOne(POrg.class, Core3SystemConstants.UID_ALL_ORG);
	}

	private PUser getSystemUser() {
		return dataService.findOne(PUser.class, Core3SystemConstants.UID_SYSTEM_USER);
	}

	@Transactional
	public void initSysDataModel() {
		dataModelService.getAllEntityClasses().forEach(entityClass -> {
			if (log.isInfoEnabled()) {
				log.info("import data model for " + entityClass.getName());
			}
			FlyDataModel dataModel = new FlyDataModel(new EntityFlyTableBuilder(entityClass));
			dataModel.validate();
			PTable table = PTTableFlyTableBuilder.toPTable(dataModel);
			table.setClient(getSystemClient());
			table.setOrg(getAllOrg());
			table.setCreated(DateUtil.nowSqlTimestamp());
			table.setCreatedBy(getSystemUser());
			table.setUpdated(DateUtil.nowSqlTimestamp());
			table.setUpdatedBy(getSystemUser());
			dataService.saveEntity(table);
		});
	}
}
