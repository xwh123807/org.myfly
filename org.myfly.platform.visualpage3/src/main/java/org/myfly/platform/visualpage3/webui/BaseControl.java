package org.myfly.platform.visualpage3.webui;

public abstract class BaseControl {
	/**
	 * 显示模式
	 */
	private ViewMode viewMode = ViewMode.EDIT;

	public ViewMode getViewMode() {
		return viewMode;
	}

	public void setViewMode(ViewMode viewMode) {
		this.viewMode = viewMode;
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
}
