package org.myfly.platform.core3.metadata.service;

import org.myfly.platform.core3.model.view.PField;
import org.myfly.platform.core3.model.view.PTab;
import org.myfly.platform.core3.model.view.PWindow;

/**
 * 显示模型服务
 * 
 * @author xiangwanhong
 *
 */
public interface IFlyViewModelService {
	/**
	 * IFlyViewModel实现类
	 */
	public static Class<? extends IFlyViewModel> IMPLCLASS_FLY_VIEW_MODEL = PWindow.class;

	/**
	 * IFlyViewTab实现类
	 */
	public static Class<? extends IFlyViewTab> IMPLCLASS_FLY_VIEW_TAB = PTab.class;

	/**
	 * IFlyViewModel实现类
	 */
	public static Class<? extends IFlyViewField> IMPLCLASS_FLY_VIEW_FIELD = PField.class;

	/**
	 * 获取实体显示模型
	 * 
	 * @param entityName
	 * @return
	 */
	public IFlyViewModel getFlyViewModel(String entityName);

	/**
	 * 
	 * @param uid
	 * @return
	 */
	public IFlyViewModel getFlyViewModelByUid(String uid);

	/**
	 * 获取系统按默认规则自动构建的实体显示模型
	 * 
	 * @param entityName
	 * @return
	 */
	public IFlyViewModel getFlyViewModelFromBuildIn(String entityName);
}
