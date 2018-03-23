package org.org.myfly.apps.skymonitor.internal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.junit.Assert;
import org.junit.Test;

public class UtilsTest {
	@Test
	public void todate(){
		Date date = Utils.strToDate("05/Jun/2016:10:14:54 +0800");
		Assert.assertNotNull(date);
	}
	
	@Test
	public void toDate1() throws ParseException{
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2016-02-01 10:11:12");
		Assert.assertNotNull(date);
		date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse("2016/02/01 10:11:12");
		Assert.assertNotNull(date);
		date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse("02/01/2016 10:11:12");
		Assert.assertNotNull(date);
		date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss Z").parse("02/01/2016 10:11:12 +0800");
		Assert.assertNotNull(date);
		date = new SimpleDateFormat("dd/MM/yyyy:HH:mm:ss").parse("02/01/2016:10:11:12");
		Assert.assertNotNull(date);
		String str = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss", Locale.ENGLISH).format(Calendar.getInstance().getTime());
		System.out.println(str);
		date = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss", Locale.ENGLISH).parse("02/Jun/2016:10:11:12");
		Assert.assertNotNull(date);
	}
	
	@Test
	public void mod(){
	}
}
