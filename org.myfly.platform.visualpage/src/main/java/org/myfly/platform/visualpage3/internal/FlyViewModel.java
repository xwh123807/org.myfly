package org.myfly.platform.visualpage3.internal;

import java.util.Map;

import org.myfly.platform.core.utils.JSONUtil;
import org.myfly.platform.core3.metadata.define.IDefinition;
import org.myfly.platform.core3.model.PTable;
import org.myfly.platform.visualpage3.model.PWindow;

public class FlyViewModel extends PWindow implements IDefinition{

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
	 * @param tabs the tabs to set
	 */
	public void setTabs(Map<String, FTab> tabs) {
		this.tabs = tabs;
	}

	public PTable toTablePO() {
		// TODO Auto-generated method stub
		return null;
	}

}
