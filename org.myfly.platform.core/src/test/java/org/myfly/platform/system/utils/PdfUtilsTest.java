package org.myfly.platform.system.utils;

import java.io.File;
import java.io.InputStream;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.utils.FileUtil;
import org.myfly.platform.core.utils.PdfUtils;

public class PdfUtilsTest {
	private static String DATA_PATH = "/org/myfly/platform/system/utils/data/";

	@Test
	public void baseTable() {
		InputStream contentStream = getClass().getResourceAsStream(DATA_PATH + "BaseTable.html");
		Assert.assertNotNull(contentStream);
		InputStream cssStream = getClass().getResourceAsStream(DATA_PATH + "pdf.css");
		Assert.assertNotNull(cssStream);
		String pdfFile = FileUtil.createTempDirectoryPath() + "BaseTable.pdf";
		PdfUtils.exportToPdf(contentStream, cssStream, pdfFile);
		System.out.println("生成PDF文件：" + pdfFile);
		Assert.assertTrue(new File(pdfFile).exists());
	}
	
	@Test
	public void grd30() {
		InputStream contentStream = getClass().getResourceAsStream(DATA_PATH + "grd30.html");
		Assert.assertNotNull(contentStream);
		//InputStream cssStream = getClass().getResourceAsStream(DATA_PATH + "pdf.css");
		//Assert.assertNotNull(cssStream);
		String pdfFile = FileUtil.createTempDirectoryPath() + "grd30.pdf";
		PdfUtils.exportToPdf(contentStream, null, pdfFile);
		System.out.println("生成PDF文件：" + pdfFile);
		Assert.assertTrue(new File(pdfFile).exists());
	}
}
