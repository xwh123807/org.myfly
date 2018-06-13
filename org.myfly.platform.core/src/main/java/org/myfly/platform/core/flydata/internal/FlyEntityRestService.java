package org.myfly.platform.core.flydata.internal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.myfly.platform.core.flydata.service.FlyEntityResult;
import org.myfly.platform.core.flydata.service.IFlyEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "flydata2")
public class FlyEntityRestService {
	@Autowired
	private IFlyEntityService flyEntityService;

	public IFlyEntityService getFlyEntityService() {
		return flyEntityService;
	}

	public void setFlyEntityService(IFlyEntityService flyEntityService) {
		this.flyEntityService = flyEntityService;
	}

	@RequestMapping("help")
	public Map<String, String> help() {
		Map<String, String> map = new HashMap<>();
		map.put("/flydata2/{entityName} [POST]", "保存实体");
		map.put("/flydata2/{entityName}/{uid}", "查找单个实体");
		map.put("/flydata2/{entityName}/{uid} [DELETE]", "删除单个实体");
		map.put("/flydata2/{entityName}", "查找所有实体");
		return map;
	}

	/**
	 * 保存实体
	 * 
	 * @param entityName
	 * @param formViewName
	 * @param jsonEntity
	 */
	@RequestMapping(value = "{entityName}", method = RequestMethod.POST)
	public String saveEntity(@PathVariable("entityName") String entityName,
			@RequestParam(name = "view", required = false, defaultValue = "all") String formViewName,
			@RequestBody FlyEntityResult flyEntity) {
		return flyEntityService.saveEntity(entityName, formViewName, flyEntity);
	}

	/**
	 * 修改实体
	 * 
	 * @param entityName
	 * @param uid
	 * @param formViewName
	 * @param flyEntity
	 */
	@RequestMapping(value = "{entityName}/{uid}", method = RequestMethod.PUT)
	public void updateEntity(@PathVariable("entityName") String entityName, @PathVariable("uid") String uid,
			@RequestParam(name = "view", required = false, defaultValue = "all") String formViewName,
			@RequestBody FlyEntityResult flyEntity) {
		flyEntityService.updateEntity(entityName, uid, formViewName, flyEntity);
	}

	/**
	 * 覆盖实体，只覆盖部分属性
	 * 
	 * @param entityName
	 * @param uid
	 * @param formViewName
	 * @param flyEntity
	 */
	@RequestMapping(value = "{entityName}/{uid}", method = RequestMethod.PATCH)
	public void patchEntity(@PathVariable("entityName") String entityName, @PathVariable("uid") String uid,
			@RequestParam(name = "view", required = false, defaultValue = "all") String formViewName,
			@RequestBody FlyEntityResult flyEntity) {
		flyEntityService.mergeEntity(entityName, uid, formViewName, flyEntity);
	}

	/**
	 * 查找实体
	 * 
	 * @param entityName
	 * @param uid
	 * @param formViewName
	 * @param hasSubTable
	 * @param subTableAttrs
	 * @return
	 */
	@RequestMapping(value = "{entityName}/{uid}", method = RequestMethod.GET)
	public FlyEntityResult find(@PathVariable("entityName") String entityName, @PathVariable("uid") String uid,
			@RequestParam(name = "view", required = false, defaultValue = "all") String formViewName,
			@RequestParam(name = "hasSubTable", required = false, defaultValue = "true") boolean hasSubTable,
			@RequestParam(name = "subTableAttrs", required = false, defaultValue = "null") String[] subTableAttrs) {
		return flyEntityService.find(entityName, uid, formViewName, hasSubTable, subTableAttrs);
	}

	/**
	 * 查询所有实体
	 * 
	 * @param entityName
	 * @param uid
	 * @param listViewName
	 * @return
	 */
	@RequestMapping(value = "{entityName}", method = RequestMethod.GET)
	public List<FlyEntityResult> findAll(@PathVariable("entityName") String entityName,
			@RequestParam(name = "view", required = false, defaultValue = "all") String listViewName) {
		return flyEntityService.findAll(entityName, listViewName);
	}

	/**
	 * 删除实体
	 * 
	 * @param entityName
	 * @param uid
	 * @return
	 */
	@RequestMapping(value = "{entityName}/{uid}", method = RequestMethod.DELETE)
	public void del(@PathVariable("entityName") String entityName, @PathVariable("uid") String uid) {
		flyEntityService.del(entityName, uid);
	}
}
