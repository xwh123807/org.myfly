package org.myfly.platform.core.flydata;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.domain.ImportInfo;
import org.myfly.platform.core.flydata.internal.DataTablesResponse;
import org.myfly.platform.core.flydata.service.EntityMap;
import org.myfly.platform.core.flydata.service.FlyEntityMap;
import org.myfly.platform.core.flydata.service.IFlyDataAccessService;
import org.myfly.platform.system.stdtest.domain.StdTestTable;
import org.myfly.platform.system.stdtest.domain.StdTestTableSubA;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;

@SpringApplicationConfiguration(classes = CoreApplication.class)
@WebIntegrationTest(randomPort = true)
public class JpaFlyDataAccessServiceForStdTestTest extends ServiceTestCase {
	@Autowired
	@Qualifier("jpaFlyDataAccessService")
	private IFlyDataAccessService flyDataService;

	private static String entityName = "stdtesttable";

	private EntityMap getStdTestTable() {
		EntityMap entity = new EntityMap();
		entity.put("name", "name1");
		return entity;
	}

	private String newStdTestTable() {
		return flyDataService.saveEntity(entityName, null, getStdTestTable());
	}

	private EntityMap getStdTestTableSubA() {
		EntityMap entity = new EntityMap();
		entity.put("name", "subname1");
		return entity;
	}

	@Test
	@Transactional
	public void findOneForObject() {
		String uid = newStdTestTable();
		Object entity = flyDataService.findOne(entityName, uid);
		Assert.assertTrue(entity instanceof StdTestTable);
		Assert.assertEquals(uid, ((StdTestTable) entity).getUid());
		Map<String, Object> values = new HashMap<>();
		values.put("uid", uid);
		entity = flyDataService.findOne(entityName, values);
		Assert.assertTrue(entity instanceof StdTestTable);
		Assert.assertEquals(uid, ((StdTestTable) entity).getUid());
	}

	@Test
	public void findOneForMap() {
		String uid = newStdTestTable();
		FlyEntityMap entity = flyDataService.findOne(entityName, uid, null, false);
		Assert.assertTrue(MapUtils.isNotEmpty(entity));
	}

	@Transactional
	@Test
	public void delOne() {
		String uid = newStdTestTable();
		Assert.assertEquals(1, flyDataService.delOne(entityName, uid));
		FlyEntityMap entity = flyDataService.findOne(entityName, uid, null, false);
		Assert.assertNull(entity);
	}

	@Test
	public void saveEntity() {
		Map<String, Object> values = new HashMap<>();
		values.put("name", "name2");
		String uid = flyDataService.saveEntity(entityName, values);
		Assert.assertNotNull(uid);
	}

	@Test
	public void saveMultiEnties() {
		List<EntityMap> list = new ArrayList<>();
		list.add(getStdTestTable());
		list.add(getStdTestTable());
		flyDataService.saveEntity(entityName, list);
	}

	@Test
	@Transactional
	public void updateEntity() {
		String uid = newStdTestTable();
		StdTestTable entity = new StdTestTable();
		entity.setUid(uid);
		entity.setName("name changed");
		flyDataService.updateEntity(entity);
		entity = flyDataService.findOne(entityName, uid);
		Assert.assertEquals("name changed", entity.getName());
		
		Map<String, Object> values = new HashMap<>();
		values.put("name", "name3");
		flyDataService.updateEntity(entityName, uid, values);
		entity = flyDataService.findOne(entityName, uid);
		Assert.assertEquals("name3", entity.getName());
		
		EntityMap vlaues2 = new EntityMap();
		vlaues2.put("name", "values2");
		flyDataService.updateEntity(entityName, uid, null, vlaues2);
		entity = flyDataService.findOne(entityName, uid);
		Assert.assertEquals("values2", entity.getName());
	}

	@Test
	public void saveAndUpdateSubEntity() {
		String uid = newStdTestTable();
		EntityMap subEntity = getStdTestTableSubA();
		String subUid = flyDataService.saveEntity(entityName, uid, "details", null, subEntity);
		Assert.assertNotNull(subUid);
		EntityMap subEntity2 = getStdTestTableSubA();
		subEntity2.put("name", "subname111");
		flyDataService.updateEntity(entityName, uid, "details", subUid, null, subEntity2);
	}

	@Test
	public void stdTestTableFetchAll() {
		List<FlyEntityMap> masters = flyDataService.findAll("StdTestTable", "all", null, false);
		Assert.assertNotNull(masters);
		for (Map master : masters) {
			List details = flyDataService.findAllForSubEntity("StdTestTable", (String) master.get("uid"), "details",
					null, null, false);
			Assert.assertNotNull(details);
		}
	}

	@Test
	public void findAllToDataTablesForstdTestTableLinks() {
		StdTestTable entity = new StdTestTable();
		entity.setName("a1");
		flyDataService.saveEntity(entity);
		String tableName = "StdTestTable";
		DataTablesResponse response = flyDataService.findAllToDataTables(tableName, null, null, 0, 20, false);
		Assert.assertNotNull(response);
		Assert.assertTrue(response.getData().length > 0);
		String[] row = (String[]) response.getData()[0];
		// name
		String name = row[0];
		Assert.assertTrue(StringUtils.isNotBlank(name));
		// Assert.assertTrue(name.contains("/vp/" + tableName.toLowerCase() +
		// "/"));
		// actions
		String actions = row[row.length - 1];
		Assert.assertTrue(StringUtils.isNotBlank(actions));
		Assert.assertTrue(actions.contains("/vp/" + tableName.toLowerCase() + "/"));
	}

	@Test
	@Transactional
	public void findAllToDataTablesForstdTestTableSubTableLinks() {
		StdTestTable entity = new StdTestTable();
		entity.setName("a1");
		flyDataService.saveEntity(entity);
		StdTestTableSubA suba = new StdTestTableSubA();
		suba.setName("n2");
		suba.setStdTestTable(entity);
		flyDataService.saveEntity(suba);
		String tableName = "StdTestTable";
		List<FlyEntityMap> masters = flyDataService.findAll(tableName, "all", null, false);
		Assert.assertNotNull(masters);
		Map master = masters.get(0);
		String uid = (String) master.get("uid");
		Assert.assertNotNull(master);
		DataTablesResponse response = flyDataService.findAllToDataTables("StdTestTable", (String) master.get("uid"),
				"details", "all", null, 0, 20, false);
		Assert.assertNotNull(response);
		Assert.assertTrue(response.getData().length > 0);
		String[] row = (String[]) response.getData()[0];
		// name
		String name = row[response.getMetaData().getFieldIndex("name")];
		Assert.assertTrue(StringUtils.isNotBlank(name));
		// Assert.assertTrue(name.contains("/vp/" + tableName.toLowerCase() +
		// "/" + uid + "/details/"));
		// actions
		String actions = row[response.getMetaData().getFieldIndex("actions")];
		Assert.assertTrue(StringUtils.isNotBlank(actions));
		Assert.assertTrue(actions.contains("/vp/" + tableName.toLowerCase() + "/" + uid + "/details/"));
		Assert.assertTrue(actions.contains("/vp/" + tableName.toLowerCase() + "/" + uid + "/details/"));
		Assert.assertTrue(actions.contains("/vp/" + tableName.toLowerCase() + "/" + uid + "/details/"));
	}

	@Test
	public void exportToExcel() throws Exception {
		String tableName = "StdTestTable";
		String excelFile = FileUtils.getTempDirectoryPath() + tableName + ".csv";
		flyDataService.exportToExcel(tableName, null, null, excelFile);
		Assert.assertNotNull(excelFile);
		List<String> lines = FileUtils.readLines(new File(excelFile));
		Assert.assertNotNull(lines);
		String[] titles = lines.get(0).split(",");
		Assert.assertNotNull(titles);
	}

	@Test
	public void exportAndImportExcel() throws Exception {
		String tableName = "StdTestTable";
		String excelFile = FileUtils.getTempDirectoryPath() + tableName + ".csv";
		flyDataService.exportToExcel(tableName, null, null, excelFile);
		Assert.assertNotNull(excelFile);
		ImportInfo importInfo = flyDataService.importExcelFile(tableName, null, new File(excelFile));
		Assert.assertNotNull(importInfo);
		if (importInfo.getErrorCount() > 0) {
			for (String item : importInfo.getErrorLines()) {
				System.out.println(item);
			}
		}
		Assert.assertTrue(importInfo.getErrorCount() == 0);
	}

	@Test
	public void importExcel() throws Exception {
		String tableName = "StdTestTable";
		String excelFile = org.myfly.platform.core.utils.FileUtil.createTempDirectoryPath() + tableName + ".csv";
		flyDataService.exportToExcel(tableName, null, null, excelFile);
		Assert.assertNotNull(excelFile);
		String uploadDir = new File(excelFile).getParent();
		String result = flyDataService.importExcel(tableName, null, uploadDir, null);
	}

}
