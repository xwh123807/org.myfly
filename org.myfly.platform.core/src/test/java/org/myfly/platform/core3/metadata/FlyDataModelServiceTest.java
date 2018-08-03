package org.myfly.platform.core3.metadata;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core3.datamodel.service.IFlyDataModel;
import org.myfly.platform.core3.datamodel.service.IFlyDataModelService;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class FlyDataModelServiceTest {
	@Autowired
	private IFlyDataModelService service;

	@Test
	public void getFlyDataModel() {
		List<Class<? extends IFlyEntity>> list = service.getAllEntityClasses();
		Assert.assertNotNull(list);
		list.forEach(entityClass -> {
			IFlyDataModel flyTable = service.getFlyDataModel(entityClass.getName());
			if (entityClass.getName().startsWith("org.myfly.platform.core3")) {
				Assert.assertNotNull(flyTable);
			}
		});
	}
}
