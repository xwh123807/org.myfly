package org.myfly.platform.core3.model.dict;

import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.metadata.annotation.FlyField;

public enum Element {
	None,
	//
	@FlyField(name = "Active", columnName = "IsActive", description = "The record is active in the system", //
			help = "There are two methods of making records unavailable in the system: One is to delete the record, the other is to de-activate the record. A de-activated record is not available for selection, but available for reports.\n"
					+ "There are two reasons for de-activating and not deleting records:\n"
					+ "(1) The system requires the record for audit purposes.\n"
					+ "(2) The record is referenced by other records. E.g., you cannot delete a Business Partner, if there are invoices for this partner record existing. You de-activate the Business Partner and prevent that this record is used for future entries.", //
			dataType = FlyDataType.YesNo, defaultValue = "Y")
	IsActive,
	//
	@FlyField(name = "Classname", description = "Java Classname", //
			help = "The Classname identifies the Java classname used by this report or process.", //
			dataType = FlyDataType.String, fieldLength = 60)
	Classname,
	//
	@FlyField(name = "CreateCopy", dataType = FlyDataType.Button)
	CreateCopy,
	//
	@FlyField(name = "Description", description = "Optional short description of the record", //
			help = "A description is limited to 255 characters.", //
			dataType = FlyDataType.String, fieldLength = 255)
	Description,
	//
	@FlyField(name = "Footer Margin", description = "Margin of the Footer in 1/72 of an inch", //
			help = "Distance from the bottom of the main content to the end of the printable page in 1/72 of an inch (point)", //
			dataType = FlyDataType.Integer)
	FooterMargin,
	//
	@FlyField(name = "Header Margin", description = "Margin of the Header in 1/72 of an inch", //
			help = "Distance from the top of the printable page to the start of the main content in 1/72 of an inch (point)", //
			dataType = FlyDataType.Integer)
	HeaderMargin,
	//
	@FlyField(name = "Default", description = "Default value", help = "The Default Checkbox indicates if this record will be used as a default value.", //
			dataType = FlyDataType.YesNo)
	IsDefault,
	//
	@FlyField(name = "Form", description = "If Selected, a Form is printed, if not selected a columnar List report", //
			help = "A form has individual elements with layout information (example: invoice, check)\n" + "<br>\n"
					+ "A columnar list report has individual columns (example: list of invoices)", //
			dataType = FlyDataType.YesNo)
	IsForm,
	//
	@FlyField(name = "Print Parameters", description = "Print query parameters on list report", //
			help = "If selected, query parameters will be printed at the start of the report.", //
			dataType = FlyDataType.YesNo, defaultValue = "Y")
	IsPrintParameters,
}
