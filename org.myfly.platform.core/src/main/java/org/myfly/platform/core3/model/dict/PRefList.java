package org.myfly.platform.core3.model.dict;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.FlyMetaEntity;
import org.myfly.platform.core3.metadata.annotation.FlyRefTable;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(name = "PT_Ref_List")
@FlyTable(name = "Reference List", description = "Reference List based on Table")
@FlyRefTable(apiName = "refListID", name = "PRefList ID", keyColumn = "refListID", displayColumn = "name")
public class PRefList extends FlyMetaEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6873854004771767977L;

	@Id
	@Column(length = 32)
	private String refListID;

	@Column(length = 32)
	private String referenceID;

	@Column(length = 32)
	private String entityType;

	@Column(name = "ValidFrom", length = 7)
	private String validFrom;

	@Column(name = "ValidTo", length = 7)
	private String validTo;

	@Column(name = "Value", length = 60)
	private String value;

	public String getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	public String getValidTo() {
		return validTo;
	}

	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getRefListID() {
		return refListID;
	}

	public void setRefListID(String refListID) {
		this.refListID = refListID;
	}

	public String getReferenceID() {
		return referenceID;
	}

	public void setReferenceID(String referenceID) {
		this.referenceID = referenceID;
	}
}
