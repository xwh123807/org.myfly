package org.myfly.platform.system.core;

import org.junit.Before;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.test.EntityActionsWebPageTestCase;
import org.myfly.platform.core.user.domain.Menu;
import org.myfly.platform.core.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;

public class MenuWebPageTest extends EntityActionsWebPageTestCase<Menu, String> {
	private static boolean isInited;
	private static String menuUid;
	@Autowired
	private IJpaDataAccessService jpaDataAccessService;

	@Before
	public void init() {
		if (!isInited) {
			isInited = true;
			
			Menu menu = new Menu();
			menu.setUid(UUIDUtil.newUUID());
			menu.setName("hello");
			jpaDataAccessService.saveEntity(menu);
			menuUid = menu.getUid();
		}
	}

	@Override
	public Class<Menu> getEntityClass() {
		return Menu.class;
	}

	@Override
	public String getViewName() {
		return null;
	}

	@Override
	public String getEntityPk() {
		return menuUid;
	}

	@Override
	public Menu getNewEntity() {
		Menu entity = new Menu();
		entity.setUid(UUIDUtil.newUUID());
		entity.setName("hello");
		return entity;
	}

	@Override
	public Menu getSaveAndNewEntity() {
		Menu entity = new Menu();
		entity.setUid(UUIDUtil.newUUID());
		entity.setName("hello 2");
		return entity;
	}

	@Override
	public Menu getUpdateEntity() {
		Menu entity = new Menu();
		entity.setName("hello changed");
		return entity;
	}

}
