package org.myfly.platform.core3.metadata;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core3.metadata.define.FlyTableDefinition;
import org.myfly.platform.core3.metadata.service.IMetaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class)
public class MetaDataServiceTest {
	@Autowired
	private IMetaDataService service;

	@Test
	public void getFlyTableDefinitionFromEntityClass() {
		List<Class<?>> list = service.getAllEntityClasses();
		Assert.assertNotNull(list);
		list.forEach(entityClass -> {
			FlyTableDefinition flyTable = service.getFlyTableDefinitionFromEntityClass(entityClass);
			Assert.assertNotNull(flyTable);
		});
	}

	@Test
	public void getFlyTableDefinition() {
		List<Class<?>> list = service.getAllEntityClasses();
		Assert.assertNotNull(list);
		list.forEach(entityClass -> {
			FlyTableDefinition flyTable = service.getFlyTableDefinition(entityClass.getName());
			Assert.assertNotNull(flyTable);
		});
	}

	@Test
	public void importDataModelFromAllEntityClass() {
		List<String> result = service.importDataModelFromAllEntityClass();
		result.forEach(log -> System.out.println(log));
	}
}
