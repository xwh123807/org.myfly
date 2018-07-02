package org.myfly.platform.core3.metadata.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 标记实体引用
 * 
 * @author xiangwanhong
 *
 */
@Target({ ElementType.TYPE, ElementType.ANNOTATION_TYPE })
@Retention(RUNTIME)
public @interface FlyRefTable {
	String name();

	String description() default "";

	String help() default "";

	String entityType() default "D";

	String keyColumn();

	String displayColumn();

	String displaySQL() default "";

	boolean isAlert() default false;

	boolean isDisplayIdentifier() default false;

	boolean isValueDisplayed() default false;

	String orderByClause() default "";

	String whereClause() default "";
}
