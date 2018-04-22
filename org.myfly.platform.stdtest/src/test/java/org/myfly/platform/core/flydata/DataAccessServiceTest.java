package org.myfly.platform.core.flydata;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.context.SystemContext;
import org.myfly.platform.core.flydata.internal.EntityUtil;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.user.domain.SUser;
import org.myfly.platform.core.user.domain.Tenant;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.system.stdtest.domain.StdTestTable;
import org.myfly.platform.system.stdtest.domain.StdTestTableSubA;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specifications;

@SpringApplicationConfiguration(classes = CoreApplication.class)
public class DataAccessServiceTest extends ServiceTestCase {
	@Autowired
	private IJpaDataAccessService dataAccessService;
	
	@Before
	public void before(){
		StdTestTable entity = new StdTestTable();
		entity.setName("name2");
		dataAccessService.saveEntity(entity);
	}

	@Test
	public void findOne() {
		String tableName = "suser";
		String uid = SystemContext.SYS_SUSER_UID;
		Object result = dataAccessService.findOne(tableName, uid);
		Assert.assertNotNull(result);
	}

	@Test
	public void findAllWithMTable() {
		String tableName = "suser";
		List<?> result = dataAccessService.findAll(tableName);
		Assert.assertNotNull(result);
	}

	@Test
	public void findOneForSTenant() {
		List<Tenant> list = dataAccessService.findAll("Tenant");
		Assert.assertNotNull(list);
	}
	
	@Test
	public void saveAndUpdate(){
		StdTestTable entity = new StdTestTable();
		entity.setName("n");
		dataAccessService.saveEntity(entity);
		String uid = entity.getUid();
		StdTestTableSubA subEntity = new StdTestTableSubA();
		subEntity.setName("suba");
		StdTestTable std = new StdTestTable();
		std.setUid(uid);
		subEntity.setStdTestTable(std);
		dataAccessService.saveEntity(subEntity);
	}

	@Test(expected = EmptyResultDataAccessException.class)
	public void deleteOneForSUser() {
		String tableName = "suser";
		dataAccessService.delOne(tableName, "asdfa");
	}

	@Test
	@Transactional
	public void saveAndUpdateEntityForSUser() {
		Map<String, Object> values = new HashMap<>();
		values.put("uid", new String[] { UUIDUtil.newUUID() });
		values.put("name", "name-test");
		values.put("employeeNumber", 123L);
		values.put("email", UUIDUtil.newUUID() + "@ygsoft.com");
		SUser entity = (SUser) dataAccessService.saveEntity("suser", values);
		Assert.assertNotNull(entity);
		Assert.assertNotNull(entity.getUid());
		Assert.assertEquals("name-test", entity.getName());
		Assert.assertEquals(123, entity.getEmployeeNumber().longValue());
		dataAccessService.delOne("suser", entity.getUid());
	}

	@Test
	@Transactional
	public void stdTestTableForCrudTest() {
		Map<String, String[]> values = new HashMap<>();
		values.put("uid", new String[] { UUIDUtil.newUUID() });
		values.put("bigDecimalField", new String[] { "12312.10" });
		values.put("bigIntegerField", new String[] { "12312" });
		values.put("calendarFieldField", new String[] { "2014-01-11" });
		values.put("created", new String[] { "2014-01-11 00:00:00" });
		values.put("dateField", new String[] { "2014-01-11" });
		values.put("updated", new String[] { "2014-01-11 00:00:00" });
		values.put("sqlDateField", new String[] { "2014-01-11" });
		values.put("sqlTimeField", new String[] { "10:28:00" });
		values.put("sqlTimestampField", new String[] { "2014-01-11 10:28:12" });
		values.put("dataType", new String[] { "TEXT" });
		values.put("doubleField", new String[] { "21312.23" });
		values.put("floatField", new String[] { "21312.23" });
		values.put("integerField", new String[] { "21312" });
		values.put("longField", new String[] { "21312" });
		values.put("longText", new String[] { "longText" });
		values.put("name", new String[] { "name" });
		values.put("stringField", new String[] { "stringField" });
		values.put("smallText", new String[] { "smallText" });

		StdTestTable entity = EntityUtil.buildNewEntityForRequest("StdTestTable", null, values);

		// values.put("tenant", new String[]{"tenant"});
		// values.put("updatedBy", new String[]{"updatedBy"});
		// values.put("createdBy", new String[]{"createdBy"});

		entity = dataAccessService.saveEntity(entity);
		Assert.assertNotNull(entity.getUid());

		entity = dataAccessService.findOne("StdTestTable", entity.getUid());
		Assert.assertEquals(new BigDecimal(values.get("bigDecimalField")[0]), entity.getBigDecimalField());
		Assert.assertEquals(new BigInteger(values.get("bigIntegerField")[0]), entity.getBigIntegerField());
		// Assert.assertEquals(values.get("calendarFieldField")[0],
		// DateUtil.dateToStr(entity.getCalendarFieldField()));
		Assert.assertEquals(values.get("created")[0], DateUtil.datetimeToStr(entity.getCreated()));
		Assert.assertEquals(values.get("dateField")[0], DateUtil.dateToStr(entity.getDateField()));
		Assert.assertEquals(values.get("updated")[0], DateUtil.datetimeToStr(entity.getUpdated()));
		Assert.assertEquals(values.get("sqlDateField")[0], DateUtil.dateToStr(entity.getSqlDateField()));
		Assert.assertEquals(values.get("sqlTimeField")[0], DateUtil.timeToStr(entity.getSqlTimeField()));
		Assert.assertEquals(values.get("sqlTimestampField")[0], DateUtil.datetimeToStr(entity.getSqlTimestampField()));
		Assert.assertEquals(values.get("dataType")[0], entity.getDataType().name());
		Assert.assertEquals(new Double(values.get("doubleField")[0]), entity.getDoubleField());
		Assert.assertEquals(new Float(values.get("floatField")[0]), entity.getFloatField());
		Assert.assertEquals(new Integer(values.get("integerField")[0]), entity.getIntegerField());
		Assert.assertEquals(new Long(values.get("longField")[0]), entity.getLongField());
		Assert.assertEquals(values.get("longText")[0], entity.getLongText());
		Assert.assertEquals(values.get("name")[0], entity.getName());
		Assert.assertEquals(values.get("stringField")[0], entity.getStringField());
		Assert.assertEquals(values.get("smallText")[0], entity.getSmallText());

		// Assert.assertEquals(values.get("createdBy")[0],
		// entity.getCreatedBy());
		// Assert.assertEquals(values.get("tenant")[0], entity.getTenant());
		// Assert.assertEquals(values.get("updatedBy")[0],
		// entity.getUpdatedBy());
	}

	@Test
	public void findAllForPageable() {
		String tableName = "suser";
		Pageable pageable = new PageRequest(0, 5);
		Page<SUser> users = dataAccessService.findAll(tableName, pageable);
		Assert.assertNotNull(users);
	}

	//@Test
	@Transactional
	public void stdTestTableMasterDetail() {
		// 新增主记录
		Map<String, String[]> values = new HashMap<>();
		values.put("uid", new String[] { UUIDUtil.newUUID() });
		values.put("name", new String[] { "name1" });
		String tableName = "StdTestTable";
		StdTestTable entity = EntityUtil.buildNewEntityForRequest(tableName, values);
		entity = dataAccessService.saveEntity(entity);
		Assert.assertNotNull(entity.getUid());
		// 增加明细记录
		Map<String, String[]> values2 = new HashMap<>();
		values2.put("uid", new String[] { UUIDUtil.newUUID() });
		values2.put("name", new String[] { "detail-name1" });
		values2.put("stdTestTable", new String[] { entity.getUid() });
		String detailTableName = "StdTestTableSubA";
		StdTestTableSubA detailEntity = EntityUtil.buildNewSubEntityForRequest(
				AppUtil.getEntityMataDataService().getEntityMetaData("StdTestTable"), entity.getUid(), "details", values2);
		// EntityUtil.buildNewEntityForRequest(detailTableName, values2);
		detailEntity = dataAccessService.saveEntity(detailEntity);
		String detailUid = detailEntity.getUid();
		Assert.assertNotNull(detailUid);
		Assert.assertEquals(values2.get("name")[0], detailEntity.getName());
		Assert.assertEquals(values2.get("stdTestTable")[0], detailEntity.getStdTestTable().getUid());
		entity = dataAccessService.findOne(tableName, entity.getUid());
		Assert.assertNotNull(entity.getUid());
		// 再次修改主记录
		Map<String, String[]> values3 = new HashMap<>();
		values3.put("uid", new String[] { entity.getUid() });
		values3.put("name", new String[] { "name-updated" });
		entity = EntityUtil.buildNewEntityForRequest(tableName, values);
		dataAccessService.saveEntity(entity);
		entity = dataAccessService.findOne(tableName, entity.getUid());
		Assert.assertNotNull(entity.getUid());
		detailEntity = dataAccessService.findOne(detailTableName, detailUid);
		Assert.assertNotNull(detailEntity);
		Assert.assertNotNull(detailEntity.getStdTestTable().getUid());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void findAllForSpecificationIsNull() {
		String tableName = "stdtesttable";
		Pageable pageable = new PageRequest(0, 5);
		Page<StdTestTable> page = dataAccessService.findAll(tableName, (Specifications) null, pageable);
		Assert.assertNotNull(page);
		Assert.assertTrue(page.getContent().size() > 0);
	}

	@Test
	public void findAllForMapIsNull() {
		String tableName = "stdtesttable";
		Pageable pageable = new PageRequest(0, 5);
		Page<StdTestTable> page = dataAccessService.findAll(tableName, (Map<String, Object>) null, pageable);
		Assert.assertNotNull(page);
		Assert.assertTrue(page.getContent().size() > 0);
	}

	@Test
	public void findAllForMapIsActive() {
		String tableName = "stdtesttable";
		Pageable pageable = new PageRequest(0, 5);
		Map<String, Object> params = new HashMap<>();
		params.put("active", true);
		Page<StdTestTable> page = dataAccessService.findAll(tableName, params, pageable);
		Assert.assertNotNull(page);
		Assert.assertTrue(page.getContent().size() > 0);
	}
}
