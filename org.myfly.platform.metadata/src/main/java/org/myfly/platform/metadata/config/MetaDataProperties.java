package org.myfly.platform.metadata.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "org.myfly.platform.metadata")
public class MetaDataProperties {

	private boolean enable = false;

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}
}
