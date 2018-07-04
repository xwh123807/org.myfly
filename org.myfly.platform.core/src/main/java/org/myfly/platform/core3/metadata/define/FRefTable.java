package org.myfly.platform.core3.metadata.define;

import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.model.data.PRefTable;
import org.myfly.platform.core3.model.dict.PReference;
import org.springframework.util.Assert;

public class FRefTable extends PReference implements IDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5324066959139355161L;

	private PRefTable refTable;

	private String tableClassName;

	@Override
	public String getKey() {
		return getName();
	}

	@Override
	public void validate() {
		Assert.hasLength(getKey(), "属性[Key]不能为空");
		Assert.hasLength(getEntityType(), "属性[EntityType]不能为空");
		Assert.hasLength(getName(), "属性[Name]不能为空");
		Assert.hasLength(getTableClassName(), "属性[TableClassName]不能为空");
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

	public String getTableClassName() {
		return tableClassName;
	}

	public void setTableClassName(String tableClassName) {
		this.tableClassName = tableClassName;
	}

	@Override
	public void setUid(String value) {
		setReferenceID(value);
	}

	@Override
	public String getUid() {
		return getReferenceID();
	}
}
