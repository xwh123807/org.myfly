package org.myfly.platform.metadata.service;

import java.util.List;

import org.myfly.platform.core.user.domain.SGlobalName;
import org.myfly.platform.metadata.domain.MTable;
import org.myfly.platform.system.domain.TableMapping;

public interface IMetaDataService {

	MTable findTableByTableName(String tableName);

	List<TableMapping> findAllTableMapping();

	TableMapping findTableMapping(String tableName);

	SGlobalName findGlobalName(String uid);

	/**
	 * 获取子表属性名
	 * @param table
	 * @param subTableAttr
	 * @return
	 */
	String getSubTableName(String table, String subTableAttr);
	
}
