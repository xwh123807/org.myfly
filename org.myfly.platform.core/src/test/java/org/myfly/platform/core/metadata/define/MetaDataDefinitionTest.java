package org.myfly.platform.core.metadata.define;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.testdata.Master;

public class MetaDataDefinitionTest {
	@Test
	public void masterMetaData() {
		MetaDataView view = Master.class.getAnnotation(MetaDataView.class);
		MetaDataDefinition define = new MetaDataDefinition(view);
		Assert.assertEquals(2, define.getFormDefinitions().length);
		Assert.assertEquals(2, define.getListDefinitions().length);
		Assert.assertEquals(1, define.getOutlineDefinitions().length);
	}
}
