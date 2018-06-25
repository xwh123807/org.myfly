package org.myfly.platform.core3.metadata.internal;

import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.metadata.builder.FlyDataModelBuilder;
import org.myfly.platform.core3.metadata.builder.FlyViewModelBuilder;
import org.myfly.platform.core3.metadata.service.IFlyColumn;
import org.myfly.platform.core3.metadata.service.IFlyDataModel;
import org.myfly.platform.core3.metadata.service.IFlyDataModelService;
import org.myfly.platform.core3.metadata.service.IFlyViewField;
import org.myfly.platform.core3.metadata.service.IFlyViewModel;
import org.myfly.platform.core3.metadata.service.IFlyViewModelService;
import org.myfly.platform.core3.metadata.service.IFlyViewTab;

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
	 * 创建IFlyDataModel实例
	 * 
	 * @return
	 */
	public static IFlyDataModel newFlyDataModelInstance() {
		return newFlyEntityInstance(IFlyDataModelService.IMPLCLASS_FLY_DATA_MODEL);
	}

	/**
	 * 创建IFlyColumn实例
	 * 
	 * @return
	 */
	public static IFlyColumn newFlyColumnInstance() {
		return newFlyEntityInstance(IFlyDataModelService.IMPLCLASS_FLY_COLUMN);
	}

	/**
	 * 从实体类构建实体数据模型
	 * 
	 * @param entityClass
	 * @return
	 */
	public static IFlyDataModel newFlyDataModelFromEntityClass(Class<?> entityClass) {
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

	/**
	 * 创建IFlyViewModel实例
	 * 
	 * @return
	 */
	public static IFlyViewModel newFlyViewModelInstance() {
		return newFlyEntityInstance(IFlyViewModelService.IMPLCLASS_FLY_VIEW_MODEL);
	}

	/**
	 * 创建IFlyViewTab实例
	 * 
	 * @return
	 */
	public static IFlyViewTab newFlyViewTabInstance() {
		return newFlyEntityInstance(IFlyViewModelService.IMPLCLASS_FLY_VIEW_TAB);
	}

	/**
	 * 创建IFlyViewField实例
	 * 
	 * @return
	 */
	public static IFlyViewField newFlyViewFieldInstance() {
		return newFlyEntityInstance(IFlyViewModelService.IMPLCLASS_FLY_VIEW_FIELD);
	}

}
