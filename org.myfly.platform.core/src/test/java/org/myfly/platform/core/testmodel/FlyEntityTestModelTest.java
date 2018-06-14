package org.myfly.platform.core.testmodel;

import java.util.Collection;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.myfly.platform.core.flydata.service.FlyEntityResult;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.UUIDUtil;

public class FlyEntityTestModelTest {
	private FlyEntityTestModel model;
	
	@Before
	public void before() {
		model = new FlyEntityTestModel();
	}
	
	@Test
	public void flyEntityJsonConvert() {
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
		Detail subDetail = master1.getDetails().toArray(new Detail[] {})[0];
		Assert.assertNotNull(subDetail);
		Assert.assertEquals(Detail.class, subDetail.getClass());
		Assert.assertNotNull(subDetail.getMaster());
		Assert.assertEquals(master1.getUid(), subDetail.getMaster().getUid());
		Assert.assertEquals(master1, subDetail.getMaster());
		
		FlyEntityResult result2 = FlyEntityResult.fromEntity(metaData, master1);
		Assert.assertNotNull(result2);
		String json2 = result.toJson();
		Assert.assertNotNull(json2);
		System.out.println(json2);
		
		model.assertFlyEntityAllFields(result, result2);
		
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
	
	@Test
	public void entitySample() {
		FlyEntityTestModel model = new FlyEntityTestModel();
		Assert.assertEquals(model.getTestEntity(), model.getTestEntity());
	}
	
	@Test
	public void detail1() {
		FlyEntityResult entitya = model.getFlyTestEntity();
		FlyEntityResult entityb = (FlyEntityResult) entitya.clone();
		Map detail1 = (Map) entityb.get("detail1");
		detail1.put("title", "test");
		model.assertFlyEntityAllFields(entitya, entityb);
	}
	
	@Test
	public void details() {
		FlyEntityResult entitya = model.getFlyTestEntity();
		FlyEntityResult entityb = new FlyEntityResult(entitya);
		Collection details = (Collection) entityb.get("details");
		FlyEntityResult detail = new FlyEntityResult();
		detail.put("uid", UUIDUtil.newUUID());
		details.add(detail);
		model.assertFlyEntityAllFields(entitya, entityb);
	}
}
