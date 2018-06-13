package org.myfly.platform.core.testmodel;

import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.flydata.service.FlyEntityResult;
import org.myfly.platform.core.flydata.service.IFlyEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 用于测试IFlyEntityService服务
 * 
 * @author xiangwanhong
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class)
public class FlyEntityMasterTest {
	@Autowired
	private IFlyEntityService entityService;

	private String masterEntityName = Master.class.getName();

	@Test
	public void cudq() {
		FlyEntityTestModel model = new FlyEntityTestModel();
		// create
		String uid = entityService.saveEntity(masterEntityName, null, model.getFlyTestEntity());
		Assert.assertNotNull(uid);
		// find
		FlyEntityResult flyEntity = entityService.find(masterEntityName, uid, null, true, null);
		Assert.assertNotNull(flyEntity);
		flyEntity.printJson();
		Assert.assertNotNull(flyEntity.get("detail1"));
		Assert.assertNotNull(flyEntity.get("details"));
		Assert.assertEquals(1, ((Collection) flyEntity.get("details")).size());
		// 验证查询返回的是否和存储的完全一致
		model.assertFlyEntityAllFields(model.getFlyTestEntity(), flyEntity);
		// update
		model.getFlyChangedEntity().printJson();
		entityService.updateEntity(masterEntityName, uid, null, model.getFlyChangedEntity());
		// 查询修改后的实体
		FlyEntityResult flyEntity2 = entityService.find(masterEntityName, uid, null, true, null);
		Assert.assertNotNull(flyEntity2);
		flyEntity2.printJson();
		Assert.assertNull(flyEntity2.get("detail1"));
		Assert.assertNotNull(flyEntity2.get("details"));
		// find all
		List<FlyEntityResult> list = entityService.findAll(masterEntityName, null);
		Assert.assertNotNull(list);
		Assert.assertTrue(list.size() > 0);
		//del
		entityService.del(masterEntityName, uid);
	}
}
