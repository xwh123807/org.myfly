package org.myfly.platform.core.process;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.process.define.FlyProcessModel;
import org.myfly.platform.core.process.define.FlyProcessModelBuilder;
import org.myfly.platform.core.process.internal.ChangePassword;
import org.myfly.platform.core.test.ServiceTestCase;

public class ProcessModelBuilderTest extends ServiceTestCase{
	@Test
	public void load() {
		FlyProcessModelBuilder builder = new FlyProcessModelBuilder();
		List<FlyProcessModel> list = builder.loadFromProcessClass(ChangePassword.class);
		Assert.assertEquals(1, list.size());
		list.get(0).printJson();
	}
}
