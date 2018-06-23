package org.myfly.platform.core3.domain;

import org.myfly.platform.core3.metadata.annotation.FlyField;

/**
 * 实体类型
 * 
 * @author xiangwanhong
 *
 */
public enum EntityType implements IRefList {
	//
	@FlyField(name = "Dictionary")
	D(),
	//
	@FlyField(name = "Flyme")
	C,
	//
	@FlyField(name = "User maintained")
	U,
	//
	@FlyField(name = "Applications")
	A(),
	//
	@FlyField(name = "Extensions")
	EXT(),
	//
	@FlyField(name = "Other Extensions")
	XX(),
	//
	@FlyField(name = "Other Customizations")
	CUST();
}
