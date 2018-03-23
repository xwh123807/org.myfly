package org.myfly.platform.system.domain;

import org.myfly.platform.core.domain.BaseEnum;

public enum UserAction implements BaseEnum {
	OPEN("打开"), LINK("点击链接打开");

	private String title;

	private UserAction(final String title) {
		this.title = title;
	}

	@Override
	public String getTitle() {
		return this.title;
	}

}
