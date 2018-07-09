package org.myfly.platform.core3.model;

import org.myfly.platform.core3.domain.IRefList;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@FlyTable(name = "PTable Access Levels", description = "Table Access and Sharing Level list")
public enum AccessLevel implements IRefList {
	//
	@FlyField(name = "全部", description = "全部")
	ALL,
	//
	@FlyField(name = "客户端", description = "仅能从客户端访问")
	CLIENT,
	//
	ORGANIZATION,
	//
	SYSTEM,
	//
	SYSTEMCLEINT,
	//
	CLIENTORGANIZATION;
}
