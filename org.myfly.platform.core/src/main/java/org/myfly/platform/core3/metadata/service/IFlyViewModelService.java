package org.myfly.platform.core3.metadata.service;

import org.myfly.platform.core3.model.view.PWindow;

/**
 * 显示模型服务
 * 
 * @author xiangwanhong
 *
 */
public interface IFlyViewModelService {
	/**
	 * 获取实体显示模型
	 * @param entityName
	 * @return
	 */
	public PWindow getViewModel(String entityName);
}
