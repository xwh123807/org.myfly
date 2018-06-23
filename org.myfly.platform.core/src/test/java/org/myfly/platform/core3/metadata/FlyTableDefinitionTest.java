package org.myfly.platform.core3.metadata;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.metadata.builder.EntityFlyTableBuilder;
import org.myfly.platform.core3.metadata.define.FlyTableDefinition;
import org.myfly.platform.core3.model.data.PTable;

public class FlyTableDefinitionTest {
	@Test
	public void model() {
		EntityFlyTableBuilder builder = new EntityFlyTableBuilder(PTable.class);
		FlyTableDefinition flyTable = new FlyTableDefinition(builder);
		flyTable.validate();
		String josn = flyTable.toJson();
		System.out.println(josn);
		FlyTableDefinition flyTable2 = JSONUtil.fromJSON(josn, FlyTableDefinition.class);
		Assert.assertNotNull(flyTable2);
	}
}
