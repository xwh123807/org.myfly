package org.myfly.platform.core3.metadata.define;

import org.myfly.platform.core.utils.EntityClassUtil.FieldInfo;
import org.myfly.platform.core3.metadata.service.IFlyColumn;

public class ColumnDefinition {
	private IFlyColumn column;
	private FieldInfo fieldInfo;

	public ColumnDefinition(IFlyColumn column, FieldInfo fieldInfo) {
		setColumn(column);
		setFieldInfo(fieldInfo);
	}

	public IFlyColumn getColumn() {
		return column;
	}

	public void setColumn(IFlyColumn column) {
		this.column = column;
	}

	public FieldInfo getFieldInfo() {
		return fieldInfo;
	}

	public void setFieldInfo(FieldInfo fieldInfo) {
		this.fieldInfo = fieldInfo;
	}
}
