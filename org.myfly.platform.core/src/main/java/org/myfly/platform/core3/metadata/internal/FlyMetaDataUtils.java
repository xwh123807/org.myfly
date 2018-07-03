package org.myfly.platform.core3.metadata.internal;

import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.metadata.builder.FlyDataModelBuilder;
import org.myfly.platform.core3.metadata.builder.FlyViewModelBuilder;
import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.core3.metadata.service.IFlyDataModel;
import org.myfly.platform.core3.metadata.service.IFlyViewModel;

public class FlyMetaDataUtils {
	/**
	 * 创建实体类
	 * 
	 * @param entityClass
	 * @return
	 */
	public static <T extends IFlyEntity> T newFlyEntityInstance(Class<T> entityClass) {
		try {
			return (T) entityClass.newInstance();
		} catch (Exception e) {
			throw new IllegalArgumentException(
					"创建实体类[" + entityClass.getClass().getName() + "]失败，错误信息: " + e.getMessage());
		}
	}

	/**
	 * 从实体类构建实体数据模型
	 * 
	 * @param entityClass
	 * @return
	 */
	public static FlyDataModel newFlyDataModelFromEntityClass(Class<?> entityClass) {
		FlyDataModelBuilder builder = new FlyDataModelBuilder(entityClass);
		builder.build();
		builder.validate();
		return builder.getFlyDataModel();
	}

	/**
	 * 从实体数据模型构建实体显示模型
	 * 
	 * @param dataModel
	 * @return
	 */
	public static IFlyViewModel newFlyViewModelFromDataModel(IFlyDataModel dataModel) {
		FlyViewModelBuilder builder = new FlyViewModelBuilder(dataModel);
		builder.build();
		builder.validate();
		return builder.getFlyViewModel();
	}
}
