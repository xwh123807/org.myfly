package org.myfly.platform.core.process.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core.datamodel.annotation.FlyRefTable;
import org.myfly.platform.core.datamodel.annotation.FlyTable;
import org.myfly.platform.core.domain.FlyDataType;
import org.myfly.platform.core.domain.FlyMetaEntity;

@Entity
@Table(name = "PT_Process_Para")
@FlyTable(name = "过程参数", description = "", help = "")
@FlyRefTable(apiName = "processParaID", name = "进程参数", keyColumn = "processParaID", displayColumn = "name")
public class PProcessPara extends FlyMetaEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1392262917228272181L;

	@Id
	@Column(length = 32)
	private String processParaID;
	
	@Column(length = 255, name = "ApiName", unique = true)
	private String apiName;

	@Column(length = 32)
	private String entityType;

	@Column
	private Boolean isMandatory;

	@Column
	private Integer fieldLength;

	@Column(length = 20)
	private String valueMax;

	@Column(length = 30)
	private String columnName;
	
	@Column(length = 30)
	private FlyDataType dataType;

	@Column(length = 32)
	private String processID;

	@Column
	private Boolean isRange;

	@Column(length = 32)
	private String referenceID;

	@Column(length = 32)
	private String valRuleID;

	@Column
	private BigDecimal seqNo;

	@Column(length = 2000)
	private String readOnlyLogic;

	@Column
	private Boolean isCentrallyMaintained;

	@Column(length = 2000)
	private String defaultValue2;

	@Column(length = 20)
	private String vFormat;

	@Column(length = 20)
	private String valueMin;

	@Column(length = 2000)
	private String defaultValue;

	@Column(length = 2000)
	private String displayLogic;

	@Column(length = 32)
	private String elementID;

	@Column
	private Boolean isInfoOnly;

	public String getProcessParaID() {
		return processParaID;
	}

	public void setProcessParaID(String processParaID) {
		this.processParaID = processParaID;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public Boolean getIsMandatory() {
		return isMandatory;
	}

	public void setIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	public Integer getFieldLength() {
		return fieldLength;
	}

	public void setFieldLength(Integer fieldLength) {
		this.fieldLength = fieldLength;
	}

	public String getValueMax() {
		return valueMax;
	}

	public void setValueMax(String valueMax) {
		this.valueMax = valueMax;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getProcessID() {
		return processID;
	}

	public void setProcessID(String processID) {
		this.processID = processID;
	}

	public Boolean getIsRange() {
		return isRange;
	}

	public void setIsRange(Boolean isRange) {
		this.isRange = isRange;
	}

	public String getReferenceID() {
		return referenceID;
	}

	public void setReferenceID(String referenceID) {
		this.referenceID = referenceID;
	}

	public String getValRuleID() {
		return valRuleID;
	}

	public void setValRuleID(String valRuleID) {
		this.valRuleID = valRuleID;
	}

	public BigDecimal getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(BigDecimal seqNo) {
		this.seqNo = seqNo;
	}

	public String getReadOnlyLogic() {
		return readOnlyLogic;
	}

	public void setReadOnlyLogic(String readOnlyLogic) {
		this.readOnlyLogic = readOnlyLogic;
	}

	public Boolean getIsCentrallyMaintained() {
		return isCentrallyMaintained;
	}

	public void setIsCentrallyMaintained(Boolean isCentrallyMaintained) {
		this.isCentrallyMaintained = isCentrallyMaintained;
	}

	public String getDefaultValue2() {
		return defaultValue2;
	}

	public void setDefaultValue2(String defaultValue2) {
		this.defaultValue2 = defaultValue2;
	}

	public String getvFormat() {
		return vFormat;
	}

	public void setvFormat(String vFormat) {
		this.vFormat = vFormat;
	}

	public String getValueMin() {
		return valueMin;
	}

	public void setValueMin(String valueMin) {
		this.valueMin = valueMin;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getDisplayLogic() {
		return displayLogic;
	}

	public void setDisplayLogic(String displayLogic) {
		this.displayLogic = displayLogic;
	}

	public String getElementID() {
		return elementID;
	}

	public void setElementID(String elementID) {
		this.elementID = elementID;
	}

	public Boolean getIsInfoOnly() {
		return isInfoOnly;
	}

	public void setIsInfoOnly(Boolean isInfoOnly) {
		this.isInfoOnly = isInfoOnly;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public FlyDataType getDataType() {
		return dataType;
	}

	public void setDataType(FlyDataType dataType) {
		this.dataType = dataType;
	}
}
