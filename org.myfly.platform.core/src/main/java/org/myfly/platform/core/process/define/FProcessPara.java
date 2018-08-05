package org.myfly.platform.core.process.define;

import org.myfly.platform.core.datamodel.define.FElement;
import org.myfly.platform.core.process.model.PProcessPara;

public class FProcessPara extends PProcessPara {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7212014393858268812L;

	private FElement element;

	public FElement getElement() {
		return element;
	}

	public void setElement(FElement element) {
		this.element = element;
	}
}
