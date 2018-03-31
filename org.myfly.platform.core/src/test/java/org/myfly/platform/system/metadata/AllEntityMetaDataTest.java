package org.myfly.platform.system.metadata;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.metadata.internal.EntityMetaData;
import org.myfly.platform.core.metadata.service.IEntityMetaDataService;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes=CoreApplication.class)
public class AllEntityMetaDataTest extends ServiceTestCase{
	@Autowired
	private IEntityMetaDataService entityMetaDataService;
	
	@Test
	public void fetchAllEntities(){
		List<Class<?>> list = entityMetaDataService.getAllEntityClasses();
		for (Class<?> item : list){
			EntityMetaData metaData = entityMetaDataService.getEntityMetaData(item.getName());
			Assert.assertEquals(item.getName(), metaData.getEntityClass().getName());
		}
	}
	
}
