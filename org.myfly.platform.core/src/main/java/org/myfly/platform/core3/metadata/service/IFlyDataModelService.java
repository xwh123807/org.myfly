package org.myfly.platform.core3.metadata.service;

import java.util.List;

import org.myfly.platform.core3.model.data.PColumn;
import org.myfly.platform.core3.model.data.PTable;

/**
 * 数据模型服务 <br>
 * 
 * @author xiangwanhong
 *
 */
public interface IFlyDataModelService {
	/**
	 * IFlyDataModel实现类
	 */
	public static final Class<? extends IFlyDataModel> IMPLCLASS_FLY_DATA_MODEL = PTable.class;

	/**
	 * IFlyColumn实现类
	 */
	public static final Class<? extends IFlyColumn> IMPLCLASS_FLY_COLUMN = PColumn.class;

	/**
	 * 获取系统中所有的实体
	 * 
	 * @return
	 */
	List<Class<?>> getAllEntityClasses();

	/**
	 * 获取实体类
	 * 
	 * @param entityName
	 * @return
	 */
	<T> T getEntityClass(String entityName);

	/**
	 * 获取表的数据模型
	 * 
	 * @param entityName
	 * @return
	 */
	public IFlyDataModel getFlyDataModel(String entityName);

	/**
	 * 获取表的数据模型
	 * 
	 * @param entityClass
	 * @return
	 */
	public IFlyDataModel getFlyDataModelFromEntityClass(Class<?> entityClass);

	/**
	 * 从实体类中导入数据模型到数据库中
	 * 
	 * @return
	 */
	public List<String> importDataModelFromAllEntityClasses();
}
