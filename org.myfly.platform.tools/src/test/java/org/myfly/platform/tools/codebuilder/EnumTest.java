package org.myfly.platform.tools.codebuilder;

import java.net.URL;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.JaxbUtil;
import org.springframework.util.StreamUtils;

public class EnumTest {
	@Test
	public void userDir() {
		String userDir = System.getProperty("user.dir");
		Assert.assertNotNull(userDir);
	}

	@Test
	public void classPath() {
		String pkg = "org.myfly.platform.core3.domain";
		String path = StringUtils.join(pkg.split("\\."), "/");
		Assert.assertEquals("org/myfly/platform/core3/domain", path);
		Assert.assertEquals(pkg.replaceAll("\\.", "/"), path);
	}

	@Test
	public void strReplact() {
		String str = "dfsd(def)sdfsd/sds";
		String result = str.replaceAll("\\(", "_").replaceAll("\\)", "_").replaceAll("/", "_");
		Assert.assertEquals("dfsd_def_sdfsd_sds", result);
	}

	@Test
	public void loadRes() throws Exception{
		URL url = EnumTest.class.getResource("/AD_Element_Trl_zh_CN.xml");
		byte[] bytes = StreamUtils.copyToByteArray(url.openStream());
		ADEmpiereTrl trl = JaxbUtil.fromXml(new String(bytes), ADEmpiereTrl.class);
		Assert.assertNotNull(trl);
		String xml = JaxbUtil.toXml(trl);
		System.out.println(xml);
	}

	@Test
	public void loadRes2() {
		URL url = EnumTest.class.getResource("/AD_Element_Trl_zh_CN.xml");
		ADEmpiereTrl trl = JaxbUtil.fromXml(url, ADEmpiereTrl.class);
		Assert.assertNotNull(trl);
	}
}
