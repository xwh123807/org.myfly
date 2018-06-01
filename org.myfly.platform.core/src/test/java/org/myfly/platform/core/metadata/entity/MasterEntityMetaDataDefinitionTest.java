package org.myfly.platform.core.metadata.entity;

import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.testdata.Master;
import org.myfly.platform.core.utils.FuncUtil;
import org.myfly.platform.core.utils.UUIDUtil;

public class MasterEntityMetaDataDefinitionTest {
	@Test
	public void masterEntity() {
		EntityMetaDataDefinition metaData = new EntityMetaDataDefinition(Master.class);
		
		Assert.assertEquals("SM_MASTER", metaData.getTableDefinition().getTableName());
		Assert.assertEquals("TEST", metaData.getTableDefinition().getCatalog());
		Assert.assertEquals("SAMPLE", metaData.getTableDefinition().getSchema());
		FuncUtil.forEach(metaData.getTableDefinition().getFields(), field -> {
			Assert.assertNotNull(field);
			Assert.assertNotNull(field.toString());
		});
		// 验证主键
		PKFieldDefinition pkField = metaData.getPkFieldDefinition();
		pkField.validate();
		Assert.assertNotNull(pkField.getValueHandler());
		Assert.assertEquals(1, pkField.getFields().length);
		Assert.assertEquals(KeyType.SINGLE, pkField.getKeyType());
		String uidField = pkField.getFields()[0].getName();
		Assert.assertEquals("uid", uidField);

		Master master = new Master();
		// 验证主键值设置和获取
		String uid = UUIDUtil.newUUID();
		pkField.getValueHandler().setFieldValue(master, uid);
		Assert.assertEquals(uid, pkField.getValueHandler().getFieldValue(master));
		//build pk
		String uid2 = (String) pkField.buildPK(uid);
		Assert.assertEquals(uid, uid2);
		Map<String, Object> keyParams = new HashedMap();
		keyParams.put("uid", uid);
		String uid3 = (String) pkField.buildPK(keyParams);
		Assert.assertEquals(uid, uid3);
	}
}
