package org.myfly.platform.core.metadata.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.myfly.platform.core.domain.FieldDataType;

@Target(ElementType.ANNOTATION_TYPE)
@Retention(RUNTIME)
public @interface PropertyView {
	/**
	 * 属性名称
	 * 
	 * @return
	 */
	String name() default "";

	/**
	 * 标题
	 * 
	 * @return
	 */
	String title() default "";

	/**
	 * 简述
	 * 
	 * @return
	 */
	String description() default "";

	/**
	 * 字段名称
	 */
	String fieldName() default "";

	/**
	 * 默认未指定，根据实际的类型更换。主要用于增强的数据类型，如邮件、url、地址、电话等
	 * 
	 * @return
	 */
	FieldDataType dataType() default FieldDataType.NONE;

	/**
	 * 最大长度
	 * 
	 * @return
	 */
	int maxLength() default 255;

	/**
	 * 最小长度
	 * 
	 * @return
	 */
	int minLength() default 0;

	/**
	 * 是否必填
	 * 
	 * @return
	 */
	boolean required() default false;

	/**
	 * 精度
	 */
	int precision() default 0;

	/**
	 * 小数位数
	 */
	int scale() default 0;
}
