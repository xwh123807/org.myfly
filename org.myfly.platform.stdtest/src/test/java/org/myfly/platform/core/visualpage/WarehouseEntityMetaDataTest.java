package org.myfly.platform.core.visualpage;

import org.myfly.platform.core.test.EntityMetaDataTestCase;
import org.myfly.platform.system.tpcc.domain.Warehouse;

public class WarehouseEntityMetaDataTest extends EntityMetaDataTestCase<Warehouse> {

	@Override
	public Class<Warehouse> getEntityClass() {
		return Warehouse.class;
	}

	@Override
	public String getViewName() {
		return null;
	}

}
