package org.myfly.platform.core.metadata;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.flydata.internal.DataTablesResponse;
import org.myfly.platform.core.flydata.service.IFlyDataAccessService;
import org.myfly.platform.core.metadata.service.EntityMetaData;
import org.myfly.platform.core.metadata.service.IEntityMetaDataService;
import org.myfly.platform.core.metadata.service.JsonEntityMetaData;
import org.myfly.platform.system.stdtest.domain.StdTestEmployee;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes = CoreApplication.class)
public class ExternalTableMetaDataServiceTest extends ServiceTestCase {
	@Autowired
	private IEntityMetaDataService entityMetaDataService;
	@Autowired
	@Qualifier("jdbcFlyDataAccessService")
	private IFlyDataAccessService queryUseMetaDataService;

	private String entityName = "xwh_std_test_employee";

	@Test
	public void stdTestEmployee() {
		JsonEntityMetaData metaData = new JsonEntityMetaData(
				entityMetaDataService.getEntityMetaData(StdTestEmployee.class.getName()));
		System.out.println(metaData.toJson());
	}

	//@Test
	public void getExternal() {
		EntityMetaData entityMetaData = entityMetaDataService.getEntityMetaData(entityName);
		Assert.assertNotNull(entityMetaData);
	}

	//@Test
	public void findAllToDataTables() {
		DataTablesResponse resulut = queryUseMetaDataService.findAllToDataTables(entityName, null, null, 0,
				10, true);
	}
}
