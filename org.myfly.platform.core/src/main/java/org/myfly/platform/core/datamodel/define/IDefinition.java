package org.myfly.platform.core.datamodel.define;

public interface IDefinition {
	String getKey();

	void setUid(String value);

	String getUid();
	
	/**
	 * 从DB加载
	 * @return
	 */
	boolean isFromDB();
	
	/**
	 * 设置从DB加载
	 * @param value
	 */
	void setFromDB(boolean value);

	void validate();

	String toJson();

	void printJson();
}
