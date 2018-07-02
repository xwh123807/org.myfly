package org.myfly.platform.core3.metadata.builder;

import org.junit.Test;
import org.myfly.platform.core3.model.data.PTable;

public class FlyDataModelBuilder2Test {
	@Test
	public void ptable() {
		FlyDataModelBuilder2 builder = new FlyDataModelBuilder2();
		builder.build(PTable.class);
	}
}
