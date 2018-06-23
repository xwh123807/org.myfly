package org.myfly.platform.core3.flydata.application;

import org.junit.Test;
import org.myfly.platform.core.utils.UUIDUtil;

public class Core3SystemDataTest {
	@Test
	public void genUid() {
		for (int i = 0; i < 10; i++) {
			System.out.println(UUIDUtil.newUUID());
		}
	}
}
