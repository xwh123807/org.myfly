package org.myfly.platform.visualpage3.internal;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.visualpage3.define.FlyMemoryViewModel;
import org.myfly.platform.visualpage3.define.FlyViewModel;
import org.myfly.platform.visualpage3.service.ITemplateService;
import org.myfly.platform.visualpage3.webui.ViewMode;
import org.myfly.platform.visualpage3.webui.view.FormView;
import org.myfly.platform.visualpage3.webui.view.ListView;
import org.springframework.stereotype.Service;

@Service
public class TemplateService implements ITemplateService {
	private static Log log = LogFactory.getLog(TemplateService.class);
	/**
	 * 模板存储路径
	 */
	private String templatePath = System.getProperty("user.dir") + "/target/classes/templates/";

	public String getTemplatePath() {
		return templatePath;
	}

	/**
	 * 获取界面模型
	 * 
	 * @param windowName
	 * @return
	 */
	private FlyViewModel getFlyViewModel(String windowName) {
		return FlyMemoryViewModel.getInstance().getFlyViewModel(windowName);
	}

	/**
	 * 保存视图模板
	 * 
	 * @param viewName
	 * @param content
	 */
	private void saveTemplateFile(String viewName, String content) {
		File file = new File(getTemplatePath() + viewName);
		try {
			FileUtils.writeStringToFile(file, content);
			log.info("保存实体视图[" + viewName + "]模板，" + file.getPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getFormViewTempalte(String windowName, ViewMode viewMode) {
		String viewName = "windows/" + windowName + "_" + viewMode.name() + ".html";
		FormView result = new FormView(getFlyViewModel(windowName), viewMode);
		saveTemplateFile(viewName, result.html());
		return viewName;
	}

	@Override
	public String getListViewTempalte(String windowName, ViewMode viewMode) {
		String viewName = "windows/" + windowName + "_" + viewMode.name() + ".html";
		ListView result = new ListView(getFlyViewModel(windowName), viewMode);
		saveTemplateFile(viewName, result.html());
		return viewName;
	}
}
