package org.myfly.platform.core.test.utils;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.StringUtil;
import org.myfly.platform.test.ServiceTestCase;

public class StringUtilTest extends ServiceTestCase{
	@Test
	public void isEmptyForNull() {
		Assert.assertTrue(StringUtil.isEmpty(null));
	}

	@Test
	public void isEmptyForEmptyString() {
		Assert.assertTrue(StringUtil.isEmpty(""));
	}

	@Test
	public void isEmptyForString() {
		Assert.assertTrue(!StringUtil.isEmpty("a"));
	}

	@Test
	public void isNotEmptyForNull() {
		Assert.assertTrue(!StringUtil.isNotEmpty((String) null));
	}

	@Test
	public void isNotEmptyForEmptyString() {
		Assert.assertTrue(!StringUtil.isNotEmpty(""));
	}

	@Test
	public void isNotEmptyForString() {
		Assert.assertTrue(StringUtil.isNotEmpty("a"));
	}

	@Test
	public void match() {
		String url = "/assets/js/fs.js";
		Assert.assertTrue(StringUtil.matches(url, "/assets"));
	}

	@Test
	public void isNotEmptyArray() {
		Assert.assertTrue(!StringUtil.isNotEmpty(new String[] {}));
		Assert.assertTrue(!StringUtil.isNotEmpty(new String[] { null }));
		Assert.assertTrue(!StringUtil.isNotEmpty(new String[] { "" }));
		Assert.assertTrue(StringUtil.isNotEmpty(new String[] { "a" }));
	}

	@Test
	public void getHibernateName() {
		Assert.assertEquals("NAME", StringUtil.getHibernateName("name"));
		Assert.assertEquals("MY_NAME", StringUtil.getHibernateName("myName"));
		Assert.assertEquals("STD_TEST_TABLE", StringUtil.getHibernateName("StdTestTable"));
		Assert.assertEquals("SUSER", StringUtil.getHibernateName("SUser"));
		Assert.assertEquals("STDTEST_TABLE", StringUtil.getHibernateName("STDTestTable"));
		Assert.assertEquals("WHO_ID", StringUtil.getHibernateName("whoId"));
		Assert.assertEquals("INTERNAL_TABLE", StringUtil.getHibernateName("internalTable"));
	}

	@Test
	public void formatSql() {
		String sql = "select * from suser where userid=? and name=?";
		String fsql = StringUtil.formatSql(sql, new Object[] { 12, "xwh" });
		Assert.assertEquals("select * from suser where userid=12 and name='xwh'", fsql);
	}
}
