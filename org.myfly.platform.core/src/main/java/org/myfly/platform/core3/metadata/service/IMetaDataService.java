package org.myfly.platform.core3.metadata.service;

import org.myfly.platform.core3.metadata.define.FlyTableDefinition;

/**
 * 元数据服务 <br>
 * 
 * @author xiangwanhong
 *
 */
public interface IMetaDataService {
	/**
	 * 获取表的数据模型
	 * 
	 * @param entityName
	 * @return
	 */
	public FlyTableDefinition getFlyTableDefinition(String entityName);

	/**
	 * 获取表的数据模型
	 * 
	 * @param entityClass
	 * @return
	 */
	public FlyTableDefinition getFlyTableDefinition(Class<?> entityClass);
}
