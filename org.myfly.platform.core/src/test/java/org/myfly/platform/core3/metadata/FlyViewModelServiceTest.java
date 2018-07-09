package org.myfly.platform.core3.metadata;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core3.metadata.service.IFlyDataModelService;
import org.myfly.platform.visualpage3.service.IFlyViewModel;
import org.myfly.platform.visualpage3.service.IFlyViewModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class)
public class FlyViewModelServiceTest {
	@Autowired
	private IFlyDataModelService dataModelService;
	@Autowired
	private IFlyViewModelService viewModelService;

	@Test
	public void allViewModelForBuildIn() {
		dataModelService.getAllEntityClasses().forEach(entityClass -> {
			String entityName = entityClass.getName();
			IFlyViewModel viewModel = viewModelService.getFlyViewModelFromBuildIn(entityName);
			Assert.assertNotNull(viewModel);
		});
	}
}
