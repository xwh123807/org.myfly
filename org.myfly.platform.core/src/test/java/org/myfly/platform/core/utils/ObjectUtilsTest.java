package org.myfly.platform.core.utils;

import org.apache.commons.lang3.ObjectUtils;
import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core3.model.test.PTMaster;

public class ObjectUtilsTest {
	@Test
	public void objectClone() {
		PTMaster master = new PTMaster();
		master.setName("a");
		PTMaster master2 = ObjectUtils.clone(master);
		master2.setName("b");
		Assert.assertEquals(master.getName(), master2.getName());
	}
}
