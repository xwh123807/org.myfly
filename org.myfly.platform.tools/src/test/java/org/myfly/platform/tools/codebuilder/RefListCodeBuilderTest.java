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
	public void genCodes() {
		builder.setPath("/gencodes/");
		builder.setPackageName("org.myfly.platform.core3.model.data");
		builder.setClassName("RefLists_ALL");
		builder.setLanguage("EN");
		builder.setTables(null);
		builder.parareData();
		builder.generateCodes();
	}

	@Test
	public void genCodesForCN() {
		builder.setPath("/gencodes/");
		builder.setPackageName("org.myfly.platform.core3.model.data");
		builder.setClassName("RefLists_ALL");
		builder.setLanguage("zh_CN");
		builder.setTables(null);
		builder.parareData();
		builder.generateCodes();
	}

	@Test
	public void genCodesForCNWithTables() {
		builder.setPath("/gencodes/");
		builder.setPackageName("org.myfly.platform.core3.model.data");
		builder.setClassName("RefLists");
		builder.setLanguage("zh_CN");
		builder.setTables(ExportConstants.EXPORT_CORE_TABLES);
		builder.parareData();
		builder.generateCodes();
	}
}
