package org.myfly.platform.core.metadata.entity;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.metadata.define.FormDefinition;
import org.myfly.platform.core.metadata.define.ListDefinition;
import org.myfly.platform.core.metadata.service.EntityMetaDataConstants;
import org.myfly.platform.core.testdata.Detail;
import org.myfly.platform.core.testdata.Master;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core.utils.UUIDUtil;

public class EntityMetaDataTest {
	@Test
	public void master() {
		EntityMetaData metaData = new EntityMetaData(Master.class);
		Assert.assertEquals(Master.class, metaData.getEntityClass());
		Assert.assertEquals("org.myfly.platform.core.testdata.Master", metaData.getEntityName());
		Assert.assertEquals(Master.class, metaData.newEntityInstance().getClass());

		Assert.assertEquals(7, metaData.getFieldMap().size());
		Assert.assertEquals(6, metaData.getAllFields().length);
		Assert.assertTrue(Arrays.equals(new String[] { "uid", "created", "dataType", "name", "description", "active" },
				metaData.getFieldNames()));
		Assert.assertArrayEquals(new String[] { "uid", "created", "dataType", "name", "description", "active" },
				metaData.getFieldNames());
		Assert.assertArrayEquals(new String[] { "uid", "created", "dataType", "active", "title", "master" },
				metaData.getSubTableFields("default", "details"));

		Assert.assertEquals(3, metaData.getListDefinitions().size());
		checkAllListFormDefinition(metaData.getListDefinition(EntityMetaDataConstants.DEFAULT_ALL_NAME));
		Assert.assertEquals(3, metaData.getFormDefinitions().size());
		checkAllFormDefinition(metaData.getFormDefinition(EntityMetaDataConstants.DEFAULT_ALL_NAME));
		Assert.assertEquals(1, metaData.getOutlineDefinitions().size());
		Assert.assertEquals(1, metaData.getPkFieldDefinition().getFields().length);
	}

	private void checkAllFormDefinition(FormDefinition formDefinition) {
		String[] fields = formDefinition.getFields();
		Assert.assertArrayEquals(new String[] { "uid", "created", "dataType", "name", "description", "active" },
				fields);
	}

	private void checkAllListFormDefinition(ListDefinition listDefinition) {
		String[] fields = listDefinition.getFields();
		Assert.assertArrayEquals(new String[] { "uid", "created", "dataType", "name", "description", "active" },
				fields);
	}

	@Test
	public void json() {
		EntityMetaData metaData = new EntityMetaData(Master.class);
		String json = JSONUtil.toJSON(metaData);
		System.out.println(json);
	}

	@Test
	public void instance() {
		EntityMetaData metaData = new EntityMetaData(Master.class);
		Object entity = metaData.newEntityInstance();
		Assert.assertEquals(Master.class, entity.getClass());
		String uid = UUIDUtil.newUUID();
		Master entity2 = metaData.newEntityInstance(uid);
		Assert.assertEquals(Master.class, entity2.getClass());
		Assert.assertEquals(uid, entity2.getUid());
	}

	@Test
	public void subTable() {
		EntityMetaData masterMetaData = new EntityMetaData(Master.class);
		EntityMetaData detailMetaData = masterMetaData.getSubEntityMetaData("details");
		Assert.assertEquals(Detail.class, detailMetaData.getEntityClass());
		String[] fields = masterMetaData.getSubTableFields("default", "details");
		Assert.assertArrayEquals(new String[] { "uid", "created", "dataType", "active", "title", "master" }, fields);
	}
}
