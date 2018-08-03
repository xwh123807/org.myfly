package org.myfly.platform.core.metadata;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.datamodel.service.IFlyDataModel;
import org.myfly.platform.core.datamodel.service.IFlyDataModelService;
import org.myfly.platform.core.domain.IFlyEntity;
import org.myfly.platform.core.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;

public class FlyDataModelServiceTest extends ServiceTestCase{
	@Autowired
	private IFlyDataModelService service;

	@Test
	public void getFlyDataModel() {
		List<Class<? extends IFlyEntity>> list = service.getAllEntityClasses();
		Assert.assertNotNull(list);
		list.forEach(entityClass -> {
			IFlyDataModel flyTable = service.getFlyDataModel(entityClass.getName());
			if (entityClass.getName().startsWith("org.myfly.platform.core")) {
				Assert.assertNotNull(flyTable);
			}
		});
	}
}
