package org.myfly.platform.core3.metadata.internal;

import java.util.List;

import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.core3.metadata.service.IFlyDataModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 元模型Rest服务 <br>
 * 
 * @author xiangwanhong
 *
 */
@RestController
@RequestMapping("/datamodel")
public class FlyDataModelRestService {
	@Autowired
	private IFlyDataModelService metaService;
	
	@RequestMapping("list")
	public List<Class<?>> getAllEntityClasses(){
		return metaService.getAllEntityClasses();
	}

	/**
	 * 获取表的数据模型
	 * 
	 * @param table
	 * @return
	 */
	@RequestMapping("{table}")
	public FlyDataModel getFlyTableDefinition(@PathVariable("table") String table) {
		return metaService.getFlyDataModel(table);
	}
}
