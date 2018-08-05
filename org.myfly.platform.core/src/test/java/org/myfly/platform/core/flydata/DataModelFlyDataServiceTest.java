package org.myfly.platform.core.flydata;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.datamodel.model.PColumn;
import org.myfly.platform.core.datamodel.model.PTable;
import org.myfly.platform.core.flydata.service.FlyEntityMap;
import org.myfly.platform.core.flydata.service.IFlyDataService;
import org.myfly.platform.core.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.util.StringUtils;

public class DataModelFlyDataServiceTest extends ServiceTestCase {
	@Autowired
	private IFlyDataService dataService;

	@Test
	public void findAll() {
		List<FlyEntityMap> result = dataService.findAll(PTable.class.getName());
		Assert.assertTrue(result.size() > 0);
	}

	@Test
	public void findByExample() {
		FlyEntityMap params = new FlyEntityMap();
		// find ptable by apiName
		params.put("apiName", PTable.class.getName());
		List<FlyEntityMap> result = dataService.findByExample(PTable.class.getName(), params);
		Assert.assertEquals(1, result.size());
		String tableID = (String) result.get(0).get("tableID");
		Assert.assertTrue(StringUtils.hasLength(tableID));
		// find pcolumn by ptable.tableid
		params.clear();
		params.put("tableID", tableID);
		List<FlyEntityMap> result2 = dataService.findByExample(PColumn.class.getName(), params);
		Assert.assertTrue(result2.size() > 1);
	}

	@Test
	public void findAllWithPage() {
		List<FlyEntityMap> result = dataService.findAll(PTable.class.getName());
		int count = result.size();
		Page<FlyEntityMap> page = dataService.findAll(PTable.class.getName(), null, PageRequest.of(0, 5));
		Assert.assertEquals(count, page.getTotalElements());
		Assert.assertEquals(5, page.getSize());
	}
}
