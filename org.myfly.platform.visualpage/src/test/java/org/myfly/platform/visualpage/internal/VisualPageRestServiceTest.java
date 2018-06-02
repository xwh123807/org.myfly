package org.myfly.platform.visualpage.internal;

import java.net.URI;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.metadata.internal.EntityViewInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class VisualPageRestServiceTest {
	@Autowired
	private TestRestTemplate service;

	private URI getUri(String path, Object... urlVariables) {
		return service.getRestTemplate().getUriTemplateHandler().expand("/vpmeta/" + path + "/", urlVariables);
	}

	@Test
	public void help() {
		ResponseEntity<String> result = service.getForEntity("/vpmeta", String.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
	}

	@Test
	public void views() {
		ResponseEntity<EntityViewInfo[]> result = service.getForEntity(getUri("views"), EntityViewInfo[].class);
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertNotNull(result.getBody());
	}
	
	@Test
	public void builders() {
		ResponseEntity<EntityViewInfo[]> result = service.getForEntity(getUri("builders"), EntityViewInfo[].class);
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertNotNull(result.getBody());
	}
}
