package org.myfly.platform.core.flydata;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.flydata.service.FlyEntityMap;
import org.myfly.platform.core.flydata.service.IFlyDataService;
import org.myfly.platform.core.model.test.PTMaster;
import org.myfly.platform.core.testmodel.AssertEntity;
import org.myfly.platform.core.testmodel.TestModel;
import org.myfly.platform.core.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class TestModelFlyDataServiceTest {
	@Autowired
	private IFlyDataService dataService;

	private TestModel model;

	private String entityName = PTMaster.class.getName();

	@Before
	public void before() {
		model = new TestModel();
	}
	
	@After
	public void after() {
		//del();
	}

	private void save() {
		String uid = dataService.saveEntity(entityName, model.getFlyTestEntity());
		Assert.assertNotNull(uid);
		Assert.assertEquals(model.getUid(), uid);
	}

	private void del() {
		dataService.delOne(entityName, model.getUid());
	}

	@Test
	public void saveEntity() {
		save();
		FlyEntityMap entity = dataService.find(entityName, model.getUid(), false, null);
		Assert.assertNotNull(entity);
		AssertEntity.assertFlyEntityAllFields(model.getFlyTestEntity(), entity);
	}

	@Test
	public void saveAndReturn() {
		FlyEntityMap entity = dataService.saveEntityAndReturn(entityName, model.getFlyTestEntity());
		Assert.assertNotNull(entity);
		AssertEntity.assertFlyEntityAllFields(model.getFlyTestEntity(), entity);
	}

	@Test
	public void updateEntity() {
		save();
		dataService.updateEntity(entityName, model.getUid(), model.getFlyChangedEntity());
		FlyEntityMap entity = dataService.find(entityName, model.getUid(), false, null);
		Assert.assertNotNull(entity);
		AssertEntity.assertFlyEntityAllFields(model.getFlyChangedEntity(), entity);
	}

	@Test
	public void updateEntityAndReturn() {
		save();
		FlyEntityMap entity = dataService.updateEntityAndReturn(entityName, model.getUid(),
				model.getFlyChangedEntity());
		Assert.assertNotNull(entity);
		AssertEntity.assertFlyEntityAllFields(model.getFlyChangedEntity(), entity);
	}

	@Test
	public void mergeEntity() {
		save();
		FlyEntityMap mergeEntity = new FlyEntityMap();
		mergeEntity.put("name", UUIDUtil.newHtmlID());
		dataService.mergeEntity(entityName, model.getUid(), mergeEntity);
		FlyEntityMap entity = dataService.find(entityName, model.getUid(), false, null);
		Assert.assertNotNull(entity);
		AssertEntity.assertFlyEntityAllFields(model.getFlyTestEntity().merge(mergeEntity), entity);
	}

	@Test
	public void mergeEntityAndReturn() {
		save();
		FlyEntityMap mergeEntity = new FlyEntityMap();
		mergeEntity.put("name", UUIDUtil.newHtmlID());
		FlyEntityMap entity = dataService.mergeEntityAndReturn(entityName, model.getUid(), mergeEntity);
		Assert.assertNotNull(entity);
		AssertEntity.assertFlyEntityAllFields(model.getFlyTestEntity().merge(mergeEntity), entity);
	}
}
