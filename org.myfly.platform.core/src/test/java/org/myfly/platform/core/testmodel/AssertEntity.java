package org.myfly.platform.core.testmodel;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.junit.Assert;
import org.myfly.platform.core.utils.DateUtil;

public class AssertEntity {
	/**
	 * 断言两个Map是否相同
	 * @param expected
	 * @param actual
	 */
	@SuppressWarnings("unchecked")
	public static void assertFlyEntityAllFields(Map expected, Map actual) {
		expected.keySet().forEach(name -> {
			if (!expected.containsKey(name) && actual.get(name) == null) {
				// null -> not contain
				Assert.assertTrue(true);
			} else if (actual.get(name) instanceof Date && expected.get(name) instanceof Date) {
				// sql date -> sql date；因为尾数的差异
				Assert.assertEquals("属性[" + name + "]不一致.", DateUtil.sqldateToStr((Date)expected.get(name)),
						DateUtil.sqldateToStr((Date) actual.get(name)));
			} else if ((actual.get(name) instanceof Time && expected.get(name) instanceof Time)) {
				// sql time -> sql time；因为尾数的差异
				Assert.assertEquals("属性[" + name + "]不一致.", DateUtil.sqltimeToStr((Time) expected.get(name)),
						DateUtil.sqltimeToStr((Time) actual.get(name)));
			} else if (actual.get(name) instanceof Date && expected.get(name) instanceof String) {
				// string -> sql date
				Assert.assertEquals("属性[" + name + "]不一致.", expected.get(name),
						DateUtil.sqldateToStr((Date) actual.get(name)));
			} else if ((actual.get(name) instanceof Time && expected.get(name) instanceof String)) {
				// string -> sql time
				Assert.assertEquals("属性[" + name + "]不一致.", expected.get(name),
						DateUtil.sqltimeToStr((Time) actual.get(name)));
			} else if ((actual.get(name) instanceof Timestamp && expected.get(name) instanceof Long)) {
				// long -> timestamp
				Assert.assertEquals("属性[" + name + "]不一致.", expected.get(name),
						((Timestamp) actual.get(name)).getTime());
			} else if (actual.get(name) != null && actual.get(name).getClass().isEnum()
					&& expected.get(name) instanceof String) {
				// string -> enum
				Assert.assertEquals("属性[" + name + "]不一致.", expected.get(name), ((Enum) actual.get(name)).name());
			} else if (actual.get(name) instanceof Float && expected.get(name) instanceof Double) {
				// double -> float
				Assert.assertEquals("属性[" + name + "]不一致.", actual.get(name).toString(),
						((Float) (actual.get(name))).toString());
			} else if (actual.get(name) instanceof String && expected.get(name) instanceof Date) {
				// sql date -> string
				Assert.assertEquals("属性[" + name + "]不一致.", DateUtil.sqldateToStr((Date) expected.get(name)),
						actual.get(name));
			} else if (actual.get(name) instanceof Long && expected.get(name) instanceof Timestamp) {
				// timestamp -> long
				Assert.assertEquals("属性[" + name + "]不一致.", DateUtil.timestampToStr((Timestamp) expected.get(name)),
						DateUtil.timestampToStr(new Timestamp((long) actual.get(name))));
			} else if (actual.get(name) instanceof String && expected.get(name) instanceof Time) {
				// sql time -> string
				Assert.assertEquals("属性[" + name + "]不一致.", DateUtil.sqltimeToStr((Time) expected.get(name)),
						DateUtil.sqltimeToStr(DateUtil.timeStrToSqlTime((String) actual.get(name))));
			} else if (actual.get(name) instanceof String && expected.get(name) != null
					&& expected.get(name).getClass().isEnum()) {
				// enum -> string
				Assert.assertEquals("属性[" + name + "]不一致.", ((Enum) expected.get(name)).name(), actual.get(name));
			} else if (actual.get(name) instanceof Double && expected.get(name) instanceof Float) {
				// float -> double
				Assert.assertEquals("属性[" + name + "]不一致.", ((Float) (expected.get(name))).toString(),
						actual.get(name).toString());
			} else if (actual.get(name) instanceof Map) {
				// 关联
				assertFlyEntityAllFields((Map) expected.get(name), (Map) actual.get(name));
			} else if (actual.get(name) instanceof Collection && expected.get(name) instanceof Collection) {
				// 子表,集合属性
				Collection expectedItems = (Collection) expected.get(name);
				Collection actualItems = ((Collection) actual.get(name));
				Assert.assertEquals(expectedItems.size(), actualItems.size());
				Iterator expectedIt = expectedItems.iterator();
				Iterator actualIt = actualItems.iterator();
				while (actualIt.hasNext() && expectedIt.hasNext()) {
					assertFlyEntityAllFields((Map) expectedIt.next(), (Map) actualIt.next());
				}
			} else {
				Assert.assertEquals("属性[" + name + "]不一致.", expected.get(name), actual.get(name));
			}
		});
		// Assert.assertEquals(expected.size(), actual.size());
	}
}
