package org.myfly.platform.core3.metadata.builder;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.dbinit.resources.MyRefLists_zh_CN;
import org.myfly.platform.core3.dbinit.resources.RefLists_ALL_EN;
import org.myfly.platform.core3.dbinit.resources.RefLists_ALL_zh_CN;
import org.myfly.platform.core3.metadata.define.FRefList;

public class RefListBuilderTest {

	private RefListBuilder builder;

	@Before
	public void before() {
		builder = new RefListBuilder();
	}

	@Test
	public void RefLists_ALL_EN() {
		List<FRefList> list = builder.loadFromEnumClass(RefLists_ALL_EN.class);
		Assert.assertTrue(list.size() > 0);
		list.forEach(item -> item.validate());
		System.out.println(JSONUtil.toJSON(list));
	}
	
	@Test
	public void RefLists_ALL_zh_CN() {
		List<FRefList> list = builder.loadFromEnumClass(RefLists_ALL_zh_CN.class);
		Assert.assertTrue(list.size() > 0);
		list.forEach(item -> item.validate());
		System.out.println(JSONUtil.toJSON(list));
	}
	
	@Test
	public void MyRefLists_zh_CN() {
		List<FRefList> list = builder.loadFromEnumClass(MyRefLists_zh_CN.class);
		Assert.assertTrue(list.size() > 0);
		list.forEach(item -> item.validate());
		System.out.println(JSONUtil.toJSON(list));
	}
}
