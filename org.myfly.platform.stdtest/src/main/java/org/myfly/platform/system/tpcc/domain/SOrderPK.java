package org.myfly.platform.system.tpcc.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SOrderPK implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7560813431478491948L;

	@Column(nullable = false)
	private Long wid;
	
	@Column(nullable = false)
	private Long did;
	
	@Column(nullable = false)
	private Long oid;
	
	public SOrderPK() {
	}
	
	public SOrderPK(Long wid, Long did, Long oid) {
		setWid(wid);
		setDid(did);
		setOid(oid);
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

	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
