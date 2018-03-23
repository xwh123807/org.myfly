package org.myfly.platform.system.tpcc.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.myfly.platform.core.domain.SKeyEntity;
import org.myfly.platform.core.domain.SchemaConstants;
import org.myfly.platform.core.utils.UUIDUtil;

/**
 * CREATE TABLE C_HISTORY ( H_C_ID INT NULL, H_C_D_ID INT NULL, H_C_W_ID INT
 * NULL, H_D_ID INT NULL, H_W_ID INT NULL, H_DATE DATETIME DEFAULT NOW, H_AMOUNT
 * DOUBLE NULL, H_DATA VARCHAR (24) NULL )
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(schema = SchemaConstants.PT)
public class History extends SKeyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8504470747607202419L;

	@Column
	private Long cid;
	@Column
	private Long cDid;
	@Column
	private Long cWid;
	@Column
	private Long did;
	@Column
	private Long dWid;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumns({
			//
			@JoinColumn(name = "cWid", insertable = false, updatable = false, referencedColumnName = "wid"),
			//
			@JoinColumn(name = "cDid", insertable = false, updatable = false, referencedColumnName = "did"),
			//
			@JoinColumn(name = "cid", insertable = false, updatable = false, referencedColumnName = "cid"), })
	private Customer customer;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumns({
			//
			@JoinColumn(name = "dWid", insertable = false, updatable = false, referencedColumnName = "wid"),
			//
			@JoinColumn(name = "did", insertable = false, updatable = false, referencedColumnName = "did") })
	private District district;

	@Column
	private Timestamp date;
	@Column
	private Double amount;
	@Column(length = 24)
	private String data;
	
	public History() {
	}
	
	public History(Customer customer, District district) {
		setUid(UUIDUtil.newUUID());
		setcWid(customer.getWid());
		setcDid(customer.getDid());
		setCid(customer.getCid());
		setdWid(district.getWid());
		setDid(district.getDid());
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Long getcDid() {
		return cDid;
	}

	public void setcDid(Long cDid) {
		this.cDid = cDid;
	}

	public Long getcWid() {
		return cWid;
	}

	public void setcWid(Long cWid) {
		this.cWid = cWid;
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

	public Long getdWid() {
		return dWid;
	}

	public void setdWid(Long dWid) {
		this.dWid = dWid;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

}
