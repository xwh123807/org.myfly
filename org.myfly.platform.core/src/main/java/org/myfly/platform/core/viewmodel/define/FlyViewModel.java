package org.myfly.platform.core.viewmodel.define;

import java.util.Map;

import org.myfly.platform.core.datamodel.define.IDefinition;
import org.myfly.platform.core.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core.viewmodel.model.PWindow;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class FlyViewModel extends PWindow implements IDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6179348012308479009L;

	private boolean isFromDB;

	private Map<String, FTab> tabs;
	
	@Override
	public String getKey() {
		return getApiName();
	}

	@Override
	public void setUid(String value) {
		setWindowID(value);
	}

	@Override
	public String getUid() {
		return getWindowID();
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

	/**
	 * @return the tabs
	 */
	public Map<String, FTab> getTabs() {
		return tabs;
	}

	/**
	 * @param tabs
	 *            the tabs to set
	 */
	public void setTabs(Map<String, FTab> tabs) {
		this.tabs = tabs;
	}

	public PWindow toWindowPO() {
		PWindow result = new PWindow();
		result.setApiName(getApiName());
		result.setEntityType(getEntityType());
		result.setIsBetaFunctionality(getIsBetaFunctionality());
		result.setIsDefault(getIsDefault());
		result.setIsSOTrx(getIsSOTrx());
		result.setProcessing(getProcessing());
		result.setWindowID(getWindowID());
		result.setWindowType(getWindowType());
		result.setWinHeight(getWinHeight());
		result.setWinWidth(getWinWidth());
		FlyEntityUtils.copyFlyMetaFields(result, this);
		return result;
	}

	@JsonIgnore
	public FTab getMainTab() {
		String firtTabName = getTabs().keySet().toArray(new String[] {})[0];
		return getTabs().get(firtTabName);
	}
	
	public String getMainTabName() {
		return getMainTab().getName();
	}
}
