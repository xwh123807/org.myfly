package org.myfly.platform.visualpage.admin;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.myfly.platform.VisualPageApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.ModelAndView;

@SpringBootTest(classes = VisualPageApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AdminControllerTest {
	@Autowired
	private AdminController adminController;
	private String cacheName = "visualpage-service";
	
	@Test
	public void help() {
		Map<String, String> helps = adminController.help();
		Assert.assertNotNull(helps);
	}

	@Test
	public void autoconfig() {
		ModelAndView view = adminController.autoconfig(null);
		Assert.assertNotNull(view);
	}

	@Test
	public void beans() throws Exception {
		ModelAndView view = adminController.beans(null);
		Assert.assertNotNull(view);
	}

	@Test
	public void cacheClear() {
		ModelAndView view = adminController.cacheClear();
		Assert.assertNotNull(view);
	}

	@Test
	public void cacheItem() {
		ModelAndView view = adminController.cacheItem(cacheName, null);
		Assert.assertNotNull(view);
	}

	@Test
	public void cacheList() {
		ModelAndView view = adminController.cacheList(null);
		Assert.assertNotNull(view);
	}

	@Test
	public void clearCacheItem() {
		ModelAndView view = adminController.clearCacheItem(cacheName, null);
		Assert.assertNotNull(view);
	}

	@Test
	public void dump() {
		ModelAndView view = adminController.dump(null);
		Assert.assertNotNull(view);
	}

	@Test
	public void env() {
		ModelAndView view = adminController.env(null);
		Assert.assertNotNull(view);
	}

	// @Test
	// public void getMessageStatics() throws Exception{
	// ModelAndView view = adminController.getMessageStatics();
	// Assert.assertNotNull(view);
	// }

	@Test
	public void listAllTemplateBuilder() {
		ModelAndView view = adminController.listAllTemplateBuilder(null);
		Assert.assertNotNull(view);
	}

	@Test
	public void listAllEntitiesView() {
		ModelAndView view = adminController.listAllEntitiesView(null);
		Assert.assertNotNull(view);
	}

	@Test(expected = AssertionError.class)
	public void health() {
		ModelAndView view = adminController.health();
		Assert.assertNotNull(view);
	}

	@Test(expected = AssertionError.class)
	public void info() {
		ModelAndView view = adminController.info();
		Assert.assertNotNull(view);
	}

	@Test
	public void configprops() {
		ModelAndView view = adminController.configprops(null);
		Assert.assertNotNull(view);
	}

	@Test
	public void mappings() {
		ModelAndView view = adminController.mappings(null);
		Assert.assertNotNull(view);
	}

	@Test
	public void metrics() {
		ModelAndView view = adminController.metrics(null);
		Assert.assertNotNull(view);
	}

	@Test
	public void trace() {
		ModelAndView view = adminController.trace(null);
		Assert.assertNotNull(view);
	}
}
