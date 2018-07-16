package org.myfly.platform.visualpage3.internal;

import org.myfly.platform.visualpage3.service.ITemplateService;
import org.myfly.platform.visualpage3.webui.ViewMode;
import org.myfly.platform.visualpage3.webui.view.FormView;
import org.springframework.stereotype.Service;

@Service
public class TemplateService implements ITemplateService{
	/**
	 * 模板存储路径
	 */
	private String templatePath = "";

	public String getTemplatePath() {
		return templatePath;
	}
	
	@Override
	public String getFormViewTempalte(String windowName, ViewMode edit) {
		return null;
	}

	@Override
	public String getListViewTempalte(String windowName, ViewMode view) {
		return null;
	}
}
