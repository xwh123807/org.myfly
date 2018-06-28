package org.myfly.platform.tools.codebuilder;

import java.util.List;
import java.util.Map;

public class CodeBuilder {
	/**
	 * 生成代码存放路径
	 */
	private String path;
	/**
	 * 代码包名
	 */
	private String packageName;
	/**
	 * 代码模板
	 */
	private String template;
	/**
	 * 源
	 */
	private List<Map<String, Object>> sources;

	public CodeBuilder() {
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public List<Map<String, Object>> getSources() {
		return sources;
	}

	public void setSources(List<Map<String, Object>> sources) {
		this.sources = sources;
	}

	public void generateCodes() {
		
	}
}
