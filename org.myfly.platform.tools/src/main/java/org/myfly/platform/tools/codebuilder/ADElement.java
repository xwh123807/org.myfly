package org.myfly.platform.tools.codebuilder;

import java.util.HashMap;
import java.util.Map;

import com.squareup.javapoet.TypeSpec.Builder;

public class ADElement extends HashMap<String, Object> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -189348808503679207L;

	public ADElement() {
	}

	public ADElement(Map<String, Object> from) {
		putAll(from);
	}

	public String getApiName() {
		return getColumnName();
	}

	public String getClassName() {
		return getApiName();
	}

	public String getColumnName() {
		return (String) get("columnname");
	}

	public String getName() {
		return (String) get("name");
	}

	public String getDescription() {
		return (String) get("description");
	}

	public String getHelp() {
		return (String) get("help");
	}

	public void build(Builder builder) {
		builder.addEnumConstant(getApiName());
	}

	public void setName(String value) {
		put("name", value);
	}

	public void setDescription(String value) {
		put("description", value);
	}

	public void setHelp(String value) {
		put("help", value);
	}

	public void setColumnName(String value) {
		put("columnname", value);
	}
}
