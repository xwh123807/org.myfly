package org.myfly.platform.core3.metadata.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 标记实体类型
 * 
 * @author xiangwanhong
 *
 */
@Target({ FIELD })
@Retention(RUNTIME)
public @interface FlyEntityType {
	String name() default "";

	String description() default "";

	String help() default "";
	
	String modelPackage() default "";

	String classPath() default "";
}
