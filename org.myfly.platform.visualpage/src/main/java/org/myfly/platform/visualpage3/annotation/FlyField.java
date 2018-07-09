package org.myfly.platform.visualpage3.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RUNTIME)
public @interface FlyField {

}
