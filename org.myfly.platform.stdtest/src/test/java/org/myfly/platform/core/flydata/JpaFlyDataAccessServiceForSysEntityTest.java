package org.myfly.platform.core.flydata;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.flydata.service.EntityQueryMap;
import org.myfly.platform.core.flydata.service.IFlyDataAccessService;
import org.myfly.platform.core.metadata.define.FilterDefinition;
import org.myfly.platform.core.metadata.define.SQLOperator;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;

@SpringApplicationConfiguration(classes = CoreApplication.class)
@WebIntegrationTest(randomPort = true)
@Transactional
public class JpaFlyDataAccessServiceForSysEntityTest extends ServiceTestCase {
	@Autowired
	@Qualifier("jpaFlyDataAccessService")
	private IFlyDataAccessService flyDataService;
	
	@Test
	public void querySUserForNameEqual() {
		EntityQueryMap map = new EntityQueryMap();
		map.put("name", new String[] { "test" });
		List list = flyDataService.findAll("suser", null, map, false);
		Assert.assertNotNull(list);
	}

	@Test
	public void querySUserForNameIn() {
		EntityQueryMap map = new EntityQueryMap();
		map.put("name", new String[] { "test" });
		List list = flyDataService.findAll("suser", null, map, false);
		Assert.assertNotNull(list);
	}

	@Test
	public void querySUserForEmployeeNumberEqual() {
		EntityQueryMap map = new EntityQueryMap();
		map.put("employeeNumber", new String[] { "0" });
		List list = flyDataService.findAll("suser", null, map, false);
		Assert.assertNotNull(list);
	}

	@Test
	public void querySUserForEmployeeAndNameEqual() {
		EntityQueryMap map = new EntityQueryMap();
		map.put("employeeNumber", new String[] { "0" });
		map.put("name", new String[] { "test" });
		List list = flyDataService.findAll("suser", null, map, false);
		Assert.assertNotNull(list);
	}

	@Test
	public void queryForSUserForNull() {
		List list = flyDataService.findAll("suser", null, null, false);
		Assert.assertNotNull(list);
	}

	@Test
	public void queryForSUserForUser() {
		EntityQueryMap map = new EntityQueryMap();
		map.put("title", new String[] { "sfdasdfa" });
		List list = flyDataService.findAll("suser", null, map, false);
		Assert.assertNotNull(list);
	}

	private void querySUserBySampleQuery(FilterDefinition... filters) {
	}

	@Test
	public void querySUserByFilterForString() {
		FilterDefinition filter = new FilterDefinition("name", SQLOperator.EQUAL, "test");
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("name", SQLOperator.NOTEQUAL, "test");
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("name", SQLOperator.ISNULL);
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("name", SQLOperator.NOTNULL);
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("name", SQLOperator.IN, "test1", "test2");
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("name", SQLOperator.LIKE, "test%");
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("name", SQLOperator.NOTLIKE, "test%");
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("name", SQLOperator.GREATERTHAN, "test");
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("name", SQLOperator.LESSTHAN, "test");
		querySUserBySampleQuery(filter);
	}

	@Test
	public void querySUserByFilterForLong() {
		Long value = 1l;
		Long value2 = 2l;
		FilterDefinition filter = new FilterDefinition("employeeNumber", SQLOperator.EQUAL, value);
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("employeeNumber", SQLOperator.NOTEQUAL, value);
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("employeeNumber", SQLOperator.ISNULL);
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("employeeNumber", SQLOperator.NOTNULL);
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("employeeNumber", SQLOperator.IN, value, value2);
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("employeeNumber", SQLOperator.GREATERTHAN, value);
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("employeeNumber", SQLOperator.LESSTHAN, value);
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("employeeNumber", SQLOperator.GREATERTHANOREQUALTO, value);
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("employeeNumber", SQLOperator.LESSTHANOREQUALTO, value);
		querySUserBySampleQuery(filter);
	}

	@Test
	public void querySUserByFilterForDate() {
		Date value = Calendar.getInstance().getTime();
		Date value2 = Calendar.getInstance().getTime();
		FilterDefinition filter = new FilterDefinition("created", SQLOperator.EQUAL, value);
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("created", SQLOperator.NOTEQUAL, value);
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("created", SQLOperator.ISNULL);
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("created", SQLOperator.NOTNULL);
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("created", SQLOperator.IN, value, value2);
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("created", SQLOperator.GREATERTHAN, value);
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("created", SQLOperator.LESSTHAN, value);
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("created", SQLOperator.BETWEEN, value, value2);
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("created", SQLOperator.GREATERTHANOREQUALTO, value);
		querySUserBySampleQuery(filter);
		filter = new FilterDefinition("created", SQLOperator.LESSTHANOREQUALTO, value);
		querySUserBySampleQuery(filter);
	}

	@Test
	public void querySAccessLog() {
		EntityQueryMap params = new EntityQueryMap();
		List list = flyDataService.findAll("accesslog", null, params, false);
		Assert.assertNotNull(list);
	}

	@Test
	public void querySAccessLogForAllFilter() {
		EntityQueryMap params = new EntityQueryMap();
		params.put("usedtime._startValue", new String[] { "5" });
		params.put("usedtime._endValue", new String[] { "15" });
		params.put("host", new String[] { "127.0.0.1" });
		params.put("status", new String[] { "200" });
		params.put("url", new String[] { "/vp" });
		List list = flyDataService.findAll("accesslog", null, params, false);
		Assert.assertNotNull(list);
	}

}
