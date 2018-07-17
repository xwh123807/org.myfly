package org.myfly.platform.visualpage3.webui.window;

import java.util.HashMap;
import java.util.Map;

import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.visualpage3.define.FlyViewModel;
import org.myfly.platform.visualpage3.webui.ViewMode;
import org.myfly.platform.visualpage3.webui.control.ToolbarControl;

public class ListWindow extends BaseWindow {

	private FlyViewModel flyViewModel;

	private ListViewPanel listViewPanel;

	public ListWindow(FlyViewModel flyViewModel, ViewMode viewMode) {
		super(viewMode);
		this.setFlyViewModel(flyViewModel);
		setViewName(flyViewModel.getApiName() + "_list_" + viewMode.name() + ".html");
		listViewPanel = new ListViewPanel(getFlyViewModel().getMainTab(), getViewMode());
	}

	public FlyViewModel getFlyViewModel() {
		return flyViewModel;
	}

	public void setFlyViewModel(FlyViewModel flyViewModel) {
		this.flyViewModel = flyViewModel;
	}

	public ToolbarControl getToolbar() {
		return new ListWindowToolbar(getViewMode());
	}

	@Override
	public String getExtScript() {
		return "bindListWindow(\"" + getElementID() + "\", \"" + getFlyViewModel().getMainTab().getTable().getApiName()
				+ "\");";
	}

	@Override
	public String getContentHtml() {
		return getListViewPanel().html();
	}

	public ListViewPanel getListViewPanel() {
		return listViewPanel;
	}

	public void setListViewPanel(ListViewPanel listViewPanel) {
		this.listViewPanel = listViewPanel;
	}

	@Override
	public Map<String, String> getExtAttrs() {
		FlyDataModel table = getFlyViewModel().getMainTab().getTable();
		Map<String, String> attrs = new HashMap<String, String>();
		attrs.put("window", getFlyViewModel().getApiName());
		attrs.put("mainTable", table.getApiName());
		attrs.put("keyColumn", table.getPrimaryKey().getApiName());
		attrs.put("displayColumn", table.getPrimaryKey().getRefDisplayColumn());
		return attrs;
	}

}
