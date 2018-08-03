package org.myfly.platform.core.process.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 进程类标记注解
 * 
 * @author xiangwanhong
 *
 */
@Target(ElementType.TYPE)
@Retention(RUNTIME)
public @interface FlyProcess {

}
