package org.myfly.platform.visualpage3.webui.view;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.myfly.platform.core.utils.HtmlUtils;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.visualpage3.define.FlyMemoryViewModel;
import org.myfly.platform.visualpage3.define.FlyViewModel;
import org.myfly.platform.visualpage3.webui.BaseTableControl;
import org.myfly.platform.visualpage3.webui.ControlFactory;
import org.myfly.platform.visualpage3.webui.ViewMode;

public class Window {
	private FlyViewModel viewModel;
	private ViewMode viewMode;

	public Window(FlyViewModel viewModel, ViewMode viewMode) {
		this.setViewModel(viewModel);
		this.setViewMode(viewMode);
	}

	public Window(String windowName, ViewMode viewMode) {
		this.setViewModel(FlyMemoryViewModel.getInstance().getFlyViewModel(windowName));
		this.setViewMode(viewMode);
	}

	public FlyViewModel getViewModel() {
		return viewModel;
	}

	public void setViewModel(FlyViewModel viewModel) {
		this.viewModel = viewModel;
	}

	public ViewMode getViewMode() {
		return viewMode;
	}

	public void setViewMode(ViewMode viewMode) {
		this.viewMode = viewMode;
	}
	
	private String getScript(String id, String table) {
		return "<script>\n" + 
				"	var vm = new Vue({\n" + 
				"		el : \"#"+ id+"\",\n" + 
				"		data : {\n" + 
				"			tableData : []\n" + 
				"		}\n" + 
				"	})\n" + 
				"	$.get(\"/flydata3/"+ table+"\", function(data){\n" + 
				"		vm.$data.tableData = data;\n" + 
				"	});\n" + 
				"</script>";
	}

	public String html() {
		StringBuffer buffer = new StringBuffer();
		String id = UUIDUtil.newHtmlID();
		buffer.append("<div " + HtmlUtils.addProperty("id", id) + ">");
		BaseTableControl tableControl = ControlFactory.getTableControl(getViewModel().getMainTab());
		buffer.append(tableControl.html());
		buffer.append("</div>");
		buffer.append(getScript(id, getViewModel().getMainTab().getTable().getApiName()));
		return buffer.toString();
	}

	public String toFile() {
		String viewName = "windows/" + getViewModel().getApiName() + ".html";
		File file = new File(
				"/xwh.work/git/org.myfly/org.myfly.platform.visualpage3/target/classes/templates/" + viewName);
		try {
			FileUtils.writeStringToFile(file, html());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return viewName;
	}
}
