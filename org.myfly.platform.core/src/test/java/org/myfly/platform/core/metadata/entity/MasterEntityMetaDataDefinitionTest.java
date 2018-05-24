package org.myfly.platform.core.metadata.entity;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.metadata.define.FKFieldDefinition;
import org.myfly.platform.core.system.domain.ITenant;
import org.myfly.platform.core.system.domain.IUser;
import org.myfly.platform.core.testdata.Master;
import org.myfly.platform.core.utils.FuncUtil;
import org.myfly.platform.core.utils.UUIDUtil;

public class MasterEntityMetaDataDefinitionTest {
	@Test
	public void masterEntity() {
		EntityMetaDataDefinition metaData = new EntityMetaDataDefinition(Master.class);
		Assert.assertEquals(7, metaData.getTableDefinition().getFields().length);
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
	}
}
