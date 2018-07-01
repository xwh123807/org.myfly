package org.myfly.platform.core3.domain;

import org.myfly.platform.core3.metadata.annotation.FlyField;

/**
 * 数据类型，包含基本和扩展 <br>
 * 1、同AD_Reference中10-42的类型 <br>
 * 
 * @author xiangwanhong
 *
 */
public enum FlyDataType implements IRefList {
	//
	@FlyField(description = "")
	NONE,
	//
	@FlyField(name = "String", description = "Character String")
	String,
	//
	@FlyField(name = "Integer", description = "10 Digit numeric")
	Integer,
	//
	@FlyField(name = "Amount", description = "Number with 4 decimals")
	Amount,
	//
	@FlyField(name = "ID", description = "10 Digit Identifier")
	ID,
	//
	@FlyField(name = "Text", description = "Character String up to 2000 characters")
	Text,
	//
	@FlyField(name = "Date", description = "Date yyyy-mm-dd")
	Date,
	//
	@FlyField(name = "Date+Time", description = "Date with time yyyy-mm-dd hh:mm:ss")
	DateTime,
	//
	@FlyField(name = "List", description = "Reference List")
	List,
	//
	@FlyField(name = "Table", description = "Table List")
	Table,
	//
	@FlyField(name = "Table Direct", description = "Direct Table Access")
	TableDirect,
	//
	@FlyField(name = "Yes-No", description = "CheckBox")
	YesNo,
	//
	@FlyField(name = "Location (Address)", description = "Location/Address")
	Location,
	//
	@FlyField(name = "Number", description = "Float Number")
	Number,
	//
	@FlyField(name = "Binary", description = "Binary Data")
	Binary,
	//
	@FlyField(name = "Time", description = "Time")
	Time,
	//
	@FlyField(name = "Account", description = "Account Element")
	Account,
	//
	@FlyField(name = "RowID", description = "Row ID Data Type")
	RowID,
	//
	@FlyField(name = "Color", description = "Color element")
	Color,
	//
	@FlyField(name = "Button", description = "Command Button - starts a process")
	Button,
	//
	@FlyField(name = "Quantity", description = "Quantity data type")
	Quantity,
	//
	@FlyField(name = "Search", description = "Search Field")
	Search,
	//
	@FlyField(name = "Locator (WH)", description = "Warehouse Locator Data type")
	Locator,
	//
	@FlyField(name = "Image", description = "Binary Image Data")
	Image,
	//
	@FlyField(name = "Assignment", description = "Resource Assignment")
	Assignment,
	//
	@FlyField(name = "Memo", description = "Large Text Editor - Character String up to 2000 characters")
	Memo,
	//
	@FlyField(name = "Product Attribute", description = "Product Attribute")
	ProductAttribute,
	//
	@FlyField(name = "Text Long", description = "Text (Long) - Text > 2000 characters")
	LongText,
	//
	@FlyField(name = "Costs+Prices", description = "Costs + Prices (minimum currency precision but if exists more)")
	CostsPrices,
	//
	@FlyField(name = "FilePath", description = "Local File Path")
	FilePath,
	//
	@FlyField(name = "FileName", description = "Local File")
	FileName,
	//
	@FlyField(name = "FilePathOrName", description = "Local File Path or Name", help = "Selects a path or a single file.")
	FilePathOrName,
	//
	@FlyField(name = "URL", description = "URL")
	URL,
	//
	@FlyField(name = "Printer Name", description = "")
	PrinterName,
	//
	@FlyField(name = "EMail", description = "email address")
	EMail,
	//
	@FlyField(name = "Sub Table", description = "sub table")
	SubTable,
	//
	@FlyField(name = "In Table", description = "One to One")
	InTable;

}
