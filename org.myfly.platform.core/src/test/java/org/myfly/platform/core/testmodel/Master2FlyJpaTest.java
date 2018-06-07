package org.myfly.platform.core.testmodel;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.flydata.service.IFlyDataAccessService;
import org.myfly.platform.core.metadata.service.EntityMetaDataConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class)
@Transactional
public class Master2FlyJpaTest {
	@Autowired
	@Qualifier("jpaFlyDataAccessService")
	private IFlyDataAccessService service;

	private String masterEntityName = Master.class.getName();

	private String formViewName = EntityMetaDataConstants.DEFAULT_ALL_NAME;

	@Test
	public void base() {
		Master2 entity = new Master2();
		entity.setId1(1);
		entity.setId2(1);
		entity.setName("name");
		Set<Detail2> details = new HashSet<>();
		Detail2 detail = new Detail2();
		detail.setDetailId(1);
		detail.setMaster(entity);
		details.add(detail);
		entity.setDetails(details);
		service.saveEntity(entity);
		
		Master2 entity2 = service.findOne(masterEntityName, "1_1");
		Assert.assertNotNull(entity2);
		Assert.assertEquals("name", entity2.getName());
		
		entity.setName("name changed");
		service.updateEntity(entity);
		
		entity2 = service.findOne(masterEntityName, "1_1");
		Assert.assertNotNull(entity2);
		Assert.assertEquals("name changed", entity2.getName());

//		Master2Key key = new Master2Key();
//		key.setId1(1);
//		key.setId2(1);
//		Master2 entity2 = service.findOne(Master2.class, key);
//		Assert.assertNotNull(entity2);
//		Assert.assertEquals(1, entity2.getId1());
//		Assert.assertEquals(1, entity2.getId2());
//		Assert.assertEquals("name", entity2.getName());
//
//		service.delOne(Master2.class, key);
//
//		try {
//			Master2 entity3 = service.findOne(Master2.class, key);
//		} catch (Exception e) {
//			Assert.assertEquals(EntityNotFoundException.class, e.getClass());
//		}
	}
}
