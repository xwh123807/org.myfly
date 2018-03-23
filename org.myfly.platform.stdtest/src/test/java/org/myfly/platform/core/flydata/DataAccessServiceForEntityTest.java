package org.myfly.platform.core.flydata;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.flydata.internal.EntityUtil;
import org.myfly.platform.core.user.domain.SUser;
import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.system.stdtest.domain.StdTestTable;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes = CoreApplication.class)
public class DataAccessServiceForEntityTest extends ServiceTestCase {

	@Test
	public void buildEntityForSUser() {
		Map<String, String[]> values = new HashMap<>();
		values.put("name", new String[] { "name-test" });
		values.put("employeeNumber", new String[] { "123" });
		SUser entity = EntityUtil.buildNewEntityForRequest("suser", values);
		Assert.assertNotNull(entity);
		Assert.assertEquals("name-test", entity.getName());
		Assert.assertEquals(123, entity.getEmployeeNumber().longValue());
		Assert.assertNull(entity.getUid());
	}

	@Test
	public void buildEntityForStdTestTable() throws Exception {
		Map<String, String[]> values = new HashMap<>();
		values.put("bigDecimalField", new String[] { "12312.1" });
		values.put("bigIntegerField", new String[] { "12312" });
		values.put("calendarFieldField", new String[] { "2014-01-11" });
		values.put("created", new String[] { "2014-01-11 10:28:12" });
		values.put("dateField", new String[] { "2014-01-11" });
		values.put("updated", new String[] { "2014-01-11 10:28:12" });
		values.put("sqlDateField", new String[] { "2014-01-11" });
		values.put("sqlTimeField", new String[] { "10:28:00" });
		values.put("sqlTimestampField", new String[] { "2014-01-11 10:28:12" });
		values.put("dataType", new String[] { FieldDataType.TEXT.name() });
		values.put("doubleField", new String[] { "21312.23" });
		values.put("floatField", new String[] { "21312.23" });
		values.put("integerField", new String[] { "21312" });
		values.put("longField", new String[] { "21312" });
		values.put("longText", new String[] { "longText" });
		values.put("name", new String[] { "name" });
		values.put("stringField", new String[] { "stringField" });
		values.put("smallText", new String[] { "smallText" });

		values.put("tenant", new String[] { UUIDUtil.newUUID() });
		values.put("updatedBy", new String[] { UUIDUtil.newUUID() });
		values.put("createdBy", new String[] { UUIDUtil.newUUID() });

		StdTestTable entity = EntityUtil.buildNewEntityForRequest("stdtesttable", values);

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

		Assert.assertEquals(values.get("createdBy")[0], entity.getCreatedBy().getUid());
		Assert.assertEquals(values.get("tenant")[0], entity.getTenant().getUid());
		Assert.assertEquals(values.get("updatedBy")[0], entity.getUpdatedBy().getUid());
	}

	@Test
	public void buildEntityForStdTestTableForCreadedByIsNull() throws Exception {
		Map<String, String[]> values = new HashMap<>();
		values.put("createdBy", new String[] {});
		StdTestTable entity = EntityUtil.buildNewEntityForRequest("stdtesttable", values);
		Assert.assertNull(entity.getCreatedBy());
	}

	@Test
	public void buildEntityForStdTestTableForCreadedByIsEmpty() throws Exception {
		Map<String, String[]> values = new HashMap<>();
		values.put("createdBy", new String[] { "" });
		StdTestTable entity = EntityUtil.buildNewEntityForRequest("stdtesttable", values);
		Assert.assertNull(entity.getCreatedBy());
	}

	@Test
	public void buildEntityForStdTestTableForActiveIsEmpty() throws Exception {
		Map<String, String[]> values = new HashMap<>();
		values.put("active", new String[] { "" });
		StdTestTable entity = EntityUtil.buildNewEntityForRequest("stdtesttable", values);
		Assert.assertTrue(entity.isActive());
	}

	@Test
	public void buildEntityForStdTestTableForActiveIsTrue() throws Exception {
		Map<String, String[]> values = new HashMap<>();
		values.put("active", new String[] { "true" });
		StdTestTable entity = EntityUtil.buildNewEntityForRequest("stdtesttable", values);
		Assert.assertTrue(entity.isActive());
	}

	@Test
	public void buildEntityForStdTestTableForActiveIsTrue2() throws Exception {
		Map<String, String[]> values = new HashMap<>();
		values.put("active", new String[] { "TRUE" });
		StdTestTable entity = EntityUtil.buildNewEntityForRequest("stdtesttable", values);
		Assert.assertTrue(entity.isActive());
	}

	@Test(expected = IllegalArgumentException.class)
	public void buildEntityForStdTestTableForCreated() throws Exception {
		Map<String, String[]> values = new HashMap<>();
		values.put("created", new String[] { "12/10/2015 7:03 PM" });
		StdTestTable entity = EntityUtil.buildNewEntityForRequest("stdtesttable", values);
		Assert.assertNotNull(entity.getCreated());
	}

}
