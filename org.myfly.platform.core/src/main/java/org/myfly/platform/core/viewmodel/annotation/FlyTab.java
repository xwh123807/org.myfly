package org.myfly.platform.core.viewmodel.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RUNTIME)
public @interface FlyTab {

	String name();

	String description() default "";

	String help() default "";

	/**
	 * 表名，指向实体apiName
	 * @return
	 */
	String table();

	/**
	 * 字段组
	 * @return
	 */
	FlyFieldGroup[] fieldGroup() default {};
	/**
	 * 表格样式，控制表格的显示方式
	 * @return
	 */
	TableStyle tableStyle() default TableStyle.ELTable;
	
	/**
	 * 层级
	 * @return
	 */
	int tabLevel() default 0;
	
	/**
	 * 单行记录
	 * @return
	 */
	boolean isSingleRow() default false;
}
