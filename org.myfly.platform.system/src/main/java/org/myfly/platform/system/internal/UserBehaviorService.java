package org.myfly.platform.system.internal;

import java.util.Calendar;

import org.myfly.platform.system.domain.User;
import org.myfly.platform.system.domain.UserBehavior;
import org.myfly.platform.system.service.IUserBehaviorService;

/**
 * 用户行为服务
 * @author xiangwanhong
 *
 */
public class UserBehaviorService implements IUserBehaviorService{
	/**
	 * 增加用户行为记录通过异步消息的方式添加，不影响主事务
	 * @param userBehavior
	 */
	public void addUserBehavior(UserBehavior userBehavior){
		userBehavior.setCreated(Calendar.getInstance().getTime());
		//TODO 取当前登录用户，即使是开发环境，也有模拟的用户
		User createdBy = null;
		userBehavior.setCreatedBy(createdBy );
	}
}
