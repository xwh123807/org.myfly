package org.myfly.platform.core3.datamodel.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({ FIELD })
@Retention(RUNTIME)
public @interface FlyRefList {
	String name();

	String description() default "";

	String help() default "";

	String entityType() default "D";

	FlyRefItem[] items() default {};
}
