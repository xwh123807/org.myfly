package org.myfly.platform.core.testmodel;

import java.util.HashSet;
import java.util.Iterator;

import javax.transaction.Transactional;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 单主键JPA基本增删改查测试
 * 
 * @author xiangwanhong
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class)
@Transactional
public class MasterJpaTest2 {
	@Autowired
	private IJpaDataAccessService entityService;

	private FlyEntityTestModel model;

	private Master master;

	@Before
	public void before() {
		model = new FlyEntityTestModel();
		master = entityService.saveEntity(model.getTestEntity());
		Assert.assertNotNull(master);
		model.assertFlyEntityAllFields(model.newFlyEntity(master), model.newFlyEntity(master));
	}

	@Test
	public void changed() {
		Master entitya = entityService.updateEntity(model.getChangedEntity());
		Assert.assertNotNull(entitya);
		model.assertFlyEntityAllFields(model.newFlyEntity(model.getChangedEntity()), model.newFlyEntity(entitya));
	}

	@Test
	public void updateName() {
		Master entitya = new Master();
		entitya.setUid(master.getUid());
		entitya.setName("name changed");
		entityService.updateEntity(entitya);
		Master entityb = entityService.findOne(Master.class, master.getUid());
		Assert.assertNull(entityb.getDetail1());
		Assert.assertNull(entityb.getDetails());
		model.assertFlyEntityAllFields(model.newFlyEntity(entitya), model.newFlyEntity(entityb));
	}
	
	@Test
	public void updateNameForFirstSelect() {
		Master entitya = entityService.findOne(Master.class, master.getUid());
		entitya.setName("name changed");
		entityService.updateEntity(entitya);
		Master entityb = entityService.findOne(Master.class, master.getUid());
		Assert.assertNotNull(entityb.getDetail1());
		Assert.assertNotNull(entityb.getDetails());
		model.assertFlyEntityAllFields(model.newFlyEntity(entitya), model.newFlyEntity(entityb));
	}

	@Test
	public void updateDetail1ToNull() {
		Master entitya = new Master();
		entitya.setUid(master.getUid());
		entitya.setDetail1(null);
		entityService.updateEntity(entitya);
		Master entityb = entityService.findOne(Master.class, master.getUid());
		Assert.assertNull(entityb.getDetail1());
		Assert.assertNull(entityb.getDetails());
		model.assertFlyEntityAllFields(model.newFlyEntity(entitya), model.newFlyEntity(entityb));
	}

	@Test
	public void updateDetail1ToNull2() {
		Master entitya = master;
		entitya.setDetail1(null);
		entityService.updateEntity(entitya);
		Master entityb = entityService.findOne(Master.class, master.getUid());
		Assert.assertNull(entityb.getDetail1());
		Assert.assertNotNull(entityb.getDetails());
		model.assertFlyEntityAllFields(model.newFlyEntity(entitya), model.newFlyEntity(entityb));
	}

	@Test
	public void updateDetail1ToChange() {
		Master entitya = master;
		entitya.getDetail1().setTitle("detail title changed");
		entityService.updateEntity(entitya);
		Master entityb = entityService.findOne(Master.class, master.getUid());
		Assert.assertNotNull(entityb.getDetail1());
		Assert.assertNotNull(entityb.getDetails());
		model.assertFlyEntityAllFields(model.newFlyEntity(entitya), model.newFlyEntity(entityb));
	}

	@Test
	public void updateSubTableDetailsToNull() {
		Master entitya = master;
		entitya.setDetails(null);
		entityService.updateEntity(entitya);
		Master entityb = entityService.findOne(Master.class, master.getUid());
		Assert.assertNotNull(entityb.getDetail1());
		Assert.assertNull(entityb.getDetails());
		model.assertFlyEntityAllFields(model.newFlyEntity(entitya), model.newFlyEntity(entityb));
	}

	@Test
	public void updateSubTableDetailsToEmpty() {
		Master entitya = master;
		entitya.setDetails(new HashSet<>());
		entityService.updateEntity(entitya);
		Master entityb = entityService.findOne(Master.class, master.getUid());
		Assert.assertNotNull(entityb.getDetail1());
		Assert.assertTrue(CollectionUtils.isEmpty(entityb.getDetails()));
		model.assertFlyEntityAllFields(model.newFlyEntity(entitya), model.newFlyEntity(entityb));
	}

	@Test
	public void updateSubTableDetailsToClear() {
		Master entitya = master;
		entitya.getDetails().clear();
		entityService.updateEntity(entitya);
		Master entityb = entityService.findOne(Master.class, master.getUid());
		Assert.assertNotNull(entityb.getDetail1());
		Assert.assertTrue(CollectionUtils.isEmpty(entityb.getDetails()));
		model.assertFlyEntityAllFields(model.newFlyEntity(entitya), model.newFlyEntity(entityb));
	}

	@Test
	public void updateSubTableDetailsToChange() {
		Master entitya = master;
		entitya.getDetails().forEach(detail -> {
			detail.setTitle("detail title changed");
		});
		entityService.updateEntity(entitya);
		Master entityb = entityService.findOne(Master.class, master.getUid());
		Assert.assertNotNull(entityb.getDetail1());
		Assert.assertNotNull(entityb.getDetails());
		model.assertFlyEntityAllFields(model.newFlyEntity(entitya), model.newFlyEntity(entityb));
	}

	@Test
	public void updateSubTableDetailsToAdd() {
		Master entitya = master;
		Detail detail = new Detail();
		detail.setUid(UUIDUtil.newUUID());
		detail.setTitle("updateSubTableDetailsToAdd");
		detail.setMaster(entitya);
		entitya.getDetails().add(detail);
		entityService.updateEntity(entitya);
		Master entityb = entityService.findOne(Master.class, master.getUid());
		Assert.assertNotNull(entityb.getDetail1());
		Assert.assertNotNull(entityb.getDetails());
		Assert.assertEquals(2, entityb.getDetails().size());
		model.assertFlyEntityAllFields(model.newFlyEntity(entitya), model.newFlyEntity(entityb));
	}

	@Test
	public void updateSubTableDetailsToAddAndDel() {
		updateSubTableDetailsToAdd();
		Master entitya = entityService.findOne(Master.class, master.getUid());
		Iterator<Detail> it = entitya.getDetails().iterator();
		int index = 0;
		Detail del = null;
		while (it.hasNext()) {
			if (index == 0) {
				del = it.next();
			} else {
				Detail item = it.next();
				item.setTitle("chagned");
			}
			index++;
		}
		entitya.getDetails().remove(del);
		entityService.updateEntity(entitya);

		Master entityb = entityService.findOne(Master.class, master.getUid());
		Assert.assertNotNull(entityb.getDetail1());
		Assert.assertNotNull(entityb.getDetails());
		Assert.assertEquals(1, entityb.getDetails().size());
		model.assertFlyEntityAllFields(model.newFlyEntity(entitya), model.newFlyEntity(entityb));
	}
}
