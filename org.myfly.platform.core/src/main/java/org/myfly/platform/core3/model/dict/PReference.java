package org.myfly.platform.core3.model.dict;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyMetaEntity;
import org.myfly.platform.core3.metadata.annotation.FlyRefTable;
import org.myfly.platform.core3.metadata.annotation.FlyReferences;
import org.myfly.platform.core3.metadata.annotation.FlyTable;
import org.myfly.platform.core3.model.data.ValidationType;

@Entity
@Table(name = "PT_Reference", indexes = @Index(columnList = "name", unique = true))
@FlyTable(name = "Reference", description = "System Reference (Pick List)", help = "The Reference could be a display type, list or table validation.")
@FlyReferences(references= {
		@FlyRefTable(displayColumn = "name", keyColumn = "referenceID", name = "referenceID"),
		@FlyRefTable(displayColumn = "name", keyColumn = "name", name = "PReference_name")
})
public class PReference extends FlyMetaEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -80653804439861600L;

	@Id
	@Column(name = "Reference_ID", length = 32)
	private String referenceID;

	@Column(length = 40)
	private String entityType;

	@Column(name = "IsOrderByValue")
	private Boolean isOrderByValue;

	@Column
	private ValidationType validationType;

	@Column(length = 40)
	private String vFormat;

	public Boolean getIsOrderByValue() {
		return isOrderByValue;
	}

	public void setIsOrderByValue(Boolean isOrderByValue) {
		this.isOrderByValue = isOrderByValue;
	}

	public ValidationType getValidationType() {
		return validationType;
	}

	public void setValidationType(ValidationType validationType) {
		this.validationType = validationType;
	}

	public String getvFormat() {
		return vFormat;
	}

	public void setvFormat(String vFormat) {
		this.vFormat = vFormat;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getReferenceID() {
		return referenceID;
	}

	public void setReferenceID(String referenceID) {
		this.referenceID = referenceID;
	}
}
