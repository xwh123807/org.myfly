package org.myfly.platform.core3.dbinit.resources;

import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.metadata.annotation.FlyElement;

/**
 * 基本类型的Element
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
			dataType = FlyDataType.ID, entityType = "D", printName = "显示列", fieldLength = 32)
	displayColumn,
	//
	@FlyElement(columnName = "KeyColumn", name = "主键列", description = "主键列", //
			dataType = FlyDataType.ID, entityType = "D", printName = "主键列", fieldLength = 32)
	keyColumn,
	//
	@FlyElement(columnName = "ParentColumn", name = "父列", description = "父列", //
			dataType = FlyDataType.ID, entityType = "D", printName = "父列", fieldLength = 32)
	parentColumn,
	//
	@FlyElement(columnName = "DataTypeID", name = "数据类型", description = "数据类型", //
			dataType = FlyDataType.ID, entityType = "D", printName = "数据类型", fieldLength = 32)
	dataTypeID,
	//
	@FlyElement(columnName = "EmailConfigID", name = "邮箱配置", description = "邮箱配置", //
			dataType = FlyDataType.ID, entityType = "D", printName = "邮箱配置", fieldLength = 32)
	emailConfigID,
	//
	@FlyElement(columnName = "ExpProcessorID", name = "导出进程", description = "导出进程", //
			dataType = FlyDataType.ID, entityType = "D", printName = "导出进程", fieldLength = 32)
	expProcessorID,
	//
	@FlyElement(columnName = "MasterID", name = "Master", dataType = FlyDataType.ID, fieldLength = 32)
	masterID,
	//
	@FlyElement(columnName = "DetailID", name = "Detail", dataType = FlyDataType.ID, fieldLength = 32)
	detailID,
	//
	@FlyElement(columnName = "IncludedTab", name = "包含页", dataType = FlyDataType.ID, fieldLength = 32)
	includedTab
}
