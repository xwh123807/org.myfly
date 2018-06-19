package org.myfly.platform.core3.metadata.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

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

}
