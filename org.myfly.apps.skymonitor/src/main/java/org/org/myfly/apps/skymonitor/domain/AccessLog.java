package org.org.myfly.apps.skymonitor.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ACCESS_LOG", indexes= @Index(columnList="url"))
public class AccessLog implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -651663453801115388L;
	@Id
	@Column(length=36)
	private String iid;
	@Column(name="app_name", length=20)
	private String appName;
	@Column(name="server_ip", length=50)
	private String serverIP;
	@Column(name="remote_ip", length=50)
	private String remoteIP;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="access_time")
	private Date accessTime;
	@Column(name="method", length=4000)
	private String method;
	@Column(name="url", length=4000)
	private String url;
	@Column(name="protocal", length=200)
	private String protocal;
	@Column(name="status", length=20)
	private String status;
	@Column(name="referer", length=4000)
	private String referer;
	@Column(name="agent", length=1024)
	private String agent;
	@Column(name="bytes", columnDefinition="decimal(18,0) default 0")
	private long bytes;
	@Column(name="hausted_time", columnDefinition="decimal(18,0) default 0")
	private long haustedTime;
	@Column(name="input", columnDefinition="decimal(18,0) default 0")
	private long input;
	@Column(name="output", columnDefinition="decimal(18,0) default 0")
	private long output;
	@Column(name="exception_id", length=50)
	private String exceptionID;
	public String getIid() {
		return iid;
	}
	public void setIid(String iid) {
		this.iid = iid;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getServerIP() {
		return serverIP;
	}
	public void setServerIP(String serverIP) {
		this.serverIP = serverIP;
	}
	public String getRemoteIP() {
		return remoteIP;
	}
	public void setRemoteIP(String remoteIP) {
		this.remoteIP = remoteIP;
	}
	public Date getAccessTime() {
		return accessTime;
	}
	public void setAccessTime(Date accessTime) {
		this.accessTime = accessTime;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getProtocal() {
		return protocal;
	}
	public void setProtocal(String protocal) {
		this.protocal = protocal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReferer() {
		return referer;
	}
	public void setReferer(String referer) {
		this.referer = referer;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public long getBytes() {
		return bytes;
	}
	public void setBytes(long bytes) {
		this.bytes = bytes;
	}
	public long getHaustedTime() {
		return haustedTime;
	}
	public void setHaustedTime(long haustedTime) {
		this.haustedTime = haustedTime;
	}
	public long getInput() {
		return input;
	}
	public void setInput(long input) {
		this.input = input;
	}
	public long getOutput() {
		return output;
	}
	public void setOutput(long output) {
		this.output = output;
	}
	public String getExceptionID() {
		return exceptionID;
	}
	public void setExceptionID(String exceptionID) {
		this.exceptionID = exceptionID;
	}
	
	@Override
	public String toString() {
		return "url: " + getUrl() + ", haustedTime: " + getHaustedTime();
	}
}
