package org.myfly.platform.core.flydata;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.myfly.platform.core.context.UserContext;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.domain.ImportInfo;
import org.myfly.platform.core.flydata.internal.DataTablesResponse;
import org.myfly.platform.core.flydata.service.EntityMap;
import org.myfly.platform.core.flydata.service.EntityQueryMap;
import org.myfly.platform.core.flydata.service.FlyEntityMap;
import org.myfly.platform.core.flydata.service.IFlyDataAccessService;
import org.myfly.platform.core.flydata.service.Search;
import org.myfly.platform.core.test.SystempAppTestCase;
import org.myfly.platform.core.utils.FileUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.system.stdtest.domain.StdTestTable;
import org.myfly.platform.system.tpcc.domain.Customer;
import org.myfly.platform.system.tpcc.domain.District;
import org.myfly.platform.system.tpcc.domain.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class JdbcFlyDataAccessServiceTest extends SystempAppTestCase {
	@Autowired
	@Qualifier("jdbcFlyDataAccessService")
	private IFlyDataAccessService queryUseMetaDataService;

	private static boolean isInit = false;

	@Before
	public void init() {
		if (!isInit) {
			isInit = true;
			Warehouse warehouse = new Warehouse();
			warehouse.setName("w1");
			warehouse.setWid(1L);
			queryUseMetaDataService.saveEntity(warehouse);
			District district = new District();
			district.setWid(warehouse.getWid());
			district.setDid(1L);
			queryUseMetaDataService.saveEntity(district);
			Customer customer = new Customer(district);
			customer.setCid(1L);
			queryUseMetaDataService.saveEntity(customer);

			StdTestTable stdtesttable = new StdTestTable();
			stdtesttable.setUid(UUIDUtil.newUUID());
			stdtesttable.setName("name1");
			stdtesttable.setDataType(FieldDataType.DATE);
			stdtesttable.setCreatedBy(UserContext.getUserSession().getUser());
			queryUseMetaDataService.saveEntity(stdtesttable);
		}
	}

	@Test
	public void findOneForWarehouse() {
		Map<String, String> entity = queryUseMetaDataService.findOne("warehouse", "1", null, false);
		Assert.assertNotNull(entity);
		Assert.assertEquals("1", entity.get("wid"));
		String name = entity.get("name__link");
		Assert.assertTrue(name.contains("<a href=\"/vp/warehouse/"));
		String actions = entity.get("actions");
		Assert.assertEquals(null, actions);
	}

	@Test
	public void findOneForWarehouseAndPrintMode() {
		Map<String, String> entity = queryUseMetaDataService.findOne("warehouse", "1", null, true);
		Assert.assertNotNull(entity);
		Assert.assertEquals("1", entity.get("wid"));
		String name = entity.get("name");
		Assert.assertTrue(!name.contains("<a href=\"/vp/warehouse/"));
		String actions = entity.get("actions");
		Assert.assertEquals(null, actions);
	}

	@Test
	public void findAllForWarehouse() {
		EntityQueryMap params = new EntityQueryMap();
		List<FlyEntityMap> entities = queryUseMetaDataService.findAll("warehouse", null, null, false);
		Assert.assertNotNull(entities);
		params.put("wid", new String[] { "1" });
		entities = queryUseMetaDataService.findAll("warehouse", null, params, false);
		Assert.assertNotNull(entities);
		Assert.assertTrue(entities.size() > 0);
		Map<String, String> entity = entities.get(0);
		String name = entity.get("name__link");
		Assert.assertTrue(name.contains("<a href=\"/vp/warehouse/"));
		String actions = entity.get("actions");
		Assert.assertTrue(actions.contains("<a href=\"/vp/warehouse/"));
	}

	@Test
	public void findAllForWarehouseAndPrintMode() {
		EntityQueryMap params = new EntityQueryMap();
		List<FlyEntityMap> entities = queryUseMetaDataService.findAll("warehouse", null, null, false);
		Assert.assertNotNull(entities);
		params.put("wid", new String[] { "1" });
		entities = queryUseMetaDataService.findAll("warehouse", null, params, true);
		Assert.assertNotNull(entities);
		Assert.assertTrue(entities.size() > 0);
		Map<String, String> entity = entities.get(0);
		String name = entity.get("name");
		Assert.assertTrue(!name.contains("<a href=\"/vp/warehouse/"));
		String actions = entity.get("actions");
		Assert.assertNull(actions);
	}

	@Test
	public void findOneForDistrict() {
		Map<String, String> entity = queryUseMetaDataService.findOne("district", "1_1", null, false);
		Assert.assertNotNull(entity);
		Assert.assertEquals("1", entity.get("wid"));
		Assert.assertEquals("1", entity.get("did"));
		String name = entity.get("name__link");
		Assert.assertTrue(name.contains("<a href=\"/vp/district/"));
		String actions = entity.get("actions");
		Assert.assertEquals(null, actions);
	}

	@Test
	public void findAllForDistrict() {
		EntityQueryMap params = null;
		List<FlyEntityMap> entities = queryUseMetaDataService.findAll("district", null, params, false);
		Assert.assertNotNull(entities);
		params = new EntityQueryMap();
		params.put("wid", new String[] { "1" });
		params.put("did", new String[] { "1" });
		entities = queryUseMetaDataService.findAll("district", null, params, false);
		Assert.assertNotNull(entities);
		Assert.assertTrue(entities.size() > 0);
		Map<String, String> entity = entities.get(0);
		String name = entity.get("name__link");
		Assert.assertTrue(name.contains("<a href=\"/vp/district/"));
		String actions = entity.get("actions");
		Assert.assertTrue(actions.contains("<a href=\"/vp/district/"));
		String warehouse = entity.get("warehouse__link");
		Assert.assertTrue(warehouse.contains("<a href=\"/vp/warehouse/"));
	}

	@Test
	public void findOneForCustomer() {
		Map<String, String> entity = queryUseMetaDataService.findOne("customer", "1_1_1", null, false);
		Assert.assertNotNull(entity);
		Assert.assertEquals("1", entity.get("wid"));
		Assert.assertEquals("1", entity.get("did"));
		Assert.assertEquals("1", entity.get("cid"));
		String sfirst = entity.get("sfirst__link");
		Assert.assertTrue(sfirst.contains("<a href=\"/vp/customer/"));
		String district = entity.get("district__link");
		Assert.assertTrue(district.contains("<a href=\"/vp/district/"));
	}

	@Test
	public void findAllForCustomer() {
		EntityQueryMap params = null;
		List<FlyEntityMap> entities = queryUseMetaDataService.findAll("customer", null, params, false);
		Assert.assertNotNull(entities);
		Assert.assertTrue(entities.size() > 0);
		params = new EntityQueryMap();
		params.put("wid", new String[] { "1" });
		params.put("did", new String[] { "1" });
		params.put("cid", new String[] { "1" });
		entities = queryUseMetaDataService.findAll("customer", null, params, false);
		Assert.assertNotNull(entities);
		Assert.assertTrue(entities.size() == 1);
	}

	@Test
	public void findAllForCustomerAndPageable() {
		EntityQueryMap params = new EntityQueryMap();
		params.put("wid", new String[] { "1" });
		Pageable pageable = new PageRequest(0, 3);
		Page<?> pageData = queryUseMetaDataService.findAll("customer", null, params, pageable, false);
		Assert.assertNotNull(pageData);
		Assert.assertTrue(pageData.getTotalElements() > 0);
	}

	//@Test
	public void findAllForSearchDataTables() {
		DataTablesResponse response = queryUseMetaDataService.findAllForSearchDataTables("stdtesttable", null, null, 0,
				20);
		Assert.assertNotNull(response);
		Assert.assertTrue(response.getRecordsTotal() > 0);
	}

	// @Test
	public void findAllForSearch() {
		Page<FlyEntityMap> response = queryUseMetaDataService.findAllForSearch("stdtesttable", null, null, 0, 20);
		Assert.assertNotNull(response);
		Assert.assertTrue(response.getContent().size() > 0);
	}

	@Test
	public void findAllForSelect() {
		PageRequest pageable = new PageRequest(0, 5);
		Search search = null;
		DataTablesResponse response = queryUseMetaDataService.findAllForSelect("warehouse", search, pageable);
		Assert.assertNotNull(response);
		Assert.assertTrue(response.getRecordsTotal() > 0);
	}

	@Test
	public void findAllToDataTablesForWarehouse() {
		DataTablesResponse response = queryUseMetaDataService.findAllToDataTables("warehouse", null, null, 0, 5, false);
		Assert.assertNotNull(response);
		Assert.assertTrue(response.getRecordsTotal() > 0);
	}

	@Test
	public void findAllToDataTablesForWarehouseAndSubEntityAndPageable() {
		DataTablesResponse response = queryUseMetaDataService.findAllToDataTables("warehouse", "1", "districts", null,
				null, 0, 5, false);
		Assert.assertNotNull(response);
		Assert.assertTrue(response.getRecordsTotal() > 0);
	}

	@Test
	public void exportToExcelForWarehouse() {
		String excelFileName = FileUtil.createTempDirectoryPath() + UUIDUtil.newUUID() + ".csv";
		queryUseMetaDataService.exportToExcel("warehouse", null, null, excelFileName);
		File file = new File(excelFileName);
		Assert.assertTrue(file.exists());
	}

	@Test
	public void exportToExcelForWarehouseAndDistricts() {
		String excelFileName = FileUtil.createTempDirectoryPath() + UUIDUtil.newUUID() + ".csv";
		queryUseMetaDataService.exportToExcel("warehouse", "1", "districts", null, null, excelFileName);
		File file = new File(excelFileName);
		Assert.assertTrue(file.exists());
	}

	@Test
	public void exportToExcelForStdTestTable() {
		String excelFileName = FileUtil.createTempDirectoryPath() + UUIDUtil.newUUID() + ".csv";
		queryUseMetaDataService.exportToExcel("stdtesttable", null, null, excelFileName);
		File file = new File(excelFileName);
		Assert.assertTrue(file.exists());

		ImportInfo importInfo = queryUseMetaDataService.importExcelFile("stdtesttable", null, new File(excelFileName));
		Assert.assertEquals(0, importInfo.getErrorCount());
	}

	// @Test
	// public void findAllToDataTablesForStdTestTable() {
	// DataTablesResponse response =
	// queryUseMetaDataService.findAllToDataTables("StdTestTable", null, null,
	// 0, 5,
	// false);
	// Assert.assertNotNull(response);
	// Assert.assertTrue(response.getRecordsTotal() > 0);
	// }
	//
	// @Test
	// public void findAllForStdTestTable() {
	// List<FlyEntityMap> result =
	// queryUseMetaDataService.findAll("StdTestTable", null, null, false);
	// Assert.assertTrue(result.size() > 0);
	// Map<String, String> entity = result.get(0);
	// Assert.assertTrue(entity.get("createdBy__link").startsWith("<a
	// href=\"/vp/suser/"));
	// Assert.assertTrue(StringUtils.isNotBlank(entity.get("createdBy__email")));
	// }

	// @Test
	public void entityCUDForWarehouse() {
		String table = "warehouse";
		EntityMap values = new EntityMap();
		values.put("wid", "1000");
		String result = queryUseMetaDataService.saveEntity(table, null, values);
		Assert.assertNotNull(result);

		EntityMap values2 = new EntityMap();
		values2.put("name", "name gb");
		queryUseMetaDataService.updateEntity(table, "1000", null, values2);

		queryUseMetaDataService.delOne(table, "1000");
	}

	@Test
	public void findAllForMenu() {

	}

	@Test
	public void findOneForStdTestTable() {
		String tableName = "StdTestTable";
		List<FlyEntityMap> items = queryUseMetaDataService.findAll(tableName, null, null, false);
		Assert.assertTrue(items.size() > 0);
		Map<String, String> entity = items.get(0);
		Assert.assertNotNull(entity);
		// {name=<a href="/vp/stdtesttable/40289f3b5271fddd015271fdf59002a1"
		// target="" title="查看"> name25</a>, stringField=StringField字符串25,
		// longField=2500, bigDecimalField=25000.00, sqlDateField=2016-01-24,
		// dataType__name=DATE, dataType=日期,
		// createdBy__uid=40289f3b51baf0dd0151bd0e76816a72, createdBy=<a
		// href="/vp/suser/40289f3b51baf0dd0151bd0e76816a72" target=""
		// title="查看"> sys</a>,
		// createdBy.email__uid=40289f3b51baf0dd0151bd0e76816a72,
		// createdBy.email=<a href="/vp/suser/40289f3b51baf0dd0151bd0e76816a72"
		// target="" title="查看"> sys@flyme.com</a>, actions=<a
		// href="/vp/stdtesttable/40289f3b5271fddd015271fdf59002a1" target=""
		// title="查看"><i class="glyphicon glyphicon-eye-open"></i></a><a
		// href="/vp/stdtesttable/40289f3b5271fddd015271fdf59002a1?form"
		// target="" title="编辑"><i class="glyphicon glyphicon-edit"></i></a><a
		// href="/vp/stdtesttable/40289f3b5271fddd015271fdf59002a1" target=""
		// title="删除"><i class="glyphicon glyphicon-remove"></i></a>}

		String uid = entity.get("uid");
		Assert.assertNotNull(uid);
		// check name
		String name = entity.get("name__link");
		Assert.assertTrue(name.startsWith("<a"));
		// check SysEnum
		Assert.assertEquals("日期", entity.get("dataType__label"));
		Assert.assertEquals("DATE", entity.get("dataType"));
		// check createdBy
		Assert.assertEquals("40289f3b51baf0dd0151bd0e76816a72", entity.get("createdBy"));
		Assert.assertEquals("<a href=\"/vp/suser/40289f3b51baf0dd0151bd0e76816a72\" target=\"\" title=\"查看\"> sys</a>",
				entity.get("createdBy__link"));
		Assert.assertEquals("sys@flyme.com", entity.get("createdBy__email"));
		// check actions
	}
}
