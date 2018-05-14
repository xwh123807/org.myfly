package org.myfly.platform.system.core;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.myfly.platform.CoreApplication;
import org.myfly.platform.core.system.domain.IMenu;
import org.myfly.platform.core.system.service.IMenuService;
import org.myfly.platform.system.domain.Menu;
import org.myfly.platform.test.ServiceTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

@SpringApplicationConfiguration(classes = CoreApplication.class)
public class MenuServiceTest extends ServiceTestCase {
	@Autowired
	private IMenuService menuService;

	@Test
	public void registerMenu() {
		Menu menu = new Menu();
		menu.setName("topmenu");
		Set<IMenu> subMenus = new HashSet<>();
		IMenu subMenu = new Menu();
		subMenu.setName("sub1");
		subMenu.setParent(menu);
		menu.setSubMenus(subMenus);

		menuService.registerMenu(menu);
	}
}
