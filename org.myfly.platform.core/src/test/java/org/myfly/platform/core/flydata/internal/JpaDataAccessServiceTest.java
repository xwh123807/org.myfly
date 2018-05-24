package org.myfly.platform.core.flydata.internal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.testdata.Master;
import org.myfly.platform.core.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
		Master entity4 = jpaDataAccessService.saveEntity(entity3);
		Assert.assertNotNull(entity4);
		// find
		Master entity5 = jpaDataAccessService.findOne(Master.class, entity4.getUid());
		Assert.assertNotNull(entity5);
		Assert.assertEquals(entity3.getName(), entity5.getName());
		Assert.assertEquals(entity3.getDataType(), entity5.getDataType());
		// del
		jpaDataAccessService.delOne(entity5);
		// find
		try {
			Master entity6 = jpaDataAccessService.findOne(Master.class, entity5.getUid());
			Assert.assertNull(entity6);
		} catch (Exception e) {
			Assert.assertEquals(EntityNotFoundException.class, e.getClass());
		}
	}

	@Test
	public void entityCUDQWithEntityName() {
		String entityName = Master.class.getName();
		// create
		Master entity = new Master();
		entity.setUid(UUIDUtil.newUUID());
		entity.setName("entity 1");
		Master entity2 = jpaDataAccessService.saveEntity(entity);
		Assert.assertNotNull(entity2);
		// find
		Master entity3 = jpaDataAccessService.findOne(entityName, entity.getUid());
		Assert.assertNotNull(entity3);
		// update
		entity3.setName("entity 1 changed");
		entity3.setDataType(FieldDataType.ACTIONS);
		Master entity4 = jpaDataAccessService.updateEntity(entity3);
		Assert.assertNotNull(entity4);
		// find
		Master entity5 = jpaDataAccessService.findOne(entityName, entity4.getUid());
		Assert.assertNotNull(entity5);
		Assert.assertEquals(entity3.getName(), entity5.getName());
		Assert.assertEquals(entity3.getDataType(), entity5.getDataType());
		// del
		jpaDataAccessService.delOne(Master.class, entity5.getUid());
		// find
		try {
			Master entity6 = jpaDataAccessService.findOne(entityName, entity5.getUid());
			Assert.assertNull(entity6);
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
		Master entity2 = (Master) jpaDataAccessService.saveEntity(entityName, entity);
		Assert.assertNotNull(entity2);
		// find
		Master entity3 = jpaDataAccessService.findOne(entityName, (Serializable) entity.get("uid"));
		Assert.assertNotNull(entity3);
		// update
		Map entity31 = new HashMap<>();
		entity31.put("name", "entity 1 changed");
		entity31.put("dataType", FieldDataType.ACTIONS);
		Master entity4 = (Master) jpaDataAccessService.updateEntity(entityName, (Serializable) entity.get("uid"),
				entity31);
		Assert.assertNotNull(entity31);
		// find
		Master entity5 = jpaDataAccessService.findOne(entityName, entity4.getUid());
		Assert.assertNotNull(entity5);
		Assert.assertEquals(entity3.getName(), entity5.getName());
		Assert.assertEquals(entity3.getDataType(), entity5.getDataType());
		// del
		jpaDataAccessService.delOne(entityName, entity5.getUid());
		// find
		try {
			Master entity6 = jpaDataAccessService.findOne(entityName, entity5.getUid());
			Assert.assertNull(entity6);
		} catch (Exception e) {
			Assert.assertEquals(EntityNotFoundException.class, e.getClass());
		}
	}

	@Test
	public void batchSave() {
		List<Master> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Master master = new Master();
			master.setUid(UUIDUtil.newUUID());
			master.setName("name " + master.getUid());
			list.add(master);
		}
		jpaDataAccessService.delAll(Master.class);
		Assert.assertEquals(0, jpaDataAccessService.count(Master.class.getName(), null));
		jpaDataAccessService.batchSaveEntity(list);
		Assert.assertEquals(10, jpaDataAccessService.count(Master.class.getName(), null));
	}

	@Test
	public void batchSaveForEntityName() {
		String entityName = Master.class.getName();
		List<Master> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Master master = new Master();
			master.setUid(UUIDUtil.newUUID());
			master.setName("name " + master.getUid());
			list.add(master);
		}
		jpaDataAccessService.delAll(entityName);
		Assert.assertEquals(0, jpaDataAccessService.count(Master.class.getName(), null));
		jpaDataAccessService.batchSaveEntity(entityName, list);
		Assert.assertEquals(10, jpaDataAccessService.count(Master.class.getName(), null));
	}

	@Test
	public void findAll() {
		batchSaveForEntityName();
		List list = jpaDataAccessService.findAll(Master.class.getName());
		Assert.assertEquals(10, list.size());
		list = jpaDataAccessService.findAll(Master.class);
		Assert.assertEquals(10, list.size());
	}
}
