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
		Assert.assertEquals(11, metaData.getTableDefinition().getFields().length);
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
		Assert.assertNotNull(pkField.getGetValueHandler());
		Assert.assertNotNull(pkField.getSetValueHandler());
		Assert.assertEquals(1, pkField.getFields().length);
		Assert.assertEquals(KeyType.SINGLE, pkField.getKeyType());
		String uidField = pkField.getFields()[0].getName();
		Assert.assertEquals("uid", uidField);

		Map<String, FKFieldDefinition> fkFields = metaData.getTableDefinition().getFkFieldDefinitions();
		Assert.assertEquals(3, fkFields.size());
		FKFieldDefinition tenant = fkFields.get("tenant");
		Assert.assertNotNull(tenant);
		Assert.assertEquals(ITenant.class.getName(), tenant.getRelationClass());
		Assert.assertEquals("ITenant", tenant.getRelationTable());
		FKFieldDefinition createdBy = fkFields.get("createdBy");
		Assert.assertNotNull(createdBy);
		Assert.assertEquals(IUser.class.getName(), createdBy.getRelationClass());
		Assert.assertEquals("IUser", createdBy.getRelationTable());
		FKFieldDefinition updatedBy = fkFields.get("updatedBy");
		Assert.assertNotNull(updatedBy);
		Assert.assertEquals(IUser.class.getName(), updatedBy.getRelationClass());
		Assert.assertEquals("IUser", updatedBy.getRelationTable());

		Master master = new Master();
		// 验证主键值设置和获取
		String uid = UUIDUtil.newUUID();
		pkField.getSetValueHandler().setFieldValue(master, uid);
		Assert.assertEquals(uid, pkField.getGetValueHandler().getFieldValue(master));
	}
}
