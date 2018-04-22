package org.myfly.platform.core.visualpage;

import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.domain.AlertLevel;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.test.MyMatcher;
import org.myfly.platform.system.stdtest.domain.StdTestTable;
import org.myfly.platform.test.MockMVCTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes = CoreApplication.class)
public class EntityVisualPageControllerTest extends MockMVCTestCase {
	private String table = "stdtesttable";
	private String uid;

	@Autowired
	private IJpaDataAccessService dataAccessService;

	@Before
	public void before() {
		if (StringUtils.isBlank(uid)) {
			StdTestTable entity = (StdTestTable) dataAccessService.findAll(table).get(0);
			uid = entity.getUid();
		}
	}

	@Test
	public void viewOrEditEntityForView() throws Exception {
		mockMvc.perform(get("/vp/stdtesttable/" + uid)).andExpect(status().isOk());
	}

	@Test
	public void viewOrEditEntityForEdit() throws Exception {
		mockMvc.perform(get("/vp/stdtesttable/" + uid + "?form")).andExpect(status().isOk());
	}

	@Test
	public void showNewEntity() throws Exception {
		mockMvc.perform(get("/vp/stdtesttable")).andExpect(status().isOk());
	}

	@Test
	public void saveEntity() throws Exception {
		mockMvc.perform(post("/vp/stdtesttable?name=test&active=true")).andExpect(status().isOk())
				.andExpect(MyMatcher.alertTitleFromContent("保存成功"));
	}

	@Test
	public void saveAndNewEntity() throws Exception {
		mockMvc.perform(patch("/vp/stdtesttable?name=test&active=true")).andExpect(status().isOk());
	}

	@Test
	public void delEntity() throws Exception {
		mockMvc.perform(delete("/vp/stdtesttable/" + uid + "")).andExpect(status().is3xxRedirection()).andDo(print())
				.andExpect(MyMatcher.alertLevel(AlertLevel.SUCCESS));
	}
	
	@Test
	public void updateEntity() throws Exception {
		mockMvc.perform(put("/vp/stdtesttable/" + uid + "?name=test2")).andExpect(status().isOk()).andDo(print());
	}
	
	@Test
	public void outlineViewEntity() throws Exception {
		mockMvc.perform(put("/vp/outline/stdtesttable/" + uid)).andExpect(status().isOk());
	}
}
