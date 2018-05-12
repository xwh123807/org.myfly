package org.myfly.platform.visualpage.ui;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.metamodel.define.FieldDefinition;
import org.myfly.platform.metamodel.domain.FieldDataType;
import org.myfly.platform.visualpage.ui.control.CheckInputFieldRender;
import org.myfly.platform.visualpage.ui.control.SysEnumSelectFieldRender;
import org.myfly.platform.visualpage.ui.control.TextInputFieldRender;

public class FieldRenderFactoryTest {
	@Test
	public void getRenderForText(){
		FieldDefinition field = new FieldDefinition("名称" , "name", FieldDataType.TEXT);
		BaseFieldRender render = FieldRenderFactory.getRender(field);
		Assert.assertNotNull(render);
		Assert.assertTrue(render instanceof TextInputFieldRender);
	}
	
	@Test
	public void getRenderForSysEnum(){
		FieldDefinition field = new FieldDefinition("名称" , "name", FieldDataType.SYSENUM);
		BaseFieldRender render = FieldRenderFactory.getRender(field);
		Assert.assertNotNull(render);
		Assert.assertTrue(render instanceof SysEnumSelectFieldRender);
	}
	
	@Test
	public void getRenderForCheck(){
		FieldDefinition field = new FieldDefinition("名称" , "name", FieldDataType.CHECK);
		BaseFieldRender render = FieldRenderFactory.getRender(field);
		Assert.assertNotNull(render);
		Assert.assertTrue(render instanceof CheckInputFieldRender);
	}
}
