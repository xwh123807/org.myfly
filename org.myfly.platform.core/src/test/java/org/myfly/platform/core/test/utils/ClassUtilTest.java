package org.myfly.platform.core.test.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.system.domain.ITenant;
import org.myfly.platform.core.testdata.Detail;
import org.myfly.platform.core.testdata.Master;
import org.myfly.platform.core.utils.ClassUtil;
import org.myfly.platform.core.utils.DateUtil;

public class ClassUtilTest{

//	@Test
//	public void getClassAnnotationForStdTestTable(){
//		Table table = ClassUtil.getClassAnnotation(SUser.class, Table.class);
//		Assert.assertNotNull(table);
//		Assert.assertEquals("PB", table.schema());
//	}
//	
//	@Test
//	public void getFieldsAnnotationsForStdTestTable(){
//		Map<String, Column> columns = ClassUtil.getFieldsAnnotations(SUser.class, Column.class);
//		for (Entry<String, Column> item : columns.entrySet()){
//			System.out.println(item.getKey());
//		}
//		Assert.assertNotNull(columns);
//	}
	
	@Test
	public void getClassShortName(){
		String name = ClassUtil.getClassShortName(ClassUtilTest.class.getName());
		Assert.assertEquals("ClassUtilTest", name);
		Assert.assertEquals("ClassUtilTest", "ClassUtilTest");
	}
	
	@Test
	public void getClasses(){
		Set<Class<?>> list = ClassUtil.getClasses("org.myfly.platform.core.user.domain");
		Assert.assertTrue(list.size() > 0);
	}
	
	@Test
	public void convertValueToTypeForString(){
		String value = "hello";
		Class<?> type = value.getClass();
		Object result = ClassUtil.convert(value, type);
		Assert.assertEquals(value.getClass().getName(), result.getClass().getName());
	}
	
	@Test
	public void convertValueToTypeForStringAndEmpty(){
		String value = "";
		Class<?> type = value.getClass();
		Object result = ClassUtil.convert(value, type);
		Assert.assertEquals(value.getClass().getName(), result.getClass().getName());
	}
	
	@Test
	public void convertValueToTypeForStringAndNull(){
		String value = null;
		Class<?> type = String.class;
		Object result = ClassUtil.convert(value, type);
		Assert.assertNull(result);
	}
	
	@Test
	public void convertValueToTypeForLong(){
		String value = "121";
		Class<?> type = Long.class;
		Object result = ClassUtil.convert(value, type);
		Assert.assertEquals(Long.class.getName(), result.getClass().getName());
	}
	
	@Test
	public void convertValueToTypeForLongAndEmpty(){
		String value = "";
		Class<?> type = Long.class;
		Object result = ClassUtil.convert(value, type);
		Assert.assertNull(result);
	}
	
	@Test
	public void convertValueToTypeForInterger(){
		String value = "121";
		Class<?> type = Integer.class;
		Object result = ClassUtil.convert(value, type);
		Assert.assertTrue(result instanceof Integer);
	}
	
	@Test
	public void convertValueToTypeForIntegerAndEmpty(){
		String value = "";
		Class<?> type = Integer.class;
		Object result = ClassUtil.convert(value, type);
		Assert.assertNull(result);
	}
	
	@Test
	public void convertValueToTypeForDate(){
		String value = "2014-12-11";
		Class<?> type = Date.class;
		Object result = ClassUtil.convert(value, type);
		Assert.assertEquals(value, DateUtil.dateToStr((Date) result));
	}
	
	@Test
	public void convertValueToTypeForDateAndError(){
		String value = "121";
		Class<?> type = Date.class;
		Object result = ClassUtil.convert(value, type);
		Assert.assertNull(result);
	}
	
	@Test
	public void convertValueToTypeForDateAndEmpty(){
		String value = "";
		Class<?> type = Date.class;
		Object result = ClassUtil.convert(value, type);
		Assert.assertNull(result);
	}
	
	@Test
	public void convertValueForEnumToString(){
		FieldDataType dataType = FieldDataType.SYSENUM;
		String value = ClassUtil.convertValueToString(dataType);
		Assert.assertEquals("SYSENUM", value);
	}
	
	@Test
	public void convertValueForStringToEnum(){
		String value = "SYSENUM";
		FieldDataType value2 = ClassUtil.convert(value, FieldDataType.class);
		Assert.assertEquals(FieldDataType.SYSENUM, value2);
	}
	
	@Test
	public void convertValueCalendarToString(){
		Calendar now = DateUtil.now();
		String value = ClassUtil.convertValueToString(now);
		Assert.assertEquals(DateUtil.dateToStr(now), value);
	}
	
	@Test
	public void convertValueGregorianCalendarToString(){
		GregorianCalendar now = (GregorianCalendar) GregorianCalendar.getInstance();
		String value = ClassUtil.convertValueToString(now);
		Assert.assertEquals(DateUtil.dateToStr(now), value);
	}
	
	@Test
	public void getFieldType() throws Exception {
		Class<?> cls = ClassUtil.getFieldType(Master.class.getDeclaredField("details"));
		Assert.assertEquals(Detail.class, cls);
		cls = ClassUtil.getFieldType(Master.class.getSuperclass().getDeclaredField("name"));
		Assert.assertEquals(String.class, cls);
		cls = ClassUtil.getFieldType(Master.class.getSuperclass().getDeclaredField("tenant"));
		Assert.assertEquals(ITenant.class, cls);
	}
}
