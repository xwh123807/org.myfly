package org.myfly.platform.visualpage3.internal;

import java.util.Map;

import org.myfly.platform.core3.metadata.define.IDefinition;
import org.myfly.platform.visualpage3.model.PField;
import org.myfly.platform.visualpage3.model.PTab;

public class FTab extends PTab implements IDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7339322643421118783L;

	private Map<String, PField> fields;

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUid(String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getUid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFromDB() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setFromDB(boolean value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toJson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printJson() {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the fields
	 */
	public Map<String, PField> getFields() {
		return fields;
	}

	/**
	 * @param fields
	 *            the fields to set
	 */
	public void setFields(Map<String, PField> fields) {
		this.fields = fields;
	}

}
