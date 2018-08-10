package org.myfly.platform.core.process.internal;

import org.myfly.platform.core.process.annotation.FlyProcess;
import org.myfly.platform.core.process.annotation.FlyProcessParam;
import org.myfly.platform.core.process.service.SvrProcess;

/**
 * 更改用户密码 org.compiere.process.UserPassword
 * 
 * @author xiangwanhong
 *
 */
@FlyProcess(name = "更改密码")
public class ChangePassword extends SvrProcess {
	@FlyProcessParam(name = "User")
	private String userID;

	@FlyProcessParam(name = "旧密码", element = "password")
	private String oldPassword;

	@FlyProcessParam(name = "新密码", element = "password")
	private String newPassword;

	@FlyProcessParam(name = "新邮箱", element = "eMail")
	private String newEMail;

	@FlyProcessParam(name = "邮箱用户名", element = "eMailUser")
	private String newEMailUser;

	@FlyProcessParam(name = "邮箱密码", element = "eMailUserPW")
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
