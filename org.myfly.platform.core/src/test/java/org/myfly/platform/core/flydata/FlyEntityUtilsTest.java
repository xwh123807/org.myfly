package org.myfly.platform.core.flydata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.myfly.platform.core.datamodel.define.FlyDataModel;
import org.myfly.platform.core.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core.flydata.service.FlyEntityMap;
import org.myfly.platform.core.model.test.PTMaster;
import org.myfly.platform.core.test.ServiceTestCase;
import org.myfly.platform.core.testmodel.AssertEntity;
import org.myfly.platform.core.testmodel.TestModel;
import org.myfly.platform.core.utils.AppUtil;

public class FlyEntityUtilsTest extends ServiceTestCase {
	private TestModel model;

	@Before
	public void before() {
		model = new TestModel();
	}

	private FlyDataModel getPMasterDataModel() {
		return AppUtil.getFlyDataModel(PTMaster.class.getName());
	}

	@Test
	public void toEntity() {
		PTMaster master = (PTMaster) FlyEntityUtils.toEntity(AppUtil.getFlyDataModel(PTMaster.class.getName()),
				model.getFlyTestEntity());
		Assert.assertNotNull(master);
		FlyEntityMap flyEntity = FlyEntityUtils.fromEntity(master);
		Assert.assertNotNull(flyEntity);
		AssertEntity.assertFlyEntityAllFields(model.getFlyTestEntity(), flyEntity);
	}

	@Test
	public void fromEntity() {
		FlyEntityMap flyEntity = FlyEntityUtils.fromEntity(model.getTestEntity());
		Assert.assertNotNull(flyEntity);
	}

	@Test
	public void formEntityWithParams() {
		FlyEntityMap flyEntity = FlyEntityUtils.fromEntity(getPMasterDataModel(), model.getTestEntity(), true, null);
		Assert.assertNotNull(flyEntity);
		Assert.assertNotNull(flyEntity.get("details"));
		flyEntity = FlyEntityUtils.fromEntity(getPMasterDataModel(), model.getTestEntity(), false, null);
		Assert.assertNotNull(flyEntity);
		Assert.assertNull(flyEntity.get("details"));
		flyEntity = FlyEntityUtils.fromEntity(getPMasterDataModel(), model.getTestEntity(), true, new String[] {});
		Assert.assertNotNull(flyEntity);
		Assert.assertNull(flyEntity.get("details"));
		flyEntity = FlyEntityUtils.fromEntity(getPMasterDataModel(), model.getTestEntity(), true,
				new String[] { "details" });
		Assert.assertNotNull(flyEntity);
		Assert.assertNotNull(flyEntity.get("details"));
		flyEntity = FlyEntityUtils.fromEntity(getPMasterDataModel(), model.getTestEntity(), true,
				new String[] { "detailsa" });
		Assert.assertNotNull(flyEntity);
		Assert.assertNull(flyEntity.get("details"));
	}
}
