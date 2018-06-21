package org.myfly.platform.core3.metadata.service;

import java.util.List;

import org.myfly.platform.core3.metadata.define.FlyDataModel;

/**
 * 数据模型服务 <br>
 * 
 * @author xiangwanhong
 *
 */
public interface IFlyDataModelService {
	/**
	 * 获取系统中所有的实体
	 * 
	 * @return
	 */
	List<Class<?>> getAllEntityClasses();
	/**
	 * 获取实体类
	 * @param entityName
	 * @return
	 */
	 <T> T  getEntityClass(String entityName);
	/**
	 * 获取表的数据模型
	 * 
	 * @param entityName
	 * @return
	 */
	public FlyDataModel getFlyDataModel(String entityName);

	/**
	 * 获取表的数据模型
	 * 
	 * @param entityClass
	 * @return
	 */
	public FlyDataModel getFlyDataModelFromEntityClass(Class<?> entityClass);
	
	/**
	 * 从实体类中导入数据模型到数据库中
	 * @return
	 */
	public List<String> importDataModelFromAllEntityClass();
}
