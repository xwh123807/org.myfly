package org.myfly.platform.core.flydata;

import java.net.URI;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.datamodel.model.PColumn;
import org.myfly.platform.core.datamodel.model.PTable;
import org.myfly.platform.core.flydata.service.FlyEntityMap;
import org.myfly.platform.core.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

public class DataModelFlyDataRestServiceTest extends ServiceTestCase{
	@Autowired
	private TestRestTemplate service;

	private String ptableEntityName = PTable.class.getName();
	private String pcolumnEntityName = PColumn.class.getName();

	private URI getUri(String path, Object... urlVariables) {
		return service.getRestTemplate().getUriTemplateHandler()
				.expand("/flydata3/" + (path.contains("?") ? path : (path + "/")), urlVariables);
	}

	@Test
	public void findByExample() {
		ResponseEntity<FlyEntityMap[]> result = service.getForEntity(
				getUri("findByExample/{entityName}?isActive={isActive}", ptableEntityName, true), FlyEntityMap[].class);
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertTrue(result.getBody().length > 0);
	}

	@Test
	public void findAll() {
		ResponseEntity<FlyEntityMap[]> result = service.getForEntity(getUri("{entityName}", ptableEntityName),
				FlyEntityMap[].class);
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertTrue(result.getBody().length > 1);

		Stream.of(result.getBody()).forEach(item -> {
			String tableID = (String) item.get("tableID");
			ResponseEntity<FlyEntityMap[]> result2 = service.getForEntity(
					getUri("findByExample/{entityName}?tableID={tableID}", pcolumnEntityName, tableID),
					FlyEntityMap[].class);
			Assert.assertEquals(200, result2.getStatusCodeValue());
			Assert.assertTrue(result2.getBody().length > 1);
		});
	}
}
