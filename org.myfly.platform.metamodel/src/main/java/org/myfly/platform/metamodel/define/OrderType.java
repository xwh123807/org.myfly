package org.myfly.platform.metamodel.define;

import org.myfly.platform.metamodel.domain.BaseEnum;

public enum OrderType implements BaseEnum{
	//
	ASC("升序"), 
	//
	DESC("降序");
	
	private String title;

	private OrderType(String title) {
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
	}

}
