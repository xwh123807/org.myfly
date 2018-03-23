package org.myfly.platform.system.tpcc;

import org.myfly.platform.core.test.EntityActionsWebPageTestCase;
import org.myfly.platform.system.tpcc.domain.SOrder;
import org.myfly.platform.system.tpcc.domain.SOrderPK;
import org.springframework.beans.factory.annotation.Autowired;

public class SOrderWebPageTest extends EntityActionsWebPageTestCase<SOrder, SOrderPK> {
	@Autowired
	private TpccInitData tpcc;

	@Override
	public Class<SOrder> getEntityClass() {
		return SOrder.class;
	}

	@Override
	public String getViewName() {
		return null;
	}

	@Override
	public SOrderPK getEntityPk() {
		return tpcc.getSOrderPK();
	}

	@Override
	public SOrder getNewEntity() {
		return tpcc.newSOrder(2000);
	}

	@Override
	public SOrder getSaveAndNewEntity() {
		return tpcc.newSOrder(2050);
	}

	@Override
	public SOrder getUpdateEntity() {
		SOrder sorder = new SOrder();
		sorder.setCarrierId(12l);
		return sorder;
	}

}
