package org.myfly.platform.core.metadata.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.myfly.platform.core.metadata.entity.EntityFieldDefinition;
import org.myfly.platform.core.metadata.entity.EntityFormDefinition;
import org.myfly.platform.core.metadata.entity.EntityListDefinition;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.entity.EntityOutlineDefinition;
import org.myfly.platform.core.metadata.entity.PKFieldDefinition;
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
		map.put("/meta", "显示所有实体列表");
		map.put("/meta/{table}", "获取实体元模型数据,{table}为实体名称");
		map.put("/meta/{table}/pk", "获取实体主键定义");
		map.put("/meta/{table}/fields", "获取实体字段集");
		map.put("/meta/{table}/fields/{name}", "获取指定实体字段定义,{name}表示属性名称");
		map.put("/meta/{table}/listviews", "获取实体列表视图定义");
		map.put("/meta/{table}/listviews/{name}", "获取指定名称实体列表视图定义,{name}表示视图名称");
		map.put("/meta/{table}/formviews", "获取实体表单视图定义");
		map.put("/meta/{table}/formviews/{name}", "获取指定实体表单视图定义,{name}表示视图名称");
		map.put("/meta/{table}/outlineviews", "获取实体大纲视图定义");
		map.put("/meta/{table}/outlineviews/{name}", "获取指定实体大纲视图定义,{name}表示视图名称");
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
	
	/**
	 * 获取实体主键定义
	 * 
	 * @param table
	 * @return
	 */
	@RequestMapping("{table}/pk")
	public PKFieldDefinition getEntityMetaDataForPKField(@PathVariable("table") String table) {
		return getEntityMetaData(table).getPkFieldDefinition();
	}

	/**
	 * 获取实体字段集
	 * 
	 * @param table
	 * @return
	 */
	@RequestMapping("{table}/fields")
	public Map<String, EntityFieldDefinition> getEntityMetaDataForFields(@PathVariable("table") String table) {
		return getEntityMetaData(table).getFieldMap();
	}

	/**
	 * 获取指定实体字段定义
	 * 
	 * @param table
	 * @return
	 */
	@RequestMapping("{table}/fields/{name}")
	public EntityFieldDefinition getEntityMetaDataForField(@PathVariable("table") String table,
			@PathVariable("name") String name) {
		return getEntityMetaData(table).getFieldMap().get(name);
	}

	/**
	 * 获取实体列表视图定义
	 * 
	 * @param table
	 * @return
	 */
	@RequestMapping("{table}/listviews")
	public Map<String, EntityListDefinition> getEntityMetaDataForListViews(@PathVariable("table") String table) {
		return getEntityMetaData(table).getListDefinitions();
	}

	/**
	 * 获取指定名称实体列表视图定义
	 * 
	 * @param table
	 * @return
	 */
	@RequestMapping("{table}/listviews/{name}")
	public EntityListDefinition getEntityMetaDataForListViews(@PathVariable("table") String table,
			@PathVariable("name") String name) {
		return getEntityMetaData(table).getListDefinitions().get(name);
	}

	/**
	 * 获取实体表单视图定义
	 * 
	 * @param table
	 * @return
	 */
	@RequestMapping("{table}/formviews")
	public Map<String, EntityFormDefinition> getEntityMetaDataForFormViews(@PathVariable("table") String table) {
		return getEntityMetaData(table).getFormDefinitions();
	}

	/**
	 * 获取指定实体表单视图定义
	 * 
	 * @param table
	 * @return
	 */
	@RequestMapping("{table}/formviews/{name}")
	public EntityFormDefinition getEntityMetaDataForFormView(@PathVariable("table") String table,
			@PathVariable("name") String name) {
		return getEntityMetaData(table).getFormDefinitions().get(name);
	}

	/**
	 * 获取实体表单视图定义
	 * 
	 * @param table
	 * @return
	 */
	@RequestMapping("{table}/outlineviews")
	public Map<String, EntityOutlineDefinition> getEntityMetaDataForOutlineViews(@PathVariable("table") String table) {
		return getEntityMetaData(table).getOutlineDefinitions();
	}

	/**
	 * 获取指定实体表单视图定义
	 * 
	 * @param table
	 * @return
	 */
	@RequestMapping("{table}/outlineviews/{name}")
	public EntityOutlineDefinition getEntityMetaDataForOutlineView(@PathVariable("table") String table,
			@PathVariable("name") String name) {
		return getEntityMetaData(table).getOutlineDefinitions().get(name);
	}
}
