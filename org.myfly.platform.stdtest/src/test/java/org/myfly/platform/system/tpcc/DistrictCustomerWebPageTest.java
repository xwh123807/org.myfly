package org.myfly.platform.system.tpcc;

import org.myfly.platform.core.test.SubEntityActionsWebPageTestCase;
import org.myfly.platform.system.tpcc.domain.Customer;
import org.myfly.platform.system.tpcc.domain.CustomerPK;
import org.myfly.platform.system.tpcc.domain.District;
import org.myfly.platform.system.tpcc.domain.DistrictPK;
import org.springframework.beans.factory.annotation.Autowired;

public class DistrictCustomerWebPageTest
		extends SubEntityActionsWebPageTestCase<District, Customer, DistrictPK, CustomerPK> {
	@Autowired
	private TpccInitData tpcc;

	@Override
	public String getViewName() {
		return null;
	}

	@Override
	public Class<Customer> getSubEntityClass() {
		return Customer.class;
	}

	@Override
	public CustomerPK getSubEntityPk() {
		return tpcc.getCustomerPK();
	}

	@Override
	public String getSubTableAttr() {
		return "customers";
	}

	@Override
	public Customer getNewSubEntity() {
		return tpcc.newCustomer(1100);
	}

	@Override
	public Customer getSaveAndNewSubEntity() {
		return tpcc.newCustomer(1150);
	}

	@Override
	public Customer getUpdateSubEntity() {
		Customer customer = new Customer();
		customer.setSfirst("update gb");
		return customer;
	}

	@Override
	public Class<District> getEntityClass() {
		return District.class;
	}

	@Override
	public DistrictPK getEntityPk() {
		return tpcc.getDistrictPK();
	}

}
