package org.myfly.platform.visualpage3.define;

import java.util.Collection;
import java.util.Map;

import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.core3.metadata.define.IDefinition;
import org.myfly.platform.visualpage3.model.PTab;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class FTab extends PTab implements IDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7339322643421118783L;

	@JsonIgnore
	private Map<String, FField> fields;

	private boolean isFromDB;

	/**
	 * 指向实体的数据模型
	 */
	@JsonIgnore
	private FlyDataModel table;

	/**
	 * 主键列
	 */
	private String keyColumn;

	/**
	 * 子Tab
	 */
	private String[] subTabs;

	@Override
	public String getKey() {
		return getTabID();
	}

	@Override
	public void setUid(String value) {
		setTabID(value);
	}

	@Override
	public String getUid() {
		return getTabID();
	}

	@Override
	public boolean isFromDB() {
		return isFromDB;
	}

	@Override
	public void setFromDB(boolean value) {
		isFromDB = value;
	}

	@Override
	public void validate() {

	}

	@Override
	public String toJson() {
		return JSONUtil.toJSON(this);
	}

	@Override
	public void printJson() {
		System.out.println(toJson());
	}

	/**
	 * @return the fields
	 */
	public Map<String, FField> getFields() {
		return fields;
	}

	/**
	 * @param fields
	 *            the fields to set
	 */
	public void setFields(Map<String, FField> fields) {
		this.fields = fields;
	}

	public FlyDataModel getTable() {
		return table;
	}

	public void setTable(FlyDataModel table) {
		this.table = table;
	}

	public Collection<FField> getFieldList() {
		return getFields().values();
	}

	public String getTableApiName() {
		return getTable().getApiName();
	}

	public PTab toTabPO() {
		PTab result = new PTab();
		result.setTabID(getTabID());
		result.setTableID(getTableID());
		result.setEntityType(getEntityType());
		result.setTableStyle(getTableStyle());
		FlyEntityUtils.copyFlyMetaFields(result, this);
		return result;
	}

	public String getKeyColumn() {
		return keyColumn;
	}

	public void setKeyColumn(String keyColumn) {
		this.keyColumn = keyColumn;
	}

	public String[] getSubTabs() {
		return subTabs;
	}

	public void setSubTabs(String[] subTabs) {
		this.subTabs = subTabs;
	}

	/**
	 * 获取显示列
	 * 
	 * @return
	 */
	public String getDisplayColumn() {
		return getTable().getPrimaryKey().getRefDisplayColumn();
	}
}
