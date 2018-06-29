package org.myfly.platform.tools.codebuilder;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ElementCodeBuilderTest {
	private List<ADElement> getSources() {
		List<ADElement> sources = new ArrayList<>();
		ADElement element1 = new ADElement();
		element1.setColumnName("Name");
		element1.setName("Name");
		element1.setDescription("desc");
		element1.setHelp("help");
		element1.setEntityType("D");
		element1.setPrintName("print name");
		sources.add(element1);
		return sources;
	}

	@Test
	public void genCodes() {
		ElementCodeBuilder builder = new ElementCodeBuilder();
		builder.setPackageName("org.myfly");
		builder.setSources(getSources());
		builder.generateCodes();
	}
}
