package org.myfly.platform.core.flydata.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "org.myfly.platform.data")
public class FlyDataProperties {
	/**
	 * 是否初始化系统级实体
	 */
	private boolean initSysData = true;
	
	/**
	 * 是否初始化样例数据
	 */
	private boolean initSampleData = false;
	
	/**
	 * 导出最大记录数
	 */
	private int maxExportSize = 10000;
	
	/**
	 * 
	 */
	private boolean clearWorkTemplatePath = true;

	/**
	 * 
	 */
	private String defaultLayout = "default";

	private String workTemplatePath = "${java.io.tmpdir}velocity/";

	public int getMaxExportSize() {
		return maxExportSize;
	}

	public void setMaxExportSize(int maxExportSize) {
		this.maxExportSize = maxExportSize;
	}

	public boolean isInitSysData() {
		return initSysData;
	}

	public void setInitSysData(boolean initSysData) {
		this.initSysData = initSysData;
	}

	public boolean isInitSampleData() {
		return initSampleData;
	}

	public void setInitSampleData(boolean initSampleData) {
		this.initSampleData = initSampleData;
	}
	
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
}
