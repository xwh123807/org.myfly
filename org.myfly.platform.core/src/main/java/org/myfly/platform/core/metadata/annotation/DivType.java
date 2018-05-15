package org.myfly.platform.core.metadata.annotation;

import org.myfly.platform.core.domain.BaseEnum;

public enum DivType implements BaseEnum {
	// 缺省
	DEFAULT("缺省"),
	// tab页签显示
	TAB("页签"),
	// modal模态窗口显示
	MODAL("模态");

	private String title;

	private DivType(String title) {
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
	}
}
