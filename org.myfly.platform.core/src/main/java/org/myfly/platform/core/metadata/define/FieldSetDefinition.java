package org.myfly.platform.core.metadata.define;

import org.myfly.platform.core.metadata.annotation.FieldSetView;
import org.springframework.util.Assert;

public class FieldSetDefinition extends BaseDenifition {
	private String title;
	private String[] fieldNames;
	private FieldDefinition[] fields;

	public FieldSetDefinition(String title) {
		super(null);
		setTitle(title);
	}

	public FieldSetDefinition(FieldSetView view) {
		super(null);
		setTitle(view.title());
		setFieldNames(view.fields());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public FieldDefinition[] getFields() {
		return fields;
	}

	public void setFields(FieldDefinition[] fields) {
		this.fields = fields;
	}

	public String[] getFieldNames() {
		return fieldNames;
	}

	@Override
	public String toString() {
		return "title: " + getTitle() + ", fields: " + FieldDefinition.getNames(fields);
	}

	public void validate() {
		Assert.notEmpty(getFields());
	}

	public void setFieldNames(String[] fieldNames) {
		this.fieldNames = fieldNames;
	}
}
