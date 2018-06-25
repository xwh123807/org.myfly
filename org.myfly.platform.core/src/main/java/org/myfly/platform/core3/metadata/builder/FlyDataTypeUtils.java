package org.myfly.platform.core3.metadata.builder;

import java.lang.reflect.Field;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.metadata.service.IFlyColumn;

public class FlyDataTypeUtils {

	/**
	 * 
	 * @param field
	 * @param property
	 */
	public static void updatColumnFromField(IFlyColumn field, Field property) {
		switch (property.getType().getName()) {
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
			if (property.getType().isEnum()) {
				field.setDataType(FlyDataType.List);
			} else if (property.getAnnotation(ManyToOne.class) != null) {
				field.setDataType(FlyDataType.TableDirect);
			} else if (property.getAnnotation(OneToOne.class) != null) {
				field.setDataType(FlyDataType.InTable);
			} else if (property.getAnnotation(OneToMany.class) != null) {
				field.setDataType(FlyDataType.SubTable);
			} else {
				field.setDataType(FlyDataType.ID);
			}
		}
	}
}
