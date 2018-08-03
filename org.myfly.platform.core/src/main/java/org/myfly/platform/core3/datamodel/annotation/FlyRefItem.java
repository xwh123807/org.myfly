package org.myfly.platform.core3.datamodel.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RUNTIME)
public @interface FlyRefItem {
	String value();

	String name();

	String description() default "";
	
	String help() default "";

	String entityType() default "D";

	String validFrom() default "";

	String validTo() default "";
}
