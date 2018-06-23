package org.myfly.platform.core3.model.security;

import org.myfly.platform.core3.domain.IRefList;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@FlyTable(description = "Material Movement Policy")
public enum MMPolicy implements IRefList {
	//
	@FlyField(name = "FiFo")
	F,
	//
	@FlyField(name = "LiFo")
	L;
}
