package org.myfly.platform.core.metadata.builder;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.myfly.platform.core.datamodel.builder.RefTableBuilder;
import org.myfly.platform.core.datamodel.define.FRefTable;
import org.myfly.platform.core.datamodel.model.PTable;
import org.myfly.platform.core.domain.IFlyEntity;
import org.myfly.platform.core.utils.EntityClassUtil;
import org.myfly.platform.core.utils.JSONUtil;

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
				System.out.println(JSONUtil.toJSON(list));
			}
		});
	}
}
