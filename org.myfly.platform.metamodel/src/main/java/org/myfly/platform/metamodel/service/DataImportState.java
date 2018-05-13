package org.myfly.platform.metamodel.service;

import org.myfly.platform.metamodel.domain.BaseEnum;

/**
 * 数据导入状态
 * 
 * @author xiangwanhong
 *
 */
public enum DataImportState implements BaseEnum {
	SUCCESS("成功"), FAULT("失败"), PARTIAL_SUCCESS("部分成功");

	private String title;

	private DataImportState(final String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

}
