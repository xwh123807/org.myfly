package org.myfly.platform.visualpage3.webui;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.myfly.platform.core3.flydata.service.FlyEntityMap;
import org.myfly.platform.core3.flydata.service.IFlyDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("vp3")
public class VisualPage3Controller {
	@Autowired
	private IFlyDataService dataService;

	@GetMapping("test")
	public ModelAndView test() {
		ModelAndView view = new ModelAndView();
		view.setViewName("file:/xwh.work/git/org.myfly/org.myfly.platform.visualpage3/src/main/resources/templates/test.html");
		return view;
	}
	
	@GetMapping("")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView();
		Map<String, String> pageInfo = new HashMap<>();
		pageInfo.put("title", "thymeleaf");
		pageInfo.put("subTitle", "empty");
		view.addObject("pageInfo", pageInfo);
		view.addObject("webresPath", "/");
		view.addObject("subPage", "content");
		view.setViewName("empty");
		return view;
	}
	
	@GetMapping("tables")
	public ModelAndView table() {
		ModelAndView view = new ModelAndView("empty");
		Map<String, String> pageInfo = new HashMap<>();
		pageInfo.put("title", "VP3");
		pageInfo.put("subTitle", "tables");
		view.addObject("pageInfo", pageInfo);
		view.addObject("webresPath", "/");
		view.addObject("subPage", "tables");
		List<FlyEntityMap> tables = dataService.findAll("ptable");
		view.addObject("objList", tables);
		return view;
	}
	
	@GetMapping("vue")
	public ModelAndView vue() {
		ModelAndView view = new ModelAndView("vue-empty");
		Map<String, String> pageInfo = new HashMap<>();
		pageInfo.put("title", "VUE");
		pageInfo.put("subTitle", "tables");
		view.addObject("pageInfo", pageInfo);
		view.addObject("webresPath", "/");
		view.addObject("subPage", "vue-content");
		List<FlyEntityMap> tables = dataService.findAll("ptable");
		view.addObject("objList", tables);
		return view;
	}
	
	@GetMapping("vue/{subPage}")
	public ModelAndView vueForSubPage(@PathVariable(name ="subPage") String subPage) {
		ModelAndView view = new ModelAndView("vue-empty");
		Map<String, String> pageInfo = new HashMap<>();
		pageInfo.put("title", "VUE");
		pageInfo.put("subTitle", "tables");
		view.addObject("pageInfo", pageInfo);
		view.addObject("webresPath", "/");
		view.addObject("subPage", subPage);
		List<FlyEntityMap> tables = dataService.findAll("ptable");
		view.addObject("objList", tables);
		return view;
	}
}
