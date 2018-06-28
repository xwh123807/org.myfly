package org.myfly.platform.tools.codebuilder;

public class CodeGenerator {
	private String path = "/Users/xiangwanhong/git/org.myfly/org.myfly.platform.tools/target/gencodes";
	private String packageName = "org.myfly.platform.core.model";

	private void generateElement() {
		ElementCodeBuilder builder = new ElementCodeBuilder();
		builder.setPackageName(packageName);
		builder.setPath(path);
		builder.prepare();
		builder.generateCodes();
	}

	private void generateEntity() {
		EntityCodeBuilder builder = new EntityCodeBuilder();
		builder.setPackageName(packageName);
		builder.setPath(path);
		builder.prepare();
		builder.generateCodes();
	}

	public static void main(String args[]) {
		CodeGenerator generator = new CodeGenerator();
		// generator.generateElement();
		generator.generateEntity();
	}
}
