package org.myfly.platform.core.metadata.define;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.metadata.service.EntityMetaData;
import org.myfly.platform.core.testdata.Master;

public class EntityMetaDataTest {
	@Test
	public void master() {
		EntityMetaData metaData = new EntityMetaData(Master.class);
		Assert.assertEquals(Master.class, metaData.getEntityClass());
		Assert.assertEquals("org.myfly.platform.core.testdata.Master", metaData.getEntityName());
		Assert.assertEquals(11, metaData.getFieldMap().size());
		Assert.assertEquals(2, metaData.getFormDefinitions().size());
		Assert.assertEquals(2, metaData.getListDefinitions().size());
		Assert.assertEquals(1, metaData.getOutlineDefinitions().size());
		Assert.assertEquals(1, metaData.getPkFieldDefinition().getIdFields().length);

		Assert.assertEquals(10, metaData.getAllFields().length);
		Assert.assertEquals(Master.class, metaData.newEntityInstance().getClass());
	}
}
