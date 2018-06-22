package org.myfly.platform.core3.flydata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core3.flydata.service.FlyEntityMap;
import org.myfly.platform.core3.flydata.service.IFlyDataService;
import org.myfly.platform.core3.testmodel.AssertEntity;
import org.myfly.platform.core3.testmodel.PTMaster;
import org.myfly.platform.core3.testmodel.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class)
public class TestModelFlyDataServiceTest {
	@Autowired
	private IFlyDataService dataService;

	private TestModel model;

	private String entityName = PTMaster.class.getName();

	@Before
	public void before() {
		model = new TestModel();
		String uid = dataService.saveEntity(entityName, model.getFlyTestEntity());
		Assert.assertNotNull(uid);
	}

	@Test
	public void find() {
		FlyEntityMap entity = dataService.find(entityName, model.getUid(), true, null);
		Assert.assertNotNull(entity);
		AssertEntity.assertFlyEntityAllFields(model.getFlyTestEntity(), entity);
	}
}
