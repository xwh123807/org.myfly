package org.myfly.platform.core.flydata.internal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.apache.commons.collections4.map.HashedMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.flydata.service.EntityMap;
import org.myfly.platform.core.flydata.service.FlyEntityMap;
import org.myfly.platform.core.flydata.service.IFlyDataAccessService;
import org.myfly.platform.core.metadata.service.EntityMetaDataConstants;
import org.myfly.platform.core.testmodel.Detail;
import org.myfly.platform.core.testmodel.Master;
import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class)
@Transactional
public class JpaFlyDataAccessServiceTest {
	@Autowired
	@Qualifier("jpaFlyDataAccessService")
	private IFlyDataAccessService flyDataService;

	@Test
	public void entityCUDQ() {
		String entityName = Master.class.getName();
		// create
		Master master = new Master();
		master.setUid(UUIDUtil.newUUID());
		master.setName("name");
		master.setDataType(FieldDataType.MONEY);
		String uid = flyDataService.saveEntity(master);
		Assert.assertEquals(master.getUid(), uid);
		// find
		Master master2 = flyDataService.findOne(entityName, master.getUid());
		Assert.assertNotNull(master2);
		Assert.assertEquals(master.getName(), master2.getName());
		// update
		master2.setName("name changed.");
		flyDataService.updateEntity(master2);
		// find
		Map<String, Object> keyParams = new HashedMap();
		keyParams.put("uid", master.getUid());
		Master master3 = flyDataService.findOne(entityName, keyParams);
		Assert.assertNotNull(master3);
		Assert.assertEquals(master2.getName(), master3.getName());
		// del
		flyDataService.delOne(entityName, master.getUid());
		// find
		try {
			Assert.assertNull(flyDataService.findOne(entityName, master.getUid()));
		} catch (Exception e) {
			Assert.assertEquals(EntityNotFoundException.class, e.getClass());
		}
	}

	@Test
	public void batchSaveEntity() {
		String entityName = Master.class.getName();
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
		flyDataService.saveEntity(list);
		Assert.assertTrue(flyDataService.count2(entityName, null) > 0);
		Page<FlyEntityMap> page = flyDataService.findAll(entityName, EntityMetaDataConstants.DEFAULT_ALL_NAME, null,
				new PageRequest(0, 5), false);
		Assert.assertNotNull(page);
	}

	@Test
	public void saveEntityWithMap() {
		Map<String, Object> values = new HashedMap();
		values.put("uid", UUIDUtil.newUUID());
		values.put("name", "name");
		values.put("dataType", FieldDataType.MONEY);
		String uid = flyDataService.saveEntity(Master.class.getName(), values);
		Assert.assertEquals(uid, values.get("uid"));
		Map<String, Object> values2 = new HashedMap();
		values2.put("name", "name changed");
		values2.put("dataType", FieldDataType.DATE);
		flyDataService.updateEntity(Master.class.getName(), uid, values2);
		Master master = flyDataService.findOne(Master.class.getName(), uid);
		Assert.assertEquals("name changed", master.getName());
		Assert.assertEquals(FieldDataType.DATE, master.getDataType());
	}

	private String saveEntity() {
		// create
		Master master = new Master();
		master.setUid(UUIDUtil.newUUID());
		master.setName("name");
		master.setDataType(FieldDataType.MONEY);
		master.setActive(true);
		Set items = new HashSet<>();
		IntStream.range(1, 10).forEach(n -> {
			Detail detail = new Detail();
			detail.setMaster(master);
			detail.setUid(UUIDUtil.newUUID());
			detail.setTitle("title " + n);
			detail.setActive(true);
			detail.setDataType(FieldDataType.MONEY);
			detail.setCreated(DateUtil.nowSqlTimestamp());
			items.add(detail);
		});
		master.setDetails(items);
		String uid = flyDataService.saveEntity(master);
		Assert.assertEquals(master.getUid(), uid);
		return uid;
	}

	@Test
	public void findEntityForDefaultFormView() {
		String entityName = Master.class.getName();
		String uid = saveEntity();
		FlyEntityMap fly = flyDataService.findOne(entityName, uid, "default", false);
		Assert.assertNotNull(fly);
		Assert.assertEquals(uid, fly.get("uid"));
		Assert.assertEquals("name", fly.get("name"));
		Assert.assertTrue(Boolean.valueOf(fly.get("active")));
		Assert.assertEquals(FieldDataType.MONEY.name(), fly.get("dataType"));
		Assert.assertEquals("币种", fly.get("dataType__label"));
	}

	@Test
	public void saveSubEntity() {
		String entityName = Master.class.getName();
		String uid = saveEntity();
		Assert.assertNotNull(uid);
		EntityMap values = new EntityMap();
		values.put("uid", UUIDUtil.newUUID());
		values.put("title", "title");
		values.put("dataType", FieldDataType.DATE.name());
		String uid2 = flyDataService.saveEntity(entityName, uid, "details", EntityMetaDataConstants.DEFAULT_ALL_NAME,
				values);
		FlyEntityMap detail = flyDataService.findOne(Detail.class.getName(), uid2,
				EntityMetaDataConstants.DEFAULT_ALL_NAME, false);
		Assert.assertNotNull(detail);
		Assert.assertEquals(values.get("uid"), detail.get("uid"));

		EntityMap values2 = new EntityMap();
		values2.put("title", "detail title changed");
		values2.put("dataType", FieldDataType.DATETIME.name());
		flyDataService.updateEntity(entityName, uid, "details", uid2, EntityMetaDataConstants.DEFAULT_ALL_NAME,
				values2);
		detail = flyDataService.findOne(Detail.class.getName(), uid2, EntityMetaDataConstants.DEFAULT_ALL_NAME, false);
		Assert.assertNotNull(detail);
		Assert.assertEquals(uid2, detail.get("uid"));
		Assert.assertEquals(uid, detail.get("master"));
		Assert.assertEquals(values2.get("title"), detail.get("title"));
		Assert.assertEquals(values2.get("dataType"), detail.get("dataType"));
	}

	@Test
	public void findAllForSubEntity() {
		String entityName = Master.class.getName();
		String uid = saveEntity();
		Assert.assertNotNull(uid);
		List<FlyEntityMap> list = flyDataService.findAllForSubEntity(entityName, uid, "details", "default", null,
				false);
		Assert.assertNotNull(list);
		Assert.assertTrue(list.size() == 9);
		FlyEntityMap detail = list.get(0);
		Assert.assertEquals(uid, detail.get("master"));
		Assert.assertEquals("name", detail.get("master__label"));
		Assert.assertEquals("true", detail.get("active"));
		Assert.assertEquals(FieldDataType.MONEY.name(), detail.get("dataType"));
		Assert.assertEquals(FieldDataType.MONEY.getTitle(), detail.get("dataType__label"));
		Assert.assertNotNull(detail.get("created"));

		Page<FlyEntityMap> page = flyDataService.findAllForSubEntityWithPage(entityName, uid, "details", "default",
				null, new PageRequest(0, 5), false);
		Assert.assertNotNull(page);
		Assert.assertEquals(9, page.getTotalElements());
		Assert.assertEquals(2, page.getTotalPages());

		List<FlyEntityMap> list2 = flyDataService.findAllForSubEntity(entityName, uid, "details", "default", null, 0, 5,
				false);
		Assert.assertNotNull(list2);
		Assert.assertTrue(list2.size() == 9);
	}
}
