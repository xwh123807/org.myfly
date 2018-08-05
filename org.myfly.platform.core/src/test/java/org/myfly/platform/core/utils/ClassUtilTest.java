package org.myfly.platform.core.utils;

import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.process.annotation.FlyProcess;
import org.myfly.platform.core.process.annotation.FlyProcessParam;
import org.myfly.platform.core.process.internal.ChangePassword;
import org.springframework.core.convert.ConversionFailedException;

public class ClassUtilTest {
	@Test
	public void getClassShortName() {
		String name = ClassUtil.getClassShortName(ClassUtilTest.class.getName());
		Assert.assertEquals("ClassUtilTest", name);
		Assert.assertEquals("ClassUtilTest", "ClassUtilTest");
	}

	@Test
	public void getClasses() {
		Set<Class<?>> list = ClassUtil.getClasses("org.myfly.platform.core.test");
		Assert.assertTrue(list.size() > 0);
	}

	@Test
	public void convertValueToTypeForString() {
		String value = "hello";
		Class<?> type = value.getClass();
		Object result = ClassUtil.convert(value, type);
		Assert.assertEquals(value.getClass().getName(), result.getClass().getName());
	}

	@Test
	public void convertValueToTypeForStringAndEmpty() {
		String value = "";
		Class<?> type = value.getClass();
		Object result = ClassUtil.convert(value, type);
		Assert.assertEquals(value.getClass().getName(), result.getClass().getName());
	}

	@Test
	public void convertValueToTypeForStringAndNull() {
		String value = null;
		Class<?> type = String.class;
		Object result = ClassUtil.convert(value, type);
		Assert.assertNull(result);
	}

	@Test
	public void convertValueToTypeForLong() {
		String value = "121";
		Class<?> type = Long.class;
		Object result = ClassUtil.convert(value, type);
		Assert.assertEquals(Long.class.getName(), result.getClass().getName());
	}

	@Test
	public void convertValueToTypeForLongAndEmpty() {
		String value = "";
		Class<?> type = Long.class;
		Object result = ClassUtil.convert(value, type);
		Assert.assertNull(result);
	}

	@Test
	public void convertValueToTypeForInterger() {
		String value = "121";
		Class<?> type = Integer.class;
		Object result = ClassUtil.convert(value, type);
		Assert.assertTrue(result instanceof Integer);
	}

	@Test
	public void convertValueToTypeForIntegerAndEmpty() {
		String value = "";
		Class<?> type = Integer.class;
		Object result = ClassUtil.convert(value, type);
		Assert.assertNull(result);
	}

	@Test
	public void convertValueToTypeForDate() {
		String value = "2014-12-11";
		Class<?> type = Date.class;
		Object result = ClassUtil.convert(value, type);
		Assert.assertEquals(value, DateUtil.dateToStr((Date) result));
	}

	@Test(expected = ConversionFailedException.class)
	public void convertValueToTypeForDateAndError() {
		String value = "121";
		Class<?> type = Date.class;
		Object result = ClassUtil.convert(value, type);
		Assert.assertNull(result);
	}

	@Test
	public void convertValueToTypeForDateAndEmpty() {
		String value = "";
		Class<?> type = Date.class;
		Object result = ClassUtil.convert(value, type);
		Assert.assertNull(result);
	}

	@Test
	public void calendarToString() {
		Calendar now = DateUtil.now();
		String value = ClassUtil.convertValueToString(now);
		Assert.assertEquals(DateUtil.dateToStr(now), value);
	}

	@Test
	public void gregorianCalendarToString() {
		GregorianCalendar now = (GregorianCalendar) GregorianCalendar.getInstance();
		String value = ClassUtil.convertValueToString(now);
		Assert.assertEquals(DateUtil.dateToStr(now), value);
	}

	@Test
	public void dateToString() {
		Date now = DateUtil.nowDate();
		String value = ClassUtil.convertValueToString(now);
		Assert.assertEquals(DateUtil.dateToStr(now), value);
	}

	@Test
	public void longToTimestamp() {
		Date now = DateUtil.nowDate();
		Timestamp stamp = ClassUtil.convert(now.getTime(), Timestamp.class);
		Assert.assertEquals(DateUtil.datetimeToStr(now), DateUtil.timestampToStr(stamp));
	}

	@Test
	public void stringToBoolean() {
		Boolean value = ClassUtil.convert("true", Boolean.class);
		Assert.assertTrue(value);
		value = ClassUtil.convert("false", Boolean.class);
		Assert.assertTrue(!value);
		value = ClassUtil.convert("", Boolean.class);
		Assert.assertTrue(!value);
		value = ClassUtil.convert("1", Boolean.class);
		Assert.assertTrue(value);
		value = ClassUtil.convert("0", Boolean.class);
		Assert.assertFalse(value);
	}

	@Test
	public void stringToCalendar() {
		String val1 = DateUtil.dateToStr(DateUtil.now());
		Calendar value = ClassUtil.convert(val1, Calendar.class);
		Assert.assertEquals(val1, DateUtil.dateToStr(value));
	}

	@Test
	public void stringToDate() {
		String val1 = DateUtil.dateToStr(DateUtil.now());
		Date value = ClassUtil.convert(val1, Date.class);
		Assert.assertEquals(val1, DateUtil.dateToStr(value));
	}

	@Test
	public void stringToSqlDate() {
		String val1 = DateUtil.sqldateToStr(DateUtil.nowSqlDate());
		java.sql.Date value = ClassUtil.convert(val1, java.sql.Date.class);
		Assert.assertEquals(val1, DateUtil.dateToStr(value));
	}

	@Test
	public void stringToTimestampe() {
		String val1 = DateUtil.timestampToStr(DateUtil.nowSqlTimestamp());
		java.sql.Timestamp value = ClassUtil.convert(val1, java.sql.Timestamp.class);
		Assert.assertEquals(val1, DateUtil.timestampToStr(value));
	}

	@Test
	public void timestampToString() {
		Timestamp now = DateUtil.nowSqlTimestamp();
		String value = ClassUtil.convertValueToString(now);
		Assert.assertEquals(DateUtil.timestampToStr(now), value);
	}

	@Test
	public void getClassesByAnnotation() {
		List<Class<?>> list = ClassUtil.getClassesByAnnotation("org.myfly.platform.core", FlyProcess.class);
		Assert.assertTrue(list.size() > 0);
	}

	@Test
	public void getFieldsByAnnotation() {
		List<Field> list = ClassUtil.getFieldsByAnnotation(ChangePassword.class, FlyProcessParam.class);
		Assert.assertTrue(list.size() > 0);
	}
}
