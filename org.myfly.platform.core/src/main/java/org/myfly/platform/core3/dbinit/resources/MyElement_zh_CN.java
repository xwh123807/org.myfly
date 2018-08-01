package org.myfly.platform.core3.dbinit.resources;

import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.metadata.annotation.FlyElement;

/**
 * 基本类型的Element
 * 
 * @author xiangwanhong
 *
 */
public enum MyElement_zh_CN {
	//
	@FlyElement(columnName = "ApiName", name = "API名称", description = "唯一标示，对应代码类名或属性名", //
			dataType = FlyDataType.String, entityType = "D", printName = "API名称", fieldLength = 60)
	apiName,
	//
	@FlyElement(columnName = "DataType", name = "数据类型", description = "数据类型", //
			dataType = FlyDataType.String, entityType = "D", printName = "数据类型", fieldLength = 40)
	dataType,
	//
	@FlyElement(columnName = "DisplayColumn", name = "显示列", description = "显示列", //
			dataType = FlyDataType.Table, entityType = "D", printName = "显示列", fieldLength = 32)
	displayColumn,
	//
	@FlyElement(columnName = "KeyColumn", name = "主键列", description = "主键列", //
			dataType = FlyDataType.Table, entityType = "D", printName = "主键列", fieldLength = 32)
	keyColumn,
	//
	@FlyElement(columnName = "ParentColumn", name = "父列", description = "父列", //
			dataType = FlyDataType.Table, entityType = "D", printName = "父列", fieldLength = 32)
	parentColumn,
	//
	@FlyElement(columnName = "DataTypeID", name = "数据类型", description = "数据类型", //
			dataType = FlyDataType.Table, entityType = "D", printName = "数据类型", fieldLength = 32)
	dataTypeID,
	//
	@FlyElement(columnName = "ElementID", name = "系统元素", description = "系统元素", //
			dataType = FlyDataType.Table, entityType = "D", printName = "系统元素", fieldLength = 32)
	elementID,
	//
	@FlyElement(columnName = "EntityTypeID", name = "实体类型", description = "实体类型", //
			dataType = FlyDataType.Table, entityType = "D", printName = "实体类型", fieldLength = 32)
	entityTypeID,
	//
	@FlyElement(columnName = "EmailConfigID", name = "邮箱配置", description = "邮箱配置", //
			dataType = FlyDataType.Table, entityType = "D", printName = "邮箱配置", fieldLength = 32)
	emailConfigID,
	//
	@FlyElement(columnName = "ExpProcessorID", name = "导出进程", description = "导出进程", //
			dataType = FlyDataType.Table, entityType = "D", printName = "导出进程", fieldLength = 32)
	expProcessorID,
	//
	@FlyElement(columnName = "MasterID", name = "Master", dataType = FlyDataType.Table, fieldLength = 32)
	masterID,
	//
	@FlyElement(columnName = "DetailID", name = "Detail", dataType = FlyDataType.Table, fieldLength = 32)
	detailID,
	//
	@FlyElement(columnName = "IncludedTab", name = "包含页", dataType = FlyDataType.Table, fieldLength = 32)
	includedTab,
	//
	@FlyElement(columnName = "ReferenceID", name = "引用", description = "系统引用", help = "The Reference indicates the type of reference field", //
			dataType = FlyDataType.Table, entityType = "D", printName = "引用", fieldLength = 32)
	referenceID,
	//
	@FlyElement(columnName = "RefListID", name = "引用值", description = "系统引用", help = "The Reference indicates the type of reference field", //
			dataType = FlyDataType.Table, entityType = "D", printName = "引用值", fieldLength = 32)
	refListID,
	//
	@FlyElement(columnName = "TableID", name = "表", description = "字段所在表", help = "The Table indicates the table in which a field or fields reside.", //
			dataType = FlyDataType.Table, entityType = "D", printName = "表", fieldLength = 32)
	tableID,
	//
	@FlyElement(columnName = "UserID", name = "用户", description = "用户", help = "", //
			dataType = FlyDataType.Table, entityType = "D", printName = "用户", fieldLength = 32)
	userID,
	//
	@FlyElement(columnName = "WindowID", name = "窗口", description = "窗口", help = "", //
			dataType = FlyDataType.Table, entityType = "D", printName = "窗口", fieldLength = 32)
	windowID,
	//
	@FlyElement(columnName = "TableStyle", name = "表格样式", description = "", help = "", //
			dataType = FlyDataType.List, entityType = "D", printName = "表格样式", fieldLength = 40)
	tableStyle
}
