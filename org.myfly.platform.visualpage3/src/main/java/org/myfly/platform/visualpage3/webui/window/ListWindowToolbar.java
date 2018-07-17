package org.myfly.platform.visualpage3.webui.window;

import org.myfly.platform.visualpage3.webui.ViewMode;
import org.myfly.platform.visualpage3.webui.control.Action;
import org.myfly.platform.visualpage3.webui.control.ToolbarControl;

public class ListWindowToolbar extends ToolbarControl {

	public ListWindowToolbar(ViewMode viewMode) {
		super(viewMode);
	}

	@Override
	public Action[] getActions() {
		return new Action[] { Action.REFRESH, Action.DELETE };
	}
}
