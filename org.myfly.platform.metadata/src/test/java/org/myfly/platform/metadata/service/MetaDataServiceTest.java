package org.myfly.platform.metadata.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.MetaDataApplication;
import org.myfly.platform.system.domain.TableMapping;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes=MetaDataApplication.class)
public class MetaDataServiceTest extends ServiceTestCase{
	@Autowired
	private IMetaDataService metaDataService;

	@Test
	public void findAllTableMapping(){
		List<TableMapping> result = metaDataService.findAllTableMapping();
		Assert.assertNotNull(result);
		Assert.assertTrue(result.size() > 0);
	}
	
	@Test
	public void findTableMapping(){
		TableMapping mapping = metaDataService.findTableMapping("stenant");
		Assert.assertNotNull(mapping);
		Assert.assertEquals("STenant", mapping.getEntityName());
	}
}
