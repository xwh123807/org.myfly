package org.myfly.platform.core3.metadata;

import java.net.URI;
import java.util.Map;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.domain.RestControllerInfo;
import org.myfly.platform.core3.metadata.define.FDataType;
import org.myfly.platform.core3.metadata.define.FElement;
import org.myfly.platform.core3.metadata.define.FEntityType;
import org.myfly.platform.core3.metadata.define.FRefList;
import org.myfly.platform.core3.metadata.define.FRefTable;
import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class FlyMetaDataRestServiceTest {
	@Autowired
	private TestRestTemplate service;

	private URI getUri(String path, Object... urlVariables) {
		return service.getRestTemplate().getUriTemplateHandler().expand("/mdm/" + path + "/", urlVariables);
	}

	@Test
	public void help() {
		ResponseEntity<RestControllerInfo> result = service.getForEntity(getUri("help"), RestControllerInfo.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertNotNull(result.getBody());
	}

	@Test
	public void getDataTypes() {
		ResponseEntity<Map<String, FDataType>> result = service.exchange(getUri("datatypes"), HttpMethod.GET, null,
				new ParameterizedTypeReference<Map<String, FDataType>>() {
				});
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertNotNull(result.getBody());
		Assert.assertTrue(result.getBody().keySet().size() > 0);
		result.getBody().keySet().forEach(item -> {
			ResponseEntity<FDataType> result2 = service.getForEntity(getUri("datatypes/" + item), FDataType.class);
			Assert.assertEquals(200, result2.getStatusCodeValue());
			Assert.assertNotNull(result2.getBody());
		});
	}

	@Test
	public void getElements() {
		ResponseEntity<Map<String, FElement>> result = service.exchange(getUri("elements"), HttpMethod.GET, null,
				new ParameterizedTypeReference<Map<String, FElement>>() {
				});
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertNotNull(result.getBody());
		Assert.assertTrue(result.getBody().keySet().size() > 0);
		result.getBody().keySet().forEach(item -> {
			ResponseEntity<FElement> result2 = service.getForEntity(getUri("elements/" + item), FElement.class);
			Assert.assertEquals(200, result2.getStatusCodeValue());
			Assert.assertNotNull(result2.getBody());
		});
	}

	@Test
	public void getEntityTypes() {
		ResponseEntity<Map<String, FEntityType>> result = service.exchange(getUri("entitytypes"), HttpMethod.GET, null,
				new ParameterizedTypeReference<Map<String, FEntityType>>() {
				});
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertNotNull(result.getBody());
		Assert.assertTrue(result.getBody().keySet().size() > 0);
		result.getBody().keySet().forEach(item -> {
			ResponseEntity<FEntityType> result2 = service.getForEntity(getUri("entitytypes/" + item),
					FEntityType.class);
			Assert.assertEquals(200, result2.getStatusCodeValue());
			Assert.assertNotNull(result2.getBody());
		});
	}

	@Test
	public void getRefTables() {
		ResponseEntity<Map<String, FRefTable>> result = service.exchange(getUri("reftables"), HttpMethod.GET, null,
				new ParameterizedTypeReference<Map<String, FRefTable>>() {
				});
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertNotNull(result.getBody());
		Assert.assertTrue(result.getBody().keySet().size() > 0);
		result.getBody().keySet().forEach(item -> {
			ResponseEntity<FRefTable> result2 = service.getForEntity(getUri("reftables/" + item), FRefTable.class);
			Assert.assertEquals(200, result2.getStatusCodeValue());
			Assert.assertNotNull(result2.getBody());
		});
	}

	@Test
	public void getRefLists() {
		ResponseEntity<Map<String, FRefList>> result = service.exchange(getUri("reflists"), HttpMethod.GET, null,
				new ParameterizedTypeReference<Map<String, FRefList>>() {
				});
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertNotNull(result.getBody());
		Assert.assertTrue(result.getBody().keySet().size() > 0);
		result.getBody().keySet().forEach(item -> {
			ResponseEntity<FRefList> result2 = service.getForEntity(getUri("reflists/" + item), FRefList.class);
			Assert.assertEquals(200, result2.getStatusCodeValue());
			Assert.assertNotNull(result2.getBody());
		});
	}

	@Test
	public void getFlyDataModel() {
		ResponseEntity<String[]> result = service.getForEntity(getUri("dm"), String[].class);
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertTrue(result.getBody().length > 0);
		Stream.of(result.getBody()).forEach(item -> {
			ResponseEntity<FlyDataModel> result2 = service.getForEntity(getUri("dm/" + item), FlyDataModel.class);
			Assert.assertEquals(200, result2.getStatusCodeValue());
			Assert.assertNotNull(result2.getBody());
		});
	}
}
