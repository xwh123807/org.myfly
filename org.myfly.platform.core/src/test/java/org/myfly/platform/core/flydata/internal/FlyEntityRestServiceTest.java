package org.myfly.platform.core.flydata.internal;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.flydata.service.FlyEntityResult;
import org.myfly.platform.core.testmodel.FlyEntityTestModel;
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
public class FlyEntityRestServiceTest {
	@Autowired
	private TestRestTemplate service;

	private FlyEntityTestModel model;

	private String uid;

	private URI getUri(String path, Object... urlVariables) {
		return service.getRestTemplate().getUriTemplateHandler().expand("/flydata2/" + path + "/", urlVariables);
	}

	@Test
	public void help() {
		ResponseEntity<String> result = service.getForEntity(getUri("help"), String.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
	}

	@Before
	public void before() {
		model = new FlyEntityTestModel();
		// create
		FlyEntityResult entity = FlyEntityResult.fromEntity(model.getTestEntity());
		HttpEntity<FlyEntityResult> httpEntity = new HttpEntity<FlyEntityResult>(entity);
		ResponseEntity<String> result = service.postForEntity(getUri("{entityName}", Master.class.getName()),
				httpEntity, String.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
		uid = result.getBody();
		Assert.assertNotNull(uid);
	}

	@After
	public void after() {
		// del
		service.delete(getUri("{entityName}/{uid}", Master.class.getName(), uid));
	}

	@Test
	public void findAll() {
		ResponseEntity<ArrayList> result = service.getForEntity(getUri("{entityName}", Master.class.getName()),
				ArrayList.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
	}

	@Test
	public void find() {
		// find
		ResponseEntity<FlyEntityResult> result2 = service
				.getForEntity(getUri("{entityName}/{uid}", Master.class.getName(), uid), FlyEntityResult.class);
		Assert.assertEquals(200, result2.getStatusCodeValue());
		FlyEntityResult expectedFlyEntity = model.getFlyTestEntity();
		model.assertFlyEntityAllFields(expectedFlyEntity, result2.getBody());
	}

	@Test
	public void updateForChanged() {
		// update
		HttpEntity<FlyEntityResult> requestEntity = new HttpEntity<FlyEntityResult>(model.getFlyChangedEntity());
		ResponseEntity<String> result3 = service.exchange(getUri("{entityName}/{uid}", Master.class.getName(), uid),
				HttpMethod.PUT, requestEntity, String.class);
		Assert.assertEquals(200, result3.getStatusCodeValue());
		// find update
		ResponseEntity<FlyEntityResult> result4 = service
				.getForEntity(getUri("{entityName}/{uid}", Master.class.getName(), uid), FlyEntityResult.class);
		Assert.assertEquals(200, result4.getStatusCodeValue());
		Assert.assertNull(result4.getBody().get("detail1"));
		Assert.assertNull(result4.getBody().get("details"));
		model.assertFlyEntityAllFields(model.getFlyChangedEntity(), result4.getBody());
	}
	
	@Test
	public void updateName() {
		FlyEntityResult entitya = new FlyEntityResult();
		entitya.put("name", "name changed");
		HttpEntity<FlyEntityResult> requestEntity = new HttpEntity<FlyEntityResult>(entitya);
		ResponseEntity<String> result1 = service.exchange(getUri("{entityName}/{uid}", Master.class.getName(), uid),
				HttpMethod.PUT, requestEntity, String.class);
		Assert.assertEquals(200, result1.getStatusCodeValue());
		//check
		ResponseEntity<FlyEntityResult> result2 = service
				.getForEntity(getUri("{entityName}/{uid}", Master.class.getName(), uid), FlyEntityResult.class);
		Assert.assertEquals(200, result2.getStatusCodeValue());
		Assert.assertNull(result2.getBody().get("detail1"));
		Assert.assertNull(result2.getBody().get("details"));
		model.assertFlyEntityAllFields(entitya, result2.getBody());
	}
	
	/**
	 * TODO 只发出了update detail1=null的语句，但detai1的实体记录仍然存在，增加了orphanRemoval=true也无效。
	 */
	@Test
	public void mergeDetail1ToNull() {
		FlyEntityResult entitya = new FlyEntityResult();
		entitya.put("detail1", null);
		HttpEntity<FlyEntityResult> requestEntity = new HttpEntity<FlyEntityResult>(entitya);
		ResponseEntity<String> result1 = service.exchange(getUri("{entityName}/{uid}", Master.class.getName(), uid),
				HttpMethod.PATCH, requestEntity, String.class);
		Assert.assertEquals(200, result1.getStatusCodeValue());
		//check
		ResponseEntity<FlyEntityResult> result2 = service
				.getForEntity(getUri("{entityName}/{uid}", Master.class.getName(), uid), FlyEntityResult.class);
		Assert.assertEquals(200, result2.getStatusCodeValue());
		Assert.assertNull(result2.getBody().get("detail1"));
		Assert.assertNotNull(result2.getBody().get("details"));
		model.assertFlyEntityAllFields(model.getFlyTestEntity().merge(entitya), result2.getBody());
	}
	
	/**
	 * 只发出更新detail1的语句
	 */
	@Test
	public void mergeDetail1ToChange() {
		FlyEntityResult entitya = new FlyEntityResult();
		Map detail = new HashMap<>();
		detail.put("title", "title changed");
		entitya.put("detail1", detail);
		HttpEntity<FlyEntityResult> requestEntity = new HttpEntity<FlyEntityResult>(entitya);
		ResponseEntity<String> result1 = service.exchange(getUri("{entityName}/{uid}", Master.class.getName(), uid),
				HttpMethod.PATCH, requestEntity, String.class);
		Assert.assertEquals(200, result1.getStatusCodeValue());
		//check
		ResponseEntity<FlyEntityResult> result2 = service
				.getForEntity(getUri("{entityName}/{uid}", Master.class.getName(), uid), FlyEntityResult.class);
		Assert.assertEquals(200, result2.getStatusCodeValue());
		Assert.assertNotNull(result2.getBody().get("detail1"));
		Assert.assertNotNull(result2.getBody().get("details"));
		model.assertFlyEntityAllFields(model.getFlyTestEntity().merge(entitya), result2.getBody());
	}
	
	/**
	 * TODO 没有执行任何语句，子表没有清空
	 */
	@Test
	public void mergeSubTableDetailsToNull() {
		FlyEntityResult entitya = new FlyEntityResult();
		entitya.put("details", null);
		HttpEntity<FlyEntityResult> requestEntity = new HttpEntity<FlyEntityResult>(entitya);
		ResponseEntity<String> result1 = service.exchange(getUri("{entityName}/{uid}", Master.class.getName(), uid),
				HttpMethod.PATCH, requestEntity, String.class);
		Assert.assertEquals(200, result1.getStatusCodeValue());
		//check
		ResponseEntity<FlyEntityResult> result2 = service
				.getForEntity(getUri("{entityName}/{uid}", Master.class.getName(), uid), FlyEntityResult.class);
		Assert.assertEquals(200, result2.getStatusCodeValue());
		Assert.assertNotNull(result2.getBody().get("detail1"));
		Assert.assertNull(result2.getBody().get("details"));
		model.assertFlyEntityAllFields(model.getFlyTestEntity().merge(entitya), result2.getBody());
	}
	
	/**
	 * 执行了增加子表的记录
	 */
	@Test
	public void mergeSubTableDetailsAdd() {
		FlyEntityResult entitya = new FlyEntityResult();
		Set details = new HashSet<>();
		Map detail = new HashMap<>();
		detail.put("uid", UUIDUtil.newUUID());
		detail.put("master", uid);
		details.add(detail);
		entitya.put("details", details);
		HttpEntity<FlyEntityResult> requestEntity = new HttpEntity<FlyEntityResult>(entitya);
		ResponseEntity<String> result1 = service.exchange(getUri("{entityName}/{uid}", Master.class.getName(), uid),
				HttpMethod.PATCH, requestEntity, String.class);
		Assert.assertEquals(200, result1.getStatusCodeValue());
		//check
		ResponseEntity<FlyEntityResult> result2 = service
				.getForEntity(getUri("{entityName}/{uid}", Master.class.getName(), uid), FlyEntityResult.class);
		Assert.assertEquals(200, result2.getStatusCodeValue());
		Assert.assertNotNull(result2.getBody().get("detail1"));
		Assert.assertNotNull(result2.getBody().get("details"));
		model.assertFlyEntityAllFields(model.getFlyTestEntity().merge(entitya), result2.getBody());
	}
}
