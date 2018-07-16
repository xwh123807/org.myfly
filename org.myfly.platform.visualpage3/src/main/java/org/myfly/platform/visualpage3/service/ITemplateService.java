package org.myfly.platform.visualpage3.service;

import org.myfly.platform.visualpage3.webui.ViewMode;

public interface ITemplateService {

	/**
	 * 获取实体模板。如果没有，则先创建模板
	 * @param windowName
	 * @param edit
	 * @return
	 */
	String getFormViewTempalte(String windowName, ViewMode edit);

	String getListViewTempalte(String windowName, ViewMode view);

}
