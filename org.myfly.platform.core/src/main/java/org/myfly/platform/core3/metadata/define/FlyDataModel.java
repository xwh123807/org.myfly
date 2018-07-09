package org.myfly.platform.core3.metadata.define;

import java.util.Map;

import org.myfly.platform.core.utils.ClassUtil;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core3.model.data.PTable;
import org.springframework.util.Assert;

/**
 * 实体数据模型 <br>
 * 1、实体所有属性，需要先到Element中注册；PColumn.elementID不能为空; <br>
 * 2、属性默认按属性名与Element中元素对应； <br>
 * 3、属性从Element中引用后，使用Element中定义的dataType、fieldLength； <br>
 * 4、属性可以通过@FlyField注解覆盖Name、Description、Help值；<br>
 * 5、当数据类型为FlyDataType.Talbe，Element的Reference属性不能为空，指向其关联表RefTable；<br>
 * 6、FlyDataType.List时
 * 
 * @author xiangwanhong
 *
 */
public class FlyDataModel extends PTable implements IDefinition {

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

	private boolean isFromDB;

	public FlyDataModel() {
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

	@Override
	public String getKey() {
		return getApiName();
	}

	@Override
	public void setUid(String value) {
		setTableID(value);
	}

	@Override
	public String getUid() {
		return getTableID();
	}

	@Override
	public boolean isFromDB() {
		return isFromDB;
	}

	@Override
	public void setFromDB(boolean value) {
		this.isFromDB = value;
	}

	public PTable toTablePO() {
		PTable result = new PTable();
		result.setAccessLevel(getAccessLevel());
		result.setaCTriggerLength(getaCTriggerLength());
		result.setApiName(getApiName());
		result.setCopyColumnsFromTable(getCopyColumnsFromTable());
		result.setEntityType(getEntityType());
		result.setImportTable(getImportTable());
		result.setIsCentrallyMaintained(getIsCentrallyMaintained());
		result.setIsChangeLog(getIsChangeLog());
		result.setIsDeleteable(getIsDeleteable());
		result.setIsDocument(getIsDocument());
		result.setIsHighVolume(getIsHighVolume());
		result.setIsIgnoreMigration(getIsIgnoreMigration());
		result.setIsSecurityEnabled(getIsSecurityEnabled());
		result.setIsView(getIsView());
		result.setReplicationType(getReplicationType());
		result.setTableID(getTableID());
		result.setTableName(getTableName());
		result.setWindowID(getWindowID());
		FlyEntityUtils.copyFlyMetaFields(result, this);
		return result;
	}

	public Class<?> getEntityClass() {
		return ClassUtil.getClass(getApiName());
	}
}
