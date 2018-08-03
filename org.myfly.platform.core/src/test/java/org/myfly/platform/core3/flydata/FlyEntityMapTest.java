package org.myfly.platform.core3.flydata;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core3.flydata.service.FlyEntityMap;

public class FlyEntityMapTest {
	@Test
	public void booleanValue() {
		Map<String, Object> map = new HashMap<>();
		map.put("isActive", true);
		FlyEntityMap flyMap = new FlyEntityMap(map);
		Assert.assertTrue((boolean) flyMap.get("isActive"));
	}
}
