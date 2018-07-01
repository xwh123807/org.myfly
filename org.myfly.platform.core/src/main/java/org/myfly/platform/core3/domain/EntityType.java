package org.myfly.platform.core3.domain;

import org.myfly.platform.core3.metadata.annotation.FlyField;

/**
 * 实体类型
 * 
 * @author xiangwanhong
 *
 */
public enum EntityType implements IRefList {
	//
	@FlyField(name = "Dictionary", description = "Application Dictionary Ownership ** System Maintained **", //
			help = "The entity is owned by the Application Dictionary. You should NOT use Disctionary as all modifications are likely to be reversed, to maintain customizations, copy the record. (Change Log & Reapply Customization allows you to maintain minor modifications)")
	D(),
	//
	@FlyField(name = "Flyme", description = "Flyme Ownership ** System Maintained **", help = "DO NOT USE")
	C,
	//
	@FlyField(name = "User maintained", description = "User maintained modifications", //
			help = "The default entity type for your Customizations and custom Extensions.  Will be preserved during version migration.")
	U,
	//
	@FlyField(name = "Applications", description = "Application modifications", help = "Alternative to User maintained entity type.  Will be preserved during version migration.")
	A(),
	//
	@FlyField(name = "Extensions", description = "Application Extensions", help = "Alternative to User maintained entity type.  Will be preserved during version migration.")
	EXT(),
	//
	@FlyField(name = "Other Extensions", description = "Other Application Extensions", //
			help = "Alternative to User maintained entity type.  Will be preserved during version migration.")
	XX(),
	//
	@FlyField(name = "Other Customizations", description = "Other Application Customizations", //
			help = "Alternative to User maintained entity type.  Will be preserved during version migration.")
	CUST();
}
