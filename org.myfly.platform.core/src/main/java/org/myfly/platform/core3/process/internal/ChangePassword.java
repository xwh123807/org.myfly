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
public class ChangePassword {
	@FlyProcessParam
	private String userID;

	@FlyProcessParam
	private String oldPassword;

	@FlyProcessParam
	private String newPassword;

	@FlyProcessParam
	private String confirmPassword;
}
