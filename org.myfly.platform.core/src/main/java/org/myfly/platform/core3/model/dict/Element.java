package org.myfly.platform.core3.model.dict;

import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.metadata.annotation.FlyElement;

/**
 * 系统Element定义 <br>
 * 1、自动存入到AD_Element表中 <br>
 * 
 * @author xiangwanhong
 *
 */
public enum Element {
	None,
	//
	@FlyElement(name = "Name", description = "Alphanumeric identifier of the entity", //
			help = "The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.", //
			fieldLength = 60)
	Name,
	//
	@FlyElement(name = "Entity Type", dataType = FlyDataType.Table, description = "Dictionary Entity Type; Determines ownership and synchronization", //
			help = "The Entity Types \"Dictionary\", \"Adempiere\" and \"Application\" might be automatically synchronized and customizations deleted or overwritten.  \n"
					+ "\n" + "For customizations, copy the entity and select \"User\"!")
	EntityType,
	//
	@FlyElement(name = "Active", columnName = "IsActive", description = "The record is active in the system", //
			help = "There are two methods of making records unavailable in the system: One is to delete the record, the other is to de-activate the record. A de-activated record is not available for selection, but available for reports.\n"
					+ "There are two reasons for de-activating and not deleting records:\n"
					+ "(1) The system requires the record for audit purposes.\n"
					+ "(2) The record is referenced by other records. E.g., you cannot delete a Business Partner, if there are invoices for this partner record existing. You de-activate the Business Partner and prevent that this record is used for future entries.", //
			dataType = FlyDataType.YesNo)
	IsActive,
	//
	@FlyElement(name = "Classname", description = "Java Classname", //
			help = "The Classname identifies the Java classname used by this report or process.", //
			dataType = FlyDataType.String, fieldLength = 60)
	Classname,
	//
	@FlyElement(name = "CreateCopy", dataType = FlyDataType.Button)
	CreateCopy,
	//
	@FlyElement(name = "Description", description = "Optional short description of the record", //
			help = "A description is limited to 255 characters.", //
			dataType = FlyDataType.String, fieldLength = 255)
	Description,
	//
	@FlyElement(name = "Footer Margin", description = "Margin of the Footer in 1/72 of an inch", //
			help = "Distance from the bottom of the main content to the end of the printable page in 1/72 of an inch (point)", //
			dataType = FlyDataType.Integer)
	FooterMargin,
	//
	@FlyElement(name = "Header Margin", description = "Margin of the Header in 1/72 of an inch", //
			help = "Distance from the top of the printable page to the start of the main content in 1/72 of an inch (point)", //
			dataType = FlyDataType.Integer)
	HeaderMargin,
	//
	@FlyElement(name = "Default", description = "Default value", help = "The Default Checkbox indicates if this record will be used as a default value.", //
			dataType = FlyDataType.YesNo)
	IsDefault,
	//
	@FlyElement(name = "Form", description = "If Selected, a Form is printed, if not selected a columnar List report", //
			help = "A form has individual elements with layout information (example: invoice, check)\n" + "<br>\n"
					+ "A columnar list report has individual columns (example: list of invoices)", //
			dataType = FlyDataType.YesNo)
	IsForm,
	//
	@FlyElement(name = "Print Parameters", description = "Print query parameters on list report", //
			help = "If selected, query parameters will be printed at the start of the report.", //
			dataType = FlyDataType.YesNo)
	IsPrintParameters,
	//
	@FlyElement(name = "Standard Header/Footer", printName = "Standard Header/Footer", //
			description = "The standard Header and Footer is used", help = "If the standard header is not used, it must be explicitly defined.", //
			dataType = FlyDataType.YesNo)
	IsStandardHeaderFooter,
	//
	@FlyElement(name = "Summary Level", printName = "Summary Level", description = "This is a summary entity", //
			help = "A summary entity represents a branch in a tree rather than an end-node. Summary entities are used for reporting and do not have own values.", //
			dataType = FlyDataType.YesNo)
	IsSummary,

	//
	@FlyElement(name = "IsTableBased", printName = "Table Based", description = "Table based List Reporting", //
			help = "Table based columnar list reporting is invoked from the Window Report button", //
			dataType = FlyDataType.YesNo)
	IsTableBased,

	//
	@FlyElement(name = "", printName = "", description = "", //
			help = "", //
			dataType = FlyDataType.YesNo)
	JasperProcess_ID,

	//
	@FlyElement(name = "Display SQL", printName = "Display SQL", description = "SQL for display of lookup value", //
			help = "Fully qualified subquery SQL", //
			dataType = FlyDataType.Text, fieldLength = 2000)
	DisplaySQL,

	//
	@FlyElement(name = "Alert", printName = "Alert", description = "Display alert message when referenced record is accessed", //
			help = "", //
			dataType = FlyDataType.YesNo)
	IsAlert,

	//
	@FlyElement(name = "Display Identifier", printName = "Display Identifier", description = "Display the record identifier", //
			help = "Display the columns that are marked as part of the identifier for this table.  ", //
			dataType = FlyDataType.YesNo)
	IsDisplayIdentifier,

	//
	@FlyElement(name = "Display Value", printName = "Display Value", description = "Displays Value column with the Display column", //
			help = "The Display Value checkbox indicates if the value column will display with the display column.", //
			dataType = FlyDataType.YesNo)
	IsValueDisplayed,

	//
	@FlyElement(name = "Sql ORDER BY", printName = "Order by clause", description = "Fully qualified ORDER BY clause", //
			help = "The ORDER BY Clause indicates the SQL ORDER BY clause to use for record selection", //
			dataType = FlyDataType.Text, fieldLength = 2000)
	OrderByClause,

	//
	@FlyElement(name = "Sql WHERE", printName = "Where clause", description = "Fully qualified SQL WHERE clause", //
			help = "The Where Clause indicates the SQL WHERE clause to use for record selection. The WHERE clause is added to the query. Fully qualified means \"tablename.columnname\".", //
			dataType = FlyDataType.Text, fieldLength = 2000)
	WhereClause,

	// //
	// @FlyElement(name = "", printName = "", description = "", //
	// help = "", //
	// dataType = FlyDataType.YesNo)
	// IsSummary,

}
