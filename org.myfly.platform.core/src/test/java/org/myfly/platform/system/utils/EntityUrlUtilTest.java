package org.myfly.platform.system.utils;

import org.junit.Assert;
import org.junit.Test;
import org.myfly.platform.core.metadata.define.EntityAction;
import org.myfly.platform.core.utils.EntityUrlUtil;
import org.myfly.platform.core.utils.UUIDUtil;

public class EntityUrlUtilTest {

	@Test
	public void getEntityUrl() {
		String tableName = "stdtesttable";
		String uid = "40289f3b51baf0dd0151bd0e76816a71";
		// new
		String url = EntityUrlUtil.getEntityActionUrl(EntityAction.NEW, tableName, null, null);
		Assert.assertEquals("/vp/stdtesttable", url);
		// del
		url = EntityUrlUtil.getEntityActionUrl(EntityAction.DEL, tableName, uid, null);
		Assert.assertEquals("/vp/stdtesttable/40289f3b51baf0dd0151bd0e76816a71", url);
		// edit
		url = EntityUrlUtil.getEntityActionUrl(EntityAction.EDIT, tableName, uid, null);
		Assert.assertEquals("/vp/stdtesttable/40289f3b51baf0dd0151bd0e76816a71?form", url);
		// list
		url = EntityUrlUtil.getEntityActionUrl(EntityAction.LIST, tableName, null, null);
		Assert.assertEquals("/vp/list/stdtesttable", url);
		// listoutline
		url = EntityUrlUtil.getEntityActionUrl(EntityAction.OUTLINE, tableName, uid, null);
		Assert.assertEquals("/vp/outline/stdtesttable/40289f3b51baf0dd0151bd0e76816a71", url);
		// outline
		url = EntityUrlUtil.getEntityActionUrl(EntityAction.OUTLINE, tableName, uid, "default");
		Assert.assertEquals("/vp/outline/stdtesttable/40289f3b51baf0dd0151bd0e76816a71?view=default", url);
		// listprint
		url = EntityUrlUtil.getEntityActionUrl(EntityAction.LISTPRINT, tableName, null, null);
		Assert.assertEquals("/vp/listprint/stdtesttable", url);
		// print
		url = EntityUrlUtil.getEntityActionUrl(EntityAction.PRINT, tableName, uid, "default");
		Assert.assertEquals("/vp/print/stdtesttable/40289f3b51baf0dd0151bd0e76816a71?view=default", url);
	}

	@Test
	public void getSubEntityUrl() {
		String tableName = "stdtesttable";
		String uid = "40289f3b51baf0dd0151bd0e76816a71";
		String subTableAttr = "details";
		String subUid = "50289f3b51baf0dd0151bd0e76816a71";
		// new
		String url = EntityUrlUtil.getSubEntityActionUrl(EntityAction.NEW, tableName, uid, subTableAttr, subUid, null);
		Assert.assertEquals("/vp/stdtesttable/40289f3b51baf0dd0151bd0e76816a71/details", url);
		// outline
		url = EntityUrlUtil.getSubEntityActionUrl(EntityAction.OUTLINE, tableName, uid, subTableAttr, subUid,
				"default");
		Assert.assertEquals(
				"/vp/outline/stdtesttable/40289f3b51baf0dd0151bd0e76816a71/details/50289f3b51baf0dd0151bd0e76816a71?view=default",
				url);
	}

	@Test
	public void getEntitySearchRelationViewUrl() {
		String tableName = "stdtesttable";
		String uid = UUIDUtil.newUUID();
		String url = EntityUrlUtil.getEntitySearchRelationViewUrl(tableName, uid);
		Assert.assertEquals("/vp/" + tableName + "/" + uid, url);
	}
}
