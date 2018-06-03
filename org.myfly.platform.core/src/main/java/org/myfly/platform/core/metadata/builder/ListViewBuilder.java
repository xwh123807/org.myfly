package org.myfly.platform.core.metadata.builder;

import org.myfly.platform.core.metadata.annotation.ListStyle;

public class ListViewBuilder {
	private String name;
	private String title;
	private ListStyle listStyle;
	private String[] fields;
	private String entityName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ListStyle getListStyle() {
		return listStyle;
	}

	public void setListStyle(ListStyle listStyle) {
		this.listStyle = listStyle;
	}

	public String[] getFields() {
		return fields;
	}

	public void setFields(String[] fields) {
		this.fields = fields;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
}
