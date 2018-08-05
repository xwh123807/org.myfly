package org.myfly.platform.core.process.define;

import java.util.Map;

import org.myfly.platform.core.datamodel.define.IDefinition;
import org.myfly.platform.core.process.model.PProcess;
import org.myfly.platform.core.utils.JSONUtil;

/**
 * 进程模型
 * 
 * @author xiangwanhong
 *
 */
public class ProcessModel extends PProcess implements IDefinition {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8721874232881283786L;

	private Map<String, FProcessPara> paras;

	private boolean isFromDB;

	public Map<String, FProcessPara> getParas() {
		return paras;
	}

	public void setParas(Map<String, FProcessPara> paras) {
		this.paras = paras;
	}

	@Override
	public String getKey() {
		return getApiName();
	}

	@Override
	public void setUid(String value) {
		setProcessID(value);
	}

	@Override
	public String getUid() {
		return getProcessID();
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
}
