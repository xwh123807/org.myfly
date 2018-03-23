package org.myfly.platform.system.application.filter;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.myfly.platform.core.context.UserContext;
import org.myfly.platform.core.message.service.IMessageQueueService;
import org.myfly.platform.core.message.service.MessageQueueConstants;
import org.myfly.platform.core.utils.StringUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.system.domain.AccessLog;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * http访问监听，将监听结果写入消息队列，并记入用户行为分析
 * @author xiangwanhong
 *
 */
public class AccessLogFilter extends  OncePerRequestFilter{
	private IMessageQueueService messageQueueService;
	
	/**
	 * 资源类匹配正则表达式
	 */
	private String logIgnoresRegex = "/assets/";

	public AccessLogFilter(IMessageQueueService messageQueueService) {
		this.messageQueueService = messageQueueService;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		long startTime = System.currentTimeMillis();
		try{
			chain.doFilter(request, response);
		}finally{
			String uri = request.getRequestURI();
			if (StringUtil.matches(uri, logIgnoresRegex)){
				//不记录日志
			}else{
				long usedtime = System.currentTimeMillis() - startTime;
				AccessLog accessLog = new AccessLog();
				String query = StringUtil.isEmpty(request.getQueryString()) ? "" : "?" + request.getQueryString();
				accessLog.setUid(UUIDUtil.newUUID());
				accessLog.setUrl(StringUtils.substring(uri + query, 0, 1000));
				accessLog.setCreatedBy(UserContext.getUserSession().getUser());
				accessLog.setCreated(Calendar.getInstance().getTime());
				accessLog.setUsedtime(usedtime);
				accessLog.setStatus(response.getStatus());
				accessLog.setResponseLength(0l);
				accessLog.setMethod(request.getMethod());
				accessLog.setRequestLength(request.getContentLengthLong());
				accessLog.setHost(request.getRemoteHost());
				accessLog.setReferer(StringUtils.substring(request.getHeader("referer"), 0, 1000));
				send(accessLog);
			}
		}
	}

	public void send(AccessLog accessLog) {
		messageQueueService.sendMessageToQueue(MessageQueueConstants.QUEUE_ACCESS_LOG , accessLog);
	}
}
