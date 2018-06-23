package org.myfly.platform.core3.metadata.builder;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.utils.EntityClassUtil.FieldInfo;
import org.myfly.platform.core.utils.StringUtil;
import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.define.FlyFieldDefinition;

/**
 * 实体类字段构造器，从实体属性构建
 * 
 * @author xiangwanhong
 *
 */
public class EntityFlyFieldBuilder extends FlyFieldDefinition {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2792351110786169083L;

	/**
	 * 从实体属性构造字段定义信息
	 * 
	 * @param field
	 */
	public EntityFlyFieldBuilder(FieldInfo field) {
		setApiName(field.getField().getName());
		setGetter(field.getGetter());
		setSetter(field.getSetter());
		FlyField view = field.getField().getAnnotation(FlyField.class);
		if (view != null) {
			setName(view.name());
			setEntityType(view.entityType());
			setDescription(view.description());
			setHelp(view.help());
			setColumnSQL(view.columnSQL());
			setDataType(view.dataType());
			setDefaultValue(view.defaultValue());
			setAllowCopy(view.isAllowCopy());
			setAllowLogging(view.isAllowLogging());
			setAlwaysUpdateable(view.isAlwaysUpdateable());
			setAutocomplete(view.isAutocomplete());
			setEncrypted(view.isEncrypted());
			setParent(view.isParent());
			setRange(view.isRange());
			setSelectionColumn(view.isSelectionColumn());
			setSyncDatabase(view.isSyncDatabase());
			setTranslated(view.isTranslated());
			setValueMin(view.valueMin());
			setValueMax(view.valueMax());
			setvFormat(view.vFormat());
		} else {
			// 设置默认值
			setEntityType(EntityType.D);
			setDataType(FlyDataType.NONE);
			setAllowCopy(true);
			setTranslated(true);
		}
		Column column = field.getField().getAnnotation(Column.class);
		if (column != null) {
			setColumnName(column.name());
			setFieldLength(column.length());
			setMandatory(column.nullable());
		}
		if (StringUtils.isBlank(getName())) {
			setName(getApiName());
		}
		if (StringUtils.isBlank(getColumnName())) {
			setColumnName(StringUtil.getHibernateName(getApiName()));
		}
		if (FlyDataType.NONE.equals(getDataType())) {
			updateDataTypeFromFieldDefinition(this, field);
		}
	}

	private void updateDataTypeFromFieldDefinition(FlyFieldDefinition field, FieldInfo fieldInfo) {
		switch (field.getGetter().getReturnType().getName()) {
		case "boolean":
		case "java.lang.Boolean":
			field.setDataType(FlyDataType.YesNo);
			break;
		case "java.lang.String":
			if (field.getFieldLength() <= 255) {
				field.setDataType(FlyDataType.String);
			} else if (field.getFieldLength() <= 2000) {
				field.setDataType(FlyDataType.Text);
			} else {
				field.setDataType(FlyDataType.LongText);
			}
			break;
		case "java.sql.Clob":
			field.setDataType(FlyDataType.Memo);
			break;
		case "java.sql.Blob":
		case "[B":
			field.setDataType(FlyDataType.Binary);
			break;
		case "int":
		case "java.lang.Integer":
			field.setDataType(FlyDataType.Integer);
			field.setFieldLength(10);
			break;
		case "long":
		case "java.lang.Long":
			field.setDataType(FlyDataType.Integer);
			field.setFieldLength(20);
			break;
		case "double":
		case "float":
		case "java.lang.Double":
		case "java.lang.Float":
			field.setDataType(FlyDataType.Number);
			break;
		case "java.math.BigDecimal":
			field.setDataType(FlyDataType.Number);
			break;
		case "java.math.BigInteger":
			field.setDataType(FlyDataType.Integer);
			break;
		case "java.util.Date":
		case "java.sql.Date":
		case "java.util.Calendar":
			field.setDataType(FlyDataType.Date);
			break;
		case "java.sql.Time":
			field.setDataType(FlyDataType.Time);
			break;
		case "java.sql.Timestamp":
			field.setDataType(FlyDataType.DateTime);
			break;
		default:
			if (field.getGetter().getReturnType().isEnum()) {
				field.setDataType(FlyDataType.List);
			} else if (fieldInfo.getField().getAnnotation(ManyToOne.class) != null) {
				field.setDataType(FlyDataType.TableDirect);
			} else if (fieldInfo.getField().getAnnotation(OneToOne.class) != null) {
				field.setDataType(FlyDataType.InTable);
			} else if (fieldInfo.getField().getAnnotation(OneToMany.class) != null) {
				field.setDataType(FlyDataType.SubTable);
			} else {
				field.setDataType(FlyDataType.ID);
			}
		}
	}
}
