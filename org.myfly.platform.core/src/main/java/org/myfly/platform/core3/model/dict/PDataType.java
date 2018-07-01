package org.myfly.platform.core3.model.dict;

import javax.persistence.Column;
import javax.persistence.Id;

import org.myfly.platform.core3.domain.FlyMetaEntity;

/**
 * 系统数据类型 <br>
 * 1、AD_Reference中值小于50的基本数据类型，不包含引用类型 <br>
 * 2、由FlyDataType中导入 <br>
 * 
 * @author xiangwanhong
 *
 */
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
	private String entityTypeID;

	public String getEntityTypeID() {
		return entityTypeID;
	}

	public void setEntityTypeID(String entityTypeID) {
		this.entityTypeID = entityTypeID;
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
