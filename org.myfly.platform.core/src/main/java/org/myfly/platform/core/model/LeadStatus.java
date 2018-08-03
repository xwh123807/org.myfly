package org.myfly.platform.core.model;

import org.myfly.platform.core.datamodel.annotation.FlyField;
import org.myfly.platform.core.datamodel.annotation.FlyTable;

@FlyTable(name = "Lead Status")
public enum LeadStatus {
	@FlyField(name = "Converted")
	C, 
	//
	@FlyField(name = "Expired")
	E, 
	//
	@FlyField(name = "New")
	N, 
	//
	@FlyField(name = "Recycled")
	R,
	//
	@FlyField(name = "Working")
	W,
}
