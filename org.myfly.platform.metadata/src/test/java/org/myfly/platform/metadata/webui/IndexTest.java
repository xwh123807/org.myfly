package org.myfly.platform.metadata.webui;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.test.WebTestCase;
import org.openqa.selenium.By;

public class IndexTest extends WebTestCase{

	@Override
	public String getPath() {
		return "";
	}
	
	@Test
	public void testIndex(){
		String t1 = driver.findElement(By.xpath(".//*[@id='main-container']/div[2]/div[2]/div[2]/h1")).getText();
		Assert.assertEquals("仪表板 我的仪表板", t1);
	}
	
	@Test
	public void testDashboard(){
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[1]/a/span")).click();
		String t1 = driver.findElement(By.xpath(".//*[@id='main-container']/div[2]/div[2]/div[2]/h1")).getText();
		Assert.assertEquals("仪表板 我的仪表板", t1);
	}
	
	@Test
	public void testObject(){
		//点击元模型，使其展开
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[2]/a/span")).click();
		//点击对象
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[2]/ul/li[2]/a")).click();
	}
	
}
