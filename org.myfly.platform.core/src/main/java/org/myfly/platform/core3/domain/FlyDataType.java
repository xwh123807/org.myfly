package org.myfly.platform.core3.domain;

/**
 * 数据类型，包含基本和扩展 <br>
 * 1、同AD_Reference中10-42的类型 <br>
 * 
 * @author xiangwanhong
 *
 */
public enum FlyDataType implements IRefList {
	NONE, String, Text, YesNo, Button, DateTime, Date, Time, Amount, List, Table;

	@Override
	public String getName() {
		return null;
	}
	
}
