package org.myfly.platform.core.metadata;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.metadata.service.EntityMetaData;
import org.myfly.platform.core.metadata.service.IEntityMetaDataService;
import org.myfly.platform.core.metadata.service.JsonEntityMetaData;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.system.stdtest.domain.StdTestTable;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes = CoreApplication.class)
public class EntityMetaDataJsonTest extends ServiceTestCase {
	@Autowired
	private IEntityMetaDataService entityMetaDataService;

	@Test
	public void toJsonStdTestTable() {
		EntityMetaData metaData = entityMetaDataService.getEntityMetaData(StdTestTable.class.getName());
		// check tableDefenition
		JsonEntityMetaData jsonMetaData = new JsonEntityMetaData(metaData);
		String json = JSONUtil.toJSON(jsonMetaData);
		System.out.println(json);
		jsonMetaData = JSONUtil.fromJSON(json, JsonEntityMetaData.class);
		Assert.assertNotNull(jsonMetaData);
		Assert.assertEquals(jsonMetaData.getFieldMap().size(), metaData.getFieldMap().size());
		Assert.assertEquals(jsonMetaData.getPkFieldDefinition().getIdFields().length,
				metaData.getPKFieldDefinition().getIdFields().length);
		//listdefinition
		Assert.assertEquals(jsonMetaData.getListDefinitions().size(), metaData.getListDefinitions().size());
		Assert.assertEquals(jsonMetaData.getListDefinitions().get("all").getFields().length,
				metaData.getListDefinitions().get("all").getFields().length);
		Assert.assertEquals(jsonMetaData.getListDefinitions().get("all").getFilters().length,
				metaData.getListDefinitions().get("all").getFilters().length);
		//formdefinition
		Assert.assertEquals(jsonMetaData.getFormDefinitions().size(), metaData.getFormDefinitions().size());
		Assert.assertEquals(jsonMetaData.getFormDefinitions().get("all").getSections()[0].getFieldSets()[0].getFields().length,
				metaData.getFormDefinitions().get("all").getSections()[0].getFieldSets()[0].getFields().length);

		EntityMetaData metaData2 = jsonMetaData.convertToEntityMetaData();
		Assert.assertNotNull(metaData2);
		Assert.assertEquals(metaData2.getFieldMap().size(), metaData.getFieldMap().size());
		Assert.assertEquals(metaData2.getPKFieldDefinition().getIdFields().length,
				metaData.getPKFieldDefinition().getIdFields().length);
		//listdefinition
		Assert.assertEquals(metaData2.getListDefinitions().size(), metaData.getListDefinitions().size());
		Assert.assertEquals(metaData2.getListDefinitions().get("all").getFields().length,
				metaData.getListDefinitions().get("all").getFields().length);
		Assert.assertEquals(metaData2.getListDefinitions().get("all").getFilters().length,
				metaData.getListDefinitions().get("all").getFilters().length);
		//formdefinition
		Assert.assertEquals(metaData2.getFormDefinitions().size(), metaData.getFormDefinitions().size());
		Assert.assertEquals(metaData2.getFormDefinitions().get("all").getSections()[0].getFieldSets()[0].getFields().length,
				metaData.getFormDefinitions().get("all").getSections()[0].getFieldSets()[0].getFields().length);
		
		JsonEntityMetaData jsonMetaData2 = new JsonEntityMetaData(metaData2);
		Assert.assertNotNull(jsonMetaData2);
		String json2 = JSONUtil.toJSON(jsonMetaData2);
		System.out.println(json2);
		JsonEntityMetaData jsonMetaData3 = JSONUtil.fromJSON(json2, JsonEntityMetaData.class);
		Assert.assertNotNull(jsonMetaData3);
	}

	@Test
	public void allEntity() {
		List<Class<?>> classes = entityMetaDataService.getAllEntityClasses();
		for (Class<?> entityClass : classes) {
			EntityMetaData metaData = entityMetaDataService.getEntityMetaData(entityClass.getName());
			JsonEntityMetaData jsonMetaData = new JsonEntityMetaData(metaData);
			String json = JSONUtil.toJSON(jsonMetaData);
			System.out.println(json);
			jsonMetaData = JSONUtil.fromJSON(json, JsonEntityMetaData.class);
			Assert.assertNotNull(jsonMetaData);
		}
	}
}
