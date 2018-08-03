package org.myfly.platform.tools.codebuilder;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.myfly.platform.core.domain.FlyDataType;

import com.squareup.javapoet.TypeSpec.Builder;

public class ADElement extends HashMap<String, Object> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -189348808503679207L;

	public ADElement() {
	}

	public ADElement(Map<String, Object> from) {
		putAll(from);
	}

	public String getApiName() {
		return Util.toFieldApiName(getColumnName());
	}

	public String getClassName() {
		return getApiName();
	}

	public String getColumnName() {
		return (String) get("columnname");
	}

	public String getName() {
		return (String) get("name");
	}

	public String getDescription() {
		return (String) get("description");
	}

	public String getHelp() {
		return (String) get("help");
	}
	
	public void setName(String value) {
		put("name", value);
	}

	public void setDescription(String value) {
		put("description", value);
	}

	public void setHelp(String value) {
		put("help", value);
	}

	public void setColumnName(String value) {
		put("columnname", value);
	}

	public String getEntityType() {
		return (String) get("entitytype");
	}

	public void setEntityType(String value) {
		put("entitytype", value);
	}

	public String getPrintName() {
		return (String) get("printname");
	}

	public void setPrintName(String value) {
		put("printname", value);
	}

	public void build(Builder builder) {
		builder.addEnumConstant(getApiName());
	}

	public int getFieldLength() {
		BigDecimal value = (BigDecimal) get("fieldlength");
		if (value != null) {
			return value.intValue();
		} else {
			return 0;
		}
	}

	public FlyDataType getDataType() {
		FlyDataType result = FlyDataType.NONE;
		BigDecimal value = (BigDecimal) get("ad_reference_id");
		if (value != null) {
			switch (value.intValue()) {
			case 10:
				result = FlyDataType.String;
				break;
			case 11:
				result = FlyDataType.Integer;
				break;
			case 12:
				result = FlyDataType.Amount;
				break;
			case 13:
				result = FlyDataType.ID;
				break;
			case 14:
				result = FlyDataType.Text;
				break;
			case 15:
				result = FlyDataType.Date;
				break;
			case 16:
				result = FlyDataType.DateTime;
				break;
			case 17:
				result = FlyDataType.List;
				break;
			case 18:
				result = FlyDataType.Table;
				break;
			case 19:
				result = FlyDataType.TableDirect;
				break;
			case 20:
				result = FlyDataType.YesNo;
				break;
			case 21:
				result = FlyDataType.Location;
				break;
			case 22:
				result = FlyDataType.Number;
				break;
			case 23:
				result = FlyDataType.Binary;
				break;
			case 24:
				result = FlyDataType.Time;
				break;
			case 25:
				result = FlyDataType.Account;
				break;
			case 26:
				result = FlyDataType.RowID;
				break;
			case 27:
				result = FlyDataType.Color;
				break;
			case 28:
				result = FlyDataType.Button;
				break;
			case 29:
				result = FlyDataType.Quantity;
				break;
			case 30:
				result = FlyDataType.Search;
				break;
			case 31:
				result = FlyDataType.Locator;
				break;
			case 32:
				result = FlyDataType.Image;
				break;
			case 33:
				result = FlyDataType.Assignment;
				break;
			case 34:
				result = FlyDataType.Memo;
				break;
			case 35:
				result = FlyDataType.ProductAttribute;
				break;
			case 36:
				result = FlyDataType.LongText;
				break;
			case 37:
				result = FlyDataType.CostsPrices;
				break;
			case 38:
				result = FlyDataType.FilePath;
				break;
			case 39:
				result = FlyDataType.FileName;
				break;
			case 40:
				result = FlyDataType.URL;
				break;
			case 42:
				result = FlyDataType.PrinterName;
				break;
			case 53370:
				result = FlyDataType.Chart;
				break;
			case 53670:
				result = FlyDataType.FilePathOrName;
				break;
			}
		}
		return result;
	}

	public int getUID() {
		return ((BigDecimal)get("ad_element_id")).intValue();
	}
	
	public String convertStr(String value) {
		if (StringUtils.isBlank(value)) {
			return "";
		}else {
			return value;
		}
	}

}
