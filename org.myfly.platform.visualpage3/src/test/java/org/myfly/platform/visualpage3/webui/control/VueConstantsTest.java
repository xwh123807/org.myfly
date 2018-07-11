package org.myfly.platform.visualpage3.webui.control;

import java.text.MessageFormat;

import org.junit.Assert;
import org.junit.Test;

public class VueConstantsTest {
	@Test
	public void format() {
		String result = MessageFormat.format(VueConstants.DATE_EDIT_HTML, "日期", "obj.date");
		Assert.assertEquals(
				"<el-date-picker type=\"date\" placeholder=\"日期\" v-model=\"obj.date\" style=\"width: 100%;\"></el-date-picker>",
				result);
	}
}
