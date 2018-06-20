package org.myfly.platform.core3.metadata;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.metadata.builder.EntityFlyTableBuilder;
import org.myfly.platform.core3.metadata.model.PTable;

public class EntityFlyTableBuilderTest {
	@Test
	public void PTable() {
		EntityFlyTableBuilder builder = new EntityFlyTableBuilder(PTable.class);
		builder.validate();
		System.out.println(builder.toJson());
		
		EntityFlyTableBuilder builder2 = JSONUtil.fromJSON(builder.toJson(), EntityFlyTableBuilder.class);
		Assert.assertNotNull(builder2);
		Assert.assertEquals(builder.getFlyFields().size(), builder2.getFlyFields().size());
	}
}
