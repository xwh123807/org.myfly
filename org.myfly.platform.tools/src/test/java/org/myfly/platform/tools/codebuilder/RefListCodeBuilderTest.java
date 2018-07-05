package org.myfly.platform.tools.codebuilder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.tools.ToolsApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ToolsApplication.class)
public class RefListCodeBuilderTest {
	@Autowired
	private RefListCodeBuilder builder;

	@Test
	public void genCodesFromDB() {
		builder.setPackageName("org.myfly.platform.tools.codebuilder");
		builder.parareData();
		builder.generateCodes();
	}
}
