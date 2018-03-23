package org.org.myfly.apps.skymonitor.internal;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="skymonitor")
public class ConfigProperties {
	//private String path = "/Users/xiangwanhong/logs";
	private String path ="/Users/xiangwanhong/Downloads/access_log";
	
	/**
	 * 秒
	 */
	private long haustedTime = 1;
	
	private int threads = 1;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public long getHaustedTime() {
		return haustedTime;
	}

	public void setHaustedTime(long haustedTime) {
		this.haustedTime = haustedTime;
	}

	public int getThreads() {
		return threads;
	}

	public void setThreads(int threads) {
		this.threads = threads;
	}
}
