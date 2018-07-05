package org.myfly.platform.tools.codebuilder;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.tools.ToolsApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ToolsApplication.class)
public class ADEmpiereRepostoryTest {
	@Autowired
	private ADEmpiereRepostory repository;

	@Test
	public void getElements() {
		List<ADElement> elements = repository.getElements();
		Assert.assertNotNull(elements);
		Assert.assertTrue(elements.size() > 0);
	}

	@Test
	public void getTables() {
		List<ADTable> elements = repository.getTables();
		Assert.assertNotNull(elements);
		Assert.assertTrue(elements.size() > 0);
	}

	@Test
	public void getTable() {
		ADTable table = repository.getTable("AD_Table");
		Assert.assertNotNull(table);
		List<ADColumn> columns = repository.getTableColumns(table.getTableId());
		Assert.assertNotNull(columns);
		Assert.assertTrue(columns.size() > 0);
	}

	@Test
	public void getReferencesByList() {
		List<ADReference> elements = repository.getReferencesByList();
		Assert.assertNotNull(elements);
		Assert.assertTrue(elements.size() > 0);
	}

	@Test
	public void getRefLists() {
		List<ADRefList> list = repository.getRefLists(101);
		Assert.assertNotNull(list);
		Assert.assertTrue(list.size() > 0);
	}
}
