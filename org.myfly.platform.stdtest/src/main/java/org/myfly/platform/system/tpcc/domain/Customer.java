package org.myfly.platform.system.tpcc.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
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

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.myfly.platform.core.domain.SchemaConstants;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.TableView;

/**
 * CREATE TABLE C_CUSTOMER ( C_ID INT NOT NULL, C_D_ID INT NOT NULL, C_W_ID INT
 * NOT NULL, C_FIRST VARCHAR (16) NULL, C_MIDDLE CHAR (2) NULL, C_LAST VARCHAR
 * (16) NULL, C_STREET_1 VARCHAR (20) NULL, C_STREET_2 VARCHAR (20) NULL, C_CITY
 * VARCHAR (20) NULL, C_STATE CHAR (2) NULL, C_ZIP CHAR (9) NULL, C_PHONE
 * VARCHAR (16) NULL, C_SINCE DATETIME NULL, C_CREDIT CHAR (2) NULL,
 * C_CREDIT_LIM DOUBLE NULL, C_DISCOUNT DOUBLE NULL, C_BALANCE DOUBLE NULL,
 * C_DATA VARCHAR (500) NULL, C_YTD_PAYMENT DOUBLE NULL, C_PAYMENT_CNT INT NULL,
 * C_DELIVERY_CNT INT NULL, CLUSTER PRIMARY KEY(C_W_ID,C_D_ID,C_ID))
 * 
 * @author xiangwanhong
 *
 */

@Table(schema=SchemaConstants.PT)
@Entity
@IdClass(CustomerPK.class)
@MetaDataView(tableView=@TableView(labelField="sfirst"))
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4794641178327884674L;
	@Id
	@Column(nullable = false)
	private Long wid;
	@Id
	@Column(nullable = false)
	private Long did;
	@Id
	@Column(nullable = false)
	private Long cid;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumns({
			//
			@JoinColumn(name = "wid", insertable = false, updatable = false, referencedColumnName = "wid"),
			//
			@JoinColumn(name = "did", insertable = false, updatable = false, referencedColumnName = "did") })
	private District district;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,  mappedBy="customer")
	private Set<SOrder> orders;

	@Column(length = 16)
	private String sfirst;
	@Column(length = 2)
	private String middle;
	@Column(length = 16)
	private String slast;
	@Column(length = 20)
	private String street1;
	@Column(length = 20)
	private String street2;
	@Column(length = 20)
	private String city;
	@Column(length = 2)
	private String state;
	@Column(length = 9)
	private String zip;
	@Column(length = 16)
	private String phone;
	@Column
	private Date since;
	@Column(length = 2)
	private String credit;
	@Column
	private Double creditLim;
	@Column
	private Double discount;
	@Column
	private Double balance;
	@Column(length = 500)
	private String data;
	@Column
	private Double ytdPayment;
	@Column
	private Long paymentCnt;
	@Column
	private Long deliveryCnt;

	public Customer() {
	}

	public Customer(District district) {
		setWid(district.getWid());
		setDid(district.getDid());
	}

	public String getMiddle() {
		return middle;
	}

	public void setMiddle(String middle) {
		this.middle = middle;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getSince() {
		return since;
	}

	public void setSince(Date since) {
		this.since = since;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public Double getCreditLim() {
		return creditLim;
	}

	public void setCreditLim(Double creditLim) {
		this.creditLim = creditLim;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Double getYtdPayment() {
		return ytdPayment;
	}

	public void setYtdPayment(Double ytdPayment) {
		this.ytdPayment = ytdPayment;
	}

	public Long getPaymentCnt() {
		return paymentCnt;
	}

	public void setPaymentCnt(Long paymentCnt) {
		this.paymentCnt = paymentCnt;
	}

	public Long getDeliveryCnt() {
		return deliveryCnt;
	}

	public void setDeliveryCnt(Long deliveryCnt) {
		this.deliveryCnt = deliveryCnt;
	}

	public String getSfirst() {
		return sfirst;
	}

	public void setSfirst(String sfirst) {
		this.sfirst = sfirst;
	}

	public String getSlast() {
		return slast;
	}

	public void setSlast(String slast) {
		this.slast = slast;
	}

	public District getDistrict() {
		return district;
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

	public void setDistrict(District district) {
		this.district = district;
	}

	public Set<SOrder> getOrders() {
		return orders;
	}

	public void setOrders(Set<SOrder> orders) {
		this.orders = orders;
	}

}
