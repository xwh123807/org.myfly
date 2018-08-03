package org.myfly.platform.core.metadata.builder;

import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.myfly.platform.core.datamodel.builder.FlyDataModelBuilder;
import org.myfly.platform.core.datamodel.define.FlyDataModel;
import org.myfly.platform.core.datamodel.model.PTable;
import org.myfly.platform.core.domain.IFlyEntity;
import org.myfly.platform.core.utils.EntityClassUtil;
import org.myfly.platform.core.utils.JSONUtil;

public class FlyDataModelBuilderTest {
	private FlyDataModelBuilder builder;

	@Before
	public void before() {
		builder = new FlyDataModelBuilder();
	}

	@Test
	public void ptable() {
		List<FlyDataModel> list = builder.loadFromEntityClass(PTable.class);
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
			List<FlyDataModel> list = builder.loadFromEntityClass((Class<? extends IFlyEntity>) item);
			if (CollectionUtils.isNotEmpty(list)) {
				list.forEach(item2 -> item2.validate());
				System.out.println(JSONUtil.toJSON(list));
			}
		});
	}
}
