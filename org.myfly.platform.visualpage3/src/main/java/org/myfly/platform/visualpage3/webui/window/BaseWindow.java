package org.myfly.platform.visualpage3.webui.window;

import java.util.HashMap;
import java.util.Map;

import org.myfly.platform.core.utils.HtmlUtils;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.visualpage3.webui.BaseControl;
import org.myfly.platform.visualpage3.webui.ViewMode;
import org.myfly.platform.visualpage3.webui.control.ToolbarControl;

public abstract class BaseWindow extends BaseControl {
	/**
	 * 视图名称，唯一
	 */
	private String viewName;
	/**
	 * 元素ID，唯一
	 */
	private String elementID;
	
	public BaseWindow(ViewMode viewMode) {
		super(viewMode);
		setElementID(UUIDUtil.newHtmlID());
	}

	public String getViewName() {
		return viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

	@Override
	public String htmlForView() {
		return htmlForEdit();
	}

	/**
	 * 工具栏
	 * 
	 * @return
	 */
	public abstract ToolbarControl getToolbar();

	public abstract BaseControl getContent();

	public abstract String getExtScript();
	
	public abstract Map<String, String> getExtAttrs();

	@Override
	public String htmlForEdit() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<div").append(HtmlUtils.addAttrs(getAttrs())).append(">");
		buffer.append("<el-container>").append("\n");
		buildHeader(buffer);
		buildMain(buffer);
		buffer.append("</el-container>").append("\n");
		buffer.append("</div>");
		buffer.append(getScript(getExtScript()));
		return buffer.toString();
	}

	private Map<String, String> getAttrs() {
		Map<String, String> result = new HashMap<>();
		result.putAll(getExtAttrs());
		result.put("id", getElementID());
		return result;
	}

	private void buildMain(StringBuffer buffer) {
		BaseControl main = getContent();
		if (main != null) {
			buffer.append("<el-main>").append("\n");
			buffer.append(main.html());
			buffer.append("</el-main>").append("\n");
		}
	}

	private void buildHeader(StringBuffer buffer) {
		ToolbarControl toolbar = getToolbar();
		if (toolbar != null) {
			buffer.append("<el-header>").append("\n");
			buffer.append(toolbar.html());
			buffer.append("</el-header>").append("\n");
		}
	}

	private String getScript(String extScript) {
		return "<script>\n" + extScript + "</script>";
	}

	public String getElementID() {
		return elementID;
	}

	public void setElementID(String elementID) {
		this.elementID = elementID;
	}
}
