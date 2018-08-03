package org.myfly.platform.core.viewmodel;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.datamodel.define.FlyMemoryDataModel;
import org.myfly.platform.core.test.ServiceTestCase;
import org.myfly.platform.core.viewmodel.application.MyFlyViewModel_zh_CN;
import org.myfly.platform.core.viewmodel.define.FlyViewModel;
import org.myfly.platform.core.viewmodel.define.FlyViewModelBuilder;
import org.myfly.platform.core.viewmodel.service.IFlyViewModel;

public class FlyViewModelBuilderTest extends ServiceTestCase{
	@Test
	public void loadFromEnumClass() {
		FlyViewModelBuilder builder = new FlyViewModelBuilder();
		List<FlyViewModel> result = builder.loadFromEnumClass(MyFlyViewModel_zh_CN.class);
		Assert.assertNotNull(result);
		Assert.assertTrue(result.size() > 0);
		result.forEach(item -> {
			Assert.assertNotNull(item);
		});
	}

	@Test
	public void loadFromFlyDataModel() {
		FlyMemoryDataModel.getInstance().getFlyDataModels().values().forEach(item -> {
			FlyViewModelBuilder builder = new FlyViewModelBuilder();
			IFlyViewModel result = builder.loadFromFlyDataModel(item);
			Assert.assertNotNull(result);
		});
	}
}
