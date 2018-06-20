package org.myfly.platform.core3.metadata.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.FlyDataType;

/**
 * 实体类字段注解<br>
 * AD_Column<br>
 * 
 * @author xiangwanhong
 *
 */
@Target({ FIELD })
@Retention(RUNTIME)
public @interface FlyField {
	String name() default "";

	EntityType entityType() default EntityType.D;

	String description() default "";

	String help() default "";
	
	String columnSQL() default "";
	
	FlyDataType dataType() default FlyDataType.NONE;
	
	String defaultValue() default "";
	
	boolean isAllowCopy() default true;
	
	boolean isAllowLogging() default false;
	
	boolean isAlwaysUpdateable() default false;
	
	boolean isAutocomplete() default false;
	
	boolean isEncrypted() default false;
	
	boolean isParent() default false;
	
	boolean isRange() default false;
	
	boolean isSelectionColumn() default false;
	
	boolean isSyncDatabase() default false;
	
	boolean isTranslated() default true;
	
	String valueMin() default "";
	
	String valueMax() default "";
	
	String vFormat() default "";
}
