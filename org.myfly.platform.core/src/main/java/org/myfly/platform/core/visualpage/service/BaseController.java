package org.myfly.platform.core.visualpage.service;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.context.UserContext;
import org.myfly.platform.core.domain.AlertInfo;
import org.myfly.platform.core.flydata.service.IFlyDataAccessService;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.Utils;
import org.myfly.platform.core.visualpage.domain.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.ModelAndView;

/**
 * 实体MVC 控制器基类
 * 
 * @author xiangwanhong
 *
 */
public abstract class BaseController {
	private Log log = LogFactory.getLog(getClass());
	
	@Autowired
	private IVisualPageService visualPageService;

	@Value("${server.port}")
	private String port;
	

	public IVisualPageService getVisualPageService() {
		return visualPageService;
	}

	public void setVisualPageService(IVisualPageService visualPageService) {
		this.visualPageService = visualPageService;
	}

	/**
	 * 获取服务地址
	 * 
	 * @return
	 */
	public String getBaseUrl() {
		return "http://localhost:" + port;
	}

	/**
	 * 设置用户警告信息，设置到用户会话中
	 * 
	 * @param alertInfo
	 */
	public void setUserAlertInfo(AlertInfo alertInfo) {
		UserContext.getUserSession().setAlertInfo(alertInfo);
		if (log.isDebugEnabled()) {
			log.debug(alertInfo.toString());
		}
	}

	/**
	 * 获取用户的警告信息，从用户会话中获取
	 * 
	 * @return
	 */
	public AlertInfo getUserAlertInfo() {
		return UserContext.getUserSession().getAlertInfo();
	}

	/**
	 * 根据页面类型，获取主视图名称
	 * 
	 * @param pageType
	 * @return
	 */
	public String getMasterViewName(VisualPageType pageType) {
		String name = null;
		if (pageType == null) {
			name = VisualPageConstants.PORTAL_EMPTY_VIEW;
		} else {
			switch (pageType) {
			case LISTPRINT:
			case PRINT:
				name = VisualPageConstants.PORTAL_PRINT_VIEW;
				break;
			case OUTLINE:
				name = VisualPageConstants.PORTAL_OUTLINE_VIEW;
				break;
			default:
				name = VisualPageConstants.PORTAL_SUBPAGE_VIEW;
				break;
			}
		}
		return getVisualPageService().getTemplateFile(name);
	}

	/**
	 * 获取ModelAndView，已添加常用工具类。资料获取视图时，必须从此处获取
	 * 
	 * @param pageType
	 * 
	 * @return
	 */
	public ModelAndView getBaseModelAndView(VisualPageType pageType) {
		ModelAndView mv = new ModelAndView();
		// 设置主模板视图
		mv.setViewName(getMasterViewName(pageType));
		// 增加工具集类
		mv.addObject("utils", new Utils());
		// 增加警告信息对象
		mv.addObject("alert", getUserAlertInfo());
		return mv;
	}
	
	public ModelAndView getBaseModelAndView(VisualPageType pageType, HttpServletRequest request) {
		if (request != null && StringUtils.isBlank(request.getHeader("Referer"))){
			pageType = null;
		}
		return getBaseModelAndView(pageType);
	}

	public ModelAndView getBaseModelAndView() {
		return getBaseModelAndView(VisualPageType.VIEW);
	}
	
	public ModelAndView getBaseModelAndView(HttpServletRequest request){
		VisualPageType pageType = VisualPageType.VIEW;
		if (request != null && StringUtils.isBlank(request.getHeader("Referer"))){
			pageType = null;
		}
		return getBaseModelAndView(pageType);
	}

	/**
	 * 获取MV
	 * 
	 * @param pageType
	 * @param pageInfo
	 * @param noSkin
	 * @return
	 */
	public ModelAndView getBaseModelAndView(VisualPageType pageType, PageInfo pageInfo) {
		ModelAndView mv = getBaseModelAndView(pageType);
		mv.addObject("pageInfo", pageInfo);
		return mv;
	}
	
	public ModelAndView getBaseModelAndView(VisualPageType pageType, PageInfo pageInfo, HttpServletRequest request) {
		if (request != null && StringUtils.isBlank(request.getHeader("Referer"))){
			pageType = null;
		}
		ModelAndView mv = getBaseModelAndView(pageType);
		mv.addObject("pageInfo", pageInfo);
		return mv;
	}

	/**
	 * 获取MV
	 * 
	 * @param title
	 * @param subTitle
	 * @param subViewName
	 * @param scripts
	 * @return
	 */
	public ModelAndView getBaseModelAndView(String title, String subTitle, String subViewName, String... scripts) {
		PageInfo pageInfo = getBasePageInfo(title, subTitle, subViewName);
		pageInfo.setScripts(scripts);
		ModelAndView mv = getBaseModelAndView();
		mv.addObject("pageInfo", pageInfo);
		return mv;
	}

	public ModelAndView getModelAndView(HttpServletRequest request, String title, String subTitle, String subViewName,
			String... scripts) {
		PageInfo pageInfo = getBasePageInfo(title, subTitle, subViewName);
		pageInfo.setScripts(scripts);
		ModelAndView mv = getBaseModelAndView();
		mv.addObject("pageInfo", pageInfo);
		return mv;
	}

	/**
	 * 跳转到Referer页面
	 * 
	 * @param url
	 * @return
	 */
	public ModelAndView redirectReferer(HttpServletRequest request) {
		String viewName = request.getHeader("referer");
		if (StringUtils.isBlank(viewName)) {
			viewName = getMasterViewName(VisualPageType.VIEW);
		}
		return new ModelAndView("redirect:" + viewName);
	}

	/**
	 * 重定向到页面。问题：客户端会多一次交互
	 * 
	 * @param url
	 * @return
	 */
	public ModelAndView redirectTo(String url) {
		if (log.isDebugEnabled()) {
			log.debug("redirect: " + url);
		}
		return new ModelAndView("redirect:" + url);
	}

	/**
	 * 服务端直接转向到另外一个地址。问题：客户端地址不会改变
	 * 
	 * @param url
	 * @return
	 */
	public ModelAndView forwardTo(String url) {
		if (log.isDebugEnabled()) {
			log.debug("forward: " + url);
		}
		return new ModelAndView("forward:" + url);
	}

	/**
	 * 获取PageInfo
	 * 
	 * @param title
	 * @param subTitle
	 * @param subViewName
	 * @return
	 */
	public PageInfo getBasePageInfo(final String title, final String subTitle, final String subViewName) {
		PageInfo pageInfo = new PageInfo();
		pageInfo.setTitle(title);
		pageInfo.setSubTitle(subTitle);
		pageInfo.setLayout(visualPageService.getCurrentLayout());
		if (StringUtils.isNotBlank(subViewName)) {
			if (subViewName.startsWith(pageInfo.getLayout())) {
				pageInfo.setTemplate(subViewName);
			} else {
				pageInfo.setTemplate(pageInfo.getLayout() + "/" + subViewName);
			}
		}
		pageInfo.setSideBarTemplate(
				visualPageService.getUserSideBarTemplteFile(UserContext.getUserTokenid(), VisualPageType.RENDER));
		return pageInfo;
	}

	/**
	 * 信息错误信息
	 * 
	 * @param messages
	 * @return
	 */
	public ModelAndView showError(final String title, final String... messages) {
		PageInfo pageInfo = getBasePageInfo("", "错误：" + title, VisualPageConstants.COMMON_TEMPLATE_ERROR);
		ModelAndView mv = getBaseModelAndView(VisualPageType.VIEW);
		mv.addObject("pageInfo", pageInfo);
		mv.addObject("messages", messages);
		return mv;
	}

	/**
	 * 显示提示信息
	 * 
	 * @param title
	 * @param messages
	 * @return
	 */
	public ModelAndView showInfo(final String title, final String... messages) {
		PageInfo pageInfo = getBasePageInfo("", "提示：" + title, VisualPageConstants.COMMON_TEMPLATE_ERROR);
		ModelAndView mv = getBaseModelAndView(VisualPageType.VIEW);
		mv.addObject("pageInfo", pageInfo);
		mv.addObject("messages", messages);
		return mv;
	}

	/**
	 * 获取实体下载文件，相对路径
	 * 
	 * @param fileName
	 * @return
	 */
	public String getDownloadFileName(String fileName) {
		return fileName.substring(FileUtils.getTempDirectoryPath().length());
	}

	public IFlyDataAccessService getFlyDataAccessService(final String entityName) {
		return AppUtil.getFlyDataAccessService(entityName);
	}
}
