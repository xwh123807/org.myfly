package org.myfly.platform.visualpage3.webui;

import org.myfly.platform.visualpage3.define.FField;
import org.springframework.util.StringUtils;

public abstract class BaseFieldControl {
	/**
	 * 控件对应的列定义
	 */
	private FField field;
	/**
	 * 显示模式
	 */
	private ViewMode viewMode = ViewMode.EDIT;

	public BaseFieldControl(FField field, ViewMode viewMode) {
		this.setViewMode(viewMode);
		this.setField(field);
	}

	public String getBindObjectVariableName() {
		return "obj";
	}

	public String getModel() {
		return getBindObjectVariableName() + "." + getField().getFlyColumn().getApiName();
	}

	public String getPlaceholder() {
		return StringUtils.hasLength(getField().getName()) ? getField().getName() : getField().getDescription();
	}

	/**
	 * 返回控件Html代码
	 * 
	 * @return
	 */
	public String html() {
		switch (getViewMode()) {
		case EDIT:
			return htmlForEdit();
		case VIEW:
		case PRINT:
			return htmlForView();
		}
		return null;
	}

	public abstract String htmlForEdit();

	public abstract String htmlForView();

	public ViewMode getViewMode() {
		return viewMode;
	}

	public void setViewMode(ViewMode viewMode) {
		this.viewMode = viewMode;
	}

	public FField getField() {
		return field;
	}

	public void setField(FField field) {
		this.field = field;
	}
}
