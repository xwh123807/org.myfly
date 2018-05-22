package org.myfly.platform.core.metadata.entity;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.testdata.Master2;

public class Master2EntityMetaDataTest {
	@Test
	public void master2PrimaryKey() {
		EntityMetaData meta = new EntityMetaData(Master2.class);
		PKFieldDefinition pkField = meta.getPkFieldDefinition();
		pkField.validate();
		Assert.assertEquals(KeyType.MULTIID, pkField.getKeyType());
		Assert.assertArrayEquals(new String[] { "id1", "id2" }, pkField.getFieldNames());
		Assert.assertNotNull(pkField.getGetValueHandler());
		Assert.assertNotNull(pkField.getSetValueHandler());
		Master2 master = new Master2();
		String value = "1_2";
		pkField.getSetValueHandler().setFieldValue(master, value);
		Assert.assertEquals(value, pkField.getGetValueHandler().getFieldValue(master));
		Assert.assertEquals(1, meta.getField("id1").getGetValueHandler().getFieldValue(master));
		Assert.assertEquals(2, meta.getField("id2").getGetValueHandler().getFieldValue(master));
	}
}