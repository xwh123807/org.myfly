package org.myfly.platform.tools.codebuilder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.tools.ToolsApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ToolsApplication.class)
public class ReportCodeBuiderTest {
	@Autowired
	private RefListCodeBuilder builder;

	@Test
	public void genCodesForCNWithTables() {
		builder.setPath("/gencodes/");
		builder.setPackageName("org.myfly.platform.report.model");
		builder.setClassName("RefLists");
		builder.setLanguage("zh_CN");
		builder.setTables(ExportConstants.EXPORT_REPORT_TABLES);
		builder.parareData();
		builder.generateCodes();
	}

	@Autowired
	private EntityCodeBuilder entityCodeBuilder;

	@Test
	public void genCodes() {
		entityCodeBuilder.setPath("/gencodes/");
		PackageTable[] packages = new PackageTable[] {
				new PackageTable("org.myfly.platform.core3.model", ExportConstants.EXPORT_REPORT_TABLES) };
		entityCodeBuilder.setPackages(packages);
		entityCodeBuilder.parareData();
		entityCodeBuilder.generateCodes();
	}
}
