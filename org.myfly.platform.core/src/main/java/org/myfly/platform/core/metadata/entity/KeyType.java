package org.myfly.platform.core.metadata.entity;

import org.myfly.platform.core.domain.BaseEnum;

/**
 * 主键类型
 * @author xiangwanhong
 *
 */
public enum KeyType implements BaseEnum{
	// 单@Id,单主键
	SINGLE("单主键"),
	// @Embeddable，复合主键
	EMBED("复合主键"),
	// 多@Id,指定@IdClass，复合主键
	MULTIID("多主键");
	
	private String title;
	
	private KeyType(String title) {
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
	}
}
