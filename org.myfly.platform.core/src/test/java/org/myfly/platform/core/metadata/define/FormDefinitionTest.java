package org.myfly.platform.core.metadata.define;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.metadata.annotation.FormView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.testmodel.Master;

public class FormDefinitionTest {
	@Test
	public void test() {
		MetaDataView view = Master.class.getAnnotation(MetaDataView.class);
		FormView formView = view.formViews()[0];
		FormDefinition define = new FormDefinition(formView);
		Assert.assertEquals("default", define.getName());
	}
}
