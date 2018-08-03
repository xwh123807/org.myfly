package org.myfly.platform.core.metadata.builder;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.myfly.platform.core.datamodel.builder.DataTypeBuilder;
import org.myfly.platform.core.datamodel.define.FDataType;
import org.myfly.platform.core.domain.FlyDataType;
import org.myfly.platform.core.utils.JSONUtil;

public class DataTypeBuilderTest {
	private DataTypeBuilder builder;
	
	@Before
	public void before() {
		builder = new DataTypeBuilder();
	}
	
	@Test
	public void dataType() {
		List<FDataType> list = builder.loadFromEnumClass(FlyDataType.class);
		Assert.assertTrue(list.size() > 0);
		list.forEach(item -> item.validate());
		System.out.println(JSONUtil.toJSON(list));
	}
}
