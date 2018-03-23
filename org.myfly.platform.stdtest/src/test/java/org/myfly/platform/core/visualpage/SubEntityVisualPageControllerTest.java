package org.myfly.platform.core.visualpage;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.flydata.service.IJpaAccessService;
import org.myfly.platform.core.test.MyMatcher;
import org.myfly.platform.system.stdtest.domain.StdTestTable;
import org.myfly.platform.system.stdtest.domain.StdTestTableSubA;
import org.myfly.platform.test.MockMVCTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.web.util.NestedServletException;

@SpringApplicationConfiguration(classes = CoreApplication.class)
public class SubEntityVisualPageControllerTest extends MockMVCTestCase {
	private String table = "stdtesttable";
	private String subTableAttr = "details";
	private String uid;
	private String subUid;

	@Autowired
	private IJpaAccessService dataAccessService;

	@Before
	public void before() {
		if (StringUtils.isBlank(uid)) {
			StdTestTable entity = new StdTestTable();
			entity.setName("name1");
			dataAccessService.saveEntity(entity);
			String uid = entity.getUid();
			Assert.assertNotNull(uid);
			StdTestTableSubA detailEntity = new StdTestTableSubA();
			detailEntity.setName("detailname");
			detailEntity.setStdTestTable(entity);
			dataAccessService.saveEntity(detailEntity);
			subUid = detailEntity.getUid();
		}
	}

	@Test
	public void viewOrEditEntityForView() throws Exception {
		mockMvc.perform(get("/vp/stdtesttable/" + uid + "/" + subTableAttr + "/" + subUid)).andExpect(status().isOk());
	}

	@Test
	public void viewOrEditEntityForEdit() throws Exception {
		mockMvc.perform(get("/vp/stdtesttable/" + uid + "/" + subTableAttr + "/" + subUid + "?form"))
				.andExpect(status().isOk());
	}

	@Test
	public void showNewEntity() throws Exception {
		mockMvc.perform(get("/vp/stdtesttable/" + uid + "/" + subTableAttr)).andExpect(status().isOk());
	}

	@Test
	public void saveEntity() throws Exception {
		mockMvc.perform(post("/vp/stdtesttable/" + uid + "/" + subTableAttr + "?name=test"))
				.andExpect(status().isOk()).andExpect(MyMatcher.alertTitleFromContent("保存成功."));
	}

	@Test
	public void saveAndNewEntity() throws Exception {
		mockMvc.perform(patch("/vp/stdtesttable/" + uid + "/" + subTableAttr + "?name=test")).andExpect(status().isOk())
				.andExpect(MyMatcher.alertTitleFromContent("保存成功."));
	}

	@Test
	public void delEntity() throws Exception {
		mockMvc.perform(delete("/vp/stdtesttable/" + uid + "/" + subTableAttr + "/" + subUid))
				.andExpect(status().is3xxRedirection()).andDo(print())
				.andExpect(MyMatcher.alertTitleFromContent("删除成功"));
	}

	@Test
	public void updateEntity() throws Exception {
		mockMvc.perform(put("/vp/stdtesttable/" + uid + "/" + subTableAttr + "/" + subUid + "?name=test2"))
				.andExpect(status().isOk());
	}

//	@Test
//	public void outlineViewEntity() throws Exception {
//		mockMvc.perform(get("/vp/outline/stdtesttable/" + uid + "/" + subTableAttr + "/" + subUid))
//				.andExpect(status().isOk());
//	}

	@Test
	public void printViewEntity() throws Exception {
		mockMvc.perform(get("/vp/listprint/stdtesttable/" + uid + "/" + subTableAttr))
				.andExpect(status().isOk());
	}

	@Test
	public void exportToExcel() throws Exception {
		mockMvc.perform(get("/vp/excel/stdtesttable/" + uid + "/" + subTableAttr)).andExpect(status().isOk());
	}

	@Test(expected=NestedServletException.class)
	public void exportToPdf() throws Exception {
		mockMvc.perform(get("/vp/pdf/stdtesttable/" + uid + "/" + subTableAttr)).andExpect(status().isOk());
	}

	@Test
	public void showExcelImport() throws Exception {
		mockMvc.perform(get("/vp/excelimport/stdtesttable/" + uid + "/" + subTableAttr)).andExpect(status().isOk());
	}

	@Test
	public void postExcelImport() throws Exception {
		String uploadDir = "test";
		mockMvc.perform(post("/vp/excelimport/stdtesttable/" + uid + " / " + subTableAttr + "/" + uploadDir))
				.andExpect(status().is2xxSuccessful()).andExpect(MyMatcher.alertTitleFromContent("导入失败"));
	}
}
