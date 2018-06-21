package org.myfly.platform.core3.flydata.internal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.myfly.platform.core3.flydata.service.FlyEntityResult3;
import org.myfly.platform.core3.flydata.service.IFlyDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("flydata3")
public class FlyDataRestService {
	@Autowired
	private IFlyDataService flyDataService;
	
	@RequestMapping("help")
	public Map<String, String> help() {
		Map<String, String> map = new HashMap<>();
		map.put("{entityName} [POST]", "保存实体");
		map.put("{entityName} [PUT]", "修改实体");
		map.put("{entityName} [PATCH]", "修改实体，覆盖");
		map.put("{entityName}/{uid}", "查找单个实体");
		map.put("{entityName}/{uid} [DELETE]", "删除单个实体");
		map.put("{entityName}", "查找所有实体");
		return map;
	}

	/**
	 * 保存实体
	 * 
	 * @param entityName
	 * @param flyEntity
	 */
	@RequestMapping(value = "{entityName}", method = RequestMethod.POST)
	public String saveEntity(@PathVariable("entityName") String entityName,
			@RequestBody FlyEntityResult3 flyEntity) {
		return flyDataService.saveEntity(entityName, flyEntity);
	}

	/**
	 * 修改实体
	 * 
	 * @param entityName
	 * @param uid
	 * @param flyEntity
	 */
	@RequestMapping(value = "{entityName}/{uid}", method = RequestMethod.PUT)
	public void updateEntity(@PathVariable("entityName") String entityName, @PathVariable("uid") String uid,
			@RequestBody FlyEntityResult3 flyEntity) {
		flyDataService.updateEntity(entityName, uid, flyEntity);
	}

	/**
	 * 覆盖实体，只覆盖部分属性
	 * 
	 * @param entityName
	 * @param uid
	 * @param flyEntity
	 */
	@RequestMapping(value = "{entityName}/{uid}", method = RequestMethod.PATCH)
	public void patchEntity(@PathVariable("entityName") String entityName, @PathVariable("uid") String uid,
			@RequestBody FlyEntityResult3 flyEntity) {
		flyDataService.mergeEntity(entityName, uid, flyEntity);
	}

	/**
	 * 查找实体
	 * 
	 * @param entityName
	 * @param uid
	 * @param hasSubTable
	 * @param subTableAttrs
	 * @return
	 */
	@RequestMapping(value = "{entityName}/{uid}", method = RequestMethod.GET)
	public FlyEntityResult3 find(@PathVariable("entityName") String entityName, @PathVariable("uid") String uid,
			@RequestParam(name = "hasSubTable", required = false, defaultValue = "true") boolean hasSubTable,
			@RequestParam(name = "subTableAttrs", required = false, defaultValue = "null") String[] subTableAttrs) {
		return flyDataService.find(entityName, uid, hasSubTable, subTableAttrs);
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
	public List<FlyEntityResult3> findAll(@PathVariable("entityName") String entityName) {
		return flyDataService.findAll(entityName);
	}

	/**
	 * 删除实体
	 * 
	 * @param entityName
	 * @param uid
	 * @return
	 */
	@RequestMapping(value = "{entityName}/{uid}", method = RequestMethod.DELETE)
	public void delOne(@PathVariable("entityName") String entityName, @PathVariable("uid") String uid) {
		flyDataService.delOne(entityName, uid);
	}
}
