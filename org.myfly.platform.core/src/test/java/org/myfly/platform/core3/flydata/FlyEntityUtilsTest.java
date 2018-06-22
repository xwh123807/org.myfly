package org.myfly.platform.core3.flydata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core3.flydata.service.FlyEntityMap;
import org.myfly.platform.core3.flydata.service.FlyEntityUtils;
import org.myfly.platform.core3.testmodel.PTMaster;
import org.myfly.platform.core3.testmodel.TestModel;

public class FlyEntityUtilsTest {
	private TestModel model;

	@Before
	public void before() {
		model = new TestModel();
	}

	@Test
	public void toEntity() {
		PTMaster master = (PTMaster) FlyEntityUtils.toEntity(AppUtil.getFlyDataModel(PTMaster.class.getName()),
				model.getFlyTestEntity());
		Assert.assertNotNull(master);
	}

	@Test
	public void fromEntity() {
		FlyEntityMap flyEntity = FlyEntityUtils.fromEntity(model.getTestEntity());
		Assert.assertNotNull(flyEntity);
	}
}
