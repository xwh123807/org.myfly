package org.myfly.platform.core.testmodel;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.flydata.service.FlyEntityResult;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.utils.AppUtil;

public class FlyEntityTestModelTest {
	@Test
	public void base() {
		FlyEntityTestModel model = new FlyEntityTestModel();
		model.buildTestModelEntities();
		
		EntityMetaData metaData = AppUtil.getEntityMetaData(Master.class.getName());
		
		Master master = model.getTestEntity();
		FlyEntityResult result = FlyEntityResult.fromEntity(metaData, master);
		Assert.assertNotNull(result);
		String json = result.toJson();
		Assert.assertNotNull(json);
		System.out.println(json);
		
		Assert.assertEquals(FlyEntityResult.class, result.get("detail1").getClass());
		Assert.assertNotNull(result.get("details"));
	}
}
