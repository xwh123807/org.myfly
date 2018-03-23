package org.myfly.platform.system.domain;

import org.myfly.platform.core.domain.BaseEnum;

/**
 * 开发状态（正在开发，已经部署）
 * 
 * @author xiangwanhong
 *
 */
public enum DevelopStateType implements BaseEnum {
	// 正在开发
	DEVELOPTING("正在开发"),
	// 已经部署
	DEPLOYED("已经部署");

	private String title;

	DevelopStateType(final String title) {
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
	}
}
