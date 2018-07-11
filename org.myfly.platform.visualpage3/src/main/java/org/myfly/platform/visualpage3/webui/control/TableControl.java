package org.myfly.platform.visualpage3.webui.control;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import org.myfly.platform.core.utils.HtmlUtils;
import org.myfly.platform.visualpage3.define.FTab;

/**
 * 表格控件
 * 
 * @author xiangwanhong
 *
 */
public class TableControl {
	/**
	 * 表格显示模型定义
	 */
	private FTab tab;
	/**
	 * 
	 */
	private String model = "tableData";
	/**
	 * 表格附加属性
	 */
	private Map<String, String> tableAttrs;

	public TableControl(FTab tab) {
		this.setTab(tab);
		tableAttrs = new HashMap<>();
	}

	public FTab getTab() {
		return tab;
	}

	public void setTab(FTab tab) {
		this.tab = tab;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Map<String, String> getTableAttrs() {
		return tableAttrs;
	}

	public void setTableAttrs(Map<String, String> tableAttrs) {
		this.tableAttrs = tableAttrs;
	}

	public String html() {
		String html = MessageFormat.format(VueConstants.TABLE_VIEW_HTML, getModel(),
				HtmlUtils.addAttrs(getTableAttrs()), getBodyHtml());
		return html;
	}

	private String getBodyHtml() {
		StringBuffer result = new StringBuffer();
		getTab().getFields().values().forEach(item -> {
			String label = item.getName();
			String model = item.getFlyColumn().getApiName();
			result.append(MessageFormat.format(VueConstants.COLUMN_VIEW_HTML, model, label)).append("\n");
		});
		return result.toString();
	}
}
