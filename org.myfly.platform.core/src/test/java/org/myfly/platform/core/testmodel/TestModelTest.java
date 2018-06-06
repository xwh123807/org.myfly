package org.myfly.platform.core.testmodel;

import org.junit.Assert;
import org.junit.Test;
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
}
