package org.myfly.platform.core3.model.data;

import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

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
