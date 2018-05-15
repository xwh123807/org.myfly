package org.myfly.platform.core.metadata.annotation;

import org.myfly.platform.core.domain.BaseEnum;

/**
 * 部件类型，CUSTOM为自定义部件，其他均为预制标准部件
 * 
 * @author xiangwanhong
 *
 */
public enum SectionType implements BaseEnum {
	// 自定义，默认
	CUSTOM("自定义"),
	// 社交化
	SOCIAL("社交"),
	// 文件
	ATTACHMENT("文件"),
	// 备注
	NOTE("备注");

	private SectionType(final String title) {
		this.title = title;
	}

	private String title;

	@Override
	public String getTitle() {
		return title;
	}
}
