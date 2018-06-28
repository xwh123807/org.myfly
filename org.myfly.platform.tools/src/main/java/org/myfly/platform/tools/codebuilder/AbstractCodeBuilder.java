package org.myfly.platform.tools.codebuilder;

import java.util.List;
import java.util.Map;

public abstract class AbstractCodeBuilder {
	/**
	 * 生成代码存放路径
	 */
	private String path;
	/**
	 * 代码包名
	 */
	private String packageName;

	/**
	 * 源
	 */
	private List<Map<String, Object>> sources;

	public AbstractCodeBuilder() {
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

	public List<Map<String, Object>> getData(String tableName) {
		return DB.getJdbcTemplate().queryForList("select * from " + tableName);
	}

	public abstract void prepare();

	public abstract void generateCodes();

	public List<Map<String, Object>> getSources() {
		return sources;
	}

	public void setSources(List<Map<String, Object>> sources) {
		this.sources = sources;
	}
}
