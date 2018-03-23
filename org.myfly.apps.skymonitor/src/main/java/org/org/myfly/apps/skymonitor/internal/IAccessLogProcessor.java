package org.org.myfly.apps.skymonitor.internal;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.org.myfly.apps.skymonitor.domain.AccessLog;

public interface IAccessLogProcessor {

	/**
	 * 读取日志文件
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	List<AccessLog> readAccessLog(File file) throws IOException;

	/**
	 * 根据日志字符串构建日志对象 123.139.75.37|-|-|05/Jun/2016:10:14:54
	 * +0800|GET|/grm/ywdj/script/controller/com.ygsoft.ecp.app.ywdj.controller.
	 * js|HTTP/1.1|304
	 * |-|1243|http://ygfs.ygsoft.com:9080/grm/core.workflow.engine/workflow/
	 * todo.html?_d=
	 * Qml6SUQ9MzA0OTUxODYmcHJvY2Vzc0RlZklEPTExMTYmYWN0aXZpdHlEZWZJRD1lY3BVc2VyVGFzayZjbGFzc0lkPWdyaXMueXdkaiZ0eXBlSWQ9NTQwMjAmcHJvY2Vzc0luc3RJZD0yODE4NDUmYWN0aXZpdHlJbnN0SUQ9MTY5MzYyNCZzdGFydER3ZGg9MDAzMiZ3b3JrSXRlbUlkPTgwMjI5MyZvcGVubW9kZT0xJnByb2Nlc3N0eXBlPTImd2ViUHJveHk9dHJ1ZSZta2pjPUVSJmNsb3NlTW9kZWw9MSZfaD0xMjE1MDc0MzAw
	 * &_winTitle=Y92001.%E5%B7%AE%E6%97%85%E8%B4%B9%E6%8A%A5%E9%94%80-%E9%A2%84
	 * %E7%AE%97|Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML,
	 * like Gecko) Chrome/30.0.1599.66 Safari/537.36|1129|204
	 * 
	 * @param line
	 * @return
	 */
	AccessLog logLineToObject(String line);

	/**
	 * 
	 * @param path
	 */
	void importAccessLogs(String path);
	
	void importAccessLogs(String path, int taskSize);

	void importAccessLog(File file) throws Exception;
}