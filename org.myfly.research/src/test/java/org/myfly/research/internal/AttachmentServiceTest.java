package org.myfly.research.internal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.research.domain.Attachment;
import org.myfly.research.domain.Attachment2;
import org.myfly.research.service.IAttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AttachmentServiceTest {
	@Autowired
	private IAttachmentService service;

	@Before
	public void init() {
		service.deleteAll();
		service.deleteAllSearch();
	}

	@Test
	public void curd() {
		Attachment entity = new Attachment();
		entity.setName("h" + System.currentTimeMillis());
		service.save(entity);

		String uid = entity.getUid();
		Assert.assertNotNull(uid);
		Attachment entity2 = service.find(uid);
		Assert.assertNotNull(entity2);

		Attachment2 s2 = service.searchOne(uid);
		Assert.assertNotNull(s2);

		entity2.setName("c" + System.currentTimeMillis());
		service.update(entity2);
		Attachment entity3 = service.find(entity2);
		Assert.assertNotNull(entity3);
		Assert.assertEquals(entity2.getName(), entity3.getName());

		Attachment2 s3 = service.searchOne(entity2.getUid());
		Assert.assertNotNull(s3);
		Assert.assertEquals(entity2.getName(), s3.getName());

		service.delete(entity3);

		Assert.assertNull(service.find(entity3));
		Assert.assertNull(service.findNoCache(entity3.getUid()));
		Assert.assertNull(service.searchOne(entity3.getUid()));
	}

	@Test
	public void zbatchAdd() {
		for (int i = 0; i < 100; i++) {
			Attachment entity = new Attachment();
			entity.setName("h" + System.currentTimeMillis());
			service.save(entity);
		}
	}
}
