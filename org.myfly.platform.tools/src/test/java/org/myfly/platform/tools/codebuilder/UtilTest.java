package org.myfly.platform.tools.codebuilder;

import org.junit.Assert;
import org.junit.Test;


public class UtilTest {
	/**
	 * AD_Chart_ID\AccessLevel\ACTriggerLength\AD_Ref_List_ID\Allow_Info_Product\IsCanExport
	 */
	@Test
	public void toFieldApiName() {
		Assert.assertEquals("chartID", Util.toFieldApiName("AD_Chart_ID"));
		Assert.assertEquals("accessLevel", Util.toFieldApiName("AccessLevel"));
		Assert.assertEquals("refListID", Util.toFieldApiName("AD_Ref_List_ID"));
		Assert.assertEquals("allowInfoProduct", Util.toFieldApiName("Allow_Info_Product"));
		Assert.assertEquals("isCanExport", Util.toFieldApiName("IsCanExport"));
		
		Assert.assertEquals("aCTriggerLength", Util.toFieldApiName("ACTriggerLength"));
	}
	
	/**
	 * AD_Chart_ID\AccessLevel\ACTriggerLength\AD_Ref_List_ID\Allow_Info_Product\IsCanExport
	 */
	@Test
	public void toFieldName() {
		Assert.assertEquals("Chart_ID", Util.toFieldName("AD_Chart_ID"));
		Assert.assertEquals("AccessLevel", Util.toFieldName("AccessLevel"));
		Assert.assertEquals("Ref_List_ID", Util.toFieldName("AD_Ref_List_ID"));
		Assert.assertEquals("Allow_Info_Product", Util.toFieldName("Allow_Info_Product"));
		Assert.assertEquals("IsCanExport", Util.toFieldName("IsCanExport"));
		
		Assert.assertEquals("ACTriggerLength", Util.toFieldName("ACTriggerLength"));
	}
	
	/**
	 * AD_Table\AD_Ref_List
	 */
	@Test
	public void toTableClassName() {
		Assert.assertEquals("PTable", Util.toTableApiName("AD_Table"));
		Assert.assertEquals("PRefList", Util.toTableApiName("AD_Ref_List"));
	}
	
	/**
	 * AD_Table\AD_Ref_List
	 */
	@Test
	public void toTableName() {
		Assert.assertEquals("PT_Table", Util.toTableName("AD_Table"));
		Assert.assertEquals("PT_Ref_List", Util.toTableName("AD_Ref_List"));
	}
}
