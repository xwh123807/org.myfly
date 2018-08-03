package org.myfly.platform.tools.codebuilder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.tools.ToolsApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ToolsApplication.class)
public class AllCodeBuilderTest {
	@Autowired
	private ElementCodeBuilder builder;

	@Autowired
	private RefListCodeBuilder refListBuilder;

	@Autowired
	private EntityCodeBuilder entityBuilder;

	@Test
	public void genElementsCode() {
		builder.setPath("/gencodes/");
		builder.setPackageName("org.myfly.platform.core3.dbinit.resources");
		builder.setClassName("Element");
		builder.setLanguage("zh_CN");
		builder.setTables(ExportConstants.getElementTables());
		builder.parareData();
		builder.generateCodes();
	}

	@Test
	public void genRefListsCode() {
		refListBuilder.setPath("/gencodes/");
		refListBuilder.setPackageName("org.myfly.platform.core3.dbinit.resources");
		refListBuilder.setClassName("RefLists");
		refListBuilder.setLanguage("zh_CN");
		refListBuilder.setTables(ExportConstants.getElementTables());
		refListBuilder.parareData();
		refListBuilder.generateCodes();
	}

	@Test
	public void genCodes() {
		entityBuilder.setPath("/gencodes/");
		entityBuilder.setPackages(ExportConstants.packageTables);
		entityBuilder.parareData();
		entityBuilder.generateCodes();
	}

}
