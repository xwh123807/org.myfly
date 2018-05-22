package org.myfly.platform.core.metadata.entity;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.entity.SearchRelationFieldDefinition;
import org.myfly.platform.core.testdata.Detail;
import org.myfly.platform.core.testdata.Master;
import org.myfly.platform.core.utils.EntityClassUtil;
import org.myfly.platform.core.utils.UUIDUtil;

public class DetailEntityMetaDataDefinitionTest {

	@Test
	public void detailEntity() {
		Detail detail = new Detail();
		EntityClassUtil.getAllEntityFields(Detail.class).forEach(item -> {
			if ("master".equals(item.getName())) {
				// SearchRelation ManyToOne
				SearchRelationFieldDefinition field = new SearchRelationFieldDefinition(item);
				Assert.assertEquals("master", field.getName());
				Assert.assertEquals("master".toUpperCase(), field.getFieldName());
				Assert.assertEquals("主记录", field.getTitle());
				Assert.assertEquals(FieldDataType.SEARCHRELATION, field.getDataType());
				Assert.assertTrue(field.isRequired());
				Assert.assertEquals(Master.class, field.getType());
				Assert.assertEquals(Master.class.getName(), field.getRelationClass());
				Assert.assertEquals("getMaster", field.getGetter().getName());
				Assert.assertEquals("setMaster", field.getSetter().getName());
				Assert.assertNotNull(field.getGetValueHandler());
				Assert.assertNotNull(field.getSetValueHandler());
				Master value = new Master();
				field.getSetValueHandler().setFieldValue(detail, value);
				Assert.assertEquals(value, field.getGetValueHandler().getFieldValue(detail));
				// 根据主键构建对象
				String masterUid = UUIDUtil.newUUID();
				field.getSetValueHandler().setFieldValue(detail, masterUid);
				Assert.assertEquals(masterUid, field.getGetValueHandler().getFieldValue(detail));
			}
		});
	}
}
