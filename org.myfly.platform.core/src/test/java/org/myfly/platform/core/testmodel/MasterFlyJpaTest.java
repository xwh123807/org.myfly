package org.myfly.platform.core.testmodel;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.flydata.service.EntityMap;
import org.myfly.platform.core.flydata.service.EntityQueryMap;
import org.myfly.platform.core.flydata.service.FlyEntityMap;
import org.myfly.platform.core.flydata.service.IFlyDataAccessService;
import org.myfly.platform.core.metadata.service.EntityMetaDataConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @author xiangwanhong
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class)
@Transactional
public class MasterFlyJpaTest {
	@Autowired
	@Qualifier("jpaFlyDataAccessService")
	private IFlyDataAccessService service;

	private String masterEntityName = Master.class.getName();

	private String formViewName = EntityMetaDataConstants.DEFAULT_ALL_NAME;

	@Test
	public void cudq() {
		TestModel model = new TestModel();
		model.buildTestModelEntities();
		// new
		String uid = service.saveEntity(masterEntityName, formViewName, EntityMap.build(model.getTestEntity()));
		Assert.assertNotNull(uid);
		// find
		FlyEntityMap flyEntity = service.findOne(masterEntityName, uid, formViewName, false);
		model.assertEntityAllFields(model.getFlyTestEntity(), flyEntity);
		// find all
		EntityQueryMap queryMap = new EntityQueryMap();
		queryMap.put("uid", new String[] { uid });
		List<FlyEntityMap> list = service.findAll(masterEntityName, formViewName, queryMap, false);
		Assert.assertNotNull(list);
		Assert.assertEquals(1, list.size());
		model.assertEntityAllFields(model.getFlyTestEntityWithActions(), list.get(0));
		// update
		service.updateEntity(masterEntityName, uid, formViewName, EntityMap.build(model.getChangedEntity()));
		// find
		FlyEntityMap flyEntity2 = service.findOne(masterEntityName, uid, formViewName, false);
		model.assertEntityAllFields(model.getFlyChangedEntity(), flyEntity2);
		// find page
		EntityQueryMap queryMap2 = new EntityQueryMap();
		queryMap2.put("uid", new String[] { uid });
		Page<FlyEntityMap> list2 = service.findAllWithPage(masterEntityName, formViewName, queryMap2, 0, 5, false);
		Assert.assertNotNull(list2);
		Assert.assertEquals(1, list2.getTotalElements());
		model.assertEntityAllFields(model.getFlyChangedEntityWithActions(), list2.getContent().get(0));
		// del
		service.delOne(masterEntityName, uid);
	}
	
	@Test
	public void josnEntity() {
		TestModel model = new TestModel();
		model.buildTestModelEntities();
	}
}
