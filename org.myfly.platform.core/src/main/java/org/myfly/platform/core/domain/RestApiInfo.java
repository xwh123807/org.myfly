package org.myfly.platform.core.domain;

import org.springframework.http.HttpMethod;

public class RestApiInfo {
	private String path;
	private String description;
	private HttpMethod method;
	
	public RestApiInfo(String path, String description, HttpMethod method) {
		setPath(path);
		setDescription(description);
		setMethod(method);
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

	public HttpMethod getMethod() {
		return method;
	}

	public void setMethod(HttpMethod method) {
		this.method = method;
	}
}
