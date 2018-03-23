package org.myfly.platform.system.tpcc.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.myfly.platform.core.domain.SchemaConstants;

/**
 * CREATE TABLE C_NEW_ORDER( NO_O_ID INT NOT NULL, NO_D_ID INT NOT NULL, NO_W_ID
 * INT NOT NULL, CLUSTER PRIMARY KEY(NO_W_ID,NO_D_ID,NO_O_ID))
 * 
 * @author xiangwanhong
 *
 */
@Table(schema = SchemaConstants.PT)
@Entity
@IdClass(NewOrderPK.class)
public class NewOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4284174450195324128L;
	@Id
	@Column(nullable = false)
	private Long wid;

	@Id
	@Column(nullable = false)
	private Long did;

	@Id
	@Column(nullable = false)
	private Long oid;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "wid", referencedColumnName = "wid", insertable = false, updatable = false),
			@JoinColumn(name = "did", referencedColumnName = "did", insertable = false, updatable = false),
			@JoinColumn(name = "oid", referencedColumnName = "oid", insertable = false, updatable = false) })
	private SOrder order;

	public NewOrder() {
	}

	public NewOrder(SOrder order) {
		setWid(order.getWid());
		setDid(order.getDid());
		setOid(order.getOid());
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

	public SOrder getOrder() {
		return order;
	}

	public void setOrder(SOrder order) {
		this.order = order;
	}
}
