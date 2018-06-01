package org.myfly.platform.core.flydata.internal;

import java.net.URI;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.flydata.service.EntityMap;
import org.myfly.platform.core.flydata.service.FlyEntityMap;
import org.myfly.platform.core.system.domain.KeyEntity;
import org.myfly.platform.core.testmodel.Detail;
import org.myfly.platform.core.testmodel.Master;
import org.myfly.platform.core.utils.UUIDUtil;
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
public class FlyDataAccessRestServiceTest {
	@Autowired
	private TestRestTemplate service;

	private URI getUri(String path, Object... urlVariables) {
		return service.getRestTemplate().getUriTemplateHandler().expand("/flydata/" + path + "/", urlVariables);
	}

	@Test
	public void help() {
		ResponseEntity<String> result = service.getForEntity("/flydata", String.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
	}

	@Test
	public void masterCUQD() {
		// create
		EntityMap values = new EntityMap();
		values.put("uid", UUIDUtil.newUUID());
		values.put("name", "name");
		HttpEntity<EntityMap> entity = new HttpEntity<>(values);
		ResponseEntity<KeyEntity> result = service.postForEntity(getUri("{entity}", Master.class.getName()), entity,
				KeyEntity.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
		String uid = result.getBody().getUid();
		// update
		EntityMap values2 = new EntityMap();
		values2.put("name", "name changed");
		HttpEntity<EntityMap> entity2 = new HttpEntity<>(values2);
		service.put(getUri("{entity}/{uid}", Master.class.getName(), uid), entity2);
		// find
		ResponseEntity<FlyEntityMap> flyEntity = service
				.getForEntity(getUri("{entity}/{uid}", Master.class.getName(), uid), FlyEntityMap.class);
		Assert.assertEquals(200, flyEntity.getStatusCodeValue());
		Assert.assertEquals(values2.get("name"), flyEntity.getBody().get("name"));
		// find All to page
		ResponseEntity<String> flyEntity3 = service.getForEntity(getUri("{entity}", Master.class.getName()),
				String.class);
		Assert.assertEquals(200, flyEntity3.getStatusCodeValue());
		// find All to list
		ResponseEntity<String> flyEntity4 = service.getForEntity(getUri("find/{entity}", Master.class.getName()),
				String.class);
		Assert.assertEquals(200, flyEntity4.getStatusCodeValue());
		// find by page
		ResponseEntity<String> flyEntity5 = service.getForEntity(getUri("findByPage/{entity}", Master.class.getName()),
				String.class);
		Assert.assertEquals(200, flyEntity5.getStatusCodeValue());
		// del
		service.delete(getUri("{entity}/{uid}", Master.class.getName(), uid));
		// find
		ResponseEntity<FlyEntityMap> flyEntity2 = service
				.getForEntity(getUri("{entity}/{uid}", Master.class.getName(), uid), FlyEntityMap.class);
		Assert.assertEquals(200, flyEntity.getStatusCodeValue());
		Assert.assertEquals(null, flyEntity2.getBody());
	}

	@Test
	public void masterDetailCURQ() {
		// create master
		EntityMap values = new EntityMap();
		values.put("uid", UUIDUtil.newUUID());
		values.put("name", "name");
		HttpEntity<EntityMap> entity = new HttpEntity<>(values);
		ResponseEntity<KeyEntity> result = service.postForEntity(getUri("{entity}", Master.class.getName()), entity,
				KeyEntity.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
		String uid = result.getBody().getUid();
		// create detail
		EntityMap detail = new EntityMap();
		detail.put("uid", UUIDUtil.newUUID());
		detail.put("title", "title");
		HttpEntity<EntityMap> detailEntity = new HttpEntity<>(detail);
		ResponseEntity<KeyEntity> detailResult = service.postForEntity(
				getUri("{entity}/{uid}/{subTableAttr}", Master.class.getName(), uid, "details"), detailEntity,
				KeyEntity.class);
		Assert.assertEquals(200, detailResult.getStatusCodeValue());
		String subUid = detailResult.getBody().getUid();
		// update detail
		EntityMap detail2 = new EntityMap();
		detail2.put("title", "title changed");
		HttpEntity<EntityMap> detailEntity2 = new HttpEntity<>(detail2);
		service.put(getUri("{entity}/{uid}/{subTableAttr}/{subUid}", Master.class.getName(), uid, "details", subUid),
				detailEntity2);
		// find detail
		ResponseEntity<FlyEntityMap> flyEntity2 = service
				.getForEntity(getUri("{entity}/{uid}", Detail.class.getName(), subUid), FlyEntityMap.class);
		Assert.assertEquals(200, flyEntity2.getStatusCodeValue());
		Assert.assertEquals(detail2.get("title"), flyEntity2.getBody().get("title"));
		// find master's detail to page
		ResponseEntity<String> flyEntity3 = service.exchange(
				getUri("{entity}/{uid}/{subTableAttr}", Master.class.getName(), uid, "details"), HttpMethod.GET, null,
				String.class);
		Assert.assertEquals(200, flyEntity3.getStatusCodeValue());
		// find master's detail by page to list
		ResponseEntity<String> flyEntity4 = service.exchange(
				getUri("findByPage/{entity}/{uid}/{subTableAttr}", Master.class.getName(), uid, "details"),
				HttpMethod.GET, null, String.class);
		Assert.assertEquals(200, flyEntity4.getStatusCodeValue());
		// find master's all detail to list
		ResponseEntity<String> flyEntity6 = service.exchange(
				getUri("find/{entity}/{uid}/{subTableAttr}", Master.class.getName(), uid, "details"), HttpMethod.GET,
				null, String.class);
		Assert.assertEquals(200, flyEntity6.getStatusCodeValue());
		// del detail
		service.delete(
				getUri("{entity}/{uid}/{subTableAttr}/{subUid}", Master.class.getName(), uid, "details", subUid));
		// find detail
		ResponseEntity<FlyEntityMap> flyEntity = service
				.getForEntity(getUri("{entity}/{uid}", Detail.class.getName(), subUid), FlyEntityMap.class);
		Assert.assertEquals(200, flyEntity.getStatusCodeValue());
		Assert.assertEquals(null, flyEntity.getBody());
	}
}
