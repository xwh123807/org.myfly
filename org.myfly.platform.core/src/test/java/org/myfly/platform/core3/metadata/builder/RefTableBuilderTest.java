package org.myfly.platform.core3.metadata.builder;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.myfly.platform.core.utils.EntityClassUtil;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.metadata.define.FRefTable;
import org.myfly.platform.core3.model.PTable;

public class RefTableBuilderTest {
	private RefTableBuilder builder;

	@Before
	public void before() {
		builder = new RefTableBuilder();
	}

	@Test
	public void load() {
		List<FRefTable> list = builder.loadFromEntityClass(PTable.class);
		Assert.assertTrue(list.size() > 0);
		list.forEach(item -> item.validate());
		System.out.println(JSONUtil.toJSON(list));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void all() {
		List<Class<?>> classes = EntityClassUtil.getEntityClasses("org.myfly.platform.core3");
		Assert.assertNotNull(classes);
		classes.forEach(item -> {
			List<FRefTable> list = builder.loadFromEntityClass((Class<? extends IFlyEntity>) item);
			if (CollectionUtils.isNotEmpty(list)) {
				list.forEach(item2 -> item2.validate());
				System.out.println(JSONUtil.toJSON(list));
			}
		});
	}
}
