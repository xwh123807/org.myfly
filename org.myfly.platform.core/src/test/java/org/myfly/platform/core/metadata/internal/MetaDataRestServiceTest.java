package org.myfly.platform.core.metadata.internal;

import java.net.URI;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
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
		ResponseEntity<String> result2 = service.getForEntity("/meta/help", String.class);
		Assert.assertEquals(200, result2.getStatusCodeValue());
	}

	@Test
	public void list() {
		ResponseEntity<String[]> result2 = service.getForEntity("/meta", String[].class);
		Assert.assertNotNull(result2.getBody());
		Assert.assertEquals(200, result2.getStatusCodeValue());
	}

	@Test
	public void featchAllEntity() {
		ResponseEntity<String[]> result2 = service.getForEntity("/meta", String[].class);
		Assert.assertEquals(200, result2.getStatusCodeValue());
		Stream.of(result2.getBody()).forEach(item -> {
			//获取实体元模型数据
			ResponseEntity<String> result = service.getForEntity(getUri("{entity}", item), String.class);
			Assert.assertEquals(200, result.getStatusCodeValue());
			//获取实体主键
			result = service.getForEntity(getUri("{entity}/pk", item), String.class);
			Assert.assertEquals(200, result.getStatusCodeValue());
			//获取实体字段
			result = service.getForEntity(getUri("{entity}/fields", item), String.class);
			Assert.assertEquals(200, result.getStatusCodeValue());
			//获取实体列表视图
			result = service.getForEntity(getUri("{entity}/listviews", item), String.class);
			Assert.assertEquals(200, result.getStatusCodeValue());
			//获取实体表单视图
			result = service.getForEntity(getUri("{entity}/formviews", item), String.class);
			Assert.assertEquals(200, result.getStatusCodeValue());
			//获取实体大纲视图
			result = service.getForEntity(getUri("{entity}/outlineviews", item), String.class);
			Assert.assertEquals(200, result.getStatusCodeValue());
		});
	}
}
