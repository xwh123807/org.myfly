package org.myfly.platform.visualpage3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core3.metadata.define.FlyMemoryDataModel;
import org.myfly.platform.visualpage3.define.FlyMemoryViewModel;
import org.myfly.platform.visualpage3.service.IFlyViewModel;
import org.myfly.platform.visualpage3.service.IFlyViewModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class FlyViewModelServiceTest {
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
