package org.myfly.platform.core.domain;

public class RestControllerInfo {
	private String path;
	private String description;
	private RestApiInfo[] restApis;

	public RestControllerInfo(String path, String description, RestApiInfo[] restApis) {
		setPath(path);
		setDescription(description);
		setRestApis(restApis);
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public RestApiInfo[] getRestApis() {
		return restApis;
	}

	public void setRestApis(RestApiInfo[] restApis) {
		this.restApis = restApis;
	}
}
