package org.myfly.platform.core3.model;

import org.myfly.platform.core3.datamodel.annotation.FlyField;
import org.myfly.platform.core3.datamodel.annotation.FlyTable;
import org.myfly.platform.core3.domain.IRefList;

@FlyTable(description = "Material Movement Policy")
public enum MMPolicy implements IRefList {
	//
	@FlyField(name = "FiFo")
	F,
	//
	@FlyField(name = "LiFo")
	L;
}
