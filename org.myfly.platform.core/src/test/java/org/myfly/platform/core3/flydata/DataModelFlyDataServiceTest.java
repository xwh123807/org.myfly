package org.myfly.platform.core3.flydata;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core3.flydata.service.FlyEntityMap;
import org.myfly.platform.core3.flydata.service.IFlyDataService;
import org.myfly.platform.core3.metadata.service.IFlyDataModelService;
import org.myfly.platform.core3.model.data.PTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class)
public class DataModelFlyDataServiceTest {
	@Autowired
	private IFlyDataModelService modelService;
	@Autowired
	private IFlyDataService dataService;

	@Before
	public void before() {
		modelService.importDataModelFromAllEntityClass();
	}

	@Test
	public void ptable() {
		List<FlyEntityMap> list = dataService.findAll(PTable.class.getName());
		Assert.assertNotNull(list);
		Assert.assertTrue(list.size() > 0);
	}
}
