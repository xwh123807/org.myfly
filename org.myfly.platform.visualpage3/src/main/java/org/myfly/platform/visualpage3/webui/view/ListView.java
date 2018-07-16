package org.myfly.platform.visualpage3.webui.view;

import org.myfly.platform.core.utils.HtmlUtils;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.visualpage3.define.FlyViewModel;
import org.myfly.platform.visualpage3.webui.BaseTableControl;
import org.myfly.platform.visualpage3.webui.ControlFactory;
import org.myfly.platform.visualpage3.webui.ViewMode;

public class ListView extends BaseView {

	public ListView(FlyViewModel viewModel, ViewMode viewMode) {
		super(viewModel, viewMode);
	}

	@Override
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
}
