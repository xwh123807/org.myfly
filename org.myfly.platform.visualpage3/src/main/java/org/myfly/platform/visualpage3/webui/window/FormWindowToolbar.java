package org.myfly.platform.visualpage3.webui.window;

import org.myfly.platform.visualpage3.webui.ViewMode;
import org.myfly.platform.visualpage3.webui.control.Action;
import org.myfly.platform.visualpage3.webui.control.ToolbarControl;

public class FormWindowToolbar extends ToolbarControl {

	public FormWindowToolbar(ViewMode viewMode) {
		super(viewMode);
	}

	@Override
	public Action[] getActions() {
		return new Action[] { Action.ARROW_FIRST, Action.ARROW_PRIOR, Action.ARROW_NEXT, Action.ARROW_LAST };
	}
}
