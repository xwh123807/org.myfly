package org.myfly.platform.system.tpcc.domain;

import java.io.Serializable;

public class CustomerPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2739055093196681461L;
	private Long cid;
	private Long wid;
	private Long did;

	public CustomerPK() {
	}
	
	public CustomerPK(Long wid, Long did, Long cid){
		setWid(wid);
		setDid(did);
		setCid(cid);
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
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

}
