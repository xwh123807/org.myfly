package org.myfly.platform.visualpage3.webui.window;

import java.util.HashMap;
import java.util.Map;

import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.visualpage3.define.FlyViewModel;
import org.myfly.platform.visualpage3.webui.ViewMode;
import org.myfly.platform.visualpage3.webui.control.ToolbarControl;

/**
 * 表单窗口
 * 
 * @author xiangwanhong
 *
 */
public class FormWindow extends BaseWindow {

	private FlyViewModel flyViewModel;
	private String uid;

	public FormWindow(FlyViewModel flyViewModel, ViewMode viewMode, String uid) {
		super(viewMode);
		this.setFlyViewModel(flyViewModel);
		this.setUid(uid);
		setViewName(flyViewModel.getApiName() + "_form_" + viewMode.name() + ".html");
	}

	@Override
	public ToolbarControl getToolbar() {
		return new FormWindowToolbar(getViewMode());
	}

	private FormPanel getFormPanel() {
		return new FormPanel(getFlyViewModel().getMainTab(), getViewMode());
	}

	@Override
	public String getContentHtml() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<el-row>");
		buffer.append(getFormPanel().html());
		buffer.append("</el-row>");
		return buffer.toString();
	}

	private FlyDataModel getTable() {
		return getFlyViewModel().getMainTab().getTable();
	}

	@Override
	public String getExtScript() {
		return "bindFormWindow(\"" + getElementID() + "\",\"" + getTable().getApiName() + "\", \"" + getUid() + "\");";
	}

	@Override
	public Map<String, String> getExtAttrs() {
		Map<String, String> result = new HashMap<String, String>();
		return result;
	}

	public FlyViewModel getFlyViewModel() {
		return flyViewModel;
	}

	public void setFlyViewModel(FlyViewModel flyViewModel) {
		this.flyViewModel = flyViewModel;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

}
