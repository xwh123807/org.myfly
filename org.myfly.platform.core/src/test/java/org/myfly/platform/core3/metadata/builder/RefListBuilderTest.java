package org.myfly.platform.core3.metadata.builder;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.dbinit.resources.RefLists;
import org.myfly.platform.core3.metadata.define.FRefList;

public class RefListBuilderTest {

	private RefListBuilder builder;

	@Before
	public void before() {
		builder = new RefListBuilder();
	}

	@Test
	public void load() {
		List<FRefList> list = builder.loadFromEnumClass(RefLists.class);
		Assert.assertTrue(list.size() > 0);
		list.forEach(item -> item.validate());
		System.out.println(JSONUtil.toJSON(list));
	}
}