package org.myfly.platform.core3.metadata.builder;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.datamodel.builder.DataTypeBuilder;
import org.myfly.platform.core3.datamodel.define.FDataType;
import org.myfly.platform.core3.domain.FlyDataType;

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
