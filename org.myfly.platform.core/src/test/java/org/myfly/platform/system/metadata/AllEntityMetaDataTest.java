package org.myfly.platform.system.metadata;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.metadata.service.EntityMetaData;
import org.myfly.platform.core.metadata.service.IEntityMetaDataService;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes=CoreApplication.class)
public class AllEntityMetaDataTest extends ServiceTestCase {
	@Autowired
	private IEntityMetaDataService entityMetaDataService;

	@Test
	public void fetchAllEntities() {
		List<Class<?>> list = entityMetaDataService.getAllEntityClasses();
		Assert.assertNotNull(list);
		Assert.assertTrue(list.size() > 0);
		for (Class<?> item : list) {
			EntityMetaData metaData = entityMetaDataService.getEntityMetaData(item.getName());
			Assert.assertEquals(item.getName(), metaData.getEntityClass().getName());
		}
	}

}
