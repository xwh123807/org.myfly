package org.myfly.platform.core.testmodel;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.flydata.service.FlyEntityResult;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.utils.AppUtil;

public class FlyEntityTestModelTest {
	@Test
	public void flyEntityJsonConvert() {
		FlyEntityTestModel model = new FlyEntityTestModel();
		
		EntityMetaData metaData = AppUtil.getEntityMetaData(Master.class.getName());
		
		Master master = model.getTestEntity();
		FlyEntityResult result = FlyEntityResult.fromEntity(metaData, master);
		Assert.assertNotNull(result);
		
		Assert.assertEquals(FlyEntityResult.class, result.get("detail1").getClass());
		Assert.assertNotNull(result.get("details"));
		
		String json = result.toJson();
		Assert.assertNotNull(json);
		System.out.println(json);
		
		Master master1 = FlyEntityResult.toEntity(metaData, json);
		Assert.assertNotNull(master1);
		Assert.assertEquals(Detail.class, master1.getDetail1().getClass());
		Assert.assertEquals(1, master1.getDetails().size());
		Assert.assertEquals(Detail.class, master1.getDetails().toArray(new Detail[] {})[0].getClass());
		
		FlyEntityResult result2 = FlyEntityResult.fromEntity(metaData, master1);
		Assert.assertNotNull(result2);
		String json2 = result.toJson();
		Assert.assertNotNull(json2);
		System.out.println(json2);
		
		model.assertEntityAllFields(result, result2);
		
		Master master3 = model.getChangedEntity();
		Assert.assertNotNull(master3);
		FlyEntityResult result3 = model.getFlyChangedEntity();
		Assert.assertNotNull(result3);
		result3.printJson();
		Assert.assertTrue(result3.containsKey("detail1"));
		Assert.assertTrue(result3.containsKey("details"));
		Assert.assertNull(result3.get("detail1"));
		Assert.assertNull(result3.get("details"));
	}
}
