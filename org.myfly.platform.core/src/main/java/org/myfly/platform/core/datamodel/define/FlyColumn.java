package org.myfly.platform.core.datamodel.define;

import java.lang.reflect.Method;

import org.apache.commons.lang3.BooleanUtils;
import org.myfly.platform.core.datamodel.model.PColumn;
import org.myfly.platform.core.domain.FlyDataType;
import org.myfly.platform.core.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core.utils.JSONUtil;
import org.springframework.util.Assert;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class FlyColumn extends PColumn implements IDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8254426803835852767L;

	@JsonIgnore
	private FlyDataModel parent;

	@JsonIgnore
	private Method getter;

	@JsonIgnore
	private Method setter;

	@JsonIgnore
	private IValueHandler valueHandler;

	private boolean isFromDB;

	/**
	 * 对应Element
	 */
	private FElement element;

	public IValueHandler getValueHandler() {
		return valueHandler;
	}

	public void setValueHandler(IValueHandler valueHandler) {
		this.valueHandler = valueHandler;
	}

	public Method getGetter() {
		return getter;
	}

	public void setGetter(Method getter) {
		this.getter = getter;
	}

	public Method getSetter() {
		return setter;
	}

	public void setSetter(Method setter) {
		this.setter = setter;
	}

	@Override
	public String toString() {
		return "apiName: " + getApiName() + ", name: " + getName() + ", columnName: " + getColumnName() + ", dataType: "
				+ getDataType();
	}

	public void validate() {
		Assert.hasLength(getApiName(), "属性[apiName]不能为空");
		Assert.hasLength(getColumnName(), "属性[columnName]不能为空");
		Assert.notNull(getGetter(), "属性[Getter]不能为空");
		Assert.notNull(getSetter(), "属性[Setter]不能为空");
	}

	public PColumn toColumnPO() {
		PColumn result = new PColumn();
		result.setApiName(getApiName());
		result.setCallout(getCallout());
		result.setColumnID(getColumnID());
		result.setColumnName(getColumnName());
		result.setColumnSQL(getColumnSQL());
		result.setDataType(getDataType());
		result.setDefaultValue(getDefaultValue());
		result.setElementID(getElementID());
		result.setEntityType(getEntityType());
		result.setFieldLength(getFieldLength());
		result.setFormatPattern(getFormatPattern());
		result.setInfoFactoryClass(getInfoFactoryClass());
		result.setIsAllowCopy(getIsAllowCopy());
		result.setIsAllowLogging(getIsAllowLogging());
		result.setIsAlwaysUpdateable(getIsAlwaysUpdateable());
		result.setIsAutocomplete(getIsAutocomplete());
		result.setIsEncrypted(getIsEncrypted());
		result.setIsIdentifier(getIsIdentifier());
		result.setIsKey(getIsKey());
		result.setIsMandatory(getIsMandatory());
		result.setIsParent(getIsParent());
		result.setIsRange(getIsRange());
		result.setIsSelectionColumn(getIsSelectionColumn());
		result.setIsSyncDatabase(getIsSyncDatabase());
		result.setIsTranslated(getIsTranslated());
		result.setIsUpdateable(getIsUpdateable());
		result.setReadOnlyLogic(getReadOnlyLogic());
		result.setReferenceID(getReferenceID());
		result.setSeqNo(getSeqNo());
		result.setTableID(getTableID());
		result.setValueMax(getValueMax());
		result.setValueMin(getValueMin());
		result.setVersion(getVersion());
		result.setvFormat(getvFormat());
		FlyEntityUtils.copyFlyMetaFields(result, this);
		return result;
	}

	@Override
	public String getKey() {
		return getColumnID();
	}

	@Override
	public void setUid(String value) {
		setColumnID(value);
	}

	@Override
	public String getUid() {
		return getColumnID();
	}

	@Override
	public boolean isFromDB() {
		return isFromDB;
	}

	@Override
	public void setFromDB(boolean value) {
		this.isFromDB = value;
	}

	@Override
	public String toJson() {
		return JSONUtil.toJSON(this);
	}

	@Override
	public void printJson() {
		System.out.println(toJson());
	}

	public FElement getElement() {
		return element;
	}

	public void setElement(FElement element) {
		this.element = element;
	}

	/**
	 * @return the parent
	 */
	public FlyDataModel getParent() {
		return parent;
	}

	/**
	 * @param parent
	 *            the parent to set
	 */
	public void setParent(FlyDataModel parent) {
		this.parent = parent;
	}

	/**
	 * 获取引用表关联列
	 * 
	 * @return
	 */
	public String getRefKeyColumn() {
		if (isRefTableColumn()) {
			return (getElement().getRefTable() != null) ? getElement().getRefTable().getKeyColumnName() : "";
		} else if (isRefListColumn()) {
			return "refListID";
		} else {
			return "";
		}
	}

	/**
	 * 获取引用表显示列
	 * 
	 * @return
	 */
	public String getRefDisplayColumn() {
		if (getElement() != null) {
			if (isRefTableColumn()) {
				return (getElement().getRefTable() != null) ? getElement().getRefTable().getDisplayColumnName() : "";
			} else if (isRefListColumn()) {
				return "name";
			} else if (BooleanUtils.isTrue(getIsKey()) && getElement().getRefTable() != null) {
				return getElement().getRefTable().getDisplayColumnName();
			} else {
				return "";
			}
		} else {
			return "";
		}
	}

	/**
	 * 判断列是否为引用表列类型
	 * 
	 * @return
	 */
	public boolean isRefTableColumn() {
		return FlyDataType.Table.equals(getDataType()) || FlyDataType.TableDirect.equals(getDataType());
	}

	/**
	 * 判断是否为引用值列类型
	 * 
	 * @return
	 */
	public boolean isRefListColumn() {
		return FlyDataType.List.equals(getDataType());
	}
}
