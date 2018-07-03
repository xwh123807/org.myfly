package org.myfly.platform.tools.codebuilder;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.tools.ToolsApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ToolsApplication.class)
public class ElementCodeBuilderTest {
	@Autowired
	private ElementCodeBuilder builder;

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

//	@Test
//	public void genCodes() {
//		ElementCodeBuilder builder = new ElementCodeBuilder();
//		builder.setPackageName("org.myfly.platform.tools.codebuilder");
//		builder.setSources(getSources());
//		builder.generateCodes();
//	}

	@Test
	public void genCodesFromDB() {
		builder.setPackageName("org.myfly.platform.tools.codebuilder");
		builder.parareData();
		builder.generateCodes();
	}
}
