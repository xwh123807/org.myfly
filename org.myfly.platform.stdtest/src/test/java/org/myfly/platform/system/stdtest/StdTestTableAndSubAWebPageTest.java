package org.myfly.platform.system.stdtest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.myfly.platform.core.flydata.service.IJpaAccessService;
import org.myfly.platform.core.test.SubEntityActionsWebPageTestCase;
import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.system.stdtest.domain.StdTestTable;
import org.myfly.platform.system.stdtest.domain.StdTestTableSubA;
import org.myfly.platform.system.stdtest.service.IStdTestDataService;
import org.springframework.beans.factory.annotation.Autowired;

public class StdTestTableAndSubAWebPageTest
		extends SubEntityActionsWebPageTestCase<StdTestTable, StdTestTableSubA, String, String> {
	@Autowired
	private IStdTestDataService stdTestDataService;
	@Autowired
	private IJpaAccessService dataAccessService;
	private static String stdTestTableUid;
	private static String stdTestTableSubAUid;
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

			Map<String, Object> params = new HashMap<>();
			params.put("stdTestTable", stdTestTables.get(0));
			List<StdTestTableSubA> subAs = dataAccessService.findAll(StdTestTableSubA.class, params);
			stdTestTableSubAUid = (subAs.get(0).getUid());

			AssertUtil.parameterNotEmpty(null, stdTestTableUid, stdTestTableSubAUid);
			isInited = true;
		}
	}

	@Override
	public Class<StdTestTable> getEntityClass() {
		return StdTestTable.class;
	}

	@Override
	public Class<StdTestTableSubA> getSubEntityClass() {
		return StdTestTableSubA.class;
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
	public String getSubEntityPk() {
		return stdTestTableSubAUid;
	}

	@Override
	public String getSubTableAttr() {
		return "details";
	}

	@Override
	public StdTestTableSubA getNewSubEntity() {
		StdTestTableSubA entity = new StdTestTableSubA();
		entity.setName(UUIDUtil.newUUID());
		return entity;
	}

	@Override
	public StdTestTableSubA getSaveAndNewSubEntity() {
		StdTestTableSubA entity = new StdTestTableSubA();
		entity.setName(UUIDUtil.newUUID());
		return entity;
	}

	@Override
	public StdTestTableSubA getUpdateSubEntity() {
		StdTestTableSubA entity = new StdTestTableSubA();
		entity.setName(UUIDUtil.newUUID());
		return entity;
	}

}
