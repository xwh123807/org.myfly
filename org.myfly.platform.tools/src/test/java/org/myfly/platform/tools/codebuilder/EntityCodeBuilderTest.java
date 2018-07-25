package org.myfly.platform.tools.codebuilder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.tools.ToolsApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ToolsApplication.class)
public class EntityCodeBuilderTest {

	@Autowired
	private EntityCodeBuilder builder;

	@Test
	public void genCodes() {
		builder.setPath("/gencodes/");
		PackageTable[] packages = new PackageTable[] {
				new PackageTable("org.myfly.platform.core3.model", ExportConstants.EXPORT_CORE_TABLES) };
		builder.setPackages(packages);
		builder.parareData();
		builder.generateCodes();
	}
}
