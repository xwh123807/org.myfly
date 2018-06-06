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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 复合主键（@EmbeddedId）基本增删改查测试
 * @author xiangwanhong
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class)
@Transactional
public class Master3JpaTest {
	@Autowired
	private IJpaDataAccessService service;

	@Test
	public void base() {
		Master3 entity = new Master3();
		Master3Key key = new Master3Key();
		key.setId1(1);
		key.setId2(1);
		entity.setKey(key);
		entity.setName("name");
		Set<Detail3> details = new HashSet<>();
		Detail3 detail = new Detail3();
		detail.setIid(1);
		detail.setMaster(entity);
		details.add(detail);
		entity.setDetails(details);
		service.saveEntity(entity);

		Master3 entity2 = service.findOne(Master3.class, key);
		Assert.assertNotNull(entity2);
		Assert.assertEquals(key, entity2.getKey());
		Assert.assertEquals("name", entity2.getName());

		service.delOne(Master3.class, key);

		try {
			Master3 entity3 = service.findOne(Master3.class, key);
		} catch (Exception e) {
			Assert.assertEquals(EntityNotFoundException.class, e.getClass());
		}
	}
}
