package org.myfly.platform.system.tpcc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.SystemApplication;
import org.myfly.platform.core.flydata.service.IJdbcDataAccessService;
import org.myfly.platform.core.metadata.define.FilterDefinition;
import org.myfly.platform.core.metadata.define.SQLOperator;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

@SpringApplicationConfiguration(classes = SystemApplication.class)
public class JdbcDataAccessServiceForTpccTest extends ServiceTestCase {
	@Autowired
	private IJdbcDataAccessService jdbcDataAccessService;

	@Test
	public void findOneForWarehouse() {
		Map<String, Object> params = new HashMap<>();
		params.put("wid", Long.valueOf(1l));
		Map<String, Object> entity = jdbcDataAccessService.findOne(null, "pt.warehouse", params);
		Assert.assertNotNull(entity);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void findAllForWarehouse() {
		List<Map<String, Object>> entity = jdbcDataAccessService.findAll(null, "pt.warehouse", (Map) null);
		Assert.assertNotNull(entity);
		Assert.assertTrue(entity.size() > 0);
	}

	@Test
	public void findOneForDistrict() {
		Map<String, Object> params = new HashMap<>();
		params.put("wid", Long.valueOf(1l));
		params.put("did", Long.valueOf(1l));
		Map<String, Object> entity = jdbcDataAccessService.findOne(null, "pt.district", params);
		Assert.assertNotNull(entity);
	}

	@Test
	public void findAllForDistrict() {
		Map<String, Object> params = new HashMap<>();
		params.put("wid", Long.valueOf(1l));
		List<Map<String, Object>> entities = jdbcDataAccessService.findAll(null, "pt.district", params);
		Assert.assertNotNull(entities);
	}

	@Test
	public void findOneForCustomer() {
		Map<String, Object> params = new HashMap<>();
		params.put("wid", Long.valueOf(1l));
		params.put("did", Long.valueOf(1l));
		params.put("cid", Long.valueOf(1l));
		Map<String, Object> entity = jdbcDataAccessService.findOne(null, "pt.customer", params);
		Assert.assertNotNull(entity);
	}

	@Test
	public void findAllForCustomer() {
		Map<String, Object> params = new HashMap<>();
		params.put("wid", Long.valueOf(1l));
		List<Map<String, Object>> entities = jdbcDataAccessService.findAll(null, "pt.customer", params);
		Assert.assertNotNull(entities);
	}

	@Test
	public void findAllForCustomerAndPage() {
		Map<String, Object> params = new HashMap<>();
		params.put("wid", Long.valueOf(1l));
		List<Map<String, Object>> entities = jdbcDataAccessService.findAll(null, "pt.customer", params, 0, 3, null);
		Assert.assertNotNull(entities);
		entities = jdbcDataAccessService.findAll(null, "pt.customer", params, 2, 3, null);
		Assert.assertNotNull(entities);
	}

	@Test
	public void countForCustomer() {
		int count = jdbcDataAccessService.count(null, "pt.customer", (Map<String, Object>) null);
		Assert.assertTrue(count > 0);
	}

	@Test
	public void countForCustomerAndWhere() {
		Map<String, Object> params = new HashMap<>();
		params.put("wid", Long.valueOf(1l));
		int count = jdbcDataAccessService.count(null, "pt.customer", params);
		Assert.assertTrue(count > 0);
	}

	@Test
	public void countForCustomerAndPageable() {
		Map<String, Object> params = new HashMap<>();
		params.put("wid", Long.valueOf(1l));
		PageRequest pageable = new PageRequest(0, 2);
		Page<Map<String, Object>> result = jdbcDataAccessService.findAll(null, "pt.customer", params, pageable);
		Assert.assertNotNull(result);
		Assert.assertTrue(result.getContent().size() == result.getNumberOfElements());
	}

	@Test
	public void countForCustomerAndSort() {
		Map<String, Object> params = new HashMap<>();
		params.put("wid", Long.valueOf(1l));
		PageRequest pageable = new PageRequest(0, 2, new Sort(Direction.DESC, "wid"));
		Page<Map<String, Object>> result = jdbcDataAccessService.findAll(null, "pt.customer", params, pageable);
		Assert.assertNotNull(result);
		Assert.assertTrue(result.getContent().size() == result.getNumberOfElements());
	}

	@Test
	public void findAllForFilter() {
		FilterDefinition filter1 = new FilterDefinition("wid", SQLOperator.EQUAL, 1);
		FilterDefinition filter2 = new FilterDefinition("did", SQLOperator.EQUAL, 1);
		FilterDefinition[] filters = new FilterDefinition[] { filter1, filter2 };
		long count = jdbcDataAccessService.count(null, "pt.customer", filters);
		Assert.assertTrue(count > 0);
		List<Map<String, Object>> result = jdbcDataAccessService.findAll(null, "pt.customer", filters, 0, 5, null);
		Assert.assertNotNull(result);
		Assert.assertTrue(result.size() > 0);
	}

	@Test
	public void saveEntity() {
		String tableName = "pt.warehouse";

		Map<String, Object> values = new HashMap<>();
		values.put("wid", 1000l);
		values.put("name", "name1000");
		jdbcDataAccessService.saveEntity(null, tableName, values);
		
		Map<String, Object> pkParams = new HashMap<>();
		pkParams.put("wid", 1000l);
		Map<String, Object> values2 = new HashMap<>();
		values2.put("name", "name1000gb");
		jdbcDataAccessService.updateEntity(null, tableName, pkParams, values2 );

		jdbcDataAccessService.delOne(null, tableName, pkParams);
	}
}
