package org.myfly.platform.metamodel.domain;

import org.myfly.platform.metamodel.annotation.ObjectListView;
import org.myfly.platform.metamodel.annotation.PropertyView;

@ObjectListView(title = "缓存", linkField = "cacheName", linkUrl = "/admin/cache/$!{objitem.cacheName}", fields = {
		@PropertyView(name = "cacheName", title = "名称"), @PropertyView(name = "size", title = "个数") })
public class CacheInfo {
	private String cacheName;
	private int size;

	public String getCacheName() {
		return cacheName;
	}

	public void setCacheName(String cacheName) {
		this.cacheName = cacheName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
