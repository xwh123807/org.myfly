package org.myfly.platform.core.metadata.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 表视图注解，描述实体基本信息，用于在显示时使用
 * 
 * @author xiangwanhong
 *
 */
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RUNTIME)
public @interface TableView {
	/**
	 * 唯一名称，api名称
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
	 * 用于在查找关系显示时，将主键显示为名称
	 * 
	 * @return
	 */
	String labelField() default "name";

	/**
	 * 显示的通用子表
	 * 
	 * @return
	 */
	CommonSubTableType[] commonSubTables() default { CommonSubTableType.NOTE, CommonSubTableType.ATTACHMENT };

	/**
	 * 是否创建全文索引数据
	 * 
	 * @return
	 */
	boolean createIndex() default true;

	/**
	 * 索引名称，缺省和实体名称相同
	 * 
	 * @return
	 */
	String indexName() default "";

	/**
	 * 主键字段
	 * 
	 * @return
	 */
	String[] primaryKeys() default { "uid" };

	/**
	 * 字段列表
	 * 
	 * @return
	 */
	PropertyView[] fields() default {};
}
