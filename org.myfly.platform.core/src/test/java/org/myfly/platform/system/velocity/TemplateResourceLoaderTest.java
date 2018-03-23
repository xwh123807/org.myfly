package org.myfly.platform.system.velocity;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.velocity.TemplateResourceLoader;

public class TemplateResourceLoaderTest {
	@Test
	public void loadJars(){
		TemplateResourceLoader loader = new TemplateResourceLoader();
		loader.init(null);
		
		Assert.assertNotNull(loader.getResourceStream("default/portal/index.vm"));
	}
}
