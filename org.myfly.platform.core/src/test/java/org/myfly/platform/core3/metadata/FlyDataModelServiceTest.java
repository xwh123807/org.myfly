package org.myfly.platform.core3.metadata;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core3.metadata.service.IFlyDataModel;
import org.myfly.platform.core3.metadata.service.IFlyDataModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class)
public class FlyDataModelServiceTest {
	@Autowired
	private IFlyDataModelService service;

	@Test
	public void getFlyDataModelFromEntityClass() {
		List<Class<?>> list = service.getAllEntityClasses();
		Assert.assertNotNull(list);
		list.forEach(entityClass -> {
			IFlyDataModel flyTable = service.getFlyDataModelFromEntityClass(entityClass);
			Assert.assertNotNull(flyTable);
		});
	}

	@Test
	public void getFlyDataModel() {
		List<Class<?>> list = service.getAllEntityClasses();
		Assert.assertNotNull(list);
		list.forEach(entityClass -> {
			IFlyDataModel flyTable = service.getFlyDataModel(entityClass.getName());
			Assert.assertNotNull(flyTable);
		});
	}
}
