package org.myfly.platform.core.metadata.define;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.testmodel.Detail;
import org.myfly.platform.core.testmodel.Master;
import org.myfly.platform.core.utils.JSONUtil;

public class MetaDataDefinitionTest {
	@Test
	public void masterMetaData() {
		MetaDataView view = Master.class.getAnnotation(MetaDataView.class);
		MetaDataDefinition define = new MetaDataDefinition(view);
		define.validate();
		Assert.assertNotNull(define.toString());
		Assert.assertEquals(2, define.getFormDefinitions().length);
		Assert.assertEquals(2, define.getListDefinitions().length);
		Assert.assertEquals(1, define.getOutlineDefinitions().length);

		String json = JSONUtil.toJSON(define);
		Assert.assertNotNull(json);
		System.out.println(json);
		MetaDataDefinition define2 = JSONUtil.fromJSON(json, MetaDataDefinition.class);
		Assert.assertNotNull(define2);
	}

	@Test
	public void detailMetaData() {
		MetaDataView view = Detail.class.getAnnotation(MetaDataView.class);
		MetaDataDefinition define = new MetaDataDefinition(view);
		define.validate();
		Assert.assertNotNull(define.toString());
		String json = JSONUtil.toJSON(define);
		Assert.assertNotNull(json);
		System.out.println(json);
		MetaDataDefinition define2 = JSONUtil.fromJSON(json, MetaDataDefinition.class);
		Assert.assertNotNull(define2);
	}
}
