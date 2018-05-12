package org.myfly.platform.metamodel.annotation;

import org.myfly.platform.metamodel.define.OrderType;

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
