package org.myfly.platform.core.cache.service;

import java.util.List;

public interface ICacheService {
	String getCacheImplementor();

	List<CacheInfo> getCachesInfo();
	
	public Object listCacheObject(String cacheName);

	List<CacheObjectInfo> getCacheObjectsInfo(String cacheName);

	void clearAll();

	void clearCache(String cacheName);

}
