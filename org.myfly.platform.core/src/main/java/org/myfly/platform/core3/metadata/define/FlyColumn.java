package org.myfly.platform.core3.metadata.define;

import java.lang.reflect.Method;

import org.myfly.platform.core3.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core3.model.data.PColumn;
import org.springframework.util.Assert;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class FlyColumn extends PColumn {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8254426803835852767L;

	@JsonIgnore
	private Method getter;

	@JsonIgnore
	private Method setter;

	@JsonIgnore
	private IValueHandler valueHandler;

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
		Assert.hasLength(getName(), "属性[name]不能为空");
		Assert.hasLength(getColumnName(), "属性[columnName]不能为空");
		Assert.notNull(getGetter(), "属性[Getter]不能为空");
		Assert.notNull(getSetter(), "属性[Setter]不能为空");
		Assert.notNull(getValueHandler(), "属性[ValueHandler]不能为空");
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
}
