package org.myfly.platform.core.metadata.entity;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.testmodel.Master2;

public class Master2EntityMetaDataTest {
	@Test
	public void master2PrimaryKey() {
		EntityMetaData meta = new EntityMetaData(Master2.class);
		PKFieldDefinition pkField = meta.getPkFieldDefinition();
		pkField.validate();
		Assert.assertEquals(KeyType.IDCLASS, pkField.getKeyType());
		Assert.assertArrayEquals(new String[] { "id1", "id2" }, pkField.getFieldNames());
		Assert.assertNotNull(pkField.getValueHandler());
		Master2 master = new Master2();
		String value = "1_2";
		pkField.getValueHandler().setFieldValue(master, value);
		Assert.assertEquals(value, pkField.getValueHandler().getFieldValue(master));
		Assert.assertEquals(1, meta.getField("id1").getValueHandler().getFieldValue(master));
		Assert.assertEquals(2, meta.getField("id2").getValueHandler().getFieldValue(master));
	}
}
