package org.myfly.platform.core.context;

import java.io.Serializable;
import java.util.Date;

import org.myfly.platform.core.domain.AlertInfo;
import org.myfly.platform.core.system.domain.ITenant;
import org.myfly.platform.core.system.domain.IUser;

/**
 * 用户会话信息，成功登录后登记
 * 
 * @author xiangwanhong
 *
 */
public class UserSession implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -330646850597064989L;
	/**
	 * 用户
	 */
	private IUser user;
	/**
	 * 租户
	 */
	private ITenant tenant;
	/**
	 * 登录时间
	 */
	private Date loginTime;
	/**
	 * 布局名称
	 */
	private String layoutName;
	/**
	 * 会话安全标示
	 */
	private String tokenuid;
	/**
	 * 最后一次警告信息
	 */
	private AlertInfo alertInfo;

	public IUser getUser() {
		return user;
	}

	public void setUser(IUser user) {
		this.user = user;
	}

	public ITenant getTenant() {
		return tenant;
	}

	public void setTenant(ITenant tenant) {
		this.tenant = tenant;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getLayoutName() {
		return layoutName;
	}

	public void setLayoutName(String layoutName) {
		this.layoutName = layoutName;
	}

	public String getTokenuid() {
		return tokenuid;
	}

	public void setTokenuid(String tokenuid) {
		this.tokenuid = tokenuid;
	}

	public AlertInfo getAlertInfo() {
		return alertInfo;
	}

	public void setAlertInfo(AlertInfo alertInfo) {
		this.alertInfo = alertInfo;
	}

}
