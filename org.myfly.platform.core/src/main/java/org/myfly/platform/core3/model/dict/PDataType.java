package org.myfly.platform.core3.model.dict;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyMetaEntity;
import org.myfly.platform.core3.metadata.annotation.FlyRefTable;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

/**
 * 系统数据类型 <br>
 * 1、AD_Reference中值小于50的基本数据类型，不包含引用类型 <br>
 * 2、由FlyDataType中导入 <br>
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(name = "PT_DataType")
@FlyTable()
@FlyRefTable(apiName = "dataType", name = "数据类型", displayColumn = "name", keyColumn = "dataType")
public class PDataType extends FlyMetaEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3951941103022820354L;

	@Id
	@Column(length = 32)
	private String dataTypeID;

	@Column(length = 40, unique = true)
	private String dataType;

	@Column(length = 32)
	private String entityType;

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getDataTypeID() {
		return dataTypeID;
	}

	public void setDataTypeID(String dataTypeID) {
		this.dataTypeID = dataTypeID;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
}
