package org.myfly.platform.core.metadata.entity;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.entity.handler.SearchRelationEntity;
import org.myfly.platform.core.testmodel.Detail;
import org.myfly.platform.core.testmodel.Master;

public class DetailEntityMetaDataDefinitionTest {

	@Test
	public void detailEntity() {
		EntityMetaData metaData = new EntityMetaData(Detail.class);
		SearchRelationFieldDefinition field = metaData.getField("master");

		// SearchRelation ManyToOne
		Assert.assertEquals("master", field.getName());
		Assert.assertEquals("master".toUpperCase(), field.getFieldName());
		Assert.assertEquals("主记录", field.getTitle());
		Assert.assertEquals(FieldDataType.SEARCHRELATION, field.getDataType());
		Assert.assertTrue(field.isRequired());
		Assert.assertEquals(Master.class, field.getType());
		Assert.assertEquals(Master.class.getName(), field.getRelationClass());
		Assert.assertEquals("getMaster", field.getGetter().getName());
		Assert.assertEquals("setMaster", field.getSetter().getName());
		Assert.assertNotNull(field.getValueHandler());
		Detail detail = new Detail();
		Master master = new Master();
		master.setUid("1");
		master.setName("name 1");
		field.getValueHandler().setFieldValue(detail, master);
		SearchRelationEntity srEntity = (SearchRelationEntity) field.getValueHandler().getFieldValue(detail);
		Assert.assertNotNull(srEntity);
		Assert.assertEquals(master.getUid(), srEntity.getUid());
		Assert.assertEquals(master.getName(), srEntity.getTitle());
	}
}
