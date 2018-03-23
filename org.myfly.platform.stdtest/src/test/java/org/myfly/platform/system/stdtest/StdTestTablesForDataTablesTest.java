package org.myfly.platform.system.stdtest;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.SystemApplication;
import org.myfly.platform.core.flydata.internal.DataTablesResponse;
import org.myfly.platform.core.flydata.service.IFlyDataAccessService;
import org.myfly.platform.core.metadata.define.FieldDefinition;
import org.myfly.platform.core.metadata.define.ListDefinition;
import org.myfly.platform.core.metadata.internal.EntityMetaData;
import org.myfly.platform.core.metadata.service.IEntityMetaDataService;
import org.myfly.platform.system.stdtest.domain.StdTestTable;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes = SystemApplication.class)
public class StdTestTablesForDataTablesTest extends ServiceTestCase {
	@Autowired
	@Qualifier("jdbcFlyDataAccessService")
	private IFlyDataAccessService queryUseMetaDataService;
	@Autowired
	private IEntityMetaDataService entityMetaDataService;

	private int getFieldCol(FieldDefinition[] fields, String name) {
		int i = 0;
		for (FieldDefinition field : fields) {
			if (field.getName().equals(name)) {
				return i;
			}
			i++;
		}
		return -1;
	}

	@Test
	public void stdTestTable() {
		String tableName = "StdTestTable";
		DataTablesResponse response = queryUseMetaDataService.findAllToDataTables(tableName, null, null,
				0, 20, false);
		Assert.assertNotNull(response);
		Assert.assertTrue(response.getData().length > 0);
		String[] row = (String[]) response.getData()[0];

		EntityMetaData metaData = entityMetaDataService.getEntityMetaData(tableName);
		ListDefinition listDefinition = metaData.getListDefinition(null);
		
		// name
		String name = row[getFieldCol(listDefinition.getFields(), "name")];
		Assert.assertTrue(StringUtils.isNotBlank(name));
		// actions
		String actions = row[getFieldCol(listDefinition.getFields(), "actions")];
		Assert.assertTrue(StringUtils.isNotBlank(actions));
		Assert.assertTrue(actions.startsWith("<a"));
		Assert.assertTrue(actions.contains("/vp/" + tableName.toLowerCase() + "/"));
		// createdBy
		String createdBy = row[getFieldCol(listDefinition.getFields(), "createdBy")];
		Assert.assertTrue(StringUtils.isNotBlank(createdBy));
		Assert.assertTrue(createdBy.startsWith("<a"));
		Assert.assertTrue(createdBy.contains("/vp/suser/"));
	}

	@Test
	public void stdTestTableForPrintMode() {
		String tableName = "StdTestTable";
		DataTablesResponse response = queryUseMetaDataService.findAllToDataTables(tableName, null, null,
				0, 20, true);
		Assert.assertNotNull(response);
		Assert.assertTrue(response.getData().length > 0);
		String[] row = (String[]) response.getData()[0];

		EntityMetaData metaData = entityMetaDataService.getEntityMetaData(tableName);
		ListDefinition listDefinition = metaData.getListDefinition(null);
		
		tableName = metaData.getTableDefinition().getTableName();
		// name
		String name = row[getFieldCol(listDefinition.getFields(), "name")];
		Assert.assertTrue(!name.startsWith("<a"));
		// actions
		int col = getFieldCol(listDefinition.getFields(), "actions");
		Assert.assertTrue(col >= 0);
		// createdBy
		String createdBy = row[getFieldCol(listDefinition.getFields(), "createdBy")];
		Assert.assertTrue(!createdBy.startsWith("<a"));
	}

	@Test
	public void stdTestTableSuba() {
		String tableName = ClassUtils.getShortClassName(StdTestTable.class);
		List<Map<String, String>> list = queryUseMetaDataService.findAll2(tableName, null);
		Assert.assertTrue(list.size() > 0);
		Map<String, String> stdTestTable = list.get(0);
		String uid = stdTestTable.get("uid");
		String subTableAttr = "details";
		
		DataTablesResponse response = queryUseMetaDataService.findAllToDataTables(tableName, uid,
				subTableAttr, null, null, 0, 20, false);
		Assert.assertNotNull(response);
		Assert.assertTrue(response.getData().length > 0);
		String[] row = (String[]) response.getData()[0];
		
		EntityMetaData metaData = entityMetaDataService.getSubEntityMetaData(tableName, subTableAttr);
		ListDefinition listDefinition = metaData.getListDefinition(null);
		
		// name
		String name = row[getFieldCol(listDefinition.getFields(), "name")];
		Assert.assertTrue(StringUtils.isNotBlank(name));
		// createdBy
		String createdBy = row[getFieldCol(listDefinition.getFields(), "createdBy")];
		Assert.assertTrue(StringUtils.isNotBlank(createdBy));
		Assert.assertTrue(createdBy.contains("/vp/suser/"));
		// actions
		String actions = row[getFieldCol(listDefinition.getFields(), "actions")];
		Assert.assertTrue(StringUtils.isNotBlank(actions));
		Assert.assertTrue(actions.contains("/vp/" + tableName.toLowerCase() + "/" + uid + "/" + subTableAttr));
	}
}
