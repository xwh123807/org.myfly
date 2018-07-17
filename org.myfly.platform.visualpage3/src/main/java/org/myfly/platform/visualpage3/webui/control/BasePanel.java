package org.myfly.platform.visualpage3.webui.control;

import org.myfly.platform.visualpage3.webui.BaseControl;
import org.myfly.platform.visualpage3.webui.ViewMode;

public abstract class BasePanel extends BaseControl {

	public BasePanel(ViewMode viewMode) {
		super(viewMode);
	}

	@Override
	public String htmlForEdit() {
		return htmlForView();
	}

	@Override
	public String htmlForView() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<el-row>").append("\n");
		buildHead(buffer);
		buildContent(buffer);
		buffer.append("</el-row>").append("\n");
		return buffer.toString();
	}

	private void buildContent(StringBuffer buffer) {
		BaseControl content = getContent();
		buffer.append("<el-row>").append("\n");
		if (content != null) {
			buffer.append(content.html());
		} else {
			buffer.append(getContentHtml());
		}
		buffer.append("</el-row>").append("\n");
	}

	private void buildHead(StringBuffer buffer) {
		buffer.append("<el-row>").append("\n");
		buffer.append(getTitle());
		buffer.append("</el-row>").append("\n");
	}

	public abstract String getTitle();

	public abstract BaseControl getContent();

	public String getContentHtml() {
		return null;
	}
}
