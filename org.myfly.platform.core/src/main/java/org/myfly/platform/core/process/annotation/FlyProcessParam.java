package org.myfly.platform.core.process.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 进程参数配置
 * 
 * @author xiangwanhong
 *
 */
@Target({ FIELD })
@Retention(RUNTIME)
public @interface FlyProcessParam {
	String name();

	String description() default "";

	String help() default "";
	
	String element() default "";
}
