package org.myfly.platform.core.testmodel;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.domain.FieldDataType;
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

	/**
	 * 验证级联保存
	 */
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
		Assert.assertNotNull(entity2.getDetails());
		Assert.assertEquals(1, entity2.getDetails().size());

		service.delOne(Master.class, key);

		try {
			Master entity3 = service.findOne(Master.class, key);
		} catch (Exception e) {
			Assert.assertEquals(EntityNotFoundException.class, e.getClass());
		}
	}
	
	@Test
	public void cascadeBaseField() {
		String key = UUIDUtil.newUUID();
		Master entity = new Master();
		entity.setUid(key);
		entity.setName("name");
		//save
		service.saveEntity(entity);
		//find
		Master master2 = service.findOne(Master.class, key);
		Assert.assertNull(master2.getDetail1());
		Assert.assertNull(master2.getDetails());
		//update set detail1
		entity.setName("name changed");
		Detail detail1 = new Detail();
		detail1.setUid(UUIDUtil.newUUID());
		detail1.setTitle("title");
		entity.setDetail1(detail1);
		service.updateEntity(entity);
		//find
		Master master3 = service.findOne(Master.class, key);
		Assert.assertNotNull(master3.getDetail1());
		Assert.assertNull(master3.getDetails());
		//update datatype
		Master master4 = new Master();
		master4.setUid(key);
		master4.setDataType(FieldDataType.ACTIONS);
		service.updateEntity(master4);
		Master master5 = service.findOne(Master.class, key);
		Assert.assertNull(master5.getName());
		Assert.assertEquals(FieldDataType.ACTIONS, master5.getDataType());
		Assert.assertNull(master5.getDetail1());
		Assert.assertNull(master5.getDetails());
	}
	
	@Test
	public void updateSubTable() {
		String key = UUIDUtil.newUUID();
		Master master = new Master();
		master.setUid(key);
		master.setName("name");
		service.saveEntity(master);
		//增加子表记录
		Set<Detail> details = new HashSet<>();
		Detail detail = new Detail();
		detail.setUid(UUIDUtil.newUUID());
		detail.setMaster(master);
		details.add(detail);
		master.setDetails(details);
		service.updateEntity(master);
		//验证
		Master master1 = service.findOne(Master.class, key);
		Assert.assertNotNull(master1.getDetails());
		Assert.assertEquals(1, master1.getDetails().size());
		master1.getDetails().forEach(item -> {
			Assert.assertNotNull(item.getUid());
			Assert.assertEquals(master.getUid(), item.getMaster().getUid());
		});
		//再增加一条子表记录
		Detail detail2 = new Detail();
		detail2.setUid(UUIDUtil.newUUID());
		detail2.setMaster(master1);
		master1.getDetails().add(detail2);
		service.updateEntity(master1);
		//验证
		Master master2 = service.findOne(Master.class, key);
		Assert.assertNotNull(master2.getDetails());
		Assert.assertEquals(2, master2.getDetails().size());
		master1.getDetails().forEach(item -> {
			Assert.assertNotNull(item.getUid());
			Assert.assertEquals(master2.getUid(), item.getMaster().getUid());
		});
		//删除子表二，修改子表一
		Detail[] details2 = master2.getDetails().toArray(new Detail[] {});
		for (int index = 0; index < details2.length; index ++) {
			Detail item = details2[index];
			if (index == 0) {
				master2.getDetails().remove(item);
			}else if (index == 1) {
				item.setTitle("title");
			}
		}
		service.updateEntity(master2);
		//验证
		Master master3 = service.findOne(Master.class, key);
		Assert.assertNotNull(master3.getDetails());
		Assert.assertEquals(1, master3.getDetails().size());
		master1.getDetails().forEach(item -> {
			Assert.assertNotNull(item.getUid());
			Assert.assertEquals(master2.getUid(), item.getMaster().getUid());
		});
	}
}
