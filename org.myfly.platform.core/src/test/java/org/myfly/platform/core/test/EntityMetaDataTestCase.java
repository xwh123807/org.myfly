package org.myfly.platform.core.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.metadata.define.FormDefinition;
import org.myfly.platform.core.metadata.define.ListDefinition;
import org.myfly.platform.core.metadata.define.TableDefinition;
import org.myfly.platform.core.metadata.service.EntityMetaData;
import org.myfly.platform.core.metadata.service.IEntityMetaDataService;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes = CoreApplication.class)
public abstract class EntityMetaDataTestCase<T> extends ServiceTestCase {
	@Autowired
	private IEntityMetaDataService entityMetaDataService;

	private EntityMetaData metaData;

	/**
	 * 获取实体类
	 * 
	 * @return
	 */
	public abstract Class<T> getEntityClass();
	/**
	 * 获取视图名称
	 * @return
	 */
	public abstract String getViewName();

	@Before
	public void before() {
		metaData = entityMetaDataService.getEntityMetaData(getEntityClass().getName());
	}

	@Test
	public void checkTableDefinition() {
		TableDefinition tableDefinition = metaData.getTableDefinition();
		Assert.assertNotNull(tableDefinition);
		Assert.assertNotNull(tableDefinition.getTitle());
		Assert.assertNotNull(tableDefinition.getTableName());
	}
	
	@Test
	public void checkListDefenition(){
		ListDefinition listDefinition = metaData.getListDefinition(getViewName());
		Assert.assertNotNull(listDefinition);
		Assert.assertNotNull(listDefinition.getEntityName());
	}
	
	@Test
	public void checkFormDefenition(){
		FormDefinition formDefinition = metaData.getFormDefinition(getViewName());
		Assert.assertNotNull(formDefinition);
		Assert.assertTrue(formDefinition.getSections().length > 0);
	}
}
