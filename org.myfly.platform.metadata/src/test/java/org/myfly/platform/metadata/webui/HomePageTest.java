package org.myfly.platform.metadata.webui;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.myfly.platform.test.WebTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 首页测试，测试首页上所有链接
 * @author xiangwanhong
 *
 */
public class HomePageTest extends WebTestCase{

	@Override
	public String getPath() {
		return "";
	}
	
	@Test
	public void fetchAllLink(){
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		List<String> urls = new ArrayList<>();
		for (WebElement element : elements){
			String link = element.getAttribute("href");
			if (!link.endsWith("#")){
				urls.add(element.getAttribute("href"));
			}
		}
		//逐个点击
		for (String url : urls){
			driver.navigate().to(url);
		}
	}
}
