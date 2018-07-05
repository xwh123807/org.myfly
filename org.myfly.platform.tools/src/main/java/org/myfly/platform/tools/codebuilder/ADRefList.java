package org.myfly.platform.tools.codebuilder;

import java.util.HashMap;
import java.util.Map;

public class ADRefList extends HashMap<String, Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7431563672316866866L;

	public ADRefList(Map<String, Object> item) {
		putAll(item);
	}

	public String getName() {
		return (String) get("name");
	}
	
	public String getValue() {
		return (String) get("value");
	}
}
