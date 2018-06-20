package org.myfly.platform.core3.metadata.builder;

import org.myfly.platform.core3.metadata.define.FlyFieldDefinition;
import org.myfly.platform.core3.metadata.model.PColumn;

public class PTColumnFlyFieldBuilder extends FlyFieldDefinition {
	/**
	 * 
	 */
	private static final long serialVersionUID = -14792018936419207L;

	public PTColumnFlyFieldBuilder(PColumn builder) {
		setApiName(builder.getApiName());
		setName(builder.getName());
		setEntityType(builder.getEntityType());
		setDescription(builder.getDescription());
		setHelp(builder.getHelp());
		setColumnName(builder.getColumnName());
		setColumnSQL(builder.getColumnSQL());
		setDataType(builder.getDataType());
		setFieldLength(builder.getFieldLength());
		setDefaultValue(builder.getDefaultValue());
		setAllowCopy(builder.getIsAllowCopy());
		setAllowLogging(builder.getIsAllowLogging());
		setAlwaysUpdateable(builder.getIsAlwaysUpdateable());
		setAutocomplete(builder.getIsAutocomplete());
		setEncrypted(builder.getIsEncrypted());
		setParent(builder.getIsParent());
		setRange(builder.getIsRange());
		setSelectionColumn(builder.getIsSelectionColumn());
		setSyncDatabase(builder.getIsSyncDatabase());
		setTranslated(builder.getIsTranslated());
		setValueMin(builder.getValueMin());
		setValueMax(builder.getValueMax());
		setvFormat(builder.getvFormat());
	}

	public static PColumn toPColumn(FlyFieldDefinition builder) {
		PColumn column = new PColumn();
		column.setApiName(builder.getApiName());
		column.setName(builder.getName());
		column.setEntityType(builder.getEntityType());
		column.setDescription(builder.getDescription());
		column.setHelp(builder.getHelp());
		column.setColumnName(builder.getColumnName());
		column.setColumnSQL(builder.getColumnSQL());
		column.setDataType(builder.getDataType());
		column.setFieldLength(builder.getFieldLength());
		column.setDefaultValue(builder.getDefaultValue());
		column.setIsAllowCopy(builder.isAllowCopy());
		column.setIsAllowLogging(builder.isAllowLogging());
		column.setIsAlwaysUpdateable(builder.isAlwaysUpdateable());
		column.setIsAutocomplete(builder.isAutocomplete());
		column.setIsEncrypted(builder.isEncrypted());
		column.setIsParent(builder.isParent());
		column.setIsRange(builder.isRange());
		column.setIsSelectionColumn(builder.isSelectionColumn());
		column.setIsSyncDatabase(builder.isSyncDatabase());
		column.setIsTranslated(builder.isTranslated());
		column.setValueMin(builder.getValueMin());
		column.setValueMax(builder.getValueMax());
		column.setvFormat(builder.getvFormat());
		return column;
	}
}
