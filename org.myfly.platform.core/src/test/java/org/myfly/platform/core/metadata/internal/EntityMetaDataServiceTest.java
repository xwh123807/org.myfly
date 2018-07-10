package org.myfly.platform.core.metadata.internal;

import java.util.List;

import org.apache.commons.lang3.ClassUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.service.IEntityMetaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class EntityMetaDataServiceTest {
	@Autowired
	private IEntityMetaDataService metaDataService;

	@Test
	public void getAllEntityClasses() {
		//getAllEntityClasses
		List<Class<?>> list = metaDataService.getAllEntityClasses();
		Assert.assertNotNull(list);
		list.stream().forEach(item -> {
			Class<?> cls = metaDataService.getEntityClass(item.getName());
			Assert.assertEquals(item, cls);
			cls = metaDataService.getEntityClass(ClassUtils.getShortClassName(item.getName()));
			Assert.assertEquals(item, cls);
		});
	}

	@Test
	public void fetchAllEntityMetaData() {
		List<Class<?>> list = metaDataService.getAllEntityClasses();
		Assert.assertNotNull(list);
		list.stream().forEach(item -> {
			EntityMetaData metaData = metaDataService.getEntityMetaData(item.getName());
			Assert.assertNotNull(metaData);
		});
	}
}
