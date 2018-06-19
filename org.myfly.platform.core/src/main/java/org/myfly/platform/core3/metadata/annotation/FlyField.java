package org.myfly.platform.core3.metadata.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 实体类字段注解<br>
 * AD_Column<br>
 * 
 * @author xiangwanhong
 *
 */
@Target({FIELD})
@Retention(RUNTIME)
public @interface FlyField {

}
