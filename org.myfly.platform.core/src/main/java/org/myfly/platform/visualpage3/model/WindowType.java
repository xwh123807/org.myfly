package org.myfly.platform.visualpage3.model;

import org.myfly.platform.core3.datamodel.annotation.FlyField;

public enum WindowType {
	//
	@FlyField(name = "Maintain")
	M,
	//
	@FlyField(name = "Query Only")
	Q,
	//
	@FlyField(name = "Single Record")
	S,
	//
	@FlyField(name = "Transaction")
	T
}
