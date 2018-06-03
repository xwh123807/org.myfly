package org.myfly.platform.visualpage.admin;

import org.myfly.platform.visualpage.service.BaseViewController;
import org.myfly.platform.visualpage.service.VisualPageConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController extends BaseViewController {
	/**
	 * 首页
	 * @return
	 */
	@RequestMapping
	public ModelAndView appHome(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("pageInfo", getBasePageInfo(null, null, null));
		//设置主页模板
		modelAndView.setViewName(getVisualPageService().getTemplateFile(VisualPageConstants.PORTAL_INDEX_VIEW));
		return modelAndView;
	}
	
	@RequestMapping("dashboard")
	public ModelAndView home() {
		ModelAndView mv = getBaseModelAndView("仪表板", "我的仪表板", "portal/dashboard.vm", "assets/js/dashboard.js");
		return mv;
	}
	
	@RequestMapping("error2")
	public ModelAndView error(){
		ModelAndView mv = getBaseModelAndView("仪表板", "我的仪表板", "portal/error.vm");
		return mv;
	}
}
