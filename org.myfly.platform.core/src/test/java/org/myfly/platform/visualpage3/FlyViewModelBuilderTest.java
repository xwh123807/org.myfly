package org.myfly.platform.visualpage3;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core3.metadata.define.FlyMemoryDataModel;
import org.myfly.platform.visualpage3.application.MyFlyViewModel_zh_CN;
import org.myfly.platform.visualpage3.define.FlyViewModel;
import org.myfly.platform.visualpage3.define.FlyViewModelBuilder;
import org.myfly.platform.visualpage3.service.IFlyViewModel;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class FlyViewModelBuilderTest {
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
