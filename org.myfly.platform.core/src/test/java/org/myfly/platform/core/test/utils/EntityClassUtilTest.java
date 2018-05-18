package org.myfly.platform.core.test.utils;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.testdata.Master;
import org.myfly.platform.core.utils.EntityClassUtil;
import org.myfly.platform.core.utils.EntityClassUtil.FieldInfo;

public class EntityClassUtilTest {
	@Test
	public void allFields() {
		Map<String, FieldInfo> fieldInfos = EntityClassUtil.getEntityFieldInfo(Master.class);
		FieldInfo field = fieldInfos.get("name");
		Assert.assertNotNull(field);
		Assert.assertEquals("getName", field.getGetter().getName());
		Assert.assertEquals("setName", field.getSetter().getName());
		
		field = fieldInfos.get("uid");
		Assert.assertNotNull(field);
		Assert.assertEquals("getUid", field.getGetter().getName());
		Assert.assertEquals("setUid", field.getSetter().getName());
		
		field = fieldInfos.get("tenant");
		Assert.assertNotNull(field);
		Assert.assertEquals("getTenant", field.getGetter().getName());
		Assert.assertEquals("setTenant", field.getSetter().getName());
		
		field = fieldInfos.get("active");
		Assert.assertNotNull(field);
		Assert.assertEquals("isActive", field.getGetter().getName());
		Assert.assertEquals("setActive", field.getSetter().getName());
	}
}
