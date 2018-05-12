package org.myfly.platform.visualpage.ui.control;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.metamodel.define.FieldDefinition;
import org.myfly.platform.metamodel.domain.FieldDataType;
import org.myfly.platform.metamodel.domain.ViewType;

public class DateInputFieldRenderTest {
	@Test
	public void render(){
		FieldDefinition field = new FieldDefinition("名称", "name", FieldDataType.CHECK);
		DateInputFieldRender render = new DateInputFieldRender();
		render.setViewType(ViewType.EDIT);
		render.setField(field);
		String control = render.control();
		Assert.assertTrue(control.contains("type=\"text\""));
		String html = render.html();
		Assert.assertTrue(html.contains("type=\"text\""));
		Assert.assertTrue(html.contains("name=\"name\""));
		Assert.assertTrue(html.contains("value=\"$!{obj.name}\""));
		Assert.assertTrue(html.contains("名称</label>"));
		Assert.assertTrue(html.contains("date-picker"));
	}
}
