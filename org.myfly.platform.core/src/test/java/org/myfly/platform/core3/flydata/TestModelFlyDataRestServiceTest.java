package org.myfly.platform.core3.flydata;

import java.net.URI;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core3.flydata.service.FlyEntityMap;
import org.myfly.platform.core3.model.test.PTMaster;
import org.myfly.platform.core3.testmodel.AssertEntity;
import org.myfly.platform.core3.testmodel.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class TestModelFlyDataRestServiceTest {
	@Autowired
	private TestRestTemplate service;

	private TestModel model;

	private String entityName = PTMaster.class.getName();

	private URI getUri(String path, Object... urlVariables) {
		return service.getRestTemplate().getUriTemplateHandler().expand("/flydata3/" + path + "/", urlVariables);
	}

	@Test
	public void help() {
		ResponseEntity<String> result = service.getForEntity(getUri("help"), String.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
	}

	@Before
	public void before() {
		model = new TestModel();
		HttpEntity<FlyEntityMap> request = new HttpEntity<FlyEntityMap>(model.getFlyTestEntity());
		ResponseEntity<String> result = service.postForEntity(getUri("{entityName}", entityName), request,
				String.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
	}

	@After
	public void after() {
		service.delete(getUri("{entityName}/{uid}", entityName, model.getUid()));
	}

	@Test
	public void find() {
		ResponseEntity<FlyEntityMap> result = service
				.getForEntity(getUri("{entityName}/{uid}", entityName, model.getUid()), FlyEntityMap.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
		AssertEntity.assertFlyEntityAllFields(model.getFlyTestEntity(), result.getBody());
	}
}
