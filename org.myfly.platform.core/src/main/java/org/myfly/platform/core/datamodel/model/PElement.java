package org.myfly.platform.core.datamodel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core.datamodel.annotation.FlyRefTable;
import org.myfly.platform.core.datamodel.annotation.FlyTable;
import org.myfly.platform.core.domain.FlyDataType;
import org.myfly.platform.core.domain.FlyMetaEntity;

/**
 * AD_Element <br>
 * 1、所有字段都在此定义，表中的字段定义引用<br>
 * 2、数据从枚举Element中导入 <br>
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(name = "PT_Element")
@FlyTable(name = "System Element", description = "System Element enables the central maintenance of column description and help.")
@FlyRefTable(apiName = "elementID", displayColumn = "name", keyColumn = "elementID", name = "元素ID")
public class PElement extends FlyMetaEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7185405877356633362L;
	@Id
	@Column(length = 32, name="ElementID")
	private String elementID;
	
	@Column(length = 40)
	private String apiName;

	@Column(length = 60)
	private String printName;

	@Column(length = 50, unique = true)
	private String columnName;

	@Column()
	private FlyDataType dataType;

	@Column(length = 32)
	private String entityType;

	/**
	 * Required to specify, if data type is Table or List
	 */
	@Column(length = 32)
	private String referenceID;

	@Column()
	private Integer fieldLength;

	public String getElementID() {
		return elementID;
	}

	public void setElementID(String elementID) {
		this.elementID = elementID;
	}

	public String getPrintName() {
		return printName;
	}

	public void setPrintName(String printName) {
		this.printName = printName;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public FlyDataType getDataType() {
		return dataType;
	}

	public void setDataType(FlyDataType dataType) {
		this.dataType = dataType;
	}

	public String getReferenceID() {
		return referenceID;
	}

	public void setReferenceID(String referenceID) {
		this.referenceID = referenceID;
	}

	public Integer getFieldLength() {
		return fieldLength;
	}

	public void setFieldLength(Integer fieldLength) {
		this.fieldLength = fieldLength;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
}
