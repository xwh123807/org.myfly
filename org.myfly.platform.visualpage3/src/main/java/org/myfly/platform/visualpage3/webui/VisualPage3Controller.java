package org.myfly.platform.visualpage3.webui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("vp3")
public class VisualPage3Controller {

	@GetMapping("test")
	public ModelAndView test() {
		ModelAndView view = new ModelAndView();
		view.setViewName("file:/xwh.work/git/org.myfly/org.myfly.platform.visualpage3/src/main/resources/templates/test.html");
		return view;
	}
}
