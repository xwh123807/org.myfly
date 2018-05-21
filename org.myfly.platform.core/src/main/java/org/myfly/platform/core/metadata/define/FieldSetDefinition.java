package org.myfly.platform.core.metadata.define;

import org.myfly.platform.core.metadata.annotation.FieldSetView;
import org.springframework.util.Assert;

public class FieldSetDefinition extends BaseDenifition {
	private String title;
	private String[] fields;

	public FieldSetDefinition(FieldSetView view) {
		setTitle(view.title());
		setFields(view.fields());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getFields() {
		return fields;
	}

	public void setFields(String[] fields) {
		this.fields = fields;
	}

	@Override
	public String toString() {
		return "title: " + getTitle() + ", fields: " + getFields();
	}

	public void validate() {
		Assert.notEmpty(getFields());
	}
}
