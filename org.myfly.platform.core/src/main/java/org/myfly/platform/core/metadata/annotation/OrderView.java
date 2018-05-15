package org.myfly.platform.core.metadata.annotation;

public @interface OrderView {
	/**
	 * 排序字段名
	 * @return
	 */
	String field();
	/**
	 * 方向
	 * @return
	 */
	OrderType orderType() default OrderType.ASC;
}
