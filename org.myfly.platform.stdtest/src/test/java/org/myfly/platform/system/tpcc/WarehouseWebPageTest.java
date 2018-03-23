package org.myfly.platform.system.tpcc;

import org.apache.commons.lang3.RandomUtils;
import org.myfly.platform.core.test.EntityActionsWebPageTestCase;
import org.myfly.platform.system.tpcc.domain.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;

public class WarehouseWebPageTest extends EntityActionsWebPageTestCase<Warehouse, Long> {
	@Autowired
	private TpccInitData tpcc;

	@Override
	public Class<Warehouse> getEntityClass() {
		return Warehouse.class;
	}

	@Override
	public String getViewName() {
		return null;
	}

	@Override
	public Long getEntityPk() {
		return tpcc.getWarehouse().getWid();
	}

	@Override
	public Warehouse getNewEntity() {
		long wid = RandomUtils.nextLong(100, 200);
		return tpcc.newWarehouse(wid);
	}

	@Override
	public Warehouse getSaveAndNewEntity() {
		long wid = RandomUtils.nextLong(200, 300);
		return tpcc.newWarehouse(wid);
	}

	@Override
	public Warehouse getUpdateEntity() {
		Warehouse entity = new Warehouse();
		entity.setCity("test2");
		return entity;
	}

}
