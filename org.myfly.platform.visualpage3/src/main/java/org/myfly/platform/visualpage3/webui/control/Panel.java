package org.myfly.platform.visualpage3.webui.control;

import org.myfly.platform.visualpage3.webui.BaseControl;
import org.myfly.platform.visualpage3.webui.ViewMode;

public class Panel extends BaseControl {
	public Panel(ViewMode viewMode) {
		super(viewMode);
	}

	@Override
	public String htmlForEdit() {
		return htmlForView();
	}

	@Override
	public String htmlForView() {
		return null;
	}

}
