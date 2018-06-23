package org.myfly.platform.core3.metadata;

import javax.persistence.Entity;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.ClassUtil;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.metadata.builder.EntityFlyTableBuilder;
import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.core3.metadata.define.FlyTableDefinition;
import org.myfly.platform.core3.model.data.PTable;

public class FlyDataModelTest {
	@Test
	public void model() {
		testModel(PTable.class);
	}
	
	private void testModel(Class entityClass) {
		EntityFlyTableBuilder builder = new EntityFlyTableBuilder(entityClass);
		FlyDataModel flyTable = new FlyDataModel(builder);
		flyTable.validate();
		String josn = flyTable.toJson();
		System.out.println(josn);
		FlyTableDefinition flyTable2 = JSONUtil.fromJSON(josn, FlyTableDefinition.class);
		Assert.assertNotNull(flyTable2);
	}

	@Test
	public void allMetaDataModel() {
		ClassUtil.getClasses("org.myfly.platform.core3.metadata.model").stream()
				.filter(item -> item.getAnnotation(Entity.class) != null).forEach(cls -> {
					testModel(cls);
				});
	}
	
	@Test
	public void allCore3TestModel() {
		ClassUtil.getClasses("org.myfly.platform.core3.testmodel").stream()
				.filter(item -> item.getAnnotation(Entity.class) != null).forEach(cls -> {
					testModel(cls);
				});
	}
	
	@Test
	public void allTestModel() {
		ClassUtil.getClasses("org.myfly.platform.core.testmodel").stream()
				.filter(item -> item.getAnnotation(Entity.class) != null).forEach(cls -> {
					testModel(cls);
				});
	}
}
