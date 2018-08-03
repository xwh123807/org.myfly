package org.myfly.platform.core.datamodel.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.myfly.platform.core.dbinit.resources.EntityType;
import org.myfly.platform.core.model.AccessLevel;

/**
 * 实体类表注解<br>
 * AD_Table<br>
 * 
 * @author xiangwanhong
 *
 */
@Target(ElementType.TYPE)
@Retention(RUNTIME)
public @interface FlyTable {
	String name() default "";
	
	EntityType entityType() default EntityType.D;

	String description() default "";

	String help() default "";

	AccessLevel accessLevel() default AccessLevel.ALL;
	
	boolean isHighVolume() default false;
	
	boolean isChangeLog() default false;
	
	boolean isIgnoreMigration() default false;
	
	boolean isDocument() default false;
	
	boolean isSecurityEnabled() default false;
	
	boolean isDeleteable() default true;
	
	boolean isView() default false;
	
	boolean isCentrallyMaintained() default false;
	/**
	 * 显示列
	 * @return
	 */
	String displayColumn() default "name";
}
