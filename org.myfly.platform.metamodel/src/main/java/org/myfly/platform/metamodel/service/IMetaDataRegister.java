package org.myfly.platform.metamodel.service;

import java.net.URL;

import org.myfly.platform.metamodel.domain.EntityMetaData;

/**
 * 扩展元模型注册
 * @author xiangwanhong
 *
 */
public interface IMetaDataRegister {
	/**
	 * 是否提供表的元模型
	 * @param tableName
	 * @return
	 */
	public boolean contains(final String entityName);
	/**
	 * 获取表的元模型
	 * @param entityName
	 * @return
	 */
	public EntityMetaData getEntityMetaData(final String entityName);
	/**
	 * 注册元模型
	 * @param entityName
	 * @param url
	 */
	public void registerMeta(String entityName, URL url);
	/**
	 * 
	 * @param entityName
	 * @param jsonFile
	 */
	public void registerMeta(String entityName, String jsonFile);
}
