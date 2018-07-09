package org.myfly.platform.core3.flydata.service;

/**
 * ID名称服务
 * @author xiangwanhong
 *
 */
public interface IIDNameService {
	/**
	 * 获取实体显示名称
	 * @param entityName	实体名称
	 * @param keyColumn		健值列名，值唯一
	 * @param displayColumn	显示列名
	 * @param keyValue		健值
	 * @return
	 */
	String getNameValue(String entityName, String keyColumn, String displayColumn, Object keyValue);
}
