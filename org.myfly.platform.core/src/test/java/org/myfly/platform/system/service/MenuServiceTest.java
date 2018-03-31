package org.myfly.platform.system.service;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.user.domain.Menu;
import org.myfly.platform.core.user.service.IMenuService;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = CoreApplication.class)
public class MenuServiceTest extends ServiceTestCase {
	@Autowired
	private IMenuService menuService;

	@Test
	public void registerMenu() {
		Menu menu = new Menu();
		menu.setName("topmenu");
		Set<Menu> subMenus = new HashSet<>();
		Menu subMenu = new Menu();
		subMenu.setName("sub1");
		subMenu.setParent(menu);
		menu.setSubMenus(subMenus);

		menuService.registerMenu(menu);
	}
}
