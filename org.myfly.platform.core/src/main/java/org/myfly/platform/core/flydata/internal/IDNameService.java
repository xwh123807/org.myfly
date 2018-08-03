package org.myfly.platform.core.flydata.internal;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.myfly.platform.core.flydata.service.IIDNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class IDNameService implements IIDNameService {
	private static Log log = LogFactory.getLog(IDNameService.class);
	@Autowired
	private JdbcTemplate JdbcTemplate;

	@Override
	@Cacheable(cacheNames = "id-names")
	public String getNameValue(String tableName, String keyColumn, String displayColumn, Object keyValue) {
		String sql = "select " + displayColumn + " value from " + tableName + " where " + keyColumn + " = ?";
		log.info(sql);
		try {
			Map<String, Object> result = JdbcTemplate.queryForMap(sql, keyValue);
			return (String) result.get("value");
		} catch (Exception e) {
			log.error("ID名称转换失败: " + sql + "[" + keyValue + "]");
			return "ID名称转换失败";
		}
	}

}
