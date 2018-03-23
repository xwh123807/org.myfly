package org.myfly.platform.system.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.flydata.internal.QuerySpecificationUtil;
import org.myfly.platform.core.metadata.define.FilterDefinition;
import org.myfly.platform.core.metadata.define.SQLOperator;

public class QuerySpecificationUtilTest {
	@Test
	public void buildQueryWhereSql() {
		Map<String, Object> params = null;
		List<Object> paramsValues = null;
		String where = QuerySpecificationUtil.buildQueryWhereSql(params, paramsValues);
		Assert.assertEquals("", where);

		params = new LinkedHashMap<>();
		paramsValues = new ArrayList<>();
		params.put("wid", 1);
		where = QuerySpecificationUtil.buildQueryWhereSql(params, paramsValues);
		Assert.assertEquals(" WHERE wid= ?", where);
		Assert.assertEquals(1, paramsValues.size());
		Assert.assertEquals(1, paramsValues.get(0));

		params = new LinkedHashMap<>();
		paramsValues = new ArrayList<>();
		params.put("wid", 1);
		params.put("did", 1);
		params.put("city", "zhuhai");
		where = QuerySpecificationUtil.buildQueryWhereSql(params, paramsValues);
		Assert.assertEquals(" WHERE wid= ? AND did= ? AND city= ?", where);
		Assert.assertEquals(3, paramsValues.size());
		Assert.assertEquals(1, paramsValues.get(0));
		Assert.assertEquals("zhuhai", paramsValues.get(2));
	}

	@Test
	public void buildQueryWhereSqlForFilter() {
		FilterDefinition[] filters = new FilterDefinition[] {};
		List<Object> paramValues = new ArrayList<>();
		String where = QuerySpecificationUtil.buildQueryWhereSql(filters, paramValues);
		Assert.assertEquals("", where);

		paramValues.clear();
		FilterDefinition filter = new FilterDefinition("wid", SQLOperator.ISNULL);
		where = QuerySpecificationUtil.buildQueryWhereSql(new FilterDefinition[] { filter }, paramValues);
		Assert.assertEquals(" where wid is null", where);
		Assert.assertEquals(0, paramValues.size());

		paramValues.clear();
		filter = new FilterDefinition("wid", SQLOperator.NOTNULL);
		where = QuerySpecificationUtil.buildQueryWhereSql(new FilterDefinition[] { filter }, paramValues);
		Assert.assertEquals(" where wid is not null", where);
		Assert.assertEquals(0, paramValues.size());

		paramValues.clear();
		filter = new FilterDefinition("wid", SQLOperator.EQUAL);
		filter.setValue(1);
		filters = new FilterDefinition[] { filter };
		where = QuerySpecificationUtil.buildQueryWhereSql(filters, paramValues);
		Assert.assertEquals(" where wid = ?", where);
		Assert.assertEquals(1, paramValues.size());
		Assert.assertEquals(1, paramValues.get(0));

		paramValues.clear();
		filter = new FilterDefinition("wid", SQLOperator.NOTEQUAL);
		filter.setValue(1);
		filters = new FilterDefinition[] { filter };
		where = QuerySpecificationUtil.buildQueryWhereSql(filters, paramValues);
		Assert.assertEquals(" where wid != ?", where);
		Assert.assertEquals(1, paramValues.size());
		Assert.assertEquals(1, paramValues.get(0));

		paramValues.clear();
		filter = new FilterDefinition("wid", SQLOperator.IN);
		filter.setMultiValues(new Object[] { 1 });
		filters = new FilterDefinition[] { filter };
		where = QuerySpecificationUtil.buildQueryWhereSql(filters, paramValues);
		Assert.assertEquals(" where wid in (?)", where);
		Assert.assertEquals(1, paramValues.size());
		Assert.assertEquals(1, paramValues.get(0));

		paramValues.clear();
		filter = new FilterDefinition("wid", SQLOperator.IN);
		filter.setMultiValues(new Object[] { 1, 2, 3 });
		filters = new FilterDefinition[] { filter };
		where = QuerySpecificationUtil.buildQueryWhereSql(filters, paramValues);
		Assert.assertEquals(" where wid in (?, ?, ?)", where);
		Assert.assertEquals(3, paramValues.size());
		Assert.assertEquals(3, paramValues.get(2));

		paramValues.clear();
		filter = new FilterDefinition("city", SQLOperator.LIKE);
		filter.setValue("zhuhai");
		filters = new FilterDefinition[] { filter };
		where = QuerySpecificationUtil.buildQueryWhereSql(filters, paramValues);
		Assert.assertEquals(" where city like ?", where);
		Assert.assertEquals(1, paramValues.size());
		Assert.assertEquals("%zhuhai%", paramValues.get(0));

		paramValues.clear();
		filter = new FilterDefinition("city", SQLOperator.LIKE);
		filter.setValue("zhuhai%");
		filters = new FilterDefinition[] { filter };
		where = QuerySpecificationUtil.buildQueryWhereSql(filters, paramValues);
		Assert.assertEquals(" where city like ?", where);
		Assert.assertEquals(1, paramValues.size());
		Assert.assertEquals("zhuhai%", paramValues.get(0));

		paramValues.clear();
		filter = new FilterDefinition("city", SQLOperator.NOTLIKE);
		filter.setValue("zhuhai%");
		filters = new FilterDefinition[] { filter };
		where = QuerySpecificationUtil.buildQueryWhereSql(filters, paramValues);
		Assert.assertEquals(" where city not like ?", where);
		Assert.assertEquals(1, paramValues.size());
		Assert.assertEquals("zhuhai%", paramValues.get(0));

		paramValues.clear();
		filter = new FilterDefinition("wid", SQLOperator.GREATERTHAN);
		filter.setValue(1);
		filters = new FilterDefinition[] { filter };
		where = QuerySpecificationUtil.buildQueryWhereSql(filters, paramValues);
		Assert.assertEquals(" where wid > ?", where);
		Assert.assertEquals(1, paramValues.size());
		Assert.assertEquals(1, paramValues.get(0));

		paramValues.clear();
		filter = new FilterDefinition("wid", SQLOperator.LESSTHAN);
		filter.setValue(1);
		filters = new FilterDefinition[] { filter };
		where = QuerySpecificationUtil.buildQueryWhereSql(filters, paramValues);
		Assert.assertEquals(" where wid < ?", where);
		Assert.assertEquals(1, paramValues.size());
		Assert.assertEquals(1, paramValues.get(0));

		paramValues.clear();
		filter = new FilterDefinition("wid", SQLOperator.GREATERTHANOREQUALTO);
		filter.setValue(1);
		filters = new FilterDefinition[] { filter };
		where = QuerySpecificationUtil.buildQueryWhereSql(filters, paramValues);
		Assert.assertEquals(" where wid >= ?", where);
		Assert.assertEquals(1, paramValues.size());
		Assert.assertEquals(1, paramValues.get(0));

		paramValues.clear();
		filter = new FilterDefinition("wid", SQLOperator.LESSTHANOREQUALTO);
		filter.setValue(1);
		filters = new FilterDefinition[] { filter };
		where = QuerySpecificationUtil.buildQueryWhereSql(filters, paramValues);
		Assert.assertEquals(" where wid <= ?", where);
		Assert.assertEquals(1, paramValues.size());
		Assert.assertEquals(1, paramValues.get(0));

		paramValues.clear();
		filter = new FilterDefinition("wid", SQLOperator.BETWEEN);
		filter.setMultiValues(new Object[] { 20, 30 });
		filters = new FilterDefinition[] { filter };
		where = QuerySpecificationUtil.buildQueryWhereSql(filters, paramValues);
		Assert.assertEquals(" where wid >= ? and wid <= ?", where);
		Assert.assertEquals(2, paramValues.size());
		Assert.assertEquals(20, paramValues.get(0));
		Assert.assertEquals(30, paramValues.get(1));

		paramValues.clear();
		filter = new FilterDefinition("sdate", SQLOperator.BETWEEN);
		filter.setMultiValues(new Object[] { new Date(), new Date() });
		filters = new FilterDefinition[] { filter };
		where = QuerySpecificationUtil.buildQueryWhereSql(filters, paramValues);
		Assert.assertEquals(" where sdate between ? and ?", where);
		Assert.assertEquals(2, paramValues.size());

		paramValues.clear();
		filter = new FilterDefinition("wid", SQLOperator.EQUAL);
		filter.setValue(1);
		FilterDefinition filter2 = new FilterDefinition("did", SQLOperator.EQUAL);
		filter2.setValue(3);
		filters = new FilterDefinition[] { filter, filter2 };
		where = QuerySpecificationUtil.buildQueryWhereSql(filters, paramValues);
		Assert.assertEquals(" where wid = ? and did = ?", where);
		Assert.assertEquals(2, paramValues.size());
		Assert.assertEquals(1, paramValues.get(0));
		Assert.assertEquals(3, paramValues.get(1));
	}
}
