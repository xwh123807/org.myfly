package org.myfly.platform.tools.codebuilder;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ADEmpiereRepostory {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * 获取AD_Element全部数据
	 * 
	 * @return
	 */
	public List<ADElement> getElements() {
		List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from ad_element order by columnname");
		return list.stream().map(item -> new ADElement(item)).collect(Collectors.toList());
	}

	/**
	 * 获取AD_Table全部数据
	 * 
	 * @return
	 */
	public List<ADTable> getTables() {
		List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from ad_table");
		return list.stream().map(item -> new ADTable(item)).collect(Collectors.toList());
	}

	/**
	 * 获取指定表
	 * 
	 * @param tableName
	 * @return
	 */
	public ADTable getTable(String tableName) {
		Map<String, Object> item = jdbcTemplate.queryForMap("select * from ad_table where tablename = ?", tableName);
		return new ADTable(item);
	}

	/**
	 * 获取表列定义
	 * 
	 * @param tableId
	 * @return
	 */
	public List<ADColumn> getTableColumns(int tableId) {
		List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from ad_column where ad_table_id = ?",
				tableId);
		return list.stream().map(item -> new ADColumn(item)).collect(Collectors.toList());
	}
}
