package org.myfly.platform.visualpage3.webui.control;

import org.apache.commons.lang3.ArrayUtils;
import org.myfly.platform.visualpage3.webui.BaseControl;
import org.myfly.platform.visualpage3.webui.ViewMode;

public class ToolbarControl extends BaseControl {

	public ToolbarControl(ViewMode viewMode) {
		super(viewMode);
	}

	@Override
	public String htmlForEdit() {
		return htmlForView();
	}

	public Action[] getActions() {
		return null;
	}

	@Override
	public String htmlForView() {
		StringBuffer buffer = new StringBuffer();
		Action[] actions = getActions();
		if (ArrayUtils.isNotEmpty(actions)) {
			for (Action action : actions) {
				buffer.append("<el-button icon=\"" + action.getIcon() + "\">");
				buffer.append(action.getTitle());
				buffer.append("</el-button>").append("\n");
			}
		}
		return buffer.toString();
	}
}
