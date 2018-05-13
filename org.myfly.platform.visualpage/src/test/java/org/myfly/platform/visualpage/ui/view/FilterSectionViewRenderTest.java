package org.myfly.platform.visualpage.ui.view;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.domain.ViewType;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes=CoreApplication.class)
public class FilterSectionViewRenderTest extends ServiceTestCase{
	@Test
	public void render(){
		FilterSectionViewRender render = new FilterSectionViewRender(null, ViewType.VIEW, null);
		String html = render.html();
		Assert.assertNotNull(html);
	}
}
