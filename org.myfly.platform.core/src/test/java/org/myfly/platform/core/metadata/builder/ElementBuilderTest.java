package org.myfly.platform.core.metadata.builder;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.datamodel.builder.ElementBuilder;
import org.myfly.platform.core.datamodel.define.FElement;
import org.myfly.platform.core.dbinit.resources.Element_zh_CN;
import org.myfly.platform.core.dbinit.resources.MyElement_zh_CN;
import org.myfly.platform.core.utils.JSONUtil;

public class ElementBuilderTest {
	private ElementBuilder builder;

	@org.junit.Before
	public void before() {
		builder = new ElementBuilder();
	}
	
	@Test
	public void zhElement() {
		List<FElement> list = builder.loadFromEnumClass(Element_zh_CN.class);
		Assert.assertTrue(list.size() > 0);
		list.forEach(item -> item.validate());
		System.out.println(JSONUtil.toJSON(list));
	}
	
	@Test
	public void myElement() {
		List<FElement> list = builder.loadFromEnumClass(MyElement_zh_CN.class);
		Assert.assertTrue(list.size() > 0);
		list.forEach(item -> item.validate());
		System.out.println(JSONUtil.toJSON(list));
	}
}
