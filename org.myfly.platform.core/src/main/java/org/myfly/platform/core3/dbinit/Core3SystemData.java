package org.myfly.platform.core3.dbinit;

import javax.transaction.Transactional;

import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.core3.metadata.internal.FlySystemResource;
import org.myfly.platform.core3.model.ConnectionProfile;
import org.myfly.platform.core3.model.NotificationType;
import org.myfly.platform.core3.model.PClient;
import org.myfly.platform.core3.model.POrg;
import org.myfly.platform.core3.model.PUser;
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

	@Transactional
	public void initCore3SystemData() {
		// 创建系统Client
		PClient client = dataService.findOne(PClient.class, FlySystemResource.UID_SYSTEM_CLIENT);
		if (client == null) {
			client = new PClient();
			client.setClientID(FlySystemResource.UID_SYSTEM_CLIENT);
			client.setName(FlySystemResource.NAME_SYSTEM_CLIENT);
			client.setValue("SYSTEM");
			client.setDescription("System Client");
			client.setCreated(DateUtil.nowSqlTimestamp());
			client.setIsActive(true);
			dataService.saveEntity(client);
		}
		// 创建系统Organization
		POrg org = dataService.findOne(POrg.class, FlySystemResource.UID_ALL_ORG);
		if (org == null) {
			org = new POrg();
			org.setOrgID(FlySystemResource.UID_ALL_ORG);
			org.setName(FlySystemResource.NAME_ALL_ORG);
			org.setValue("0");
			org.setDescription("All Organizations");
			org.setIsActive(true);
			org.setCreated(DateUtil.nowSqlTimestamp());
			org.setClientID(client.getClientID());
			dataService.saveEntity(org);
		}
		// 创建System用户
		PUser system = dataService.findOne(PUser.class, FlySystemResource.UID_SYSTEM_USER);
		if (system == null) {
			system = new PUser();
			system.setUserID(FlySystemResource.UID_SYSTEM_USER);
			system.setName(FlySystemResource.NAME_SYSTEM_USER);
			system.setValue(system.getName());
			system.setDescription("** Do not change **");
			system.setIsActive(true);
			system.setCreated(DateUtil.nowSqlTimestamp());
			system.setClientID(client.getClientID());
			system.setOrgID(org.getOrgID());
			system.setConnectionProfile(ConnectionProfile.L.name());
			system.setNotificationType(NotificationType.B.name());
			dataService.saveEntity(system);
		}
		// 创建SuperUser用户
		PUser superUser = dataService.findOne(PUser.class, FlySystemResource.UID_SUPER_USER);
		if (superUser == null) {
			superUser = new PUser();
			superUser.setUserID(FlySystemResource.UID_SUPER_USER);
			superUser.setName(FlySystemResource.NAME_SUPER_USER);
			superUser.setValue(superUser.getName());
			superUser.setDescription("Super User with Access to all levels");
			superUser.setIsActive(true);
			superUser.setCreated(DateUtil.nowSqlTimestamp());
			superUser.setClientID(client.getClientID());
			superUser.setOrgID(org.getOrgID());
			superUser.setConnectionProfile(ConnectionProfile.T.name());
			superUser.setNotificationType(NotificationType.E.name());
			dataService.saveEntity(superUser);
		}
		// 更新关联字段
		client.setOrgID(org.getOrgID());
		client.setCreatedBy(system.getUserID());
		client.setUpdated(DateUtil.nowSqlTimestamp());
		client.setUpdatedBy(system.getUserID());
		dataService.saveEntity(client);
		org.setClientID(client.getClientID());
		org.setCreatedBy(system.getUserID());
		org.setUpdated(DateUtil.nowSqlTimestamp());
		org.setUpdatedBy(system.getUserID());
		dataService.saveEntity(org);
		system.setCreatedBy(system.getUserID());
		system.setUpdated(DateUtil.nowSqlTimestamp());
		system.setUpdatedBy(system.getUserID());
		dataService.saveEntity(system);
		superUser.setCreatedBy(system.getUserID());
		superUser.setUpdated(DateUtil.nowSqlTimestamp());
		superUser.setUpdatedBy(system.getUserID());
		dataService.saveEntity(superUser);
		dataService.flush();
	}
}
