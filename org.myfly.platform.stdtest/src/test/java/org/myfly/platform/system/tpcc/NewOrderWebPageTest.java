package org.myfly.platform.system.tpcc;

import org.myfly.platform.core.test.EntityActionsWebPageTestCase;
import org.myfly.platform.system.tpcc.domain.NewOrder;
import org.myfly.platform.system.tpcc.domain.NewOrderPK;
import org.springframework.beans.factory.annotation.Autowired;

public class NewOrderWebPageTest extends EntityActionsWebPageTestCase<NewOrder, NewOrderPK> {
	@Autowired
	private TpccInitData tpcc;
	
	@Override
	public Class<NewOrder> getEntityClass() {
		return NewOrder.class;
	}

	@Override
	public String getViewName() {
		return null;
	}

	@Override
	public NewOrderPK getEntityPk() {
		return tpcc.getNewOrderPK();
	}

	@Override
	public NewOrder getNewEntity() {
		return tpcc.newNewOrder(2300);
	}

	@Override
	public NewOrder getSaveAndNewEntity() {
		return tpcc.newNewOrder(2350);
	}

	@Override
	public NewOrder getUpdateEntity() {
		return new NewOrder();
	}

}
