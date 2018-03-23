package org.myfly.platform.system.tpcc.domain;

import java.io.Serializable;

public class NewOrderPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3122056596689512859L;
	private Long wid;

	private Long did;

	private Long oid;

	public NewOrderPK() {
	}

	public NewOrderPK(Long wid, Long did, Long oid) {
		setWid(wid);
		setDid(did);
		setOid(oid);
	}

	public Long getWid() {
		return wid;
	}

	public void setWid(Long wid) {
		this.wid = wid;
	}

	public Long getDid() {
		return did;
	}

	public void setDid(Long did) {
		this.did = did;
	}

	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}
}
