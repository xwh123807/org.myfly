package org.myfly.platform.tools.codebuilder;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ADReference extends HashMap<String, Object> {

	public ADReference(Map<String, Object> item) {
		putAll(item);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2178371893673836756L;

	public String getName() {
		return (String) get("name");
	}

	public String getDescription() {
		return (String) get("description");
	}

	public String getHelp() {
		return (String) get("help");
	}

	public int getReferenceID() {
		return ((BigDecimal) get("ad_reference_id")).intValue();
	}

	public void setRefLists(List<ADRefList> refList) {
		put("refLists", refList);
	}
	
	@SuppressWarnings("unchecked")
	public List<ADRefList> getRefLists(){
		return (List<ADRefList>) get("refLists");
	}
}
