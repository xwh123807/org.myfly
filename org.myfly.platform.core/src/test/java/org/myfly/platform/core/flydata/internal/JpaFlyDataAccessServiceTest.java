package org.myfly.platform.core.flydata.internal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.apache.commons.collections.map.HashedMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.flydata.service.FlyEntityMap;
import org.myfly.platform.core.flydata.service.IFlyDataAccessService;
import org.myfly.platform.core.testdata.Detail;
import org.myfly.platform.core.testdata.Master;
import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
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
		for (int i = 0; i < 10; i++) {
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
		flyDataService.del(entityName);
		Assert.assertEquals(0, flyDataService.count(entityName, null));
		flyDataService.saveEntity(list);
		Assert.assertEquals(10, flyDataService.count(entityName, null));
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
			detail.setCreated(DateUtil.nowSqlTimestamp());
			items.add(detail);
		});
		master.setDetails(items);
		String uid = flyDataService.saveEntity(master);
		Assert.assertEquals(master.getUid(), uid);
		return uid;
	}

	@Test
	public void findEntityForDefault() {
		String entityName = Master.class.getName();
		String uid = saveEntity();
		FlyEntityMap fly = flyDataService.findOne(entityName, uid, "default", false);
		Assert.assertNotNull(fly);
		Assert.assertEquals(uid, fly.get("uid"));
		Assert.assertEquals("name", fly.get("name"));
		Assert.assertTrue(Boolean.valueOf(fly.get("active")));
		Assert.assertEquals(FieldDataType.MONEY, fly.get("dataType"));
	}
	
	@Test
	public void detail() {
		String entityName = Master.class.getName();
		String uid = saveEntity();
		Assert.assertNotNull(uid);
		List<FlyEntityMap> list = flyDataService.findAllForSubEntity(entityName, uid, "details", "default", null, false);
		Assert.assertNotNull(list);
		Assert.assertTrue(list.size() == 10);
	}
}
