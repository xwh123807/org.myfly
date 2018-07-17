package org.myfly.platform.visualpage3.webui.control;

import org.myfly.platform.visualpage3.define.FTab;
import org.myfly.platform.visualpage3.webui.BaseTableControl;
import org.myfly.platform.visualpage3.webui.ViewMode;

/**
 * DataTable表格控件
 * 
 * @author xiangwanhong
 *
 */
public class DTTableControl extends BaseTableControl {

	public DTTableControl(FTab tab) {
		super(tab, ViewMode.EDIT);
	}

	@Override
	public String htmlForView() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<table class='dataTable table table-bordered table-striped'>");
		buffer.append("<thead>");
		getTab().getFields().values().forEach(item -> {
			String label = item.getName();
			buffer.append("<th>").append(label).append("</th>");
		});
		buffer.append("</thead>");
		buffer.append("<tbody>");
		buffer.append("<tr v-for=\"obj in " + getModel() + "\">");
		getTab().getFields().values().forEach(item -> {
			String model = item.getFlyColumn().getApiName();
			if (item.getFlyColumn().isRefTableColumn()) {
				model += "." + item.getFlyColumn().getRefDisplayColumn();
			} else if (item.getFlyColumn().isRefListColumn()) {
				model += ".name";
			}
			buffer.append("<td>{{").append("obj." + model).append("}}</td>");
		});
		buffer.append("</tr>");
		buffer.append("</tbody>");
		buffer.append("</table>");
		return buffer.toString();
	}
}
