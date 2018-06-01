package org.myfly.platform.core.metadata.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.service.IEntityMetaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "meta")
public class MetaDataRestService {
	@Autowired
	private IEntityMetaDataService entityMetaDataService;

	@RequestMapping(value = "help")
	public Map<String, String> help() {
		Map<String, String> map = new LinkedHashMap<>();
		map.put("/meta/{table}", "获取实体元模型数据,{table}为实体名称");
		map.put("/meta", "显示所有实体列表");
		return map;
	}

	/**
	 * 显示所有实体列表
	 * 
	 * @return
	 */
	@RequestMapping
	public String[] list() {
		return entityMetaDataService.getAllEntityClasses().stream().map(item -> item.getName())
				.collect(Collectors.toList()).toArray(new String[] {});
	}

	/**
	 * 获取实体元模型数据
	 * 
	 * @param table
	 * @return
	 */
	@RequestMapping("{table}")
	public EntityMetaData getEntityMetaData(@PathVariable("table") String table) {
		return entityMetaDataService.getEntityMetaData(table);
	}
}
