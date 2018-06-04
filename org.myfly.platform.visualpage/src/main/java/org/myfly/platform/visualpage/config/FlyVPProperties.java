package org.myfly.platform.visualpage.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * VP配置文件
 * @author xiangwanhong
 *
 */
@ConfigurationProperties(prefix = "org.myfly.platform.vp")
public class FlyVPProperties {
	/**
	 * 启动时是否清除模板目录
	 */
	private boolean clearWorkTemplatePath = true;

	/**
	 * 缺省布局
	 */
	private String defaultLayout = "default";

	/**
	 * 模板目录
	 */
	private String workTemplatePath = "${java.io.tmpdir}velocity/";
	
	/**
	 * 模板文件缓存，如果不启用则每次调用都重新生成
	 */
	private boolean templateFileCache = false;

	public boolean isClearWorkTemplatePath() {
		return clearWorkTemplatePath;
	}

	public void setClearWorkTemplatePath(boolean clearWorkTemplatePath) {
		this.clearWorkTemplatePath = clearWorkTemplatePath;
	}

	public String getDefaultLayout() {
		return defaultLayout;
	}

	public void setDefaultLayout(String defaultLayout) {
		this.defaultLayout = defaultLayout;
	}

	public String getWorkTemplatePath() {
		return workTemplatePath;
	}

	public void setWorkTemplatePath(String workTemplatePath) {
		this.workTemplatePath = workTemplatePath;
	}

	public boolean isTemplateFileCache() {
		return templateFileCache;
	}

	public void setTemplateFileCache(boolean templateFileCache) {
		this.templateFileCache = templateFileCache;
	}
}
