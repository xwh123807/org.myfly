package org.myfly.platform.core.metadata.define;

import org.myfly.platform.core.metadata.annotation.FieldSetView;
import org.springframework.util.Assert;

public class FieldSetDefinition extends BaseDenifition {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7230349413792087843L;
	private String title;
	private String[] fields;

	public FieldSetDefinition(FieldSetView view) {
		setTitle(view.title());
		setFields(view.fields());
	}

	public FieldSetDefinition() {
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
