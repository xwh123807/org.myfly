package org.myfly.platform.core.metadata.define;

import org.myfly.platform.core.metadata.annotation.OrderType;
import org.myfly.platform.core.metadata.annotation.OrderView;
import org.springframework.util.Assert;

/**
 * 排序定义
 * 
 * @author xiangwanhong
 *
 */
public class OrderDefinition extends BaseDenifition {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1437749424312017122L;
	private OrderType orderType;

	public OrderDefinition(OrderView view) {
		setName(view.field());
		setOrderType(view.orderType());
	}

	public OrderDefinition() {
	}

	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}

	@Override
	public String toString() {
		return "name: " + getName() + ", orderType: " + orderType.getTitle();
	}

	@Override
	public void validate() {
		Assert.notNull(getName());
		Assert.notNull(getOrderType());
	}
}
