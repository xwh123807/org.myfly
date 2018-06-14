package org.myfly.platform.core.testmodel;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.flydata.service.FlyEntityResult;
import org.myfly.platform.core.flydata.service.IFlyEntityService;
import org.myfly.platform.core.utils.UUIDUtil;
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

	private FlyEntityTestModel model;

	private String uid;

	@Before
	public void before() {
		model = new FlyEntityTestModel();
		uid = entityService.saveEntity(masterEntityName, null, model.getFlyTestEntity());
		Assert.assertNotNull(uid);
	}

	@Test
	public void cudq() {
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
		// merge
		model.getFlyMergeEntity().printJson();
		entityService.mergeEntity(masterEntityName, uid, null, model.getFlyMergeEntity());
		// 查询合并修改后的实体
		FlyEntityResult flyEntity3 = entityService.find(masterEntityName, uid, null, true, null);
		Assert.assertNotNull(flyEntity3);
		flyEntity3.printJson();
		// find all
		List<FlyEntityResult> list = entityService.findAll(masterEntityName, null);
		Assert.assertNotNull(list);
		Assert.assertTrue(list.size() > 0);
		// del
		entityService.del(masterEntityName, uid);
	}

	@Test
	public void updateName() {
		FlyEntityResult flyEntitya = new FlyEntityResult();
		flyEntitya.put("name", "name changed");
		entityService.updateEntity(masterEntityName, uid, null, flyEntitya);

		FlyEntityResult flyEntityb = entityService.find(masterEntityName, uid, null, true, null);
		Assert.assertNull(flyEntityb.get("details"));
		Assert.assertNull(flyEntityb.get("detail1"));
		model.assertFlyEntityAllFields(flyEntitya, flyEntityb);
	}

	@Test
	public void updateForDetail1ToNull() {
		FlyEntityResult flyEntitya = new FlyEntityResult(model.getFlyTestEntity());
		flyEntitya.put("detail1", null);
		entityService.updateEntity(masterEntityName, uid, null, flyEntitya);

		FlyEntityResult flyEntityb = entityService.find(masterEntityName, uid, null, true, null);
		Assert.assertNull(flyEntityb.get("details"));
		Assert.assertNotNull(flyEntityb.get("detail1"));
		FlyEntityResult flyEntityc = FlyEntityResult.merge(model.getFlyTestEntity(), flyEntitya);
		model.assertFlyEntityAllFields(flyEntityc, flyEntityb);
	}

	@Test
	public void updateForSubTableToNull() {
		FlyEntityResult flyEntitya = new FlyEntityResult(model.getFlyTestEntity());
		flyEntitya.put("details", null);
		entityService.updateEntity(masterEntityName, uid, null, flyEntitya);

		FlyEntityResult flyEntityb = entityService.find(masterEntityName, uid, null, true, null);
		Assert.assertNull(flyEntityb.get("details"));
		Assert.assertNotNull(flyEntityb.get("detail1"));
		FlyEntityResult flyEntityc = FlyEntityResult.merge(model.getFlyTestEntity(), flyEntitya);
		model.assertFlyEntityAllFields(flyEntityc, flyEntityb);
	}
	
	@Test
	public void updateForSubTableToEmptySet() {
		FlyEntityResult flyEntitya = new FlyEntityResult(model.getFlyTestEntity());
		flyEntitya.put("details", new HashSet<>());
		entityService.updateEntity(masterEntityName, uid, null, flyEntitya);

		FlyEntityResult flyEntityb = entityService.find(masterEntityName, uid, null, true, null);
		Assert.assertNull(flyEntityb.get("details"));
		Assert.assertNotNull(flyEntityb.get("detail1"));
		FlyEntityResult flyEntityc = FlyEntityResult.merge(model.getFlyTestEntity(), flyEntitya);
		model.assertFlyEntityAllFields(flyEntityc, flyEntityb);
	}
	
	@Test
	public void updateForSubTableUpdateSubDetail() {
		FlyEntityResult flyEntitya = new FlyEntityResult(model.getFlyTestEntity());
		Collection list = (Collection) flyEntitya.get("details");
		list.forEach(item -> {
			Map detail = (Map) item;
			detail.put("title", "detail title update");
		});
		entityService.updateEntity(masterEntityName, uid, null, flyEntitya);

		FlyEntityResult flyEntityb = entityService.find(masterEntityName, uid, null, true, null);
		Assert.assertNotNull(flyEntityb.get("details"));
		Collection details = (Collection) flyEntityb.get("details");
		Assert.assertEquals(1, details.size());
		Assert.assertNotNull(flyEntityb.get("detail1"));
		FlyEntityResult flyEntityc = FlyEntityResult.merge(model.getFlyTestEntity(), flyEntitya);
		model.assertFlyEntityAllFields(flyEntityc, flyEntityb);
	}
	
	@Test
	public void updateForSubTableAddSubDetail() {
		FlyEntityResult flyEntitya = new FlyEntityResult(model.getFlyTestEntity());
		Detail detail = new Detail();
		detail.setUid(UUIDUtil.newUUID());
		detail.setMaster(model.getTestEntity());
		detail.setTitle("detail title update");
		Collection list = (Collection) flyEntitya.get("details");
		list.add(FlyEntityResult.fromEntity(detail));
		entityService.updateEntity(masterEntityName, uid, null, flyEntitya);

		FlyEntityResult flyEntityb = entityService.find(masterEntityName, uid, null, true, null);
		Assert.assertNotNull(flyEntityb.get("details"));
		Collection details = (Collection) flyEntityb.get("details");
		Assert.assertEquals(2, details.size());
		Assert.assertNotNull(flyEntityb.get("detail1"));
		FlyEntityResult flyEntityc = FlyEntityResult.merge(model.getFlyTestEntity(), flyEntitya);
		model.assertFlyEntityAllFields(flyEntityc, flyEntityb);
	}

	@Test
	public void mergeName() {
		// merge name
		FlyEntityResult flyEntity1a = new FlyEntityResult();
		flyEntity1a.put("name", "name merge");
		flyEntity1a.put("encpytText", "encpytText merge");
		entityService.mergeEntity(masterEntityName, uid, null, flyEntity1a);
		FlyEntityResult flyEntity1b = entityService.find(masterEntityName, uid, null, true, null);
		FlyEntityResult flyEntity1c = FlyEntityResult.merge(model.getFlyTestEntity(), flyEntity1a);
		model.assertFlyEntityAllFields(flyEntity1c, flyEntity1b);
	}

	@Test
	public void mergeDetailToNull() {
		// merge detail1=null
		FlyEntityResult flyEntity2a = new FlyEntityResult();
		flyEntity2a.put("detail1", null);
		entityService.mergeEntity(masterEntityName, uid, null, flyEntity2a);
		FlyEntityResult flyEntity2b = entityService.find(masterEntityName, uid, null, true, null);
		FlyEntityResult flyEntity2c = FlyEntityResult.merge(model.getFlyTestEntity(), flyEntity2a);
		flyEntity2b.printJson();
		Assert.assertNull(flyEntity2b.get("detail1"));
		model.assertFlyEntityAllFields(flyEntity2c, flyEntity2b);
	}

	/**
	 * 先设置为null，再赋值。由于主键不变，实际就是变更
	 */
	@Test
	public void mergeDetailForNewDetail() {
		// first, set detail1 = null
		mergeDetailToNull();
		FlyEntityResult flyEntity1 = new FlyEntityResult();
		flyEntity1.put("detail", null);
		FlyEntityResult flyEntity2 = FlyEntityResult.merge(model.getFlyTestEntity(), flyEntity1);
		
		// merge detail1 new
		FlyEntityResult flyEntitya = new FlyEntityResult();
		Map detail1 = new HashMap();
		detail1.put("uid", uid);
		detail1.put("title", "detail title new");
		flyEntitya.put("detail1", detail1);
		entityService.mergeEntity(masterEntityName, uid, null, flyEntitya);

		FlyEntityResult flyEntityb = entityService.find(masterEntityName, uid, null, true, null);
		FlyEntityResult flyEntityc = FlyEntityResult.merge(flyEntity2, flyEntitya);
		Assert.assertNotNull(flyEntityc.get("detail1"));
		model.assertFlyEntityAllFields(flyEntityc, flyEntityb);
	}

	@Test
	public void mergeDetailForChange() {
		// merge detail1 changed
		FlyEntityResult flyEntitya = new FlyEntityResult();
		Map detail1 = new HashMap();
		detail1.put("uid", uid);
		detail1.put("title", "detail title merge");
		flyEntitya.put("detail1", detail1);
		entityService.mergeEntity(masterEntityName, uid, null, flyEntitya);

		FlyEntityResult flyEntityb = entityService.find(masterEntityName, uid, null, true, null);
		FlyEntityResult flyEntityc = FlyEntityResult.merge(model.getFlyTestEntity(), flyEntitya);
		Assert.assertNotNull(flyEntityc.get("detail1"));
		model.assertFlyEntityAllFields(flyEntityc, flyEntityb);
	}

	@Test
	public void mergeDetailSubTableToNull() {
		FlyEntityResult flyEntitya = new FlyEntityResult();
		flyEntitya.put("details", null);
		entityService.mergeEntity(masterEntityName, uid, null, flyEntitya);

		FlyEntityResult flyEntityb = entityService.find(masterEntityName, uid, null, true, null);
		FlyEntityResult flyEntityc = FlyEntityResult.merge(model.getFlyTestEntity(), flyEntitya);
		Assert.assertNull(flyEntityb.get("details"));
		model.assertFlyEntityAllFields(flyEntityc, flyEntityb);
	}

	@Test
	public void mergeDetailSubTableToEmpty() {
		FlyEntityResult flyEntitya = new FlyEntityResult();
		flyEntitya.put("details", new HashSet<>());
		entityService.mergeEntity(masterEntityName, uid, null, flyEntitya);

		FlyEntityResult flyEntityb = entityService.find(masterEntityName, uid, null, true, null);
		FlyEntityResult flyEntityc = FlyEntityResult.merge(model.getFlyTestEntity(), flyEntitya);
		Assert.assertNull(flyEntityb.get("details"));
		model.assertFlyEntityAllFields(flyEntityc, flyEntityb);
	}
	
	@Test
	public void mergeDetailSubTableForUpdate() {
		FlyEntityResult flyEntitya = model.getFlyTestEntity();
		Collection<Map> details = (Collection<Map>) flyEntitya.get("details");
		details.forEach(detail -> {
			detail.put("title", "detail title merged");
		});
		entityService.mergeEntity(masterEntityName, uid, null, flyEntitya);
		
		FlyEntityResult flyEntityb = entityService.find(masterEntityName, uid, null, true, null);
		FlyEntityResult flyEntityc = flyEntitya;
		Assert.assertNotNull(flyEntityb.get("details"));
		details = (Collection) flyEntityb.get("details");
		Assert.assertEquals(1, details.size());
		model.assertFlyEntityAllFields(flyEntityc, flyEntityb);
	}

	@Test
	public void mergeDetailSubTableForAddSubDetail() {
		FlyEntityResult flyEntitya = model.getFlyTestEntity();
		Collection details = (Collection) flyEntitya.get("details");
		FlyEntityResult detail = new FlyEntityResult();
		detail.put("uid", UUIDUtil.newUUID());
		detail.put("master", uid);
		details.add(detail);
		entityService.mergeEntity(masterEntityName, uid, null, flyEntitya);
		
		FlyEntityResult flyEntityb = entityService.find(masterEntityName, uid, null, true, null);
		FlyEntityResult flyEntityc = flyEntitya;
		Assert.assertNotNull(flyEntityb.get("details"));
		details = (Collection) flyEntityb.get("details");
		Assert.assertEquals(2, details.size());
		model.assertFlyEntityAllFields(flyEntityc, flyEntityb);
	}

	@Test
	public void mergeDetailSubTableForMergeSubDetail() {
		
	}
}
