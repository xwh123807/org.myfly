package org.myfly.platform.tools.codebuilder;

public class PackageTable {
	private String packageName;
	private String[] tableNames;

	public PackageTable(String packageName, String[] tableNames) {
		setPackageName(packageName);
		setTableNames(tableNames);
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String[] getTableNames() {
		return tableNames;
	}

	public void setTableNames(String[] tableNames) {
		this.tableNames = tableNames;
	}
}
