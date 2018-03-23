package org.myfly.platform.core.visualpage;

import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.test.MyMatcher;
import org.myfly.platform.test.MockMVCTestCase;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.web.util.NestedServletException;

@SpringApplicationConfiguration(classes = CoreApplication.class)
public class EntityListVisualPageControllerTest extends MockMVCTestCase {
	@Test
	public void listEntity() throws Exception {
		mockMvc.perform(get("/vp/list/stdtesttable")).andExpect(status().isOk());
	}

	@Test
	public void printListEntity() throws Exception {
		mockMvc.perform(get("/vp/print/stdtesttable")).andExpect(status().isOk());
	}

	@Test
	public void exportToExcel() throws Exception {
		mockMvc.perform(get("/vp/excel/stdtesttable")).andExpect(status().isOk());
	}

	@Test(expected = NestedServletException.class)
	public void exportToPdf() throws Exception {
		mockMvc.perform(get("/vp/pdf/stdtesttable")).andExpect(status().isOk());
	}

	@Test
	public void showExcelImport() throws Exception {
		mockMvc.perform(get("/vp/excelimport/stdtesttable")).andExpect(status().isOk());
	}

	@Test
	public void postExcelImport() throws Exception {
		String uploadDir = "test";
		mockMvc.perform(get("/vp/excelimport/stdtesttable/" + uploadDir)).andExpect(status().is2xxSuccessful())
				.andExpect(MyMatcher.alertTitleFromContent("导入失败"));
	}
}
