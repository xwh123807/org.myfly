package org.myfly.platform.core.metadata.annotation;

import org.myfly.platform.core.domain.BaseEnum;

/**
 * 取数模式
 * @author xiangwanhong
 *
 */
public enum FetchMode implements BaseEnum{
	SERVER_ALL("服务端取出全部数据"),
	SERVER_PAGE("服务端分页取数"),
	AJAX_ALL("客户端异步取出全部数据"),
	AJAX_PAGE("客户端分页取数");
	
	private String title;

	private FetchMode(String title) {
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
	}
	
}
