package org.myfly.platform.core.testmodel;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.UUIDUtil;

/**
 * 主键测试
 * 
 * @author xiangwanhong
 *
 */
public class PKTest {
	@Test
	public void masterKey() {
		String uid = UUIDUtil.newUUID();
		EntityMetaData meta = AppUtil.getEntityMetaData(Master.class.getName());

		Map<String, Object> keyParams = new HashMap<>();
		keyParams.put("uid", uid);
		String pkValue = (String) meta.getPkFieldDefinition().buildPK(keyParams);
		Assert.assertEquals(uid, pkValue);

		String pkValue2 = (String) meta.getPkFieldDefinition().buildPK(uid);
		Assert.assertEquals(uid, pkValue2);

		Master entity = new Master();
		meta.getPkFieldDefinition().setPKValue(entity, uid);
		Assert.assertEquals(uid, meta.getPkFieldDefinition().getPKValue(entity));
	}

	@Test
	public void master2Key() {
		EntityMetaData meta = AppUtil.getEntityMetaData(Master2.class.getName());
		String uid = "1_2";

		Map<String, Object> keyParams = new HashMap<>();
		keyParams.put("id1", 1);
		keyParams.put("id2",2);
		Master2Key pkValue = (Master2Key) meta.getPkFieldDefinition().buildPK(keyParams);
		Assert.assertEquals(1, pkValue.getId1());
		Assert.assertEquals(2, pkValue.getId2());

		Master2Key pkValue2 = (Master2Key) meta.getPkFieldDefinition().buildPK(uid);
		Assert.assertEquals(1, pkValue2.getId1());
		Assert.assertEquals(2, pkValue2.getId2());

		Master2 entity = new Master2();
		meta.getPkFieldDefinition().setPKValue(entity, uid);
		Assert.assertEquals(uid, meta.getPkFieldDefinition().getPKValue(entity));
	}
	
	@Test
	public void master3Key() {
		EntityMetaData meta = AppUtil.getEntityMetaData(Master3.class.getName());
		String uid = "1_2";

		Map<String, Object> keyParams = new HashMap<>();
		keyParams.put("id1", 1);
		keyParams.put("id2", 2);
		Master3Key pkValue = (Master3Key) meta.getPkFieldDefinition().buildPK(keyParams);
		Assert.assertEquals(1, pkValue.getId1());
		Assert.assertEquals(2, pkValue.getId2());

		Master3Key pkValue2 = (Master3Key) meta.getPkFieldDefinition().buildPK(uid);
		Assert.assertEquals(1, pkValue2.getId1());
		Assert.assertEquals(2, pkValue2.getId2());

		Master3 entity = new Master3();
		meta.getPkFieldDefinition().setPKValue(entity, uid);
		Assert.assertEquals(uid, meta.getPkFieldDefinition().getPKValue(entity));
	}
}
