package org.myfly.platform.core.context;

import java.io.Serializable;
import java.util.Date;

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

}
