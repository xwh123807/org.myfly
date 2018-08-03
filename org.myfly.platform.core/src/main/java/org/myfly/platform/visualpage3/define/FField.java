package org.myfly.platform.visualpage3.define;

import java.util.ArrayList;
import java.util.List;

import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core3.metadata.builder.FlyDataTypeUtils;
import org.myfly.platform.core3.metadata.define.FElement;
import org.myfly.platform.core3.metadata.define.FRefListItem;
import org.myfly.platform.core3.metadata.define.FlyColumn;
import org.myfly.platform.core3.metadata.define.IDefinition;
import org.myfly.platform.core3.model.PRefList;
import org.myfly.platform.visualpage3.model.PField;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class FField extends PField implements IDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7304780919645810513L;
	private boolean isFromDB;
	/**
	 * 数据模型列定义
	 */
	@JsonIgnore
	private FlyColumn flyColumn;
	/**
	 * 用于vue绑定名
	 */
	private String model;
	/**
	 * 字段名称
	 */
	private String columnName;
	/**
	 * 引用表名称
	 */
	private String relationTable;
	/**
	 * 引用表健值字段名
	 */
	private String relationKeyColumn;
	/**
	 * 引用表显示字段名
	 */
	private String relationDisplayColumn;
	/**
	 * 引用值列表值
	 */
	private List<FRefListItem> refListItems;

	@Override
	public String getKey() {
		return getFieldID();
	}

	@Override
	public void setUid(String value) {
		setFieldID(value);
	}

	@Override
	public String getUid() {
		return getFieldID();
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

	public PField toFieldPO() {
		PField result = new PField();
		result.setFieldID(getFieldID());
		result.setFieldGroupID(getFieldGroupID());
		result.setColumnID(getColumnID());
		result.setDataType(getDataType());
		result.setEntityType(getEntityType());
		FlyEntityUtils.copyFlyMetaFields(result, this);
		return result;
	}

	public FlyColumn getFlyColumn() {
		return flyColumn;
	}

	public void setFlyColumn(FlyColumn flyColumn) {
		this.flyColumn = flyColumn;
		updateRelationInfo();
	}

	/**
	 * 更新引用类型信息
	 * 
	 * @param element
	 */
	private void updateRelationInfo() {
		FElement element = getFlyColumn().getElement();
		setColumnName(element.getApiName());
		switch (getFlyColumn().getDataType()) {
		case Table:
		case TableDirect:
			setRelationTable(element.getRefTable().getTableApiName());
			setRelationKeyColumn(element.getRefTable().getKeyColumnName());
			setRelationDisplayColumn(element.getRefTable().getDisplayColumnName());
			setModel(element.getApiName());
			break;
		case List:
			setRelationTable(PRefList.class.getName());
			setRelationKeyColumn("refListID");
			setRelationDisplayColumn("name");
			if (element.getRefList() != null) {
				List<FRefListItem> items = new ArrayList<>(element.getRefList().getItems().values());
				setRefListItems(items);
			}
			setModel(element.getApiName());
			break;
		default:
			setModel(element.getApiName());
			break;
		}
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRelationTable() {
		return relationTable;
	}

	public void setRelationTable(String relationTable) {
		this.relationTable = relationTable;
	}

	public String getRelationKeyColumn() {
		return relationKeyColumn;
	}

	public void setRelationKeyColumn(String relationKeyColumn) {
		this.relationKeyColumn = relationKeyColumn;
	}

	public String getRelationDisplayColumn() {
		return relationDisplayColumn;
	}

	public void setRelationDisplayColumn(String relationDisplayColumn) {
		this.relationDisplayColumn = relationDisplayColumn;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public List<FRefListItem> getRefListItems() {
		return refListItems;
	}

	public void setRefListItems(List<FRefListItem> refListItems) {
		this.refListItems = refListItems;
	}

	/**
	 * 判断是否为引用列
	 * @return
	 */
	public boolean isRefColumn() {
		return FlyDataTypeUtils.isRefColumn(getDataType());
	}
}