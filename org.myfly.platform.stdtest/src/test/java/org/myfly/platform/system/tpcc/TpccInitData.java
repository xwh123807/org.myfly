package org.myfly.platform.system.tpcc;

import javax.transaction.Transactional;

import org.apache.commons.lang3.RandomUtils;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.system.tpcc.domain.Customer;
import org.myfly.platform.system.tpcc.domain.CustomerPK;
import org.myfly.platform.system.tpcc.domain.District;
import org.myfly.platform.system.tpcc.domain.DistrictPK;
import org.myfly.platform.system.tpcc.domain.NewOrder;
import org.myfly.platform.system.tpcc.domain.NewOrderPK;
import org.myfly.platform.system.tpcc.domain.SOrder;
import org.myfly.platform.system.tpcc.domain.SOrderPK;
import org.myfly.platform.system.tpcc.domain.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TpccInitData {
	@Autowired
	private IJpaDataAccessService dataAccessService;

	private Warehouse warehouse;

	private District district;

	private Customer customer;

	private SOrder order;

	private NewOrder newOrder;

	@Transactional
	public Warehouse getWarehouse() {
		if (warehouse == null) {
			long wid = RandomUtils.nextLong(200, 300);
			warehouse = newWarehouse(wid);
			dataAccessService.saveEntity(warehouse);
		}
		return warehouse;
	}

	public Warehouse newWarehouse(long wid) {
		Warehouse warehouse = new Warehouse();
		warehouse.setWid(wid);
		return warehouse;
	}

	@Transactional
	public District getDistrict() {
		if (district == null) {
			long did = RandomUtils.nextLong(200, 300);
			district = newDistrict(did);
			dataAccessService.saveEntity(district);
		}
		return district;
	}

	public District newDistrict(long did) {
		District district = new District();
		district.setWid(getWarehouse().getWid());
		district.setDid(did);
		district.setName("name" + did);
		return district;
	}

	public DistrictPK getDistrictPK() {
		return new DistrictPK(getDistrict().getWid(), getDistrict().getDid());
	}

	@Transactional
	public Customer getCustomer() {
		if (customer == null) {
			long cid = RandomUtils.nextLong(200, 300);
			customer = newCustomer(cid);
			dataAccessService.saveEntity(customer);
		}
		return customer;
	}

	public Customer newCustomer(long cid) {
		Customer customer = new Customer();
		customer.setWid(getWarehouse().getWid());
		customer.setDid(getDistrict().getDid());
		customer.setCid(cid);
		customer.setSfirst("sfirst" + cid);
		return customer;
	}

	public CustomerPK getCustomerPK() {
		return new CustomerPK(getCustomer().getWid(), getCustomer().getDid(), getCustomer().getCid());
	}

	@Transactional
	public SOrder getOrder() {
		if (order == null) {
			long oid = RandomUtils.nextLong(200, 300);
			order = newSOrder(oid);
			dataAccessService.saveEntity(order);
		}
		return order;
	}

	public SOrder newSOrder(long oid) {
		SOrder order = new SOrder();
		order.setWid(getCustomer().getWid());
		order.setDid(getCustomer().getDid());
		order.setCid(getCustomer().getCid());
		order.setOid(oid);
		order.setCarrierId(RandomUtils.nextLong(2000, 300232));
		return order;
	}

	public SOrderPK getSOrderPK() {
		return new SOrderPK(getOrder().getWid(), getOrder().getDid(), getOrder().getOid());
	}

	public NewOrderPK getNewOrderPK() {
		return new NewOrderPK(getNewOrder().getWid(), getNewOrder().getDid(), getNewOrder().getOid());
	}

	@Transactional
	public NewOrder getNewOrder() {
		if (newOrder == null) {
			long oid = RandomUtils.nextLong(200, 300);
			newOrder = newNewOrder(oid);
			dataAccessService.saveEntity(newOrder);
		}
		return newOrder;
	}

	public NewOrder newNewOrder(long oid) {
		SOrder order2 = newSOrder(oid);
		dataAccessService.saveEntity(order2);
		NewOrder newOrder = new NewOrder();
		newOrder.setWid(order2.getWid());
		newOrder.setDid(order2.getDid());
		newOrder.setOid(order2.getOid());
		return newOrder;
	}

}
