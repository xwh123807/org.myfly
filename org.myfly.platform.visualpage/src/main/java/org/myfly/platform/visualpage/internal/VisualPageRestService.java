package org.myfly.platform.visualpage.internal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.myfly.platform.core.metadata.internal.EntityViewInfo;
import org.myfly.platform.core.utils.AssertUtil;
import org.myfly.platform.visualpage.domain.TemplateBuilderInfo;
import org.myfly.platform.visualpage.service.IVisualPageService;
import org.myfly.platform.visualpage.service.VisualPageType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "vpmeta")
public class VisualPageRestService {
	@Autowired
	private IVisualPageService pageService;

	@RequestMapping(path = { "help", "" })
	public Map<String, String> help() {
		Map<String, String> map = new HashMap<>();
		map.put("/vpmeta/help", "帮助");
		map.put("/vpmeta/views", "所有实体视图");
		map.put("/vpmeta/builders", "视图构造器");
		return map;
	}

	@RequestMapping(path = "views")
	public List<EntityViewInfo> getAllEntitiesViewInfo() {
		return pageService.getAllEntitiesViewInfo();
	}

	@RequestMapping(path = "builders")
	public List<TemplateBuilderInfo> getAllTemplateBuilder() {
		return pageService.getAllTemplateBuilder();
	}

	@RequestMapping("template/{table}/{pageType}")
	@ResponseBody
	public String getTemplateContent(@PathVariable("table") String table,
			@PathVariable("pageType") VisualPageType pageType,
			@RequestParam(name = "view", required = false) String view, HttpServletRequest request) {
		AssertUtil.parameterEmpty(table, "table");
		AssertUtil.parameterEmpty(pageType, "pageType");
		return pageService.getEntityTemplateContent(table, pageType, view);
	}
}
