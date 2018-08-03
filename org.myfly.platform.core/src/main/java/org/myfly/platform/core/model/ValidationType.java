package org.myfly.platform.core.model;

import org.myfly.platform.core.datamodel.annotation.FlyField;
import org.myfly.platform.core.datamodel.annotation.FlyTable;

@FlyTable(name = "Validation Types", description = "Reference Validation Type list", help = "e.g. I - Independent ")
public enum ValidationType {
	@FlyField(name = "Data Type")
	D,
	//
	@FlyField(name = "List Validation")
	L,
	//
	@FlyField(name = "Table Validation")
	T;
}
