package org.myfly.platform.metadata.webui;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.test.WebTestCase;

/**
 * 管理功能测试
 * @author xiangwanhong
 *
 */
public class AdminPageTest extends WebTestCase{

	@Override
	public String getPath() {
		return "";
	}

	@Test
	public void beans(){
		navigateTo("/admin/beans");
		Assert.assertEquals("beans - 管理", driver.getTitle());
	}
	
	@Test
	public void templatebuilders(){
		navigateTo("/admin/templatebuilders");
		Assert.assertEquals("模板构造器 - 管理", driver.getTitle());
	}
	
	@Test
	public void entityviews(){
		navigateTo("/admin/entityviews");
		Assert.assertEquals("实体视图 - 管理", driver.getTitle());
	}
	
	@Test
	public void cache(){
		navigateTo("/admin/cache");
		Assert.assertEquals("缓存 - 管理", driver.getTitle());
	}
	
	@Test
	public void cacheMetaService(){
		navigateTo("/admin/cache/metadata-service");
		Assert.assertEquals("缓存 - metadata-service - 管理", driver.getTitle());
	}
	
	@Test
	public void cacheVisualPageService(){
		navigateTo("/admin/cache/visualpage-service");
		Assert.assertEquals("缓存 - visualpage-service - 管理", driver.getTitle());
	}
	
	@Test
	public void mappings(){
		navigateTo("/admin/mappings");
		Assert.assertEquals("资源 - 管理", driver.getTitle());
	}
	
	@Test
	public void dump(){
		navigateTo("/admin/dump");
		Assert.assertEquals("线程 - 管理", driver.getTitle());
	}
	
	@Test
	public void autoconfig(){
		navigateTo("/admin/autoconfig");
		Assert.assertEquals("配置 - 管理", driver.getTitle());
	}
	
	@Test
	public void env(){
		navigateTo("/admin/env");
		Assert.assertEquals("环境 - 管理", driver.getTitle());
	}
	
	@Test
	public void configprops(){
		navigateTo("/admin/configprops");
		Assert.assertEquals("参数 - 管理", driver.getTitle());
	}
	
	@Test
	public void metrics(){
		navigateTo("/admin/metrics");
		Assert.assertEquals("统计 - 管理", driver.getTitle());
	}
	
	@Test
	public void trace(){
		navigateTo("/admin/trace");
		Assert.assertEquals("跟踪 - 管理", driver.getTitle());
	}
}
