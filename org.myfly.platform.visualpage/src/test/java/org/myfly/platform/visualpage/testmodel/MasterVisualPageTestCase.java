package org.myfly.platform.visualpage.testmodel;

import org.myfly.platform.core.metadata.service.EntityMetaDataConstants;
import org.myfly.platform.core.testmodel.Master;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.visualpage.test.EntityActionsWebPageTestCase;

public class MasterVisualPageTestCase extends EntityActionsWebPageTestCase<Master>{

	@Override
	public Class<Master> getEntityClass() {
		return Master.class;
	}

	@Override
	public String getViewName() {
		return EntityMetaDataConstants.DEFAULT_ALL_NAME;
	}

	@Override
	public Master getNewEntity() {
		Master master = new Master();
		master.setUid(UUIDUtil.newUUID());
		master.setName("name " + System.currentTimeMillis());
		return master;
	}

	@Override
	public Master getSaveAndNewEntity() {
		Master master = new Master();
		master.setUid(UUIDUtil.newUUID());
		master.setName("name " + System.currentTimeMillis());
		return master;
	}

	@Override
	public Master getUpdateEntity() {
		Master master = new Master();
		master.setName("name " + System.currentTimeMillis());
		return master;
	}

}
