package org.myfly.platform.system.tpcc.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.myfly.platform.core.domain.SchemaConstants;

/**
 * 
 * CREATE TABLE C_WAREHOUSE ( W_ID INT NOT NULL, W_NAME VARCHAR (10) NULL,
 * W_STREET_1 VARCHAR (20) NULL, W_STREET_2 VARCHAR (20) NULL, W_CITY VARCHAR
 * (20) NULL, W_STATE CHAR (2) NULL, W_ZIP CHAR (9) NULL, W_TAX DOUBLE NULL,
 * W_YTD DOUBLE NULL, CLUSTER PRIMARY KEY(W_ID))
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(schema = SchemaConstants.PT)
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Warehouse implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5630420793886258002L;
	@Id
	@Column(unique=true)
	private Long wid;
	
	@Column(length=10)
	private String name;
	
	@Column(length=20)
	private String street1;
	
	@Column(length=20)
	private String street2;
	
	@Column(length=20)
	private String city;
	
	@Column(length=2)
	private String state;
	
	@Column(length=9)
	private String zip;
	
	@Column
	private Double tax;
	
	@Column
	private Double ytd;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="warehouse")
	private Set<District> districts;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="warehouse")
	private Set<Stock> stocks;

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

	public Long getWid() {
		return wid;
	}

	public void setWid(Long wid) {
		this.wid = wid;
	}

	public Set<District> getDistricts() {
		return districts;
	}

	public void setDistricts(Set<District> districts) {
		this.districts = districts;
	}

	public Set<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(Set<Stock> stocks) {
		this.stocks = stocks;
	}
}
