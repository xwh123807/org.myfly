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
		buffer.append("<el-container>").append("\n");
		buildHead(buffer);
		buildContent(buffer);
		buffer.append("</el-container>").append("\n");
		return buffer.toString();
	}

	private void buildContent(StringBuffer buffer) {
		buffer.append("<el-main>").append("\n");
		buffer.append(getContent().html());
		buffer.append("</el-main>").append("\n");
	}

	private void buildHead(StringBuffer buffer) {
		buffer.append("<el-header>").append("\n");
		buffer.append(getTitle());
		buffer.append("</el-header>").append("\n");
	}

	public abstract String getTitle();

	public abstract BaseControl getContent();
}
