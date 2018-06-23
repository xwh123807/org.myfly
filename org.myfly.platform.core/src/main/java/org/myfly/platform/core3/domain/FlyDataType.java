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
	@FlyField(description = "Character String")
	String,
	//
	@FlyField(description = "10 Digit numeric")
	Integer,
	//
	@FlyField(description = "Number with 4 decimals")
	Amount,
	//
	@FlyField(description = "10 Digit Identifier")
	ID,
	//
	@FlyField(description = "Character String up to 2000 characters")
	Text,
	//
	@FlyField(description = "Date yyyy-mm-dd")
	Date,
	//
	@FlyField(description = "Date with time yyyy-mm-dd hh:mm:ss")
	DateTime,
	//
	@FlyField(description = "Reference List")
	List,
	//
	@FlyField(description = "Table List")
	Table,
	//
	@FlyField(description = "Direct Table Access")
	TableDirect,
	//
	@FlyField(name = "Yes-No", description = "CheckBox")
	YesNo,
	//
	@FlyField(name = "Location (Address)", description = "Location/Address")
	Location,
	//
	@FlyField(description = "Float Number")
	Number,
	//
	@FlyField(description = "Binary Data")
	Binary,
	//
	@FlyField(description = "Time")
	Time,
	//
	@FlyField(description = "Account Element")
	Account,
	//
	@FlyField(description = "Row ID Data Type")
	RowID,
	//
	@FlyField(description = "Color element")
	Color,
	//
	@FlyField(description = "Command Button - starts a process")
	Button,
	//
	@FlyField(description = "Quantity data type")
	Quantity,
	//
	@FlyField(description = "Search Field")
	Search,
	//
	@FlyField(name = "Locator (WH)", description = "Warehouse Locator Data type")
	Locator,
	//
	@FlyField(description = "Binary Image Data")
	Image,
	//
	@FlyField(description = "Resource Assignment")
	Assignment,
	//
	@FlyField(description = "Large Text Editor - Character String up to 2000 characters")
	Memo,
	//
	@FlyField(description = "Product Attribute")
	ProductAttribute,
	//
	@FlyField(description = "Text (Long) - Text > 2000 characters")
	LongText,
	//
	@FlyField(description = "Costs + Prices (minimum currency precision but if exists more)")
	CostsPrices,
	//
	@FlyField(description = "Local File Path")
	FilePath,
	//
	@FlyField(description = "Local File")
	FileName,
	//
	@FlyField(description = "URL")
	URL,
	//
	@FlyField(description = "")
	PrinterName,
	//
	@FlyField(description = "email address")
	EMail,
	//
	@FlyField(description = "sub table")
	SubTable,
	//
	@FlyField(description = "One to One")
	InTable;

}
