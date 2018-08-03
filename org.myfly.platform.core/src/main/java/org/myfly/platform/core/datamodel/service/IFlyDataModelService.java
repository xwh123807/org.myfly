package org.myfly.platform.core.datamodel.service;

import java.util.List;

import org.myfly.platform.core.datamodel.define.FlyDataModel;
import org.myfly.platform.core.datamodel.model.PColumn;
import org.myfly.platform.core.datamodel.model.PTable;
import org.myfly.platform.core.domain.IFlyEntity;

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
	List<Class<? extends IFlyEntity>> getAllEntityClasses();

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
	public FlyDataModel getFlyDataModel(String entityName);
}
