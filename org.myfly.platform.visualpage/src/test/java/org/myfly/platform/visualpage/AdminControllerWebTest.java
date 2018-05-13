package org.myfly.platform.visualpage;

import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.test.MockMVCTestCase;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes = CoreApplication.class)
public class AdminControllerWebTest extends MockMVCTestCase {
	@Test
	public void beans() throws Exception {
		mockMvc.perform(get("/admin/beans")).andExpect(status().isOk());
	}

	@Test
	public void mappings() throws Exception {
		mockMvc.perform(get("/admin/mappings")).andExpect(status().isOk());
	}

	@Test
	public void autoconfig() throws Exception {
		mockMvc.perform(get("/admin/autoconfig")).andExpect(status().isOk());
	}

	@Test
	public void trace() throws Exception {
		mockMvc.perform(get("/admin/trace")).andExpect(status().isOk());
	}

	@Test
	public void metrics() throws Exception {
		mockMvc.perform(get("/admin/metrics")).andExpect(status().isOk());
	}

	@Test
	public void dump() throws Exception {
		mockMvc.perform(get("/admin/dump")).andExpect(status().isOk());
	}

	@Test
	public void env() throws Exception {
		mockMvc.perform(get("/admin/env")).andExpect(status().isOk());
	}

	@Test
	public void configprops() throws Exception {
		mockMvc.perform(get("/admin/configprops")).andExpect(status().isOk());
	}

	@Test
	public void cacheList() throws Exception {
		mockMvc.perform(get("/admin/cache")).andExpect(status().isOk());
	}

	@Test
	public void cacheItemForVisualPage() throws Exception {
		mockMvc.perform(get("/admin/cache/visualpage-service")).andExpect(status().isOk());
	}

	@Test
	public void clearAllCache() throws Exception {
		mockMvc.perform(get("/admin/cache/clear")).andExpect(status().is3xxRedirection());
	}

	@Test
	public void clearCacheItemForVisualPage() throws Exception {
		mockMvc.perform(get("/admin/cache/clear/visualpage-service")).andExpect(status().isOk());
	}

	@Test
	public void listAllEntityViews() throws Exception {
		mockMvc.perform(get("/admin/entityviews")).andExpect(status().isOk());
	}
}
