package org.myfly.platform.visualpage3.webui;

import org.myfly.platform.visualpage3.define.FField;
import org.springframework.util.StringUtils;

public abstract class BaseFieldControl extends BaseControl{
	/**
	 * 控件对应的列定义
	 */
	private FField field;

	public BaseFieldControl(FField field, ViewMode viewMode) {
		super(viewMode);
		this.setField(field);
	}

	public String getBindObjectVariableName() {
		return "obj";
	}

	public String getModel() {
		String model = getBindObjectVariableName() + "." + getField().getFlyColumn().getApiName();
		if (getField().getFlyColumn().isRefTableColumn()) {
			model += "." + getField().getFlyColumn().getRefDisplayColumn();
		}
		return model;
	}

	public String getPlaceholder() {
		return StringUtils.hasLength(getField().getName()) ? getField().getName() : getField().getDescription();
	}

	public FField getField() {
		return field;
	}

	public void setField(FField field) {
		this.field = field;
	}
}
