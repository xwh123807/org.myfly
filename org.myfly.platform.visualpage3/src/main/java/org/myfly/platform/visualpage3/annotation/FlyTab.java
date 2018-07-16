package org.myfly.platform.visualpage3.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.myfly.platform.visualpage3.webui.TableStyle;

@Target({ ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RUNTIME)
public @interface FlyTab {

	String name();

	String description() default "";

	String help() default "";

	String table();

	FlyFieldGroup[] fieldGroup() default {};
	
	TableStyle tableStyle() default TableStyle.ELTable;
}
