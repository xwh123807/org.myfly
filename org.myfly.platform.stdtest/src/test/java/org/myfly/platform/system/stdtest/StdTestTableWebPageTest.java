package org.myfly.platform.system.stdtest;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.myfly.platform.core.flydata.service.IJpaAccessService;
import org.myfly.platform.core.test.EntityActionsWebPageTestCase;
import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.system.stdtest.domain.StdTestTable;
import org.myfly.platform.system.stdtest.service.IStdTestDataService;
import org.springframework.beans.factory.annotation.Autowired;

public class StdTestTableWebPageTest extends EntityActionsWebPageTestCase<StdTestTable, String> {
	@Autowired
	private IStdTestDataService stdTestDataService;
	@Autowired
	private IJpaAccessService dataAccessService;
	private static String stdTestTableUid;
	private static boolean isInited;

	@Before
	public void init() {
		if (!isInited) {
			List<StdTestTable> stdTestTables = dataAccessService.findAll(StdTestTable.class);
			if (stdTestTables.size() == 0) {
				stdTestDataService.initTestData(5);
				stdTestTables = dataAccessService.findAll(StdTestTable.class);
			}
			stdTestTableUid = (stdTestTables.get(0).getUid());

			AssertUtil.parameterNotEmpty(null, stdTestTableUid);
			isInited = true;
		}
	}

	@Override
	public Class<StdTestTable> getEntityClass() {
		return StdTestTable.class;
	}

	@Override
	public String getViewName() {
		return null;
	}

	@Override
	public String getEntityPk() {
		return stdTestTableUid;
	}

	@Override
	public StdTestTable getNewEntity() {
		StdTestTable entity = new StdTestTable();
		entity.setName(UUIDUtil.newUUID());
		return entity;
	}

	@Override
	public StdTestTable getSaveAndNewEntity() {
		StdTestTable entity = new StdTestTable();
		entity.setUid(UUIDUtil.newUUID());
		entity.setName(UUIDUtil.newUUID());
		return entity;
	}

	@Override
	public StdTestTable getUpdateEntity() {
		StdTestTable entity = new StdTestTable();
		entity.setName(UUIDUtil.newUUID());
		return entity;
	}

	@Test
	public void fullTextSearch() throws Exception{
		fullTextSearch("fullText:字符串").andExpect(status().isOk()).andDo(print());
	}
	
	@Test
	public void searchEntity() throws Exception{
		showSearchEntityView("fullText:字符串");
	}
}
