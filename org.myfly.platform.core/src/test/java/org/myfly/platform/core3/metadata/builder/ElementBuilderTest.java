package org.myfly.platform.core3.metadata.builder;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.dbinit.resources.Element_ALL_EN;
import org.myfly.platform.core3.metadata.define.FElement;

public class ElementBuilderTest {
	private ElementBuilder builder;

	@org.junit.Before
	public void before() {
		builder = new ElementBuilder();
	}
	
	@Test
	public void element() {
		List<FElement> list = builder.loadFromEnumClass(Element_ALL_EN.class);
		Assert.assertTrue(list.size() > 0);
		list.forEach(item -> item.validate());
		System.out.println(JSONUtil.toJSON(list));
	}
}
