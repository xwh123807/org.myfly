package org.myfly.platform.core.flydata.internal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.testmodel.Detail;
import org.myfly.platform.core.testmodel.Master;
import org.myfly.platform.core.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class)
@Transactional
public class JpaDataAccessServiceTest {
	@Autowired
	private IJpaDataAccessService jpaDataAccessService;

	@Test
	public void getSimpleJpaRepository() {
		JpaRepository repo = jpaDataAccessService.getSimpleJpaRepository(Master.class);
		Assert.assertNotNull(repo);
	}

	@Test(expected = EntityNotFoundException.class)
	public void findOne() {
		Master entity = jpaDataAccessService.findOne(Master.class, UUIDUtil.newUUID());
		Assert.assertNull(entity);
	}

	@Test
	public void entityCUDQWithEntityClass() {
		// create
		Master entity = new Master();
		entity.setUid(UUIDUtil.newUUID());
		entity.setName("entity 1");
		Master entity2 = jpaDataAccessService.saveEntity(entity);
		Assert.assertNotNull(entity2);
		// find
		Master entity3 = jpaDataAccessService.findOne(Master.class, entity.getUid());
		Assert.assertNotNull(entity3);
		// update
		entity3.setName("entity 1 changed");
		entity3.setDataType(FieldDataType.ACTIONS);
		Master entity4 = jpaDataAccessService.updateEntity(entity3);
		Assert.assertNotNull(entity4);
		// find
		Master entity5 = jpaDataAccessService.findOne(Master.class, entity4.getUid());
		Assert.assertNotNull(entity5);
		Assert.assertEquals(entity3.getName(), entity5.getName());
		Assert.assertEquals(entity3.getDataType(), entity5.getDataType());
		// update 2
		Master entity6 = new Master();
		entity6.setName("entity 1 chagned changed.");
		Master entity7 = jpaDataAccessService.updateEntity(entity.getUid(), entity6);
		Assert.assertNotNull(entity7);
		Assert.assertEquals(entity6.getUid(), entity7.getUid());
		Assert.assertEquals(entity6.getName(), entity7.getName());
		// del
		jpaDataAccessService.delOne(entity5);
		// find
		try {
			Master entity8 = jpaDataAccessService.findOne(Master.class, entity5.getUid());
			Assert.assertNull(entity8);
		} catch (Exception e) {
			Assert.assertEquals(EntityNotFoundException.class, e.getClass());
		}
	}

	@Test
	public void entityCUDQForMapWithEntityName() {
		String entityName = Master.class.getName();
		// create
		Map entity = new HashMap<>();
		entity.put("uid", UUIDUtil.newUUID());
		entity.put("name", "entity 1");
		Master entity2 = (Master) jpaDataAccessService.saveEntity(Master.class, entity);
		Assert.assertNotNull(entity2);
		// find
		Master entity3 = jpaDataAccessService.findOne(Master.class, (Serializable) entity.get("uid"));
		Assert.assertNotNull(entity3);
		// update
		Map entity31 = new HashMap<>();
		entity31.put("name", "entity 1 changed");
		entity31.put("dataType", FieldDataType.ACTIONS);
		Master entity4 = (Master) jpaDataAccessService.updateEntity(Master.class, (Serializable) entity.get("uid"),
				entity31);
		Assert.assertNotNull(entity4);
		// find
		Master entity5 = jpaDataAccessService.findOne(Master.class, entity4.getUid());
		Assert.assertNotNull(entity5);
		Assert.assertEquals(entity3.getName(), entity5.getName());
		Assert.assertEquals(entity3.getDataType(), entity5.getDataType());
		// del
		jpaDataAccessService.delOne(Master.class, entity5.getUid());
		// find
		try {
			Master entity6 = jpaDataAccessService.findOne(Master.class, entity5.getUid());
			Assert.assertNull(entity6);
		} catch (Exception e) {
			Assert.assertEquals(EntityNotFoundException.class, e.getClass());
		}
	}

	public void batchSave() {
		List<Master> list = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			Master master = new Master();
			master.setUid(UUIDUtil.newUUID());
			master.setName("name " + master.getUid());
			if (i % 2 == 0)
				master.setDataType(FieldDataType.MONEY);
			else
				master.setDataType(FieldDataType.EMAIL);
			master.setDescription(String.valueOf(i));
			list.add(master);
		}
		jpaDataAccessService.batchSaveEntity(list);
	}

	@Test
	public void findAll() {
		batchSave();
		List list = jpaDataAccessService.findAll(Master.class);
		Assert.assertTrue(list.size() > 0);
		Page page = jpaDataAccessService.findAll(Master.class, new PageRequest(1, 2));
	}

	@Test
	public void findAllForMap() {
		batchSave();
		Map params = new HashMap<>();
		params.put("dataType", FieldDataType.MONEY);
		List list = jpaDataAccessService.findAll(Master.class, params);
		Assert.assertTrue(list.size() > 0);
		Page page = jpaDataAccessService.findAll(Master.class, params, new PageRequest(1, 2));
	}
}
