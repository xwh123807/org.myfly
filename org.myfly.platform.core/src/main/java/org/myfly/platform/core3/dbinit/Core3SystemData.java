package org.myfly.platform.core3.dbinit;

import javax.transaction.Transactional;

import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.core3.model.security.PClient;
import org.myfly.platform.core3.model.security.POrg;
import org.myfly.platform.core3.model.security.PUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 初始化系统记录，不可删除
 * 
 * @author xiangwanhong
 *
 */
@Service
public class Core3SystemData {
	@Autowired
	private IJpaDataAccessService dataService;

	@Autowired
	private SysDataModel sysDataModel;

	@Autowired
	private SysViewModel sysViewModel;

	@Transactional
	public void initDB() {
		initCore3SystemData();
		sysDataModel.initSysDataModel();
		sysViewModel.initSysViewModel();
	}

	@Transactional
	public void initCore3SystemData() {
		// 创建系统Client
		PClient client = dataService.findOne(PClient.class, Core3SystemConstants.UID_SYSTEM_CLIENT);
		if (client == null) {
			client = new PClient();
			client.setUid(Core3SystemConstants.UID_SYSTEM_CLIENT);
			client.setName(Core3SystemConstants.NAME_SYSTEM_CLIENT);
			client.setValue("SYSTEM");
			client.setDescription("System Client");
			client.setCreated(DateUtil.nowSqlTimestamp());
			client.setIsActive(true);
			dataService.saveEntity(client);
		}
		// 创建系统Organization
		POrg org = dataService.findOne(POrg.class, Core3SystemConstants.UID_ALL_ORG);
		if (org == null) {
			org = new POrg();
			org.setUid(Core3SystemConstants.UID_ALL_ORG);
			org.setName(Core3SystemConstants.NAME_ALL_ORG);
			org.setValue("0");
			org.setDescription("All Organizations");
			org.setIsActive(true);
			org.setCreated(DateUtil.nowSqlTimestamp());
			org.setClient(client);
			dataService.saveEntity(org);
		}
		// 创建System用户
		PUser system = dataService.findOne(PUser.class, Core3SystemConstants.UID_SYSTEM_USER);
		if (system == null) {
			system = new PUser();
			system.setUid(Core3SystemConstants.UID_SYSTEM_USER);
			system.setName(Core3SystemConstants.NAME_SYSTEM_USER);
			system.setValue(system.getName());
			system.setDescription("** Do not change **");
			system.setIsActive(true);
			system.setCreated(DateUtil.nowSqlTimestamp());
			system.setClient(client);
			system.setOrg(org);
			dataService.saveEntity(system);
		}
		// 创建SuperUser用户
		PUser superUser = dataService.findOne(PUser.class, Core3SystemConstants.UID_SUPER_USER);
		if (superUser == null) {
			superUser = new PUser();
			superUser.setUid(Core3SystemConstants.UID_SUPER_USER);
			superUser.setName(Core3SystemConstants.NAME_SUPER_USER);
			superUser.setValue(superUser.getName());
			superUser.setDescription("Super User with Access to all levels");
			superUser.setIsActive(true);
			superUser.setCreated(DateUtil.nowSqlTimestamp());
			superUser.setClient(client);
			superUser.setOrg(org);
			dataService.saveEntity(superUser);
		}
		// 更新关联字段
		client.setOrg(org);
		client.setCreatedBy(system);
		client.setUpdated(DateUtil.nowSqlTimestamp());
		client.setUpdatedBy(system);
		dataService.saveEntity(client);
		org.setClient(client);
		org.setCreatedBy(system);
		org.setUpdated(DateUtil.nowSqlTimestamp());
		org.setUpdatedBy(system);
		dataService.saveEntity(org);
		system.setClient(client);
		system.setOrg(org);
		system.setCreatedBy(system);
		system.setUpdated(DateUtil.nowSqlTimestamp());
		system.setUpdatedBy(system);
		dataService.saveEntity(system);
		superUser.setClient(client);
		superUser.setOrg(org);
		superUser.setCreatedBy(system);
		superUser.setUpdated(DateUtil.nowSqlTimestamp());
		superUser.setUpdatedBy(system);
		dataService.saveEntity(superUser);
	}
}
