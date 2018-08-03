package org.myfly.platform.core3.metadata.builder;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.datamodel.builder.RefListBuilder;
import org.myfly.platform.core3.datamodel.define.FRefList;
import org.myfly.platform.core3.dbinit.resources.MyRefLists_zh_CN;

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
