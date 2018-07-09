package org.myfly.platform.core.metadata.entity;

import javax.persistence.Entity;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.testmodel.Master2;
import org.myfly.platform.core.testmodel.Master3;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.ClassUtil;

public class AllEntityMetaDataTest {
	@Test
	public void allEntity() {
		ClassUtil.getClasses("org.myfly.platform").stream().filter(item -> item.getAnnotation(Entity.class) != null)
				.forEach(cls -> {
					System.out.println(cls);
					EntityMetaData metaData = AppUtil.getEntityMetaData(cls.getName());
					Assert.assertNotNull(metaData);
					System.out.println(metaData.toJson());
				});
	}

	@Test
	public void PTable() {
		assertEntityMetaData(org.myfly.platform.core3.model.PTable.class.getName());
	}

	private void assertEntityMetaData(String entityName) {
		EntityMetaData metaData = AppUtil.getEntityMetaData(entityName);
		Assert.assertNotNull(metaData);
		System.out.println(metaData.toJson());
	}
	
	@Test
	public void Master2() {
		assertEntityMetaData(Master2.class.getName());
	}
	
	@Test
	public void Master3() {
		assertEntityMetaData(Master3.class.getName());
	}
}
