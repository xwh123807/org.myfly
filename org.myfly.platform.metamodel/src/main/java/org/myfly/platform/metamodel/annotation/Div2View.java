package org.myfly.platform.metamodel.annotation;

import org.myfly.platform.metamodel.domain.DivType;

/**
 * 响应式布局定义
 * 
 * @author xiangwanhong
 *
 */
public @interface Div2View {
	/**
	 * 内容标示，在Sections中查找对应内容定义
	 * 
	 * @return
	 */
	String name() default "";

	/**
	 * 布局类型
	 * 
	 * @return
	 */
	DivType divType() default DivType.DEFAULT;

	/**
	 * 响应式布局宽度定义,class=col-md-12
	 * 
	 * @return
	 */
	int width() default 12;

	/**
	 * 附加样式
	 * 
	 * @return
	 */
	String extClass() default "";

	/**
	 * 子Div
	 * 
	 * @return
	 */
	Div3View[] subs() default {};
}
