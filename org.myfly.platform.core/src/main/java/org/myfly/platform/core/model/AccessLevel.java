package org.myfly.platform.core.model;

import org.myfly.platform.core.datamodel.annotation.FlyField;
import org.myfly.platform.core.datamodel.annotation.FlyTable;

@FlyTable(name = "PTable Access Levels", description = "Table Access and Sharing Level list")
public enum AccessLevel {
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
