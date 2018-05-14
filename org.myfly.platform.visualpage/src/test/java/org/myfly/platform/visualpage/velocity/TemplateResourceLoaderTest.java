package org.myfly.platform.visualpage.velocity;

import org.junit.Assert;
import org.junit.Test;

public class TemplateResourceLoaderTest {
	@Test
	public void loadJars(){
		TemplateResourceLoader loader = new TemplateResourceLoader();
		loader.init(null);
		
		Assert.assertNotNull(loader.getResourceStream("default/portal/index.vm"));
	}
}
