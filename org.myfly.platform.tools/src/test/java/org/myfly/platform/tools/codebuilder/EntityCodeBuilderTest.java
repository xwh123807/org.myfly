package org.myfly.platform.tools.codebuilder;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class EntityCodeBuilderTest {
	@Test
	public void genCodes() {
		EntityCodeBuilder builder = new EntityCodeBuilder();
		builder.setSources(getSources());
		PackageTable[] packages = new PackageTable[] {
				new PackageTable("org.myfly.platform.core3.model.data", new String[] { "AD_Table" }) };
		builder.setPackages(packages);
		builder.generateCodes();
	}

	private List<ADTable> getSources() {
		List<ADTable> list = new ArrayList<>();
		ADTable table = new ADTable();
		table.setTableName("Table");
		table.setName("Table");
		table.setDescription("table description");
		table.setHelp("table help");
		List<ADColumn> columns = new ArrayList<>();
		ADColumn column1 = new ADColumn();
		column1.setColumnName("name");
		column1.setName("Name");
		column1.setColumnName("Name");
		column1.setDescription("name description");
		column1.setHelp("name help");
		column1.setFieldLength(50);
		columns.add(column1);
		table.setPackageName("org.myfly");
		table.setColumns(columns);
		list.add(table);
		return list;
	}
}
