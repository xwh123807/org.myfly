package org.myfly.platform.system.tpcc;

import org.myfly.platform.core.test.EntityActionsWebPageTestCase;
import org.myfly.platform.system.tpcc.domain.Customer;
import org.myfly.platform.system.tpcc.domain.CustomerPK;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerWebPageTest extends EntityActionsWebPageTestCase<Customer, CustomerPK> {
	@Autowired
	private TpccInitData tpcc;
	
	@Override
	public Class<Customer> getEntityClass() {
		return Customer.class;
	}

	@Override
	public String getViewName() {
		return null;
	}

	@Override
	public CustomerPK getEntityPk() {
		return tpcc.getCustomerPK();
	}

	@Override
	public Customer getNewEntity() {
		return tpcc.newCustomer(1009l);
	}

	@Override
	public Customer getSaveAndNewEntity() {
		return tpcc.newCustomer(1020);
	}

	@Override
	public Customer getUpdateEntity() {
		Customer customer = new Customer();
		customer.setSfirst("update gb");
		return customer;
	}

}
