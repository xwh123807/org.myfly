package org.myfly.platform.core.metadata.define;

import org.apache.commons.lang3.ArrayUtils;
import org.myfly.platform.core.metadata.annotation.FilterView;
import org.myfly.platform.core.metadata.annotation.SQLOperator;

public class FilterDefinition extends BaseDenifition {
	private String field;
	private Object value;
	private SQLOperator operator;
	private boolean show = true;

	private Object[] multiValues;

	public FilterDefinition(FilterView view) {
		setField(view.field());
		setValue(view.value());
		setShow(view.show());
		setOperator(view.operator());
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public SQLOperator getOperator() {
		return operator;
	}

	public void setOperator(SQLOperator operator) {
		this.operator = operator;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public Object[] getMultiValues() {
		return multiValues;
	}

	public void setMultiValues(Object[] multiValues) {
		this.multiValues = multiValues;
		if (ArrayUtils.isNotEmpty(multiValues)) {
			setValue(multiValues[0]);
		}
	}

	public boolean isShow() {
		return show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	@Override
	public String toString() {
		return "field: " + field + ", operator: " + operator.getTitle();
	}
}
