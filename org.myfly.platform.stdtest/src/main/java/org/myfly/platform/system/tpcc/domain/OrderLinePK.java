package org.myfly.platform.system.tpcc.domain;

import java.io.Serializable;

public class OrderLinePK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2977172763103408108L;
	private Long wid;
	private Long did;
	private Long oid;
	private Long number;

	public OrderLinePK() {
	}

	public OrderLinePK(Long wid, Long did, Long oid, Long number) {
		setWid(wid);
		setDid(did);
		setOid(oid);
		setNumber(number);
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

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}
}
