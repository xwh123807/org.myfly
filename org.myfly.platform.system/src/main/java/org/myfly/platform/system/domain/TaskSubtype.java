package org.myfly.platform.system.domain;

import org.myfly.platform.core.domain.BaseEnum;

public enum TaskSubtype implements BaseEnum {
	//
	TASK("任务"),
	//
	EMAIL("邮件"),
	//
	CALL("电话");

	private String title;

	private TaskSubtype(String title) {
		this.title = title;
	}

	@Override
	public String getTitle() {
		return this.title;
	}

}
