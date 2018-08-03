package org.myfly.platform.core3.metadata.builder;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.dbinit.resources.Element_zh_CN;
import org.myfly.platform.core3.dbinit.resources.MyElement_zh_CN;
import org.myfly.platform.core3.metadata.define.FElement;

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
