package org.myfly.platform.core.visualpage.ui.control;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.define.FieldDefinition;
import org.myfly.platform.core.visualpage.ui.EntityAction;
import org.myfly.platform.core.visualpage.ui.EntityActionInfo.EntityActionField;
import org.myfly.platform.core.visualpage.ui.control.VelocityTemplateTableRender;

public class VelocityTemplateTableRenderTest {
	@Test
	public void html(){
		FieldDefinition[] fields = new FieldDefinition[2];
		FieldDefinition col1 = new FieldDefinition("字段1", "col1");
		FieldDefinition col2 = new FieldDefinition("字段2", "col2");
		fields[0] = col1;
		fields[1] = col2;
		VelocityTemplateTableRender render = new VelocityTemplateTableRender(fields, "testtable", null);
		String html = render.html();
		Assert.assertNotNull(html);
		Assert.assertTrue(html.contains("#foreach($objitem in $objlist)"));
		Assert.assertTrue(html.contains("entityName=\"testtable\""));
		Assert.assertTrue(html.contains("<td>$!{objitem.col1}</td><td>$!{objitem.col2}</td>"));
	}
	
	@Test
	public void htmlForLink(){
		FieldDefinition[] fields = new FieldDefinition[1];
		FieldDefinition col1 = new FieldDefinition("字段1", "col1");
		col1.setLinkUrl("/vp/test");
		fields[0] = col1;
		VelocityTemplateTableRender render = new VelocityTemplateTableRender(fields, "testtable", null);
		String html = render.html();
		Assert.assertTrue(html.contains("href=\"/vp/test\""));
	}
	
	@Test
	public void htmlForNameField(){
		FieldDefinition[] fields = new FieldDefinition[1];
		FieldDefinition col1 = new FieldDefinition("字段1", "name");
		fields[0] = col1;
		VelocityTemplateTableRender render = new VelocityTemplateTableRender(fields, "testtable", null);
		String html = render.html();
		System.out.println(html);
		Assert.assertTrue(html.contains("href=\"/vp/testtable/$!{objitem.uid}\""));
	}
	
	@Test
	public void htmlForSubEntity(){
		FieldDefinition[] fields = new FieldDefinition[1];
		FieldDefinition col1 = new FieldDefinition("字段1", "col1");
		fields[0] = col1;
		VelocityTemplateTableRender render = new VelocityTemplateTableRender(fields, "testtable", "user");
		String html = render.html();
		Assert.assertTrue(html.contains("#foreach($objitem in $tmp)"));
	}
	
	@Test
	public void htmlForSubEntityNameField(){
		FieldDefinition[] fields = new FieldDefinition[1];
		FieldDefinition col1 = new FieldDefinition("字段1", "name");
		fields[0] = col1;
		VelocityTemplateTableRender render = new VelocityTemplateTableRender(fields, "testtable", "details");
		String html = render.html();
		System.out.println(html);
		Assert.assertTrue(html.contains("href=\"/vp/testtable/$!{obj.uid}/details/$!{objitem.uid}\""));
	}
	
	@Test
	public void htmlForSearchRelation(){
		FieldDefinition[] fields = new FieldDefinition[1];
		FieldDefinition col1 = new FieldDefinition("字段1", "col1");
		col1.setDataType(FieldDataType.SEARCHRELATION);
		col1.setRelationTable("suser");
		fields[0] = col1;
		VelocityTemplateTableRender render = new VelocityTemplateTableRender(fields, "testtable", null);
		String html = render.html();
		Assert.assertTrue(html.contains("/vp/suser/$!{objitem.col1.uid}"));
		Assert.assertTrue(html.contains("/vp/outline/suser/$!{objitem.col1.uid}"));
		Assert.assertTrue(html.contains("$!{objitem.col1.name}</a>"));
	}
	
	@Test
	public void htmlForActions(){
		FieldDefinition[] fields = new FieldDefinition[2];
		FieldDefinition col1 = new FieldDefinition("字段1", "col1");
		fields[0] = col1;
		FieldDefinition col2 = new EntityActionField(EntityAction.VIEW);
		fields[1] = col2;
		VelocityTemplateTableRender render = new VelocityTemplateTableRender(fields, "testtable", null);
		String html = render.html();
		Assert.assertTrue(html.contains("/vp/testtable/$!{objitem.uid}"));
	}
	
	@Test
	public void htmlForSubEntityActions(){
		FieldDefinition[] fields = new FieldDefinition[2];
		FieldDefinition col1 = new FieldDefinition("字段1", "col1");
		fields[0] = col1;
		FieldDefinition col2 = new EntityActionField(EntityAction.VIEW);
		fields[1] = col2;
		VelocityTemplateTableRender render = new VelocityTemplateTableRender(fields, "testtable", "details");
		String html = render.html();
		Assert.assertTrue(html.contains("/vp/testtable/$!{obj.uid}/details/$!{objitem.uid}"));
	}
}
