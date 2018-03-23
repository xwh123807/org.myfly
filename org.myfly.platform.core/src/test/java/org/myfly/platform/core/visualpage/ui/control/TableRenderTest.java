package org.myfly.platform.core.visualpage.ui.control;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.define.FieldDefinition;
import org.myfly.platform.core.visualpage.ui.control.TableRender;
import org.myfly.platform.core.visualpage.ui.control.TableRender.Td;
import org.myfly.platform.core.visualpage.ui.control.TableRender.Tr;

public class TableRenderTest {
	@Test
	public void tdForUid() {
		FieldDefinition field = new FieldDefinition("UID", "uid");
		Td td = new Td(field);
		Assert.assertEquals("<th>UID</th>", td.thead());
		Assert.assertEquals("<td>$!{objitem.uid}</td>", td.tbody());
	}

	@Test
	public void tdForName() {
		FieldDefinition field = new FieldDefinition("名称", "name");
		Td td = new Td(field);
		Assert.assertEquals("<th>名称</th>", td.thead());
		Assert.assertEquals("<td>$!{objitem.name}</td>", td.tbody());
	}

	@Test
	public void tr() {
		Tr tr = new Tr(null);
		FieldDefinition field = new FieldDefinition("UID", "uid");
		Td td = new Td(field);
		FieldDefinition field1 = new FieldDefinition("名称", "name");
		Td td1 = new Td(field1);
		FieldDefinition field2 = new FieldDefinition("描述", "description");
		Td td2 = new Td(field2);
		tr.getTds().add(td);
		tr.getTds().add(td1);
		tr.getTds().add(td2);
		Assert.assertEquals("<tr><th>UID</th><th>名称</th><th>描述</th></tr>", tr.html(false));
	}

	@Test
	public void tdForSearchRelation() {
		FieldDefinition field = new FieldDefinition("table", "table", FieldDataType.SEARCHRELATION);
		Td td = new Td(field);
		Assert.assertEquals("<th>table</th>", td.thead());
		Assert.assertEquals("<td>$!{objitem.table}</td>", td.tbody());
	}

	@Test
	public void tdForNameAndLink() {
		FieldDefinition[] fields = new FieldDefinition[1];
		TableRender table = new TableRender(fields, "", null);
		table.setLinkField("name");
		table.setLinkUrl("${objitem.name}");
		FieldDefinition field = new FieldDefinition("名称", "name");
		fields[0] = field;
		Td td = new Td(table, field);
		Assert.assertEquals("<th>名称</th>", td.thead());
		Assert.assertEquals("<td><a href=\"${objitem.name}\">$!{objitem.name}</a></td>", td.tbody());
	}
}
