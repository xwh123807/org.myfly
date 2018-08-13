package org.myfly.platform.core.flydata.service;

import java.util.List;
import java.util.Map;

/**
 * ID名称服务
 * @author xiangwanhong
 *
 */
public interface IIDNameService {
	final String NAME_COLUMN = "name";
	final String UID_COLUMN = "uid";
	/**
	 * 获取实体显示名称
	 * @param entityName	实体名称
	 * @param keyColumn		健值列名，值唯一
	 * @param displayColumn	显示列名
	 * @param keyValue		健值
	 * @return
	 */
	String getNameValue(String entityName, String keyColumn, String displayColumn, Object keyValue);
	
	/**
	 * 
	 * @param tableName
	 * @param keyColumn
	 * @param displayColumn
	 * @return
	 */
	List<Map<String, Object>> getIDNames(String tableName, String keyColumn, String displayColumn);
}
