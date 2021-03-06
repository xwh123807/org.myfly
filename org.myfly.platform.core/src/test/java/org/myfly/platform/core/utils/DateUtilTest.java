package org.myfly.platform.core.utils;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.DateUtil;

public class DateUtilTest {
	@Test
	public void datestrToDate() {
		String datestr = "2014-08-01";
		Date date = DateUtil.dateStrToDate(datestr);
		Assert.assertEquals(datestr, DateUtil.dateToStr(date));
	}

	@Test
	public void datestrToSqlDate() {
		String datestr = "2014-08-01";
		Date date = DateUtil.dateStrToSqlDate(datestr);
		Assert.assertEquals(datestr, DateUtil.dateToStr(date));
	}

	@Test(expected = IllegalArgumentException.class)
	public void datestrToDateForError() {
		String datestr = "2014/08/01";
		Date date = DateUtil.dateStrToDate(datestr);
	}

	@Test
	public void dateStrToCalendar() {
		String dateStr = "2015-08-01";
		Calendar value = DateUtil.dateStrToCalendar(dateStr);
		Assert.assertEquals("2015-08-01", DateUtil.dateToStr(value));
	}

	@Test
	public void datetimestrToDate() {
		String datestr = "2014-08-01 12:13:18";
		Date date = DateUtil.datetimeStrToDate(datestr);
		Assert.assertEquals(datestr, DateUtil.datetimeToStr(date));
	}

	@Test
	public void datetimestrToDateForError() {
		String datestr = "2014-08/01 12:13:18";
		Date date = DateUtil.datetimeStrToDate(datestr);
		Assert.assertNull(date);
	}

	@Test
	public void parseCalendar() {
		Calendar value = DateUtil.parseCalendar("2015-08-01", Calendar.class);
		Assert.assertEquals("2015-08-01", DateUtil.dateToStr(value));
	}

	@Test
	public void timeStrToSqlTime() {
		Time time = DateUtil.timeStrToSqlTime("1231wdw");
		Assert.assertNull(time);
	}

	@Test
	public void datetimeToStr() {
		String dateStr = DateUtil.datetimeToStr(DateUtil.now());
		Assert.assertNotNull(dateStr);
	}

	@Test
	public void now() {
		Assert.assertNotNull(DateUtil.now());
	}

	@Test
	public void nowDate() {
		Assert.assertNotNull(DateUtil.nowDate());
	}

	@Test
	public void nowSqlTime() {
		Assert.assertNotNull(DateUtil.nowSqlTime());
	}

	@Test
	public void nowSqlDate() {
		Assert.assertNotNull(DateUtil.nowSqlDate());
	}

	@Test
	public void nowSqlTimestamp() {
		Assert.assertNotNull(DateUtil.nowSqlTimestamp());
	}

	@Test
	public void toTimestamp() {
		String datetimestr = "2018-08-13T08:04:18.000+0000";
		try {
			Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parse(datetimestr);
			Assert.assertNotNull(date);
			Assert.assertEquals("2018-08-13 16:04:18", DateUtil.datetimeToStr(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void toTimestamp2() {
		String datetimestr = "2018-08-13T08:04:18.000+0000";
		Date date = DateUtil.datetimeStrToDate(datetimestr);
		Assert.assertNotNull(date);
		Assert.assertEquals("2018-08-13 16:04:18", DateUtil.datetimeToStr(date));
	}
}
