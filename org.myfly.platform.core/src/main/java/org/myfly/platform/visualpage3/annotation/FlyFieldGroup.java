package org.myfly.platform.visualpage3.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.myfly.platform.visualpage3.model.FieldGroupType;

@Target({ ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RUNTIME)
public @interface FlyFieldGroup {
	String name();

	FieldGroupType fieldGroupType() default FieldGroupType.C;

	FlyField[] fields() default {};

	/**
	 * 直接使用字段列表，指向字段apiName
	 * @return
	 */
	String[] columnNames() default {};
}
