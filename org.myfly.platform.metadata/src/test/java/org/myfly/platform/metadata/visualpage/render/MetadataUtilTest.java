package org.myfly.platform.metadata.visualpage.render;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.MetaDataApplication;
import org.myfly.platform.metadata.domain.MField;
import org.myfly.platform.metadata.domain.MTable;
import org.myfly.platform.metadata.service.IMetaDataService;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes=MetaDataApplication.class)
public class MetadataUtilTest extends ServiceTestCase{
	@Autowired
	private IMetaDataService metaService;
	
	@Test
	@Transactional
	public void getFieldByAttr(){
		MTable mtable = metaService.findTableByTableName("suser");
		MField field = MetadataUtil.getField(mtable, "name");
		Assert.assertEquals("name", field.getAttrName());
	}
	
	@Test
	@Transactional
	public void getFieldByAttrForSubTable(){
		MTable mtable = metaService.findTableByTableName("stdtesttable");
		MField field = MetadataUtil.getField(mtable, "name");
		Assert.assertEquals("name", field.getAttrName());
		field = MetadataUtil.getField(mtable, "details", "name");
		Assert.assertEquals("name", field.getAttrName());
	}
}
