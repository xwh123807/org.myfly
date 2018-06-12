package org.myfly.platform.core.testmodel;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.JSONUtil;
import org.springframework.util.Base64Utils;

public class TestModelTest {
	@Test
	public void testModel() {
		TestModel model = new TestModel();
		model.buildTestModelEntities();
		model.assertEntityAllFields(model.getFlyTestEntity(), model.getFlyTestEntity());
		model.assertEntityAllFields(model.getFlyTestEntityWithActions(), model.getFlyTestEntityWithActions());
		model.assertEntityAllFields(model.getFlyChangedEntity(), model.getFlyChangedEntity());
		model.assertEntityAllFields(model.getFlyChangedEntityWithActions(), model.getFlyChangedEntityWithActions());
		// test clob
		Assert.assertEquals(Base64Utils.encodeToString(model.getTestEntity().getFile()),
				model.getFlyTestEntity().get("file"));
	}

	@Test
	public void json() {
		TestModel model = new TestModel();
		model.buildTestModelEntities();

		String jsonTestEntity = JSONUtil.toJSON(model.getTestEntity());
		System.out.println(jsonTestEntity);
		Master entity = JSONUtil.fromJSON(jsonTestEntity, Master.class);
	}

	@Test
	public void json2() {
		String json = "{\"name\":\"name\"}";
		Master entity = JSONUtil.fromJSON(json, Master.class);
		String json2 = "{\"name\":\"name\",\"name2\":\"name\"}";
		Master entity2 = null;
		try {
			entity2 = JSONUtil.fromJSON(json2, Master.class);
		} catch (Exception e) {
		}
		Assert.assertNull(entity2);
	}
}
