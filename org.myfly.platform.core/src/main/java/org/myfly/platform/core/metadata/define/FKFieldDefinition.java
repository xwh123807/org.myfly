package org.myfly.platform.core.metadata.define;

import org.myfly.platform.core.metadata.entity.SearchRelationFieldDefinition;
import org.springframework.util.Assert;

/**
 * 实体外键定义。 用于查找关系和ManyToOne
 * 
 * @author xiangwanhong
 *
 */
public class FKFieldDefinition extends BaseDenifition {
	/**
	 * 外键关联表名
	 */
	private String relationTable;
	/**
	 * 外键关联实体类名
	 */
	private String relationClass;
	/**
	 * 外键字段，有多个值时表示复合外键
	 */
	private String[] fkFields;
	/**
	 * 对应关联表字段，有多个值时表示复合外键
	 */
	private String[] relationFields;

	public FKFieldDefinition(SearchRelationFieldDefinition field) {
		super(null);
		setName(field.getName());
		setRelationClass(field.getRelationClass());
		setRelationTable(field.getRelationTable());
	}

	public String getRelationTable() {
		return relationTable;
	}

	public void setRelationTable(String relationTable) {
		this.relationTable = relationTable;
	}

	public String getRelationClass() {
		return relationClass;
	}

	public void setRelationClass(String relationClass) {
		this.relationClass = relationClass;
	}

	public String[] getFkFields() {
		return fkFields;
	}

	public void setFkFields(String[] fkFields) {
		this.fkFields = fkFields;
	}

	public String[] getRelationFields() {
		return relationFields;
	}

	public void setRelationFields(String[] relationFields) {
		this.relationFields = relationFields;
	}

	/**
	 * 获取外键字段对应关联表的字段
	 * 
	 * @param fkField
	 * @return
	 */
	public String getRelationFieldByFKField(String fkField) {
		int index = -1;
		for (String name : getFkFields()) {
			index++;
			if (fkField.equals(name)) {
				break;
			}
		}
		if (index != -1) {
			return getRelationFields()[index];
		} else {
			return null;
		}
	}

	public void validate() {
		Assert.hasLength(getName());
		Assert.notEmpty(getFkFields());
		Assert.notEmpty(getRelationFields());
		Assert.hasLength(getRelationTable());
	}
}
