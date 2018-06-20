package org.myfly.platform.core3.metadata;

import java.net.URI;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core3.metadata.define.FlyTableDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class MetaDataRestV3ServiceTest {
	@Autowired
	private TestRestTemplate service;

	private URI getUri(String path, Object... urlVariables) {
		return service.getRestTemplate().getUriTemplateHandler().expand("/meta3/" + path + "/", urlVariables);
	}

	private void assertEntityModel(String className) {
		ResponseEntity<FlyTableDefinition> result = service.getForEntity(getUri("{className}", className),
				FlyTableDefinition.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertNotNull(result.getBody());
	}

	@Test
	public void list() {
		ResponseEntity<String[]> result2 = service.getForEntity(getUri("list"), String[].class);
		Assert.assertNotNull(result2.getBody());
		Assert.assertEquals(200, result2.getStatusCodeValue());
		Assert.assertTrue(result2.getBody().length > 0);
		Stream.of(result2.getBody()).forEach(className -> {
			assertEntityModel(className);
		});
	}
}
