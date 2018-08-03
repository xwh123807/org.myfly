package org.myfly.platform.core.viewmodel;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.datamodel.define.FlyMemoryDataModel;
import org.myfly.platform.core.test.ServiceTestCase;
import org.myfly.platform.core.viewmodel.define.FlyMemoryViewModel;
import org.myfly.platform.core.viewmodel.service.IFlyViewModel;
import org.myfly.platform.core.viewmodel.service.IFlyViewModelService;
import org.springframework.beans.factory.annotation.Autowired;

public class FlyViewModelServiceTest extends ServiceTestCase{
	@Autowired
	private IFlyViewModelService service;

	@Test
	public void getFlyViewModel() {
		FlyMemoryViewModel.getInstance().getFlyViewModels().keySet().forEach(item -> {
			IFlyViewModel result = service.getFlyViewModel(item);
			Assert.assertNotNull(result);
		});
	}

	@Test
	public void getFlyViewModelFromDataModels() {
		FlyMemoryDataModel.getInstance().getFlyDataModels().keySet().forEach(item -> {
			IFlyViewModel result = service.getFlyViewModelFromBuildIn(item);
			Assert.assertNotNull(result);
		});
	}
}
