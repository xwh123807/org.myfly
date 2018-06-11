package org.myfly.platform.core.testmodel;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.flydata.service.FlyEntityResult;
import org.myfly.platform.core.flydata.service.IFlyEntityService;
import org.myfly.platform.core.utils.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class)
public class FlyEntityMasterTest {
	@Autowired
	private IFlyEntityService entityService;
	
	private String masterEntityName = Master.class.getName();
	
	@Test
	public void cudq() {
		FlyEntityTestModel model = new FlyEntityTestModel();
		model.buildTestModelEntities();
		//create
		String uid = entityService.saveEntity(masterEntityName, null, JSONUtil.toJSON(model.getTestEntity()));
		Assert.assertNotNull(uid);
		//find
		FlyEntityResult flyEntity = entityService.find(masterEntityName, uid, null, true, null);
		Assert.assertNotNull(flyEntity);
		model.assertEntityAllFields(model.getFlyTestEntity(), flyEntity);
	}
}
