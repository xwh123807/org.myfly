package org.myfly.platform.visualpage.security;

import org.myfly.platform.visualpage.service.BaseViewController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping()
public class SecurityController extends BaseViewController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginCheck() {
		return forwardTo("/");
	}
}
