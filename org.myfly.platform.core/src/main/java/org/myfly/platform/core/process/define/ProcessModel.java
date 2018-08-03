package org.myfly.platform.core.process.define;

import java.util.Map;

import org.myfly.platform.core.process.model.PProcess;

/**
 * 进程模型
 * 
 * @author xiangwanhong
 *
 */
public class ProcessModel extends PProcess {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8721874232881283786L;

	private Map<String, FProcessPara> paras;

	public Map<String, FProcessPara> getParas() {
		return paras;
	}

	public void setParas(Map<String, FProcessPara> paras) {
		this.paras = paras;
	}
}
