package org.myfly.platform.core3.model.view;

import org.myfly.platform.core3.metadata.annotation.FlyField;

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
