package org.myfly.platform.system.core;

import org.junit.Before;
import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.myfly.platform.core.system.domain.IMenu;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.system.domain.Menu;
import org.myfly.platform.visualpage.test.EntityActionsWebPageTestCase;
import org.springframework.beans.factory.annotation.Autowired;

public class MenuWebPageTest extends EntityActionsWebPageTestCase<IMenu, String> {
	private static boolean isInited;
	private static String IMenuUid;
	@Autowired
	private IJpaDataAccessService jpaDataAccessService;

	@Before
	public void init() {
		if (!isInited) {
			isInited = true;
			
			IMenu IMenu = new Menu();
			IMenu.setUid(UUIDUtil.newUUID());
			IMenu.setName("hello");
			jpaDataAccessService.saveEntity(IMenu);
			IMenuUid = IMenu.getUid();
		}
	}

	@Override
	public Class<IMenu> getEntityClass() {
		return IMenu.class;
	}

	@Override
	public String getViewName() {
		return null;
	}

	@Override
	public String getEntityPk() {
		return IMenuUid;
	}

	@Override
	public IMenu getNewEntity() {
		IMenu entity = new Menu();
		entity.setUid(UUIDUtil.newUUID());
		entity.setName("hello");
		return entity;
	}

	@Override
	public IMenu getSaveAndNewEntity() {
		IMenu entity = new Menu();
		entity.setUid(UUIDUtil.newUUID());
		entity.setName("hello 2");
		return entity;
	}

	@Override
	public IMenu getUpdateEntity() {
		IMenu entity = new Menu();
		entity.setName("hello changed");
		return entity;
	}

}
