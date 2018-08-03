package org.myfly.platform.core.dbinit.resources;

import org.myfly.platform.core.datamodel.annotation.FlyEntityType;

/**
 * 实体类型
 * 
 * @author xiangwanhong
 *
 */
public enum EntityType {
	//
	@FlyEntityType(name = "Dictionary", description = "Application Dictionary Ownership ** System Maintained **", //
			help = "The entity is owned by the Application Dictionary. You should NOT use Disctionary as all modifications are likely to be reversed, to maintain customizations, copy the record. (Change Log & Reapply Customization allows you to maintain minor modifications)")
	D(),
	//
	@FlyEntityType(name = "Flyme", description = "Flyme Ownership ** System Maintained **", help = "DO NOT USE")
	C,
	//
	@FlyEntityType(name = "User maintained", description = "User maintained modifications", //
			help = "The default entity type for your Customizations and custom Extensions.  Will be preserved during version migration.")
	U,
	//
	@FlyEntityType(name = "Applications", description = "Application modifications", help = "Alternative to User maintained entity type.  Will be preserved during version migration.")
	A(),
	//
	@FlyEntityType(name = "Extensions", description = "Application Extensions", help = "Alternative to User maintained entity type.  Will be preserved during version migration.")
	EXT(),
	//
	@FlyEntityType(name = "Other Extensions", description = "Other Application Extensions", //
			help = "Alternative to User maintained entity type.  Will be preserved during version migration.")
	XX(),
	//
	@FlyEntityType(name = "Other Customizations", description = "Other Application Customizations", //
			help = "Alternative to User maintained entity type.  Will be preserved during version migration.")
	CUST();
}
