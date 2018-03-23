package org.myfly.platform.core.metadata.service;

import java.util.List;

import org.myfly.platform.core.metadata.internal.EntityMetaData;
import org.myfly.platform.core.metadata.internal.JsonEntityMetaData;

/**
 * 实体元模型服务
 * 
 * @author xiangwanhong
 *
 */
public interface IEntityMetaDataService {

	/**
	 * 根据名称或类获取实体类，名称忽略大小写
	 * 
	 * @param entityNameOrClassName
	 * @return
	 */
	<T> T getEntityClass(String entityNameOrClassName);

	/**
	 * 根据名称或类获取实体元模型，名称忽略大小写
	 * 
	 * @param entityNameOrClassName
	 * @return
	 */
	EntityMetaData getEntityMetaData(String entityNameOrClassName);

	/**
	 * 获取系统中所有的实体
	 * 
	 * @return
	 */
	List<Class<?>> getAllEntityClasses();

	/**
	 * 获取子表属性名，获取子表元模型
	 * 
	 * @param table
	 * @param subTableAttr
	 * @return
	 */
	EntityMetaData getSubEntityMetaData(String table, String subTableAttr);

	/**
	 * 返回可序列化和反序列化的元模型
	 * 
	 * @param entityNameOrClassName
	 * @return
	 */
	JsonEntityMetaData getJsonEntityMetaData(String entityNameOrClassName);

}
