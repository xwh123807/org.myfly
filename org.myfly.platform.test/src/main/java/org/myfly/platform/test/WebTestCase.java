package org.myfly.platform.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class WebTestCase {
	public WebDriver driver = new FirefoxDriver();
	
	public abstract String getPath();
	
	public String testUrl = "http://localhost:9080";
	
	@Before
	public void launchApp(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to( testUrl + getPath());
		driver.manage().window().maximize();
	}
	
	@After
	public void exitApp(){
		driver.close();
	}
	
	public void navigateTo(String path){
		driver.navigate().to(testUrl + path);
	}
}
