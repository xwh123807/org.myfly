package org.myfly.platform.system.metadata;

import org.myfly.platform.core.test.EntityMetaDataTestCase;
import org.myfly.platform.core.user.domain.Menu;

public class MenuEntityMetaDataTest extends EntityMetaDataTestCase<Menu> {

	@Override
	public Class<Menu> getEntityClass() {
		return Menu.class;
	}

	@Override
	public String getViewName() {
		return null;
	}

}
