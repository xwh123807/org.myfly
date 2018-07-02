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
@Target(ElementType.TYPE)
@Retention(RUNTIME)
public @interface FlyReferences {
	FlyRefTable[] references() default {};
}
