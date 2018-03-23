package org.myfly.platform.core.visualpage.ui;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.define.FieldDefinition;
import org.myfly.platform.core.visualpage.ui.BaseFieldRender;
import org.myfly.platform.core.visualpage.ui.FieldRenderFactory;
import org.myfly.platform.core.visualpage.ui.control.CheckInputFieldRender;
import org.myfly.platform.core.visualpage.ui.control.SysEnumSelectFieldRender;
import org.myfly.platform.core.visualpage.ui.control.TextInputFieldRender;

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
