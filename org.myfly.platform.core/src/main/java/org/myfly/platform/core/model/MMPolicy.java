package org.myfly.platform.core.model;

import org.myfly.platform.core.datamodel.annotation.FlyField;
import org.myfly.platform.core.datamodel.annotation.FlyTable;

@FlyTable(description = "Material Movement Policy")
public enum MMPolicy {
	//
	@FlyField(name = "FiFo")
	F,
	//
	@FlyField(name = "LiFo")
	L;
}
