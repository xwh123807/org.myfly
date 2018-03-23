package org.myfly.platform.system.domain;

import org.myfly.platform.core.domain.BaseEnum;

/**
 * 所有者级别
 * 
 * @author xiangwanhong
 *
 */
public enum OwnerLevel implements BaseEnum {
	// 系统级，有平台提供
	SYSTEM("系统级"),
	// 应用级，由APP开发者提供
	APPLICATION("应用级"),
	// 用户级，由用户自定义
	USER("用户级");

	private String title;

	private OwnerLevel(final String title) {
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
	}
}
