package org.myfly.platform.core.viewmodel.model;

import org.myfly.platform.core.datamodel.annotation.FlyField;

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
