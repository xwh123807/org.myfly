package org.myfly.platform.system.tpcc.domain;

import java.io.Serializable;

public class DistrictPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1471105249415689702L;
	private Long wid;

	private Long did;

	public DistrictPK() {
	}

	public DistrictPK(Long wid, Long did) {
		setWid(wid);
		setDid(did);
	}

	public Long getDid() {
		return did;
	}

	public void setDid(Long did) {
		this.did = did;
	}

	public Long getWid() {
		return wid;
	}

	public void setWid(Long wid) {
		this.wid = wid;
	}
}
