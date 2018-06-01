package org.myfly.platform.core.metadata.internal;

import java.net.URI;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.testdata.Detail;
import org.myfly.platform.core.testdata.Master;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class MetaDataRestServiceTest {
	@Autowired
	private TestRestTemplate service;

	private URI getUri(String path, Object... urlVariables) {
		return service.getRestTemplate().getUriTemplateHandler().expand("/meta/" + path + "/", urlVariables);
	}

	@Test
	public void help() {
		ResponseEntity<String> result2 = service.getForEntity("/meta", String.class);
		Assert.assertEquals(200, result2.getStatusCodeValue());
	}

	@Test
	public void getMaster() {
		// by class name
		ResponseEntity<String> result = service.getForEntity(getUri("{entity}", Master.class.getName()), String.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
		// by short name
		ResponseEntity<String> result2 = service.getForEntity(getUri("{entity}", "master"), String.class);
		Assert.assertEquals(200, result2.getStatusCodeValue());
	}

	@Test
	public void getDetail() {
		// by class name
		ResponseEntity<String> result = service.getForEntity(getUri("{entity}", Detail.class.getName()), String.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
		// by short name
		ResponseEntity<String> result2 = service.getForEntity(getUri("{entity}", "detail"), String.class);
		Assert.assertEquals(200, result2.getStatusCodeValue());
	}
}
