package org.myfly.platform.system.search;

/**
 * 用于测试Tika内容提取，需要测试pdf、txt、excel、doc、docx等常见格式
 * 
 * @author xiangwanhong
 *
 */
public class TikaUtilTest {
	private static String DATA_PATH = "/org/myfly/platform/system/search/data/";
	
//	@Test
//	public void readString() throws Exception{
//		Tika tika = new Tika();
//		StringBufferInputStream stream = new StringBufferInputStream("hello");
//		String txt  = tika.parseToString(stream);
//		System.out.println(txt);
//		Assert.assertNotNull(txt);
//	}
//
//	@Test
//	public void readPdf() throws Exception {
//		AutoDetectParser parser = new AutoDetectParser();
//		BodyContentHandler handler = new BodyContentHandler();
//		Metadata metadata = new Metadata();
//		String txt = null;
//		try (InputStream stream = TikaUtilTest.class.getResourceAsStream(DATA_PATH + "suser_2016-05-30 21-46-46.pdf")) {
//			parser.parse(stream, handler, metadata);
//			txt = handler.toString();
//		}
//		System.out.println(txt);
//		Assert.assertNotNull(txt);
//	}
}
