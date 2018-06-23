package org.myfly.platform.core3.model.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(name = "PT_Ref_List")
@FlyTable(name = "")
public class PRefList extends FlyEntity {
	@ManyToOne
	private PReference reference;

	@FlyField(name = "Name", description = "Alphanumeric identifier of the entity", help = "The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.", entityType = EntityType.D)
	@Column(length = 60)
	private String name;

	@FlyField(name = "Entity Type", dataType = FlyDataType.Table, description = "Dictionary Entity Type; Determines ownership and synchronization", help = "The Entity Types \"Dictionary\", \"Adempiere\" and \"Application\" might be automatically synchronized and customizations deleted or overwritten.  \n"
			+ "\n" + "For customizations, copy the entity and select \"User\"!")
	@Column(name = "EntityType")
	private EntityType entityType;

	@FlyField(name = "Description", description = "Optional short description of the record", help = "A description is limited to 255 characters.")
	@Column(length = 255)
	private String description;

	@FlyField(name = "Valid from", description = "Valid from including this date (first day)", help = "The Valid From date indicates the first day of a date range")
	@Column(name = "ValidFrom", length = 7)
	private String validFrom;

	@FlyField(name = "Valid to", description = "Valid to including this date (last day)", help = "The Valid To date indicates the last day of a date range")
	@Column(name = "ValidTo", length = 7)
	private String validTo;

	@FlyField(name = "Search Key", description = "Search key for the record in the format required - must be unique", help = "A search key allows you a fast method of finding a particular record.\n"
			+ "If you leave the search key empty, the system automatically creates a numeric number.  The document sequence used for this fallback number is defined in the \"Maintain Sequence\" window with the name \"DocumentNo_<TableName>\", where TableName is the actual name of the table (e.g. C_Order).")
	@Column(name = "Value", length = 60)
	private String value;

	public PReference getReference() {
		return reference;
	}

	public void setReference(PReference reference) {
		this.reference = reference;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EntityType getEntityType() {
		return entityType;
	}

	public void setEntityType(EntityType entityType) {
		this.entityType = entityType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

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
}
