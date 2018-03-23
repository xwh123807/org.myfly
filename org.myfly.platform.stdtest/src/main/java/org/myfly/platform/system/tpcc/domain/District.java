package org.myfly.platform.system.tpcc.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.myfly.platform.core.domain.SchemaConstants;

/**
 * CREATE TABLE C_DISTRICT ( D_ID INT NOT NULL, D_W_ID INT NOT NULL, D_NAME
 * VARCHAR (10) NULL, D_STREET_1 VARCHAR (20) NULL, D_STREET_2 VARCHAR (20)
 * NULL, D_CITY VARCHAR (20) NULL, D_STATE CHAR (2) NULL, D_ZIP CHAR (9) NULL,
 * D_TAX DOUBLE NULL, D_YTD DOUBLE NULL, D_NEXT_O_ID INT NULL, CLUSTER PRIMARY
 * KEY(D_W_ID,D_ID))
 * 
 * @author xiangwanhong
 *
 */

@Table(schema = SchemaConstants.PT)
@Entity
@IdClass(DistrictPK.class)
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class District implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 665469669948036919L;

	@Id
	@Column(nullable = false)
	private Long wid;

	@Id
	@Column(nullable = false)
	private Long did;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "wid", referencedColumnName = "wid", insertable = false, updatable = false)
	private Warehouse warehouse;

	@Column(length = 10)
	private String name;

	@Column(length = 20)
	private String street1;

	@Column(length = 20)
	private String street2;

	@Column(length = 2)
	private String state;

	@Column(length = 9)
	private String zip;

	@Column
	private Double tax;

	@Column
	private Double ytd;

	@Column
	private Long parent;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "district")
	private Set<Customer> customers;

	public District() {
	}

	public District(Warehouse warehouse) {
		setWid(warehouse.getWid());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getYtd() {
		return ytd;
	}

	public void setYtd(Double ytd) {
		this.ytd = ytd;
	}

	public Long getParent() {
		return parent;
	}

	public void setParent(Long parent) {
		this.parent = parent;
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

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
		setWid(warehouse.getWid());
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

}
