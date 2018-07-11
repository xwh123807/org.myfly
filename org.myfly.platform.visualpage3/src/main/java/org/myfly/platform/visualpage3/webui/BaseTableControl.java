package org.myfly.platform.visualpage3.webui;

import java.util.Map;

import org.myfly.platform.visualpage3.define.FTab;

public abstract class BaseTableControl {
	/**
	 * 表格显示模型定义
	 */
	private FTab tab;
	
	/**
	 * 表格附加属性
	 */
	private Map<String, String> tableAttrs;

	public BaseTableControl(FTab tab) {
		this.setTab(tab);
		
	}

	public FTab getTab() {
		return tab;
	}

	public void setTab(FTab tab) {
		this.tab = tab;
	}

	public Map<String, String> getTableAttrs() {
		return tableAttrs;
	}

	public void setTableAttrs(Map<String, String> tableAttrs) {
		this.tableAttrs = tableAttrs;
	}
}
