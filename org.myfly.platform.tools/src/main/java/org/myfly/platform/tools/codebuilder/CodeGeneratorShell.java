package org.myfly.platform.tools.codebuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class CodeGeneratorShell {
	private String path = "/Users/xiangwanhong/git/org.myfly/org.myfly.platform.tools/target/gencodes";
	private String packageName = "org.myfly.platform.core.model";

	@Autowired
	private ElementCodeBuilder elementBuilder;

	@Autowired
	private EntityCodeBuilder entityBuilder;

	@ShellMethod("element")
	public void generateElement() {
		elementBuilder.setPackageName(packageName);
		elementBuilder.setPath(path);
		elementBuilder.parareData();
		elementBuilder.generateCodes();
	}

	@ShellMethod("entity")
	public void generateEntity() {
		entityBuilder.setPackageName(packageName);
		entityBuilder.setPath(path);
		PackageTable[] packages = new PackageTable[] {
				new PackageTable("org.myfly.platform.core3.model.data", new String[] { "AD_Table" }) };
		entityBuilder.setPackages(packages);
		entityBuilder.parareData();
		entityBuilder.generateCodes();
	}
}
