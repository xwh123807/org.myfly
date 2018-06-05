package org.myfly.platform.core.testmodel;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.metadata.entity.EntityMetaData;

public class TestModelEntityMetaDataServiceTest {
	@Test
	public void master() {
		EntityMetaData metaData = new EntityMetaData(Master.class);
		Assert.assertNotNull(metaData);
	}
	
	@Test
	public void master2_multiid() {
		EntityMetaData metaData = new EntityMetaData(Master2.class);
		Assert.assertNotNull(metaData);
	}
	
	@Test
	public void master3_EmbeddedId() {
		EntityMetaData metaData = new EntityMetaData(Master3.class);
		Assert.assertNotNull(metaData);
	}
}
