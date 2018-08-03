package org.myfly.platform.core3.process.internal;

import org.myfly.platform.core3.process.annotation.FlyProcess;
import org.myfly.platform.core3.process.annotation.FlyProcessParam;

/**
 * 更改用户密码 org.compiere.process.UserPassword
 * 
 * @author xiangwanhong
 *
 */
@FlyProcess
public class ChangePassword extends SvrProcess {
	@FlyProcessParam
	private String userID;

	@FlyProcessParam
	private String oldPassword;

	@FlyProcessParam
	private String newPassword;

	@FlyProcessParam
	private String newEMail;

	@FlyProcessParam
	private String newEMailUser;

	@FlyProcessParam
	private String newEMailUserPW;

	@Override
	protected void prepare() {

	}

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
