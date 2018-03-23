package org.myfly.platform.system.application.filter;

import javax.servlet.Servlet;
import javax.servlet.ServletRegistration;

import org.myfly.platform.core.message.service.IMessageQueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.servlet.HandlerMapping;

@Configuration
@ConditionalOnClass({ Servlet.class, ServletRegistration.class, OncePerRequestFilter.class, HandlerMapping.class })
public class AccessLogFilterAutoConfiguration {
	@Autowired
	private IMessageQueueService messageQueueService;

	@Bean
	@ConditionalOnProperty(prefix = "org.myfly.platform.system.admin", name = "enable-accesslog", matchIfMissing = false)
	public AccessLogFilter accessLogFilter() {
		return new AccessLogFilter(messageQueueService);
	}

}
