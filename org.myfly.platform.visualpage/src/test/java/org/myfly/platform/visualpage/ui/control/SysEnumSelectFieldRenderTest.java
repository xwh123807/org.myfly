package org.myfly.platform.visualpage.ui.control;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.domain.ViewType;
import org.myfly.platform.core.metadata.define.FieldDefinition;

public class SysEnumSelectFieldRenderTest {
	@Test
	public void render(){
		FieldDefinition field = new FieldDefinition("数据类型", "dataType", FieldDataType.SYSENUM);
		field.setRelationClass(FieldDataType.class.getName());
		SysEnumSelectFieldRender render = new SysEnumSelectFieldRender();
		render.setViewType(ViewType.EDIT);
		render.setField(field);
		String control = render.control();
		Assert.assertTrue(control.contains("<select"));
		String html = render.html();
		System.out.println(html);
		Assert.assertTrue(html.contains("<select"));
		Assert.assertTrue(html.contains("name=\"dataType\""));
		Assert.assertTrue(html.contains("value=\"$!{obj.dataType}\""));
		Assert.assertTrue(html.contains("数据类型</label>"));
		Assert.assertTrue(html.contains("<option value='NONE'>未指定</option>"));
	}
}
