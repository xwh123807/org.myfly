package org.myfly.platform.core.viewmodel.define;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.myfly.platform.core.datamodel.define.FlyDataModel;
import org.myfly.platform.core.datamodel.define.IDefinition;
import org.myfly.platform.core.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core.viewmodel.model.PTab;

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

	public void setFieldList(Collection<FField> list) {
		fields = new LinkedHashMap<>();
		list.forEach(item -> {
			fields.put(item.getColumnID(), item);
		});
	}

	public String getTableApiName() {
		return getTable().getApiName();
	}

	public PTab toTabPO() {
		PTab result = new PTab();
		result.setCommitWarning(getCommitWarning());
		result.setDisplayLogic(getDisplayLogic());
		result.setEntityType(getEntityType());
		result.setHasTree(getHasTree());
		result.setImageID(getImageID());
		result.setImportFields(getImportFields());
		result.setIncludedTab(getIncludedTab());
		result.setIsAdvancedTab(getIsAdvancedTab());
		result.setIsInfoTab(getIsInfoTab());
		result.setIsInsertRecord(getIsInsertRecord());
		result.setIsReadOnly(getIsReadOnly());
		result.setIsSingleRow(getIsSingleRow());
		result.setIsSortTab(getIsSortTab());
		result.setIsTranslationTab(getIsTranslationTab());
		result.setOrderByClause(getOrderByClause());
		result.setParentColumn(getParentColumn());
		result.setProcessing(getProcessing());
		result.setReadOnlyLogic(getReadOnlyLogic());
		result.setSeqNo(getSeqNo());
		result.setTabID(getTabID());
		result.setTableID(getTableID());
		result.setTabLevel(getTabLevel());
		result.setTableStyle(getTableStyle());
		result.setWhereClause(getWhereClause());
		result.setWindowID(getWindowID());
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
