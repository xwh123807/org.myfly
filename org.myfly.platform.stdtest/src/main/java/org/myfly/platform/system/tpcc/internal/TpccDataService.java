package org.myfly.platform.system.tpcc.internal;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.myfly.platform.core.flydata.service.IJpaAccessService;
import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.system.tpcc.domain.Customer;
import org.myfly.platform.system.tpcc.domain.District;
import org.myfly.platform.system.tpcc.domain.History;
import org.myfly.platform.system.tpcc.domain.Item;
import org.myfly.platform.system.tpcc.domain.NewOrder;
import org.myfly.platform.system.tpcc.domain.OrderLine;
import org.myfly.platform.system.tpcc.domain.SOrder;
import org.myfly.platform.system.tpcc.domain.Stock;
import org.myfly.platform.system.tpcc.domain.Warehouse;
import org.myfly.platform.system.tpcc.service.ITpccDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TpccDataService implements ITpccDataService {
	@Autowired
	private IJpaAccessService dataAccessService;
	/**
	 * 数据规模
	 */
	private long scale = 1;

	private long districtCount = 10;
	private long customerCount = 100;
	private long stockCount = 1000;
	/**
	 * Stock表名
	 */
	private String stockTableName = ClassUtils.getShortClassName(Stock.class.getName());
	/**
	 * Customer表名
	 */
	private String customerTableName = ClassUtils.getShortClassName(Customer.class.getName());
	/**
	 * District表名
	 */
	private String districtTableName = ClassUtils.getShortClassName(District.class.getName());
	private String itemTableName = ClassUtils.getShortClassName(Item.class.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.system.service.internal.ITpccDataService#getScale()
	 */
	@Override
	public long getScale() {
		return scale;
	}

	public void setScale(long scale) {
		this.scale = scale;
	}

	private Warehouse buildAndSaveWarehouse(Long wid) {
		Warehouse warehouse = new Warehouse();
		warehouse.setWid(wid);
		warehouse.setName(RandomStringUtils.randomAlphabetic(10));
		warehouse.setStreet1(RandomStringUtils.randomAlphabetic(20));
		warehouse.setStreet2(RandomStringUtils.randomAlphabetic(20));
		warehouse.setCity(RandomStringUtils.randomAlphabetic(20));
		warehouse.setState(RandomStringUtils.randomAlphabetic(2));
		warehouse.setZip(RandomStringUtils.randomAlphabetic(9));
		warehouse.setTax(RandomUtils.nextDouble(0, 1));
		warehouse.setYtd(RandomUtils.nextDouble(10, 100));
		dataAccessService.saveEntity(warehouse);
		return warehouse;
	}

	private Stock buildStock(Long iid, Warehouse warehouse) {
		Stock stock = new Stock();
		stock.setWid(warehouse.getWid());
		stock.setIid(iid);
		stock.setQuantity(RandomUtils.nextInt(10, 1000));
		stock.setDist01(RandomStringUtils.randomAlphabetic(24));
		stock.setDist02(RandomStringUtils.randomAlphabetic(24));
		stock.setDist03(RandomStringUtils.randomAlphabetic(24));
		stock.setDist04(RandomStringUtils.randomAlphabetic(24));
		stock.setDist05(RandomStringUtils.randomAlphabetic(24));
		stock.setDist06(RandomStringUtils.randomAlphabetic(24));
		stock.setDist07(RandomStringUtils.randomAlphabetic(24));
		stock.setDist08(RandomStringUtils.randomAlphabetic(24));
		stock.setDist09(RandomStringUtils.randomAlphabetic(24));
		stock.setDist10(RandomStringUtils.randomAlphabetic(24));
		stock.setOrderCnt(RandomUtils.nextLong(200, 20000));
		stock.setRemoteCnt(RandomUtils.nextLong(200, 20000));
		stock.setData(RandomStringUtils.randomAlphabetic(50));
		return stock;
	}

	private Item buildItem(Long iid) {
		Item item = new Item();
		item.setIid(iid);
		item.setName(RandomStringUtils.randomAlphabetic(24));
		item.setData(RandomStringUtils.randomAlphabetic(50));
		item.setPrice(RandomUtils.nextDouble(200, 10000));
		return item;
	}

	private void buildAndSaveItemAndStocks(Long wid, long length) {
		List<Item> items = new ArrayList<>();
		List<Stock> stocks = new ArrayList<>();
		Warehouse warehouse = new Warehouse();
		warehouse.setWid(wid);
		for (long iid = 1; iid <= length; iid++) {
			Item item = buildItem(iid);
			Stock stock = buildStock(iid, warehouse);
			items.add(item);
			stocks.add(stock);
		}
		dataAccessService.batchSaveEntity(itemTableName, items);
		dataAccessService.batchSaveEntity(stockTableName, stocks);
	}

	private District buildDistrict(Long did, Long wid) {
		District district = new District();
		district.setWid(wid);
		district.setDid(did);
		district.setName(RandomStringUtils.randomAlphabetic(10));
		district.setStreet1(RandomStringUtils.randomAlphabetic(20));
		district.setStreet2(RandomStringUtils.randomAlphabetic(20));
		district.setState(RandomStringUtils.randomAlphabetic(2));
		district.setZip(RandomStringUtils.randomAlphabetic(9));
		district.setTax(RandomUtils.nextDouble(0, 1));
		district.setYtd(RandomUtils.nextDouble(10, 100));
		return district;
	}

	private void buildAndSaveDistrict(Long wid, long length) {
		List<District> districts = new ArrayList<>();
		for (long did = 1; did <= districtCount; did++) {
			District district = buildDistrict(did, wid);
			districts.add(district);
		}
		dataAccessService.batchSaveEntity(districtTableName, districts);
	}

	private void buildAndSaveCustomers(Long wid, Long did, long length, List<Customer> customers) {
		Warehouse warehouse = new Warehouse();
		warehouse.setWid(wid);
		District district = new District();
		district.setWid(wid);
		district.setDid(did);
		for (long countCustomer = 1; countCustomer <= length; countCustomer++) {
			Customer customer = buildCustomer(countCustomer, warehouse, district);
			customers.add(customer);
		}
	}

	private Customer buildCustomer(Long cid, Warehouse warehouse, District district) {
		Customer customer = new Customer();
		customer.setWid(warehouse.getWid());
		customer.setDid(district.getDid());
		customer.setCid(cid);
		customer.setSfirst(RandomStringUtils.randomAlphabetic(16));
		customer.setSlast(RandomStringUtils.randomAlphabetic(16));
		customer.setMiddle(RandomStringUtils.randomAlphabetic(2));
		customer.setStreet1(RandomStringUtils.randomAlphabetic(20));
		customer.setStreet2(RandomStringUtils.randomAlphabetic(20));
		customer.setCity(RandomStringUtils.randomAlphabetic(20));
		customer.setState(RandomStringUtils.randomAlphabetic(2));
		customer.setZip(RandomStringUtils.randomAlphabetic(9));
		customer.setPhone(RandomStringUtils.randomAlphabetic(16));
		customer.setSince(DateUtil.nowDate());
		customer.setCredit(RandomStringUtils.randomAlphabetic(2));
		customer.setCreditLim(RandomUtils.nextDouble(1, 2));
		customer.setDiscount(RandomUtils.nextDouble(0, 20));
		customer.setBalance(RandomUtils.nextDouble(0, 20000));
		customer.setData(RandomStringUtils.randomAlphabetic(90));
		customer.setYtdPayment(RandomUtils.nextDouble(1, 2));
		customer.setPaymentCnt(RandomUtils.nextLong(30, 100));
		customer.setDeliveryCnt(RandomUtils.nextLong(3, 200));
		return customer;
	}

	private void initCounter(long start) {
		if (start == 1) {
			stockCount = 10;
			districtCount = 1;
			customerCount = 3;
		} else {
			stockCount = 1000;
			districtCount = 10;
			customerCount = 100;
		}
	}

	/**
	 * 生成TPCC测试 维表数据
	 */
	@Override
	public void generateDimensionDatas(long start) {
		initCounter(start);
		for (long wid = start; wid < getScale(); wid++) {
			buildAndSaveWarehouse(wid);
			buildAndSaveItemAndStocks(wid, stockCount);
			buildAndSaveDistrict(wid, districtCount);
			List<Customer> customers = new ArrayList<>();
			for (long did = 1; did <= districtCount; did++) {
				buildAndSaveCustomers(wid, did, customerCount, customers);
			}
			dataAccessService.batchSaveEntity(customerTableName, customers);
			customers.clear();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.myfly.platform.system.service.ITpccDataService#generateOrderDatas()
	 */
	@Override
	public void generateOrderDatas(long start) {
		initCounter(start);
		for (long wid = start; wid < getScale(); wid++) {
			List<SOrder> orders = new ArrayList<>();
			List<OrderLine> orderLines = new ArrayList<>();
			List<History> historys = new ArrayList<>();
			List<NewOrder> newOrders = new ArrayList<>();
			for (long did = 1; did <= districtCount; did++) {
				Long oid = (long) 1;
				for (long cid = 1; cid <= customerCount; cid++) {
					buildAndSaveOrders(oid, wid, did, cid, orders, orderLines, historys, newOrders);
					oid++;
				}
			}
			dataAccessService.batchSaveEntity(ClassUtils.getShortClassName(SOrder.class), orders);
			dataAccessService.batchSaveEntity(ClassUtils.getShortClassName(OrderLine.class), orderLines);
			dataAccessService.batchSaveEntity(ClassUtils.getShortClassName(History.class), historys);
			dataAccessService.batchSaveEntity(ClassUtils.getShortClassName(NewOrder.class), newOrders);
		}
	}

	private void buildAndSaveOrders(Long oid, Long wid, Long did, Long cid, List<SOrder> orders,
			List<OrderLine> orderLines, List<History> historys, List<NewOrder> newOrders) {
		SOrder order = new SOrder();
		order.setOid(oid);
		order.setWid(wid);
		order.setDid(did);
		order.setCid(cid);
		order.setEntryD(DateUtil.nowSqlTimestamp());
		order.setCarrierId(RandomUtils.nextLong(1, 100));
		order.setOlCnt(RandomUtils.nextLong(100, 1000));
		order.setAllLocal(RandomUtils.nextLong(20, 40));
		orders.add(order);
		buildOrderLines(oid, wid, did, RandomUtils.nextLong(5, 16), orderLines);
		History history = new History();
		history.setUid(UUIDUtil.newUUID());
		history.setCid(cid);
		history.setcWid(wid);
		history.setcDid(did);
		history.setDid(did);
		history.setdWid(wid);
		history.setDate(DateUtil.nowSqlTimestamp());
		history.setData(RandomStringUtils.randomAlphabetic(24));
		historys.add(history);
		NewOrder newOrder = new NewOrder();
		newOrder.setOid(oid);
		newOrder.setWid(wid);
		newOrder.setDid(did);
		newOrders.add(newOrder);
	}

	private void buildOrderLines(Long oid, Long wid, Long did, long length, List<OrderLine> orderLines) {
		for (long number = 1; number <= length; number++) {
			OrderLine orderLine = new OrderLine();
			orderLine.setOid(oid);
			orderLine.setWid(wid);
			orderLine.setDid(did);
			orderLine.setNumber(number);
			orderLine.setSupplyWid(wid);
			orderLine.setIid(RandomUtils.nextLong(1, stockCount + 1));
			orderLine.setQuantity(RandomUtils.nextLong(1, 10));
			orderLine.setAmount(RandomUtils.nextDouble(1, 100));
			orderLine.setDeliveryD(DateUtil.nowSqlTimestamp());
			orderLine.setDistInfo(RandomStringUtils.randomAlphabetic(24));
			orderLines.add(orderLine);
		}
	}
}
