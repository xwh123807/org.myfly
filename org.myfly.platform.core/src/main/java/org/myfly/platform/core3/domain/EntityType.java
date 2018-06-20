package org.myfly.platform.core3.domain;

import org.myfly.platform.core3.metadata.annotation.FlyField;

/**
 * 实体类型
 * 
 * @author xiangwanhong
 *
 */
public enum EntityType implements IRefList {
	@FlyField(description = "", help = "")
	D("Dictionary"), C("Flyme"), U("User maintained"), A("Applications"), EXT("Extensions"),
	XX("Other Extensions"), CUST("Other Customizations");

	private String name;

	private EntityType(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
