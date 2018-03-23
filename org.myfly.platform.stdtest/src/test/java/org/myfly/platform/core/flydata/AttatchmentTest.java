package org.myfly.platform.core.flydata;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.flydata.service.EntityMap;
import org.myfly.platform.core.flydata.service.FlyEntityMap;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.system.domain.Attachment;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.util.Base64Utils;

@SpringApplicationConfiguration(classes = CoreApplication.class)
public class AttatchmentTest extends ServiceTestCase {

	@Test
	public void blobWriteAndRead() {
		Attachment attachment = new Attachment();
		attachment.setName("name" + System.currentTimeMillis());
		attachment.setBody(getBlobData());
		String uid = AppUtil.getJpaFlyDataAccessService().saveEntity(attachment);
		Assert.assertNotNull(uid);
		FlyEntityMap entity = AppUtil.getJpaFlyDataAccessService().findOne("attachment", uid, null, false);
		Assert.assertNotNull(entity);
		Assert.assertEquals("hello", new String(Base64Utils.decodeFromString((entity.get("body")))));
	}

	private byte[] getBlobData() {
		String tmp = "hello";
		return tmp.getBytes();
	}

	@Test
	public void blobWriteAndReadWithMap() {
		EntityMap map = new EntityMap();
		map.put("name", "name" + System.currentTimeMillis());
		map.put("body", Base64Utils.encodeToString(getBlobData()));
		String uid = AppUtil.getJpaFlyDataAccessService().saveEntity("attachment", null, map);
		Assert.assertNotNull(uid);
		FlyEntityMap entity = AppUtil.getJpaFlyDataAccessService().findOne("attachment", uid, null, false);
		Assert.assertNotNull(entity);
		Assert.assertEquals("hello", new String(Base64Utils.decodeFromString((entity.get("body")))));
	}
}
