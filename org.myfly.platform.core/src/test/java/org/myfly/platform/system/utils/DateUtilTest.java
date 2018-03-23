package org.myfly.platform.system.utils;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.DateUtil;

public class DateUtilTest {
	@Test
	public void datestrToDate(){
		String datestr = "2014-08-01";
		Date date = DateUtil.dateStrToDate(datestr);
		Assert.assertEquals(datestr, DateUtil.dateToStr(date));
	}
	
	@Test
	public void datestrToDateForError(){
		String datestr = "2014/08/01";
		Date date = DateUtil.dateStrToDate(datestr);
		Assert.assertNull(date);
	}
	
	@Test
	public void datetimestrToDate(){
		String datestr = "2014-08-01 12:13:18";
		Date date = DateUtil.datetimeStrToDate(datestr);
		Assert.assertEquals(datestr, DateUtil.datetimeToStr(date));
	}
	
	@Test
	public void datetimestrToDateForError(){
		String datestr = "2014-08/01 12:13:18";
		Date date = DateUtil.datetimeStrToDate(datestr);
		Assert.assertNull(date);
	}
	
	@Test
	public void nowTimestamp(){
		Assert.assertNotNull(DateUtil.nowSqlTimestamp());
	}
	
	@Test
	public void parseCalendar(){
		Calendar value = DateUtil.parseCalendar("2015-08-01", Calendar.class);
		Assert.assertEquals("2015-08-01", DateUtil.dateToStr(value));
	}
	
	@Test
	public void dateStrToCalendar(){
		String dateStr = "2015-08-01";
		Calendar value = DateUtil.dateStrToCalendar(dateStr);
		Assert.assertEquals("2015-08-01", DateUtil.dateToStr(value));
	}
	
	@Test
	public void timeStrToSqlTime(){
		Time time = DateUtil.timeStrToSqlTime("1231wdw");
		Assert.assertNull(time);
	}
}
