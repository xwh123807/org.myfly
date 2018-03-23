package org.myfly.platform.system.service;

import org.myfly.platform.system.domain.UserBehavior;

public interface IUserBehaviorService {
	/**
	 * 增加用户行为记录通过异步消息的方式添加，不影响主事务
	 * @param userBehavior	用户行为记录
	 */
	void addUserBehavior(UserBehavior userBehavior);

}
