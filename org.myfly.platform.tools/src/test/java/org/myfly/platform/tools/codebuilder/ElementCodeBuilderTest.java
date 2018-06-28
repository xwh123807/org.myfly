package org.myfly.platform.tools.codebuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class ElementCodeBuilderTest {
	private List<Map<String, Object>> getSources() {
		List<Map<String, Object>> list = new ArrayList<>();
		list.add(newElement("Name", "Name", ""));
		list.add(newElement("Description", "Name", ""));
		list.add(newElement("Help", "Name", ""));
		return list;
	}

	private Map<String, Object> newElement(String name, String description, String help) {
		Map<String, Object> map = new HashMap<>();
		map.put("Name", name);
		map.put("Description", description);
		map.put("Help", help);
		return map;
	}

	@Test
	public void codeBuilder() {
		ElementCodeBuilder builder = new ElementCodeBuilder();
		builder.setPath("/xwh.work/git/org.myfly/org.myfly.platform.tools/target/gencodes");
		builder.setPackageName("org.myfly.platform.core.model");
		builder.setSources(getSources());
		builder.generateCodes();
	}
}
