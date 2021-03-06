package org.myfly.platform.core.flydata.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.myfly.platform.core.datamodel.define.FlyDataModel;
import org.myfly.platform.core.datamodel.service.IFlyDataModelService;
import org.myfly.platform.core.domain.RestApiInfo;
import org.myfly.platform.core.domain.RestControllerInfo;
import org.myfly.platform.core.flydata.service.FlyEntityMap;
import org.myfly.platform.core.flydata.service.IFlyDataService;
import org.myfly.platform.core.flydata.service.IIDNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	@Autowired
	private IFlyDataModelService dataModelService;
	@Autowired
	private IIDNameService idNameService;

	private FlyDataModel getFlyDataModel(String entityName) {
		return dataModelService.getFlyDataModel(entityName);
	}

	@RequestMapping(value = { "", "help" })
	public RestControllerInfo help() {
		return new RestControllerInfo("flydata3", "数据访问服务", new RestApiInfo[] {
				new RestApiInfo("save/{entityName}", "saveEntity", HttpMethod.POST),
				new RestApiInfo("{entityName}", "saveAndReturnEntity", HttpMethod.POST),
				new RestApiInfo("{entityName}", "updateEntity", HttpMethod.PUT),
				new RestApiInfo("update/{entityName}", "updateAndReturnEntity", HttpMethod.PUT),
				new RestApiInfo("{entityName}", "patchEntity", HttpMethod.PATCH),
				new RestApiInfo("{entityName}/{uid}", "find", HttpMethod.GET),
				new RestApiInfo("{entityName}/{keyField}/{keyValue}", "findByKey", HttpMethod.GET),
				new RestApiInfo("{entityName}/{uid}", "delOne", HttpMethod.DELETE),
				new RestApiInfo("idNames/{entityName}/{keyColumn}/{displayColumn}", "findIDNames", HttpMethod.GET) });
	}

	/**
	 * 保存实体，返回实体主键
	 * 
	 * @param entityName
	 * @param flyEntity
	 */
	@RequestMapping(value = "save/{entityName}", method = RequestMethod.POST)
	public String saveEntity(@PathVariable("entityName") String entityName, @RequestBody FlyEntityMap flyEntity) {
		return flyDataService.saveEntity(entityName, flyEntity);
	}

	/**
	 * 保存并查询返回实体
	 * 
	 * @param entityName
	 * @param flyEntity
	 * @return
	 */
	@PostMapping("{entityName}")
	public FlyEntityMap saveAndReturnEntity(@PathVariable("entityName") String entityName,
			@RequestBody FlyEntityMap flyEntity) {
		return flyDataService.saveEntityAndReturn(entityName, flyEntity);
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
			@RequestBody FlyEntityMap flyEntity) {
		flyDataService.updateEntity(entityName, uid, flyEntity);
	}
	
	/**
	 * 修改并返回实体
	 * @param entityName
	 * @param uid
	 * @param flyEntity
	 */
	@RequestMapping(value = "update/{entityName}/{uid}", method = RequestMethod.PUT)
	public FlyEntityMap updateAndReturnEntity(@PathVariable("entityName") String entityName, @PathVariable("uid") String uid,
			@RequestBody FlyEntityMap flyEntity) {
		flyDataService.updateEntity(entityName, uid, flyEntity);
		return find(entityName, uid, true, null);
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
			@RequestBody FlyEntityMap flyEntity) {
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
	public FlyEntityMap find(@PathVariable("entityName") String entityName, @PathVariable("uid") String uid,
			@RequestParam(name = "hasSubTable", required = false, defaultValue = "true") boolean hasSubTable,
			@RequestParam(name = "subTableAttrs", required = false, defaultValue = "null") String[] subTableAttrs) {
		return flyDataService.find(entityName, uid, hasSubTable, subTableAttrs);
	}

	@GetMapping("{entityName}/{keyField}/{keyValue}")
	public FlyEntityMap findByKey(@PathVariable("entityName") String entityName,
			@PathVariable("keyField") String keyField, @PathVariable("keyValue") String keyValue) {
		return flyDataService.findByKey(entityName, keyField, keyValue);
	}

	/**
	 * 过滤
	 * 
	 * @param entityName
	 * @param fieldName
	 * @param fieldValue
	 * @return
	 */
	@GetMapping("findByExample/{entityName}")
	public List<FlyEntityMap> findByExample(@PathVariable("entityName") String entityName,
			@RequestParam Map<String, Object> example) {
		return flyDataService.findByExample(entityName, FlyEntityUtils.fromMap(getFlyDataModel(entityName), example));
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
	public List<FlyEntityMap> findAll(@PathVariable("entityName") String entityName) {
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

	/**
	 * 获取实体ID和名称列
	 * 
	 * @param entityName
	 * @return
	 */
	@GetMapping("idNames/{entityName}/{keyColumn}/{displayColumn}")
	public List<FlyEntityMap> findIDNames(@PathVariable("entityName") String entityName,
			@PathVariable("keyColumn") String keyColumn, @PathVariable("displayColumn") String displayColumn) {
		FlyDataModel dataModel = getFlyDataModel(entityName);
		List<Map<String, Object>> list = idNameService.getIDNames(dataModel.getTableName(),
				dataModel.getColumnMap().get(keyColumn).getColumnName(),
				dataModel.getColumnMap().get(displayColumn).getColumnName());
		List<FlyEntityMap> result = new ArrayList<>();
		list.forEach(item -> {
			FlyEntityMap tmap = new FlyEntityMap();
			tmap.put(keyColumn, item.get(IIDNameService.UID_COLUMN));
			tmap.put(displayColumn, item.get(IIDNameService.NAME_COLUMN));
			result.add(tmap);
		});
		return result;
	}
}
