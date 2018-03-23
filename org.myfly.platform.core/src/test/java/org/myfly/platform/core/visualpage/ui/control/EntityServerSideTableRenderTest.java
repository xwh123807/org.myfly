package org.myfly.platform.core.visualpage.ui.control;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.metadata.define.FieldDefinition;
import org.myfly.platform.core.metadata.define.ListDefinition;
import org.myfly.platform.core.visualpage.ui.ViewType;
import org.myfly.platform.core.visualpage.ui.control.EntityServerSideTableRender;

public class EntityServerSideTableRenderTest {
	@Test
	public void html() {
		FieldDefinition[] fields = new FieldDefinition[2];
		FieldDefinition col1 = new FieldDefinition("字段1", "col1");
		FieldDefinition col2 = new FieldDefinition("字段2", "col2");
		fields[0] = col1;
		fields[1] = col2;
		ListDefinition listDefinition = new ListDefinition(fields, "testtable", null);
		EntityServerSideTableRender render = new EntityServerSideTableRender(listDefinition, ViewType.VIEW);
		String html = render.html();
		Assert.assertTrue(html.contains("dataTable-ServerSide"));
		Assert.assertTrue(html.contains("<thead><tr><th>字段1</th><th>字段2</th></tr>"));
	}
}
