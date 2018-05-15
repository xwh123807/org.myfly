package org.myfly.platform.core.test.utils;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.myfly.platform.core.utils.ExcelUtils;

public class ExcelUtilsTest {
	@Test
	public void writeToExcel() throws Exception{
		String[] items = new String[]{"helo", "test1"};
		String fileName = FileUtils.getTempDirectoryPath() + "a.csv";
		ExcelUtils.writeToFile(fileName, items);
		ExcelUtils.appendToFile(fileName, new String[][]{items});
		System.out.println(fileName);
	}
	
	@Test
	public void writeToExcel2() throws Exception{
		String[] items = new String[]{"helo", "test1"};
		String fileName = FileUtils.getTempDirectoryPath() + "b.csv";
		ExcelUtils.writeToFile(fileName, items, new String[][]{items});
		System.out.println(fileName);
	}
}
