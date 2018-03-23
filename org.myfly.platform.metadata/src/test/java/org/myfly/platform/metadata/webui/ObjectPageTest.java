package org.myfly.platform.metadata.webui;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.test.WebTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 元模型对象页面测试
 * @author xiangwanhong
 *
 */
public class ObjectPageTest extends WebTestCase{

	@Override
	public String getPath() {
		return "/vp/list/mtable";
	}

	@Test
	public void checkPageIsObjectPage(){
		Assert.assertEquals("列表 mtable", driver.findElement(By.className("page-header")).getText());
	}

	/**
	 * 遍历所有的对象
	 */
	@Test
	public void fetchAllObject(){
		final List<String> links = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='page-content']//a"));
		for (WebElement link : elements){
			String href = link.getAttribute("href");
			if (href.contains("/vp/") && !href.endsWith("#")){
				links.add(href);
			}
		};
		for (String link : links){
			System.out.println(link);
			driver.navigate().to(link);
			fetchAllFields();
		}
	}
	
	private void fetchAllFields(){
		final List<String> links = new ArrayList<>();
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='page-content']//a"));
		for (WebElement link : elements){
			String href = link.getAttribute("href");
			if (href.contains("/vp/")  && !href.endsWith("#")){
				links.add(href);
			}
		};
		for (String link : links){
			System.out.println(link);
			driver.navigate().to(link);
		}
	}
}
