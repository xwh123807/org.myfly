package org.myfly.platform.core.datamodel.builder;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.myfly.platform.core.datamodel.service.IFlyColumn;
import org.myfly.platform.core.domain.FlyDataType;

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

	/**
	 * 获取类的Java类型
	 * 
	 * @param column
	 * @return
	 */
	public static Class<?> getJavaType(FlyDataType dataType) {
		Class<?> result = null;
		switch (dataType) {
		case Date:
			result = Date.class;
			break;
		case DateTime:
			result = Timestamp.class;
			break;
		case Binary:
		case Image:
			result = byte[].class;
			break;
		case NONE:
			break;
		case Quantity:
		case Amount:
		case CostsPrices:
		case Integer:
		case Number:
			result = BigDecimal.class;
			break;
		case InTable:
		case List:
		case ProductAttribute:
		case RowID:
		case Search:
		case SubTable:
		case ID:
		case Table:
		case TableDirect:
		case Time:
		case Account:
		case Assignment:
		case Button:
		case Chart:
		case Color:
		case EMail:
		case FileName:
		case FilePath:
		case FilePathOrName:
		case Location:
		case Locator:
		case LongText:
		case Memo:
		case PrinterName:
		case String:
		case Text:
		case URL:
			result = String.class;
			break;
		case YesNo:
			result = Boolean.class;
			break;
		default:
			break;
		}
		if (result == null) {
			result = String.class;
		}
		return result;
	}

	/**
	 * 判断是否为引用列
	 * 
	 * @return
	 */
	public static boolean isRefColumn(FlyDataType dataType) {
		return FlyDataType.List.equals(dataType) || FlyDataType.Table.equals(dataType)
				|| FlyDataType.TableDirect.equals(dataType);
	}
}
