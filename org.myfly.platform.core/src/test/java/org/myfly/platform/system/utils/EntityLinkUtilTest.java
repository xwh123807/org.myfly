package org.myfly.platform.system.utils;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.metadata.define.EntityAction;
import org.myfly.platform.core.utils.EntityLinkUtil;

public class EntityLinkUtilTest {
	private String tableName = "stdtesttable";
	private String uid = "40289f3b51baf0dd0151bd0e76816a71";
	private String subTableAttr = "details";
	private String subUid = "50289f3b51baf0dd0151bd0e76816a71";

	@Test
	public void getEntityActionLinkHtml() {
		String url = EntityLinkUtil.getEntityActionLinkHtml(EntityAction.NEW, tableName, uid, null, null, true, true);
	}

	@Test
	public void getEntityActionLinkHtmlForText() {
		String text = "hello";
		String url = EntityLinkUtil.getEntityActionLinkHtml(EntityAction.NEW, tableName, uid, text, null, false, true);
	}

	@Test
	public void getSubEntityUrl() {
		String url = EntityLinkUtil.getSubEntityActionLinkHtml(EntityAction.NEW, tableName, uid, subTableAttr, subUid,
				null, null, false, true);
	}

	@Test
	public void getSubEntityUrlForText() {
		String text = "hello";
		String url = EntityLinkUtil.getSubEntityActionLinkHtml(EntityAction.NEW, tableName, uid, subTableAttr, subUid,
				text, null, false, true);
	}

	@Test
	public void getEntitySearchRelationViewUrl() {
		String tableName = "suser";
		String uid = "4028474951b374df0151b374e0150000";
		String url = EntityLinkUtil.getEntitySearchRelationLinkHtml(tableName, "createdBy", uid, "zhangsan");
		Assert.assertEquals(
				"<a href=\"/vp/suser/4028474951b374df0151b374e0150000\" data-outline=\"/vp/outline/suser/4028474951b374df0151b374e0150000\" title=\"简档\" data-toggle=\"tooltip\" data-placement=\"bottom\" target=\"_blank\" >zhangsan</a>",
				url);
	}
}
