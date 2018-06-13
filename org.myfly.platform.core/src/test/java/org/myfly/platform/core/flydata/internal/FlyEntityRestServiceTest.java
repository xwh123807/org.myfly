package org.myfly.platform.core.flydata.internal;

import java.net.URI;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.flydata.service.FlyEntityResult;
import org.myfly.platform.core.testmodel.FlyEntityTestModel;
import org.myfly.platform.core.testmodel.Master;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class FlyEntityRestServiceTest {
	@Autowired
	private TestRestTemplate service;

	private URI getUri(String path, Object... urlVariables) {
		return service.getRestTemplate().getUriTemplateHandler().expand("/flydata2/" + path + "/", urlVariables);
	}

	@Test
	public void help() {
		ResponseEntity<String> result = service.getForEntity(getUri("help"), String.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
	}

	@Test
	public void findAll() {
		ResponseEntity<ArrayList> result = service.getForEntity(getUri("{entityName}", Master.class.getName()),
				ArrayList.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
	}

	@Test
	public void baseAddUpdateDelete() {
		FlyEntityTestModel model = new FlyEntityTestModel();
		// create
		FlyEntityResult entity = FlyEntityResult.fromEntity(model.getTestEntity());
		HttpEntity<FlyEntityResult> httpEntity = new HttpEntity<FlyEntityResult>(entity);
		ResponseEntity<String> result = service.postForEntity(getUri("{entityName}", Master.class.getName()),
				httpEntity, String.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
		String uid = result.getBody();
		Assert.assertNotNull(uid);
		// find
		ResponseEntity<FlyEntityResult> result2 = service
				.getForEntity(getUri("{entityName}/{uid}", Master.class.getName(), uid), FlyEntityResult.class);
		Assert.assertEquals(200, result2.getStatusCodeValue());
		FlyEntityResult expectedFlyEntity = model.getFlyTestEntity();
		model.assertFlyEntityAllFields(expectedFlyEntity, result2.getBody());
		// patch
		HttpEntity<FlyEntityResult> requestEntity = new HttpEntity<FlyEntityResult>(model.getFlyChangedEntity());
		ResponseEntity<String> result3 = service.exchange(getUri("{entityName}/{uid}", Master.class.getName(), uid),
				HttpMethod.PATCH, requestEntity, String.class);
		Assert.assertEquals(200, result3.getStatusCodeValue());
		// find patch
		ResponseEntity<FlyEntityResult> result4 = service
				.getForEntity(getUri("{entityName}/{uid}", Master.class.getName(), uid), FlyEntityResult.class);
		Assert.assertEquals(200, result4.getStatusCodeValue());
		model.assertFlyEntityAllFields(model.getFlyChangedEntity(), result4.getBody());
		Assert.assertNull(result4.getBody().get("detail1"));
		Assert.assertNull(result4.getBody().get("details"));
		// del
		service.delete(getUri("{entityName}/{uid}", Master.class.getName(), uid));
	}
}
