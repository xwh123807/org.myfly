package org.myfly.platform.system.stdtest;

import org.junit.Assert;
import org.junit.Before;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.flydata.service.EntityMap;
import org.myfly.platform.core.flydata.service.FlyEntityMap;
import org.myfly.platform.core.test.FlyDataAccessTestCase;
import org.myfly.platform.system.stdtest.service.IStdTestDataService;
import org.springframework.beans.factory.annotation.Autowired;

public class StdTestTableDataAccessTest extends FlyDataAccessTestCase {
	@Autowired
	private IStdTestDataService stdTestDataService;
	private static boolean isInited;

	@Override
	public String getEntityName() {
		return "StdTestTable";
	}

	@Before
	public void init() {
		if (!isInited) {
			if (tableIsEmpty()) {
				stdTestDataService.initTestData(5);
			}
			isInited = true;
		}
	}

	// @Test
	public void subEntity() {
		checkSubEntity("details", 25);
	}

	@Override
	public EntityMap getNewEntity() {
		EntityMap params = new EntityMap();
		params.put("name", "name" + System.currentTimeMillis());
		params.put("stringField", "hello");
		params.put("dataType", FieldDataType.DATE.name());
		return params;
	}

	@Override
	public void checkNewEntity(FlyEntityMap entity) {
		Assert.assertEquals("dataType", "DATE", entity.get("dataType"));
		Assert.assertEquals("dataType__label", "日期", entity.get("dataType__label"));
	}

	@Override
	public EntityMap getUpdateEntity() {
		EntityMap params = new EntityMap();
		params.put("name", "name" + System.currentTimeMillis());
		return params;
	}

	@Override
	public void checkUpdateEntity(FlyEntityMap entity, EntityMap newEntity, EntityMap updateEntity) {
		Assert.assertEquals("属性[stringField]", newEntity.get("stringField"), entity.get("stringField"));
	}
}
