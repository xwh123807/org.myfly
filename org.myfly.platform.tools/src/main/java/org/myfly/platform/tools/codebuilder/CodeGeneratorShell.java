package org.myfly.platform.tools.codebuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class CodeGeneratorShell {
	private String path = "/gencodes/";
	private String packageName = "org.myfly.platform.core3.model.data";

	@Autowired
	private ElementCodeBuilder elementBuilder;

	@Autowired
	private EntityCodeBuilder entityBuilder;

	@ShellMethod(key = "gen-element", value = "生成Element")
	public void generateElement(@ShellOption(defaultValue = "EN", help = "语言，如EN、zh_CN，默认为EN") String language) {
		elementBuilder.setPackageName(packageName);
		elementBuilder.setPath(path);
		elementBuilder.setClassName("Element_ALL");
		elementBuilder.setLanguage(language);
		elementBuilder.parareData();
		elementBuilder.generateCodes();
	}

	@ShellMethod(key = "gen-entity", value = "生成实体类")
	public void generateEntity(@ShellOption(help = "表名，如AD_Table，注意大小写") String table) {
		entityBuilder.setPath(path);
		PackageTable[] packages = new PackageTable[] {
				new PackageTable("org.myfly.platform.core3.model.data", new String[] { table }) };
		entityBuilder.setPackages(packages);
		entityBuilder.parareData();
		entityBuilder.generateCodes();
	}
}
