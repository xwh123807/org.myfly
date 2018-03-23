package org.myfly.platform.system.tpcc.domain;

import java.io.Serializable;

public class StockPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1584300863490607353L;
	private Long wid;
	private Long iid;

	public StockPK() {
	}

	public StockPK(Long wid, Long iid) {
		setWid(wid);
		setIid(iid);
	}

	public Long getWid() {
		return wid;
	}

	public void setWid(Long wid) {
		this.wid = wid;
	}

	public Long getIid() {
		return iid;
	}

	public void setIid(Long iid) {
		this.iid = iid;
	}

}
