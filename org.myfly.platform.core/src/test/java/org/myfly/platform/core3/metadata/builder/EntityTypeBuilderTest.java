package org.myfly.platform.core3.metadata.builder;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.datamodel.builder.EntityTypeBuilder;
import org.myfly.platform.core3.datamodel.define.FEntityType;
import org.myfly.platform.core3.dbinit.resources.EntityType;

public class EntityTypeBuilderTest {
	private EntityTypeBuilder builder;
	
	@Before
	public void before() {
		builder = new EntityTypeBuilder();
	}
	
	@Test
	public void load() {
		List<FEntityType> list = builder.loadFromEnumClass(EntityType.class);
		Assert.assertTrue(list.size() > 0);
		list.forEach(item -> item.validate());
		System.out.println(JSONUtil.toJSON(list));
	}
}
