package org.myfly.platform.core.metadata.builder;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.myfly.platform.core.datamodel.builder.RefListBuilder;
import org.myfly.platform.core.datamodel.define.FRefList;
import org.myfly.platform.core.dbinit.resources.MyRefLists_zh_CN;
import org.myfly.platform.core.utils.JSONUtil;

public class RefListBuilderTest {

	private RefListBuilder builder;

	@Before
	public void before() {
		builder = new RefListBuilder();
	}

	@Test
	public void MyRefLists_zh_CN() {
		List<FRefList> list = builder.loadFromEnumClass(MyRefLists_zh_CN.class);
		Assert.assertTrue(list.size() > 0);
		list.forEach(item -> item.validate());
		System.out.println(JSONUtil.toJSON(list));
	}
}
