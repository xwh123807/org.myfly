package org.myfly.platform.system.tpcc.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.myfly.platform.core.domain.SchemaConstants;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.TableView;

/**
 * CREATE TABLE C_ORDER ( O_ID INT NOT NULL, O_C_ID INT NULL, O_D_ID INT NOT
 * NULL, O_W_ID INT NOT NULL, O_ENTRY_D DATETIME DEFAULT NOW, O_CARRIER_ID INT
 * NULL, O_OL_CNT INT NULL, O_ALL_LOCAL INT NULL, CLUSTER PRIMARY
 * KEY(O_W_ID,O_D_ID,O_ID))
 * 
 * @author xiangwanhong
 *
 */
@Table(schema = SchemaConstants.PT)
@Entity
@IdClass(SOrderPK.class)
@MetaDataView(tableView = @TableView(labelField = "carrierId") )
public class SOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8664548728402659664L;
	@Id
	@Column(nullable = false)
	private Long wid;

	@Id
	@Column(nullable = false)
	private Long did;

	@Id
	@Column(nullable = false)
	private Long oid;

	@Column
	private Long cid;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumns({
			//
			@JoinColumn(name = "wid", insertable = false, updatable = false, referencedColumnName = "wid"),
			//
			@JoinColumn(name = "did", insertable = false, updatable = false, referencedColumnName = "did"),
			//
			@JoinColumn(name = "cid", insertable = false, updatable = false, referencedColumnName = "cid") })
	private Customer customer;

	@Column
	private Timestamp entryD;

	@Column
	private Long carrierId;

	@Column
	private Long olCnt;
	@Column
	private Long allLocal;

	@OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
	private Set<OrderLine> orderLines;

	public Timestamp getEntryD() {
		return entryD;
	}

	public void setEntryD(Timestamp entryD) {
		this.entryD = entryD;
	}

	public Long getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(Long carrierId) {
		this.carrierId = carrierId;
	}

	public Long getOlCnt() {
		return olCnt;
	}

	public void setOlCnt(Long olCnt) {
		this.olCnt = olCnt;
	}

	public Long getAllLocal() {
		return allLocal;
	}

	public void setAllLocal(Long allLocal) {
		this.allLocal = allLocal;
	}

	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
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

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Set<OrderLine> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(Set<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}
}
