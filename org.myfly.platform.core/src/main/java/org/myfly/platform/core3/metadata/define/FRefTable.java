package org.myfly.platform.core3.metadata.define;

import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core3.model.PRefTable;
import org.myfly.platform.core3.model.PReference;
import org.springframework.util.Assert;

public class FRefTable extends PReference implements IDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5324066959139355161L;

	private PRefTable refTable;

	private String tableApiName;

	private String keyColumnName;

	private String displayColumnName;

	private boolean isFromDB;

	@Override
	public String getKey() {
		return getApiName();
	}

	@Override
	public void validate() {
		Assert.hasLength(getKey(), "属性[Key]不能为空");
		Assert.hasLength(getApiName(), "属性[ApiName]不能为空");
		Assert.hasLength(getEntityType(), "属性[EntityType]不能为空");
		Assert.hasLength(getName(), "属性[Name]不能为空");
		Assert.hasLength(getTableApiName(), "属性[getTableApiName]不能为空");
		Assert.hasLength(getKeyColumnName(), "属性[KeyColumnName]不能为空");
		Assert.hasLength(getDisplayColumnName(), "属性[DisplayColumnName]不能为空");
		Assert.notNull(getRefTable(), "属性[RefTable]不能为空");
	}

	@Override
	public String toJson() {
		return JSONUtil.toJSON(this);
	}

	@Override
	public void printJson() {
		System.out.println(toJson());
	}

	public PRefTable getRefTable() {
		return refTable;
	}

	public void setRefTable(PRefTable refTable) {
		this.refTable = refTable;
	}

	@Override
	public void setUid(String value) {
		setReferenceID(value);
	}

	@Override
	public String getUid() {
		return getReferenceID();
	}

	@Override
	public boolean isFromDB() {
		return isFromDB;
	}

	@Override
	public void setFromDB(boolean value) {
		this.isFromDB = value;
	}

	public PReference toReferencePO() {
		PReference result = new PReference();
		result.setReferenceID(getReferenceID());
		result.setApiName(getApiName());
		result.setEntityType(getEntityType());
		result.setIsOrderByValue(getIsOrderByValue());
		result.setValidationType(getValidationType());
		result.setvFormat(getvFormat());
		FlyEntityUtils.copyFlyMetaFields(result, this);
		return result;
	}

	public PRefTable toRefTablePO() {
		return getRefTable();
	}

	public String getKeyColumnName() {
		return keyColumnName;
	}

	public void setKeyColumnName(String keyColumnName) {
		this.keyColumnName = keyColumnName;
	}

	public String getDisplayColumnName() {
		return displayColumnName;
	}

	public void setDisplayColumnName(String displayColumnName) {
		this.displayColumnName = displayColumnName;
	}

	@Override
	public String toString() {
		return "apiName:" + getApiName() + ", name: " + getName() + ", table: " + getTableApiName() + ", keyColumn:"
				+ getKeyColumnName() + ", displayColumn: " + getDisplayColumnName();
	}

	public String getTableApiName() {
		return tableApiName;
	}

	public void setTableApiName(String tableApiName) {
		this.tableApiName = tableApiName;
	}
}
