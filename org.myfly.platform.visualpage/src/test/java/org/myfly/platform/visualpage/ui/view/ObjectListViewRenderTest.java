package org.myfly.platform.visualpage.ui.view;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.cache.service.CacheInfo;
import org.myfly.platform.core.cache.service.CacheObjectInfo;
import org.myfly.platform.core.metadata.annotation.ObjectListView;
import org.myfly.platform.core.utils.ClassUtil;
import org.myfly.platform.visualpage.ui.view.ObjectListViewRender;

public class ObjectListViewRenderTest {
	@Test
	public void renderForCacheInfo(){
		ObjectListView objectBean = ClassUtil.getClassAnnotation(CacheInfo.class, ObjectListView.class);
		ObjectListViewRender render = new ObjectListViewRender(objectBean );
		Assert.assertNotNull(render);
		String html = render.html();
		Assert.assertNotNull(html);
		Assert.assertTrue(html.contains("$!{objitem.cacheName}"));
	}
	
	@Test
	public void renderForCacheObjectInfo(){
		ObjectListView objectBean = ClassUtil.getClassAnnotation(CacheObjectInfo.class, ObjectListView.class);
		ObjectListViewRender render = new ObjectListViewRender(objectBean );
		Assert.assertNotNull(render);
		String html = render.html();
		Assert.assertNotNull(html);
		Assert.assertTrue(html.contains("$!{objitem.value}"));
	}
}
