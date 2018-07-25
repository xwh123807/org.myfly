package org.myfly.platform.visualpage3.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.myfly.platform.visualpage3.model.WindowType;

@Target({ FIELD })
@Retention(RUNTIME)
public @interface FlyWindow {

	String name();

	String description() default "";

	String help() default "";

	WindowType windowType() default WindowType.M;

	String entityTpye() default "D";

	FlyTab[] tabs();
}
