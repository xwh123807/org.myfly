package org.myfly.platform.core.metadata.define;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.metadata.annotation.CommonSubTableType;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.testdata.Master;

public class TableDefinitionTest {
	@Test
	public void test() {
		TableDefinition define = new TableDefinition();
		define.setName("user");
		define.setSchema("xt");
		define.setCatalog("test");
		define.setTitle("用户信息");
		define.setTableName("user");
		define.setDescription("存储用户信息");
		define.setCreateIndex(true);
		define.setIndexName(define.getName());
		define.setLabelField("title");
		define.setPrimaryKeys(new String[] { "uid" });
		define.setCommonSubTables(new CommonSubTableType[] { CommonSubTableType.ATTACHMENT });
		define.validate();
		Assert.assertNotNull(define.toString());
	}

	@Test
	public void testView() {
		TableDefinition define = new TableDefinition(Master.class.getAnnotation(MetaDataView.class).tableView());
		Assert.assertEquals("主表", define.getTitle());
		Assert.assertEquals("主表信息", define.getDescription());
		Assert.assertEquals("name", define.getLabelField());
		Assert.assertTrue(define.isCreateIndex());
		Assert.assertArrayEquals(new String[] { "uid" }, define.getPrimaryKeys());
		Assert.assertArrayEquals(new CommonSubTableType[] { CommonSubTableType.NOTE, CommonSubTableType.ATTACHMENT },
				define.getCommonSubTables());
		Assert.assertNotNull(define.toString());
	}
}
