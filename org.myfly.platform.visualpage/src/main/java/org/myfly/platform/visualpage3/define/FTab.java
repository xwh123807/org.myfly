package org.myfly.platform.visualpage3.define;

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

	private Map<String, FField> fields;

	private boolean isFromDB;
	
	@JsonIgnore
	private FlyDataModel table;

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

	public PTab toTabPO() {
		PTab result = new PTab();
		result.setTabID(getTabID());
		result.setTableID(getTableID());
		result.setEntityType(getEntityType());
		FlyEntityUtils.copyFlyMetaFields(result, this);
		return result;
	}
}
