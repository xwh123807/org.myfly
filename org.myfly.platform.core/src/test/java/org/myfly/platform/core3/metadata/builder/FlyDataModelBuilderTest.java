package org.myfly.platform.core3.metadata.builder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.utils.EntityClassUtil;
import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.core3.model.data.PTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class)
public class FlyDataModelBuilderTest {
	@Autowired
	private FlyDataModelBuilder builder;

	@Test
	public void ptable() {
		FlyDataModel dataModel = new FlyDataModel(builder.build(PTable.class.getName()));
		dataModel.printJson();
	}

	@Test
	public void allEntity() {
		EntityClassUtil.getEntityClasses("org.myfly.platform").forEach(item -> {
			FlyDataModel dataModel = new FlyDataModel(builder.build(item.getName()));
			dataModel.printJson();
		});
	}
}
