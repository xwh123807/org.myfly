package org.myfly.platform.core.metadata.entity;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;
import org.myfly.platform.core.metadata.entity.EntityFieldDefinitionFactory;
import org.myfly.platform.core.metadata.entity.MDRelationFieldDefinition;
import org.myfly.platform.core.metadata.entity.SearchRelationFieldDefinition;
import org.myfly.platform.core.testdata.Master;
import org.myfly.platform.core.utils.EntityClassUtil;

public class EntityFieldDefinitionFactoryTest {

	@Test
	public void build() {
		EntityClassUtil.getEntityFieldInfo(Master.class).forEach((name, fieldInfo) -> {
			EntityFieldDefinition field = EntityFieldDefinitionFactory.buildEntityFieldDefinition(fieldInfo.getField());
			if ("uid".equals(name) || "name".equals(name) || "description".equals(name) || "active".equals(name)
					|| "created".equals(name) || "dataType".equals(name)) {
				Assert.assertTrue(field instanceof EntityFieldDefinition);
			} else if ("tenant".equals(name)) {
				Assert.assertTrue(field instanceof SearchRelationFieldDefinition);
			} else if ("details".equals(name)) {
				Assert.assertTrue(field instanceof MDRelationFieldDefinition);
			}
			field.validate();
			Assert.assertNotNull(field.toString());
		});
	}
}
