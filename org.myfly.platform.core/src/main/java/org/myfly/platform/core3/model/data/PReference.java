package org.myfly.platform.core3.model.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.domain.FlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.annotation.FlyTable;

@Entity
@Table(name = "PT_Reference")
@FlyTable(name = "Reference", description = "System Reference (Pick List)", help = "The Reference could be a display type, list or table validation.")
public class PReference extends FlyEntity {
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

	@FlyField(name = "Comment/Help", dataType = FlyDataType.Text, description = "Comment or Hint", help = "The Help field contains a hint, comment or help about the use of this item.")
	@Column(length = 2000)
	private String help;

	@FlyField(name = "Order By Value", description = "Order list using the value column instead of the name column", help = "Order list using the value column instead of the name column")
	@Column(name = "IsOrderByValue")
	private Boolean isOrderByValue;

	@FlyField(name = "Validation type", description = "Different method of validating data", help = "The Validation Type indicates the validation method to use.  These include list, table or data type validation.")
	@Column
	private ValidationType validationType;

	@FlyField(name = "Value Format", description = "Format of the value; Can contain fixed format elements, Variables: \"_lLoOaAcCa09\"", help = "<B>Validation elements:</B>\n"
			+ " 	(Space) any character\n" + "_	Space (fixed character)\n" + "l	any Letter a..Z NO space\n"
			+ "L	any Letter a..Z NO space converted to upper case\n" + "o	any Letter a..Z or space\n"
			+ "O	any Letter a..Z or space converted to upper case\n" + "a	any Letters & Digits NO space\n"
			+ "A	any Letters & Digits NO space converted to upper case\n" + "c	any Letters & Digits or space\n"
			+ "C	any Letters & Digits or space converted to upper case\n" + "0	Digits 0..9 NO space\n"
			+ "9	Digits 0..9 or space\n" + "\n" + "Example of format \"(000)_000-0000\"")
	@Column(length = 40)
	private String vFormat;

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

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

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
}
