package org.myfly.platform.core3.metadata.internal;

import java.util.List;

import org.myfly.platform.core3.metadata.define.FlyTableDefinition;
import org.myfly.platform.core3.metadata.service.IMetaDataService;
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
@RequestMapping("/meta3")
public class MetaDataRestV3Service {
	@Autowired
	private IMetaDataService metaService;
	
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
	public FlyTableDefinition getFlyTableDefinition(@PathVariable("table") String table) {
		return metaService.getFlyTableDefinition(table);
	}
}
