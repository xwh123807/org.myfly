package org.myfly.platform.metadata.service;

import java.util.List;
import java.util.Map;

import org.myfly.platform.core.metadata.service.EntityMetaData;
import org.myfly.platform.core.metadata.service.JsonEntityMetaData;
import org.myfly.platform.metadata.domain.MField;
import org.myfly.platform.metadata.domain.MTable;
import org.myfly.platform.system.domain.MDataSource;

public interface IMetadataRepository {

	/**
	 * 获取当前系统数据源，从DataSourceProperties中读取
	 * @return
	 */
	MDataSource getCurrentDataSource();

	/**
	 * 从数据源读取所有表信息
	 * @param currentDataSource
	 * @return
	 * @throws Exception 
	 */
	List<MTable> getTables(MDataSource ds, boolean containFields);
	
	/**
	 * 获取指定表定义信息
	 * @param ds
	 * @param tableName
	 * @return
	 */
	MTable getTable(MDataSource ds, String tableName);

	/**
	 * 获取表的字段定义信息
	 * @param ds
	 * @param tableName
	 * @return
	 */
	Map<String, MField> getFields(MDataSource ds, String tableName);

	/**
	 * 获取表元模型定义
	 * @param ds
	 * @param tableName
	 * @return
	 */
	JsonEntityMetaData getTableJsonMetaData(MDataSource ds, String tableName);

	/**
	 * 获取表元模型定义
	 * @param ds
	 * @param tableName
	 * @return
	 */
	EntityMetaData getTableEntityMetaData(MDataSource ds, String tableName);
}
