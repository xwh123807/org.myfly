package org.myfly.platform.core.testmodel;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.junit.Assert;
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
 * @author xiangwanhong
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class)
@Transactional
public class MasterJpaTest {
	@Autowired
	private IJpaDataAccessService service;

	@Test
	public void base() {
		String key = UUIDUtil.newUUID();
		Master entity = new Master();
		entity.setUid(key);
		entity.setName("name");
		//detail sub table
		Set<Detail> details = new HashSet<>();
		Detail detail = new Detail();
		detail.setUid(UUIDUtil.newUUID());
		detail.setMaster(entity);
		details.add(detail);
		entity.setDetails(details);
		//detail onetoone
		Detail detail1 = new Detail();
		detail1.setUid(UUIDUtil.newUUID());
		detail1.setTitle("title");
		entity.setDetail1(detail1);
		//save
		service.saveEntity(entity);

		Master entity2 = service.findOne(Master.class, key);
		Assert.assertNotNull(entity2);
		Assert.assertEquals(key, entity2.getUid());
		Assert.assertEquals("name", entity2.getName());
		Assert.assertNotNull(entity2.getDetail1());
		Assert.assertEquals("title", entity2.getDetail1().getTitle());

		service.delOne(Master.class, key);

		try {
			Master entity3 = service.findOne(Master.class, key);
		} catch (Exception e) {
			Assert.assertEquals(EntityNotFoundException.class, e.getClass());
		}
	}
}
