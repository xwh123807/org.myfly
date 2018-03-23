package org.org.myfly.apps.skymonitor.internal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.org.myfly.apps.skymonitor.domain.AccessLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class AccessLogProcessor implements IAccessLogProcessor {

	@Autowired
	private ConfigProperties config;

	@Autowired
	private IDataAccessService dataAccessService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.org.myfly.apps.skymonitor.internal.IAccessLogProcessor#readAccessLog(
	 * java.io.File)
	 */
	@Override
	public List<AccessLog> readAccessLog(File file) throws IOException {
		Assert.notNull(file);
		List<String> lines = FileUtils.readLines(file);
		List<AccessLog> result = new ArrayList<>();
		ApacheLogConverter converter = new ApacheLogConverter(null, null, null);
		lines.forEach(new Consumer<String>() {

			@Override
			public void accept(String line) {
				if (StringUtils.isNotBlank(line)) {
					String line2 = converter.convert(line);
					if (StringUtils.isNotBlank(line2)) {
						AccessLog entity = logLineToObject(line2);
						if (entity.getHaustedTime() >= getConfig().getHaustedTime()) {
							result.add(entity);
						}
					}
				}
			}
		});
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.org.myfly.apps.skymonitor.internal.IAccessLogProcessor#
	 * logLineToObject(java.lang.String)
	 */
	@Override
	public AccessLog logLineToObject(String line) {
		AccessLog entity = new AccessLog();
		entity.setIid(UUID.randomUUID().toString());
		String[] items = line.split("\\|");
		for (int col = 0; col < items.length; col++) {
			entity.setRemoteIP(items[0]);
			entity.setServerIP(items[1]);
			entity.setAppName(items[2]);
			entity.setAccessTime(Utils.strToDate(items[3]));
			entity.setMethod(items[4]);
			entity.setUrl(items[5]);
			entity.setProtocal(items[6]);
			entity.setStatus(items[7]);
			entity.setBytes(Utils.toInt(items[8]));
			entity.setHaustedTime(Utils.toInt(items[9]) / 1000 / 1000);
			entity.setReferer(items[10]);
			entity.setAgent(items[11]);
			entity.setInput(Utils.toInt(items[12]));
			entity.setOutput(Utils.toInt(items[13]));
		}
		return entity;
	}
	
	/**
	 * 导入日志
	 * @param file
	 * @throws Exception
	 */
	public void importAccessLog(File file) throws Exception{
		List<AccessLog> logs = readAccessLog(file);
		System.out.println("处理日志文件：" + file.getName() + "，过滤：" + logs.size());
		logs.forEach(new Consumer<AccessLog>() {

			@Override
			public void accept(AccessLog t) {
				//System.out.println(t);
			}
		});
		dataAccessService.saveEntities(logs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.org.myfly.apps.skymonitor.internal.IAccessLogProcessor#
	 * importAccessLogs(java.lang.String)
	 */
	@Override
	public void importAccessLogs(String path) {
		Collection<File> files = FileUtils.listFiles(new File(path), null, true);
		files.forEach(new Consumer<File>() {

			@Override
			public void accept(File logFile) {
				try {
					importAccessLog(logFile);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ConfigProperties getConfig() {
		return config;
	}

	public void setConfig(ConfigProperties config) {
		this.config = config;
	}

	@Override
	public void importAccessLogs(String path, int taskSize) {
		Collection<File> files = FileUtils.listFiles(new File(path), null, true);
		ExecutorService pool = Executors.newFixedThreadPool(taskSize);
		// 将文件分组
		List[] tasks = new List[taskSize];
		for (int i = 0; i < taskSize; i++) {
			tasks[i] = new ArrayList<>();
		}
		Iterator<File> it = files.iterator();
		int pos = 1;
		while (it.hasNext()) {
			File file = it.next();
			tasks[pos % taskSize].add(file);
			pos ++;
		}

		for (int i = 0; i < taskSize; i++) {
			MyCallable call = new MyCallable(tasks[i]);
			pool.submit(call);
		}
		
		pool.shutdown();
	}

	class MyCallable implements Callable<Object> {
		private List<File> files;

		public MyCallable(List<File> files) {
			this.files = files;
		}

		@Override
		public Object call() throws Exception {
			files.forEach(new Consumer<File>() {

				@Override
				public void accept(File file) {
					try {
						importAccessLog(file);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			return null;
		}

	}
}
