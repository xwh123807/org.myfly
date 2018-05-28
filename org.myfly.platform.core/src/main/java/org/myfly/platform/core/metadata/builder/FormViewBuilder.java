package org.myfly.platform.core.metadata.builder;

import org.myfly.platform.core.metadata.define.SectionDefinition;

public class FormViewBuilder {
	private String name;
	private SectionDefinition[] sections;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SectionDefinition[] getSections() {
		return sections;
	}

	public void setSections(SectionDefinition[] sections) {
		this.sections = sections;
	}
}
