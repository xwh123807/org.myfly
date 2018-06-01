package org.myfly.platform.core.testmodel;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.service.IEntityMetaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestModelEntityMetaDataServiceTest {
	@Autowired
	private IEntityMetaDataService service;

	@Test
	public void getEntityClass() {
		Class<?> cls = service.getEntityClass(Master.class.getName());
		Assert.assertEquals(Master.class, cls);
		cls = service.getEntityClass("master");
		Assert.assertEquals(Master.class, cls);
		cls = service.getEntityClass("Master");
		Assert.assertEquals(Master.class, cls);
	}

	@Test
	public void getEntityMetaData() {
		EntityMetaData meta = service.getEntityMetaData(Master.class.getName());
		Assert.assertNotNull(meta);
	}

	@Test
	public void getSubEntityMetaData() {
		EntityMetaData meta = service.getSubEntityMetaData(Master.class.getName(), "details");
		Assert.assertNotNull(meta);
		Assert.assertEquals(Detail.class, meta.getEntityClass());
	}
}
