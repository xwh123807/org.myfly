package org.myfly.platform.visualpage3;

import java.net.URI;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.domain.RestControllerInfo;
import org.myfly.platform.visualpage3.define.FTab;
import org.myfly.platform.visualpage3.define.FlyViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class FlyMemoryViewModelRestServiceTest {
	@Autowired
	private TestRestTemplate service;

	private URI getUri(String path, Object... urlVariables) {
		return service.getRestTemplate().getUriTemplateHandler().expand("/mvm/" + path + "/", urlVariables);
	}

	@Test
	public void help() {
		ResponseEntity<RestControllerInfo> result = service.getForEntity(getUri("help"), RestControllerInfo.class);
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertNotNull(result.getBody());
	}

	@Test
	public void getFlyViewModel() {
		ResponseEntity<String[]> result = service.getForEntity(getUri("list"), String[].class);
		Assert.assertEquals(200, result.getStatusCodeValue());
		Assert.assertNotNull(result.getBody());
		Stream.of(result.getBody()).forEach(item -> {
			ResponseEntity<FlyViewModel> result2 = service.getForEntity(getUri(item), FlyViewModel.class);
			Assert.assertEquals(200, result2.getStatusCodeValue());
			Assert.assertNotNull(result2.getBody());
			result2.getBody().getTabs().values().forEach(tab -> {
				ResponseEntity<FTab> result3 = service.getForEntity(getUri(item + "/" + tab.getName()), FTab.class);
				Assert.assertEquals(200, result3.getStatusCodeValue());
				Assert.assertNotNull(result3.getBody());
			});
		});
	}
}
