package org.myfly.platform.tools.codebuilder;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.collections.MapUtils;
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
		List<Map<String, Object>> list = jdbcTemplate
				.queryForList("select * from ad_element where entitytype='D' order by columnname");
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
		if (MapUtils.isEmpty(item)) {
			throw new IllegalArgumentException("表[" + tableName + "]不存在");
		}
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

	/**
	 * 获取列表引用类型
	 * 
	 * @return
	 */
	public List<ADReference> getReferencesByList() {
		List<Map<String, Object>> list = jdbcTemplate
				.queryForList("select * from ad_reference where entitytype='D' and validationtype = ?", "L");
		return list.stream().map(item -> new ADReference(item)).collect(Collectors.toList());
	}

	/**
	 * 获取引用列表
	 * 
	 * @param referenceID
	 * @return
	 */
	public List<ADRefList> getRefLists(int referenceID) {
		List<Map<String, Object>> list = jdbcTemplate
				.queryForList("select * from ad_ref_list where ad_reference_id = ?", referenceID);
		return list.stream().map(item -> new ADRefList(item)).collect(Collectors.toList());
	}
}
