package org.myfly.platform.visualpage.ui.view;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.metamodel.domain.ViewType;
import org.myfly.platform.test.ServiceTestCase;

public class FilterSectionViewRenderTest extends ServiceTestCase{
	@Test
	public void render(){
		FilterSectionViewRender render = new FilterSectionViewRender(null, ViewType.VIEW, null);
		String html = render.html();
		Assert.assertNotNull(html);
	}
}
