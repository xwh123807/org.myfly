package org.myfly.platform.core3.metadata.datamodel;

import javax.persistence.Entity;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.ClassUtil;
import org.myfly.platform.core3.metadata.builder.FlyDataModelBuilder;
import org.myfly.platform.core3.model.data.PTable;

public class FlyDataModelBuilderTest {
	@Test
	public void model() {
		testModel(PTable.class);
	}

	private void testModel(Class<?> entityClass) {
		System.out.println(entityClass.getName());
		FlyDataModelBuilder builder = new FlyDataModelBuilder(entityClass);
		builder.build();
		builder.validate();
		Assert.assertNotNull(builder);
	}

	@Test
	public void allFlyDataModel() {
		ClassUtil.getClasses("org.myfly.platform").stream().filter(item -> item.getAnnotation(Entity.class) != null)
				.forEach(cls -> {
					testModel(cls);
				});
	}
}
