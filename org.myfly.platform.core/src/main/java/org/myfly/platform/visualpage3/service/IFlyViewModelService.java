package org.myfly.platform.visualpage3.service;

import org.myfly.platform.visualpage3.define.FlyViewModel;
import org.myfly.platform.visualpage3.model.PField;
import org.myfly.platform.visualpage3.model.PTab;
import org.myfly.platform.visualpage3.model.PWindow;

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
	public FlyViewModel getFlyViewModel(String windowName);

	/**
	 * 
	 * @param uid
	 * @return
	 */
	public FlyViewModel getFlyViewModelByUid(String uid);

	/**
	 * 获取系统按默认规则自动构建的实体显示模型
	 * 
	 * @param entityName
	 * @return
	 */
	public FlyViewModel getFlyViewModelFromBuildIn(String entityName);
}
