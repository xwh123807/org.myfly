package org.myfly.platform.core.metadata.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.myfly.platform.core.domain.FieldDataType;

/**
 * 字段视图，用于显示使用
 * @author xiangwanhong
 *
 */

@Target({FIELD})
@Retention(RUNTIME)
public @interface FieldView {
	/**
	 * 标题
	 * @return
	 */
	String title() default "";
	/**
	 * 简述
	 * @return
	 */
	String description() default "";
	/**
	 * 默认未指定，根据实际的类型更换。主要用于增强的数据类型，如邮件、url、地址、电话等
	 * @return
	 */
	FieldDataType dataType() default FieldDataType.NONE;
	/**
	 * 最小长度
	 * @return
	 */
	int minLength() default 0;
}
