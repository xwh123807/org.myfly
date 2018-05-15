package org.myfly.platform.core.test.utils;

import org.junit.Test;
import org.myfly.platform.core.utils.AssertUtil;

public class AssertUtilsTest {
	@Test(expected=IllegalArgumentException.class)
	public void parameterEmptyForEmptyString(){
		AssertUtil.parameterEmpty("", "uid");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void parameterEmptyForNull(){
		AssertUtil.parameterEmpty(null, "uid");
	}
	
	public void parameterEmptyForString(){
		AssertUtil.parameterEmpty("sdfsdf", "uid");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void recordNotFoundForNullEntity(){
		AssertUtil.recordNotFound(null, "test_table", "uid", "1");
	}
	
	@Test
	public void recordNotFoundForNotNullEntity(){
		AssertUtil.recordNotFound(new Object(), "test_table", "uid", "1");
	}
}
