package org.myfly.platform.metamodel.service;

import java.util.List;

import org.myfly.platform.metamodel.domain.CacheInfo;
import org.myfly.platform.metamodel.domain.CacheObjectInfo;

public interface ICacheService {

	List<CacheInfo> getCachesInfo();

	List<CacheObjectInfo> getCacheObjectsInfo(String cacheName);

	void clearAll();

	void clearCache(String cacheName);

}
