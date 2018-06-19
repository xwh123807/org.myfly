package org.myfly.platform.core3.metadata.internal;

import org.myfly.platform.core3.metadata.define.FlyTableDefinition;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 元模型Rest服务 <br>
 * 
 * @author xiangwanhong
 *
 */
@Service
@RequestMapping("/meta3")
public class MetaDataRestService {
	/**
	 * 获取表的数据模型
	 * 
	 * @param table
	 * @return
	 */
	@RequestMapping("{table}")
	public FlyTableDefinition getFlyTableDefinition(@PathVariable("table") String table) {
		return null;
	}
}
