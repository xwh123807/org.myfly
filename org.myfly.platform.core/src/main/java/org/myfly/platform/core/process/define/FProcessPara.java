package org.myfly.platform.core.process.define;

import org.myfly.platform.core.datamodel.define.FElement;
import org.myfly.platform.core.datamodel.define.IDefinition;
import org.myfly.platform.core.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core.process.model.PProcessPara;
import org.myfly.platform.core.utils.JSONUtil;

public class FProcessPara extends PProcessPara implements IDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7212014393858268812L;

	private FElement element;

	private boolean isFromDB;

	public FElement getElement() {
		return element;
	}

	public void setElement(FElement element) {
		this.element = element;
	}

	@Override
	public String getKey() {
		return getApiName();
	}

	@Override
	public void setUid(String value) {
		setProcessParaID(value);
	}

	@Override
	public String getUid() {
		return getProcessParaID();
	}

	@Override
	public boolean isFromDB() {
		return isFromDB;
	}

	@Override
	public void setFromDB(boolean value) {
		isFromDB = value;
	}

	@Override
	public void validate() {

	}

	@Override
	public String toJson() {
		return JSONUtil.toJSON(this);
	}

	@Override
	public void printJson() {
		System.out.println(toJson());
	}

	public PProcessPara toProcessParaPO() {
		PProcessPara result = new PProcessPara();
		result.setApiName(getApiName());
		result.setColumnName(getColumnName());
		result.setDataType(getDataType());
		result.setDefaultValue(getDefaultValue());
		result.setDefaultValue2(getDefaultValue2());
		result.setDescription(getDescription());
		result.setDisplayLogic(getDisplayLogic());
		result.setElementID(getElementID());
		result.setEntityType(getEntityType());
		result.setFieldLength(getFieldLength());
		result.setHelp(getHelp());
		result.setIsCentrallyMaintained(getIsCentrallyMaintained());
		result.setIsInfoOnly(getIsInfoOnly());
		result.setIsMandatory(getIsMandatory());
		result.setIsRange(getIsRange());
		result.setName(getName());
		result.setProcessID(getProcessID());
		result.setProcessParaID(getProcessParaID());
		result.setReadOnlyLogic(getReadOnlyLogic());
		result.setReferenceID(getReferenceID());
		result.setSeqNo(getSeqNo());
		result.setValRuleID(getValRuleID());
		result.setValueMax(getValueMax());
		result.setValueMin(getValueMin());
		result.setvFormat(getvFormat());
		FlyEntityUtils.copyFlyFields(result, this);
		return result;
	}
}
