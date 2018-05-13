package org.myfly.platform.visualpage.ui.view;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.metamodel.annotation.ObjectListView;
import org.myfly.platform.metamodel.domain.CacheInfo;
import org.myfly.platform.metamodel.domain.CacheObjectInfo;
import org.myfly.platform.metamodel.utils.ClassUtil;

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
