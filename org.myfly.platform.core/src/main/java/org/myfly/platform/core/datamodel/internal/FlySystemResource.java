package org.myfly.platform.core.datamodel.internal;

import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.model.PClient;
import org.myfly.platform.core.model.POrg;
import org.myfly.platform.core.model.PUser;
import org.myfly.platform.core.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author xiangwanhong
 *
 */
@Component
public class FlySystemResource {
	public static String UID_SYSTEM_CLIENT = "1000000932658043";

	public static String UID_ALL_ORG = "1000000785171079";

	public static String UID_SYSTEM_USER = "1000001506439287";

	public static String UID_SUPER_USER = "1000001947959881";

	public static String NAME_SYSTEM_CLIENT = "System";

	public static String NAME_ALL_ORG = "*";

	public static String NAME_SYSTEM_USER = "System";

	public static String NAME_SUPER_USER = "SuperUser";

	@Autowired
	private IJpaDataAccessService dataService;

	/*
	 * 40289f65642bc6b401642bc6b6160004 40289f65642bc6b401642bc6b6160005
	 * 40289f65642bc6b401642bc6b6160006 40289f65642bc6b401642bc6b6160007
	 * 40289f65642bc6b401642bc6b6160008 40289f65642bc6b401642bc6b6160009
	 */

	public String getSystemClientID() {
		return UID_SYSTEM_CLIENT;
	}

	public String getAllOrgID() {
		return UID_ALL_ORG;
	}

	public String getSystemUserID() {
		return UID_SYSTEM_USER;
	}

	public String getSuperUserID() {
		return UID_SUPER_USER;
	}

	public PClient getSystemClient() {
		return dataService.findOne(PClient.class, UID_SYSTEM_CLIENT);
	}

	public POrg getAllOrg() {
		return dataService.findOne(POrg.class, UID_ALL_ORG);
	}

	public PUser getSystemUser() {
		return dataService.findOne(PUser.class, UID_SYSTEM_USER);
	}

	public PUser getSuperUser() {
		return dataService.findOne(PUser.class, UID_SUPER_USER);
	}
	
	public static void main(String args[]) {
		for (int i = 0 ; i < 10; i ++) {
			System.out.println(UUIDUtil.newUUID());
		}
	}
}
