package org.myfly.platform.metamodel.service;

import java.net.URL;
import java.util.List;

import org.myfly.platform.metamodel.domain.Menu;

public interface IMenuService {
	/**
	 * 获取所有菜单，只返回顶级菜单，下级菜单通过对象导航自动获取
	 * @return
	 */
	List<Menu> getAllMenus();

	/**
	 * 注册菜单，菜单在JSON文件中,且为数组格式
	 * @param url
	 */
	void registerMenus(URL url);
	/**
	 * 注册菜单
	 * @param menu
	 */
	void registerMenu(Menu menu);
}