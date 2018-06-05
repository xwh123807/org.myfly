package org.myfly.platform.core.metadata.entity;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.metadata.define.ListDefinition;
import org.myfly.platform.core.metadata.service.EntityMetaDataConstants;
import org.myfly.platform.core.testmodel.Detail;
import org.myfly.platform.core.testmodel.Master;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core.utils.UUIDUtil;

public class EntityMetaDataTest {
	@Test
	public void master() {
		EntityMetaData metaData = new EntityMetaData(Master.class);
		Assert.assertEquals(Master.class, metaData.getEntityClass());
		Assert.assertEquals(Master.class.getName(), metaData.getEntityName());
		Assert.assertEquals(Master.class, metaData.newEntityInstance().getClass());

		Assert.assertEquals(3, metaData.getListDefinitions().size());
		checkAllListFormDefinition(metaData.getListDefinition(EntityMetaDataConstants.DEFAULT_ALL_NAME));
		Assert.assertEquals(3, metaData.getFormDefinitions().size());
		checkAllFormDefinition(metaData.getFormDefinition(EntityMetaDataConstants.DEFAULT_ALL_NAME));
		Assert.assertEquals(2, metaData.getOutlineDefinitions().size());
		Assert.assertEquals(1, metaData.getPkFieldDefinition().getFields().length);
	}

	private void checkAllFormDefinition(EntityFormDefinition formDefinition) {
		Assert.assertEquals(formDefinition.getFields().length,
				formDefinition.getFields(formDefinition.getFields()).length);
	}

	private void checkAllListFormDefinition(ListDefinition listDefinition) {
		String[] fields = listDefinition.getFields();
		Assert.assertNotNull(fields);
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
	}
}
