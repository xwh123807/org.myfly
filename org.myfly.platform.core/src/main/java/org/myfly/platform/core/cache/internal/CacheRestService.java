package org.myfly.platform.core.cache.internal;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.myfly.platform.core.cache.service.CacheInfo;
import org.myfly.platform.core.cache.service.ICacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cache")
public class CacheRestService {
	@Autowired
	private ICacheService cacheService;
	
	@RequestMapping(value= {"", "help"})
	@ResponseBody
	public Map<String, String> help(){
		Map<String, String> map = new LinkedHashMap<>();
		map.put("help", "Help");
		map.put("list", "getCachesInfo");
		map.put("manager", "getCacheImplementor");
		return map;
	}
	
	@RequestMapping("manager")
	@ResponseBody
	public String getCacheImplementor() {
		return cacheService.getCacheImplementor();
	}
	
	@RequestMapping("list")
	@ResponseBody
	public List<CacheInfo> getCachesInfo(){
		return cacheService.getCachesInfo();
	}
	
	@RequestMapping("list/{cacheName}")
	@ResponseBody
	public Object listCacheObject(@PathVariable("cacheName") String cacheName){
		return cacheService.listCacheObject(cacheName);
	}
}
