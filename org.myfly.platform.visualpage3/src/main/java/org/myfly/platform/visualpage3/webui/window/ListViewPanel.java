package org.myfly.platform.visualpage3.webui.window;

import org.myfly.platform.visualpage3.define.FTab;
import org.myfly.platform.visualpage3.webui.BaseControl;
import org.myfly.platform.visualpage3.webui.ControlFactory;
import org.myfly.platform.visualpage3.webui.ViewMode;
import org.myfly.platform.visualpage3.webui.control.BasePanel;

public class ListViewPanel extends BasePanel {

	private FTab tab;

	public ListViewPanel(FTab tab, ViewMode viewMode) {
		super(viewMode);
		this.setTab(tab);
	}

	@Override
	public String getTitle() {
		return getTab().getName();
	}

	@Override
	public BaseControl getContent() {
		return ControlFactory.getTableControl(getTab());
	}

	public FTab getTab() {
		return tab;
	}

	public void setTab(FTab tab) {
		this.tab = tab;
	}
}
