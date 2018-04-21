package org.myfly.platform.system.tpcc;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.SystemApplication;
import org.myfly.platform.core.flydata.internal.DataTablesResponse;
import org.myfly.platform.core.flydata.service.EntityQueryMap;
import org.myfly.platform.core.flydata.service.IFlyDataAccessService;
import org.myfly.platform.core.flydata.service.IJpaAccessService;
import org.myfly.platform.core.metadata.define.FieldDefinition;
import org.myfly.platform.core.metadata.service.EntityMetaData;
import org.myfly.platform.core.metadata.service.IEntityMetaDataService;
import org.myfly.platform.system.tpcc.domain.Customer;
import org.myfly.platform.system.tpcc.domain.CustomerPK;
import org.myfly.platform.system.tpcc.domain.District;
import org.myfly.platform.system.tpcc.domain.DistrictPK;
import org.myfly.platform.system.tpcc.domain.History;
import org.myfly.platform.system.tpcc.domain.Item;
import org.myfly.platform.system.tpcc.domain.NewOrder;
import org.myfly.platform.system.tpcc.domain.OrderLine;
import org.myfly.platform.system.tpcc.domain.SOrder;
import org.myfly.platform.system.tpcc.domain.SOrderPK;
import org.myfly.platform.system.tpcc.domain.Stock;
import org.myfly.platform.system.tpcc.domain.StockPK;
import org.myfly.platform.system.tpcc.domain.Warehouse;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;

/**
 * 标准表测试，表不用继承IKeyEntity或SKeyEntity
 * 
 * @author xiangwanhong
 *
 */
@SpringApplicationConfiguration(classes = SystemApplication.class)
public class TPCCStandardEntityTest extends ServiceTestCase {
	@Autowired
	private IEntityMetaDataService entityMetaDataService;
	@Autowired
	private IJpaAccessService dataAccessService;
	@Autowired
	@Qualifier("jdbcFlyDataAccessService")
	private IFlyDataAccessService queryUseMetaDataService;

	private String warehouseTableName = ClassUtils.getShortClassName(Warehouse.class);
	private String customerTableName = ClassUtils.getShortClassName(Customer.class);
	private String districtTableName = ClassUtils.getShortClassName(District.class);
	private String stockTableName = ClassUtils.getShortClassName(Stock.class);
	private String orderTableName = ClassUtils.getShortClassName(SOrder.class);

	@Test
	public void entityMetaDataForWarehouse() {
		EntityMetaData metaData = entityMetaDataService.getEntityMetaData(Warehouse.class.getName());
		Assert.assertNotNull(metaData);
		Assert.assertEquals(1, metaData.getListDefinitions().size());
		Assert.assertEquals(1, metaData.getFormDefinitions().size());
		Assert.assertEquals("name", metaData.getTableDefinition().getLabelField());
		Assert.assertEquals("wid", metaData.getPKFieldDefinition().getIdFields()[0].getName());
	}

	@Test
	public void entityMetaDataForDistrict() {
		EntityMetaData metaData = entityMetaDataService.getEntityMetaData(District.class.getName());
		Assert.assertNotNull(metaData);
		Assert.assertEquals(1, metaData.getListDefinitions().size());
		Assert.assertEquals(1, metaData.getFormDefinitions().size());
		Assert.assertEquals(2, metaData.getPKFieldDefinition().getIdFields().length);
	}

	@Test
	public void entityMetaDataForItem() {
		EntityMetaData metaData = entityMetaDataService.getEntityMetaData(Item.class.getName());
		Assert.assertNotNull(metaData);
		Assert.assertEquals(1, metaData.getListDefinitions().size());
		Assert.assertEquals(1, metaData.getFormDefinitions().size());
	}

	@Test
	public void entityMetaDataForStock() {
		EntityMetaData metaData = entityMetaDataService.getEntityMetaData(Stock.class.getName());
		Assert.assertNotNull(metaData);
		Assert.assertEquals(1, metaData.getListDefinitions().size());
		Assert.assertEquals(1, metaData.getFormDefinitions().size());
	}

	@Test
	public void entityMetaDataForCustomer() {
		EntityMetaData metaData = entityMetaDataService.getEntityMetaData(Customer.class.getName());
		Assert.assertNotNull(metaData);
		Assert.assertEquals(1, metaData.getListDefinitions().size());
		Assert.assertEquals(1, metaData.getFormDefinitions().size());
		Assert.assertEquals("sfirst", metaData.getTableDefinition().getLabelField());
	}

	@Test
	public void entityMetaDataForOrder() {
		EntityMetaData metaData = entityMetaDataService.getEntityMetaData(SOrder.class.getName());
		Assert.assertNotNull(metaData);
		Assert.assertEquals(1, metaData.getListDefinitions().size());
		Assert.assertEquals(1, metaData.getFormDefinitions().size());
	}

	@Test
	public void entityMetaDataForOrderLine() {
		EntityMetaData metaData = entityMetaDataService.getEntityMetaData(OrderLine.class.getName());
		Assert.assertNotNull(metaData);
		Assert.assertEquals(1, metaData.getListDefinitions().size());
		Assert.assertEquals(1, metaData.getFormDefinitions().size());
	}

	private int getFieldCol(FieldDefinition[] fields, String name) {
		for (int i = 0; i < fields.length; i++) {
			if (fields[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}

	private Warehouse warehouse;

	public Warehouse getWarehouse() {
		if (warehouse == null) {
			Long wid = (long) 1000000001;
			warehouse = new Warehouse();
			warehouse.setWid(wid);
			warehouse.setName(RandomStringUtils.randomAlphabetic(10));
			warehouse.setStreet1(RandomStringUtils.randomAlphabetic(20));
			warehouse.setStreet2(RandomStringUtils.randomAlphabetic(20));
			dataAccessService.saveEntity(warehouse);
		}
		return warehouse;
	}

	@Transactional
	@Test
	public void allWarehouse() {
		Long wid = getWarehouse().getWid();

		Warehouse warehouse2 = dataAccessService.findOne(Warehouse.class, wid);
		Assert.assertNotNull(warehouse2);

		List<Warehouse> list = dataAccessService.findAll(Warehouse.class);
		Assert.assertTrue(list.size() > 0);

		EntityQueryMap params = new EntityQueryMap();
		params.put("wid", new String[] { String.valueOf(wid) });
		DataTablesResponse response = queryUseMetaDataService.findAllToDataTables(warehouseTableName, "all", params, 0,
				20, false);
		Assert.assertNotNull(response);
		Assert.assertTrue(response.getData().length > 0);

		String[] rowData = response.getData()[0];
		EntityMetaData metaData = entityMetaDataService.getEntityMetaData(Warehouse.class.getName());
		FieldDefinition[] fields = metaData.getListDefinition("all").getFields();
		// 验证label超链接
		int col = getFieldCol(fields, "name");
		String value = rowData[col];
		// Assert.assertTrue(value.contains("/vp/warehouse/" + wid));
		// 验证操作集
		col = getFieldCol(fields, "actions");
		value = rowData[col];
		Assert.assertTrue(value.contains("/vp/warehouse/" + wid));
		Assert.assertTrue(value.contains("/vp/warehouse/" + wid + "?form"));
	}

	private District district;

	private District getDistrict() {
		if (district == null) {
			Long did = (long) 1000001;
			district = new District();
			district.setWid(getWarehouse().getWid());
			district.setDid(did);
			district.setName("distname");
			dataAccessService.saveEntity(district);
		}
		return district;
	}

	@Transactional
	@Test
	public void allDistrict() {
		Long wid = getWarehouse().getWid();
		Long did = getDistrict().getDid();

		District district2 = dataAccessService.findOne(District.class, new DistrictPK(wid, did));
		Assert.assertNotNull(district2);

		List<District> list = dataAccessService.findAll(District.class);
		Assert.assertTrue(list.size() > 0);

		EntityQueryMap params = new EntityQueryMap();
		params.put("wid", new String[] { String.valueOf(wid) });
		params.put("did", new String[] { String.valueOf(did) });
		DataTablesResponse response = queryUseMetaDataService.findAllToDataTables(districtTableName, "all", params, 0,
				20, false);
		Assert.assertNotNull(response);
		Assert.assertTrue(response.getData().length > 0);

		String[] rowData = response.getData()[0];
		EntityMetaData metaData = entityMetaDataService.getEntityMetaData(District.class.getName());
		FieldDefinition[] fields = metaData.getListDefinition("all").getFields();

		DistrictPK districtPK = new DistrictPK(wid, did);
		String pkValue = metaData.getPKFieldDefinition().convertPKToString(districtPK);
		// 验证label超链接
		int col = getFieldCol(fields, "name");
		String value = rowData[col];
		// Assert.assertTrue(value.contains("/vp/district/" + pkValue));

		// 验证操作集
		col = getFieldCol(fields, "actions");
		value = rowData[col];
		Assert.assertTrue(value.contains("/vp/district/" + pkValue));
		Assert.assertTrue(value.contains("/vp/district/" + pkValue + "?form"));

		// 验证warehouse超链接
		col = getFieldCol(fields, "warehouse");
		value = rowData[col];
		Assert.assertTrue(value.contains("/vp/warehouse/" + wid));

		// dataAccessService.delOne(district2);
		// dataAccessService.delOne(Warehouse.class, wid);
	}

	private Item item;

	private Item getItem() {
		if (item == null) {
			Long iid = (long) 1000001;
			item = new Item();
			item.setIid(iid);
			dataAccessService.saveEntity(item);
		}
		return item;
	}

	private Stock stock;

	private Stock getStock() {
		if (stock == null) {
			stock = new Stock();
			stock.setWid(getWarehouse().getWid());
			stock.setIid(getItem().getIid());
			dataAccessService.saveEntity(stock);
		}
		return stock;
	}

	@Transactional
	@Test
	public void allStock() {
		Long wid = getStock().getWid();
		Long iid = getStock().getIid();

		Stock entity2 = dataAccessService.findOne(Stock.class, new StockPK(wid, iid));
		Assert.assertNotNull(entity2);

		List<Stock> list = dataAccessService.findAll(Stock.class);
		Assert.assertTrue(list.size() > 0);

		DataTablesResponse response = queryUseMetaDataService.findAllToDataTables(stockTableName, "all", null, 0, 20,
				false);
		Assert.assertNotNull(response);
		Assert.assertTrue(response.getData().length > 0);

		// dataAccessService.delOne(stock);
		// dataAccessService.delOne(warehouse);
	}

	private Customer customer;

	private Customer getCustomer() {
		if (customer == null) {
			Long cid = (long) 10000;
			customer = new Customer();
			customer.setWid(getWarehouse().getWid());
			customer.setDid(getDistrict().getDid());
			customer.setCid(cid);
			customer.setSfirst("firstname");
			dataAccessService.saveEntity(customer);
		}
		return customer;
	}

	@Transactional
	@Test
	public void allCustomer() {
		Long wid = getCustomer().getWid();
		Long did = getCustomer().getDid();
		Long cid = getCustomer().getCid();

		CustomerPK customerPK = new CustomerPK(wid, did, cid);

		Customer customer2 = dataAccessService.findOne(Customer.class, customerPK);
		Assert.assertNotNull(customer2);

		List<Customer> list = dataAccessService.findAll(Customer.class);
		Assert.assertTrue(list.size() > 0);

		EntityQueryMap params = new EntityQueryMap();
		params.put("wid", new String[] { String.valueOf(wid) });
		params.put("did", new String[] { String.valueOf(did) });
		params.put("cid", new String[] { String.valueOf(cid) });
		DataTablesResponse response = queryUseMetaDataService.findAllToDataTables(customerTableName, "all", params, 0,
				20, false);
		Assert.assertNotNull(response);
		Assert.assertTrue(response.getData().length > 0);

		String[] rowData = response.getData()[0];
		EntityMetaData metaData = entityMetaDataService.getEntityMetaData(Customer.class.getName());
		FieldDefinition[] fields = metaData.getListDefinition("all").getFields();
		String pkValue = metaData.getPKFieldDefinition().convertPKToString(customerPK);

		// 验证label超链接
		int col = getFieldCol(fields, "sfirst");
		String value = rowData[col];
		// Assert.assertTrue(value.contains("/vp/customer/" + pkValue));

		// 验证操作集
		col = getFieldCol(fields, "actions");
		value = rowData[col];
		Assert.assertTrue(value.contains("/vp/customer/" + pkValue));
		Assert.assertTrue(value.contains("/vp/customer/" + pkValue + "?form"));

		DistrictPK districtPK = new DistrictPK(wid, did);
		String districtPKValue = entityMetaDataService.getEntityMetaData("district").getPKFieldDefinition()
				.convertPKToString(districtPK);
		// 验证district超链接
		col = getFieldCol(fields, "district");
		value = rowData[col];
		Assert.assertTrue(value.contains("/vp/district/" + districtPKValue));

		// dataAccessService.delOne(district);
		// dataAccessService.delOne(warehouse);
		// dataAccessService.delOne(customer);
	}

	@Transactional
	@Test
	public void allOrder() {
		Long wid = getCustomer().getWid();
		Long did = getCustomer().getDid();
		Long cid = getCustomer().getCid();
		Long oid = 100L;
		SOrder order = new SOrder();
		order.setWid(wid);
		order.setDid(did);
		order.setCid(cid);
		order.setOid(oid);
		order.setCarrierId(123L);
		dataAccessService.saveEntity(order);
		OrderLine orderLine = new OrderLine();
		orderLine.setWid(wid);
		orderLine.setDid(did);
		orderLine.setOid(100L);
		orderLine.setNumber(1l);
		orderLine.setSupplyWid(getStock().getWid());
		orderLine.setIid(getStock().getIid());
		dataAccessService.saveEntity(orderLine);
		NewOrder newOrder = new NewOrder(order);
		dataAccessService.saveEntity(newOrder);
		History history = new History(customer, district);
		dataAccessService.saveEntity(history);

		SOrder order2 = dataAccessService.findOne(SOrder.class, new SOrderPK(wid, did, oid));
		Assert.assertNotNull(order2);

		EntityQueryMap params = new EntityQueryMap();
		params.put("wid", new String[] { String.valueOf(wid) });
		params.put("did", new String[] { String.valueOf(did) });
		params.put("oid", new String[] { String.valueOf(oid) });

		dataAccessService.flush();

		DataTablesResponse response = queryUseMetaDataService.findAllToDataTables(orderTableName, "all", params, 0, 20,
				false);
		Assert.assertNotNull(response);
		Assert.assertTrue(response.getData().length > 0);

		String[] rowData = response.getData()[0];
		EntityMetaData metaData = entityMetaDataService.getEntityMetaData(SOrder.class.getName());
		FieldDefinition[] fields = metaData.getListDefinition("all").getFields();
		SOrderPK orderPK = new SOrderPK(wid, did, oid);
		String pkValue = metaData.getPKFieldDefinition().convertPKToString(orderPK);

		// 验证label超链接
		int col = getFieldCol(fields, "carrierId");
		String value = rowData[col];
		// Assert.assertTrue(value.contains("/vp/sorder/" + pkValue));

		// 验证操作集
		col = getFieldCol(fields, "actions");
		value = rowData[col];
		Assert.assertTrue(value.contains("/vp/sorder/" + pkValue));
		Assert.assertTrue(value.contains("/vp/sorder/" + pkValue + "?form"));

		// 验证customer超链接
		CustomerPK customerPK = new CustomerPK(wid, did, cid);
		String customerPKValue = entityMetaDataService.getEntityMetaData(customerTableName).getPKFieldDefinition()
				.convertPKToString(customerPK);
		col = getFieldCol(fields, "customer");
		value = rowData[col];
		Assert.assertTrue(value.contains("/vp/customer/" + customerPKValue));

		// dataAccessService.delOne(newOrder);
		// dataAccessService.delOne(history);
		// dataAccessService.delOne(orderLine);
		// dataAccessService.delOne(order);
		// dataAccessService.delOne(customer);
		// dataAccessService.delOne(district);
		// dataAccessService.delOne(warehouse);
	}
}
