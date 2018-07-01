package org.myfly.platform.core3.metadata.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.myfly.platform.core3.domain.FlyDataType;

@Target({ FIELD })
@Retention(RUNTIME)
public @interface FlyElement {
	String name() default "";

	String entityType() default "D";

	String description() default "";

	String help() default "";

	FlyDataType dataType() default FlyDataType.NONE;

	String columnName() default "";
	
	String printName() default "";
	
	int fieldLength() default 255;
	/**
	 * 引用名称，在PReference表Name字段中选取
	 * @return
	 */
	String referenceName() default "";
}
