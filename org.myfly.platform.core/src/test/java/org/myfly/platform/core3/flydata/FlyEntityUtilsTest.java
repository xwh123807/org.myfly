package org.myfly.platform.core3.flydata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core3.datamodel.define.FlyDataModel;
import org.myfly.platform.core3.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core3.flydata.service.FlyEntityMap;
import org.myfly.platform.core3.model.test.PTMaster;
import org.myfly.platform.core3.testmodel.AssertEntity;
import org.myfly.platform.core3.testmodel.TestModel;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class FlyEntityUtilsTest {
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
		Assert.assertNotNull(flyEntity.get("details"));
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
