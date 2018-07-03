package org.myfly.platform.core3.metadata.define;

import java.util.Map;

import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.metadata.builder.FlyDataModelBuilder;
import org.myfly.platform.core3.model.data.PTable;
import org.springframework.util.Assert;

/**
 * 实体数据模型
 * 
 * @author xiangwanhong
 *
 */
public class FlyDataModel extends PTable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2763660520511209664L;
	/**
	 * 字段集，apiName作为Key
	 */
	private Map<String, FlyColumn> columnMap;
	/**
	 * 主键
	 */
	private FlyColumn primaryKey;

	public FlyDataModel() {
	}

	public FlyDataModel(FlyDataModelBuilder builder) {
		setApiName(builder.getApiName());
		setName(builder.getName());
		setDescription(builder.getDescription());
		setHelp(builder.getHelp());
		setTableName(builder.getTableName());
		setEntityType(builder.getEntityType());
		setColumnMap(builder.getColumnMap());
		setPrimaryKey(builder.getPrimaryKey());
		validate();
	}

	public Map<String, FlyColumn> getColumnMap() {
		return columnMap;
	}

	public void setColumnMap(Map<String, FlyColumn> columnMap) {
		this.columnMap = columnMap;
	}

	public FlyColumn getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(FlyColumn primaryKey) {
		this.primaryKey = primaryKey;
	}

	/**
	 * 获取实体主键值
	 * 
	 * @param entity
	 * @return
	 */
	public String getPKValue(Object entity) {
		return (String) getPrimaryKey().getValueHandler().getFieldValue(entity);
	}

	/**
	 * 设置实体主键值
	 * 
	 * @param entity
	 * @param uid
	 */
	public void setPKValue(Object entity, String uid) {
		getPrimaryKey().getValueHandler().setFieldValue(entity, uid);
	}

	public String toJson() {
		return JSONUtil.toJSON(this);
	}

	public void printJson() {
		System.out.println(toJson());
	}

	@Override
	public String toString() {
		return "apiName: " + getApiName() + ", name: " + getName() + ", tableName: " + getTableName();
	}

	public void validate() {
		Assert.hasLength(getApiName(), "属性[apiName]不能为空");
		Assert.hasLength(getName(), "属性[name]不能为空");
		Assert.hasLength(getTableName(), "属性[tableName]不能为空");
		Assert.notNull(getPrimaryKey(), "属性[primaryKey]不能为空");
		Assert.notEmpty(getColumnMap(), "属性[columnMap]不能为空，且长度至少大于0");
		getColumnMap().values().forEach(item -> item.validate());
	}
}
