package org.myfly.platform.metamodel.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.myfly.platform.metamodel.define.EntityAction;

/**
 * 注解，实体表单视图
 * 
 * @author xiangwanhong
 *
 */
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RUNTIME)
public @interface FormView {
	/**
	 * 名称
	 * 
	 * @return
	 */
	String name() default "default";

	/**
	 * 响应式布局定义
	 * 
	 * @return
	 */
	Div1View[] divs() default {};

	/**
	 * 区域内容显示定义。如果没有定义divs，则按默认布局展示
	 * 
	 * @return
	 */
	SectionView[] sections() default {};

	/**
	 * 实体可执行的操作
	 * 
	 * @return
	 */
	EntityAction[] actions() default {};

}
