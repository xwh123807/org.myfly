package org.myfly.platform.system.tpcc.domain;

import java.io.Serializable;
import java.sql.Timestamp;

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
 * CREATE TABLE C_ORDER_LINE ( OL_O_ID INT NOT NULL, OL_D_ID INT NOT NULL,
 * OL_W_ID INT NOT NULL, OL_NUMBER INT NOT NULL, OL_I_ID INT NULL,
 * OL_SUPPLY_W_ID INT NULL, OL_QUANTITY INT NULL, OL_AMOUNT DOUBLE NULL,
 * OL_DIST_INFO CHAR (24) NULL, OL_DELIVERY_D DATETIME NULL, CLUSTER PRIMARY
 * KEY(OL_W_ID,OL_D_ID,OL_O_ID,OL_NUMBER))
 * 
 * @author xiangwanhong
 *
 */
@Table(schema = SchemaConstants.PT)
@Entity
@IdClass(OrderLinePK.class)
public class OrderLine implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6194765811059843822L;
	@Id
	@Column(nullable = false)
	private Long wid;
	@Id
	@Column(nullable = false)
	private Long did;
	@Id
	@Column(nullable = false)
	private Long oid;
	@Id
	@Column(nullable = false)
	private Long number;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "wid", referencedColumnName = "wid", insertable = false, updatable = false),
			@JoinColumn(name = "did", referencedColumnName = "did", insertable = false, updatable = false),
			@JoinColumn(name = "oid", referencedColumnName = "oid", insertable = false, updatable = false) })
	private SOrder order;

	/**
	 * 商品ID
	 */
	@Column
	private Long iid;
	/**
	 * 商品所在Warehouse
	 */
	@Column
	private Long supplyWid;

	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "supplyWid", referencedColumnName = "wid", insertable = false, updatable = false),
			@JoinColumn(name = "iid", referencedColumnName = "iid", insertable = false, updatable = false) })
	private Stock stock;

	@Column
	private Long quantity;
	@Column
	private Double amount;
	@Column(length = 24)
	private String distInfo;
	@Column
	private Timestamp deliveryD;

	public OrderLine() {
	}

	public OrderLine(SOrder order, Stock stock) {
		setWid(order.getWid());
		setDid(order.getDid());
		setOid(order.getOid());
		setSupplyWid(stock.getWid());
		setIid(stock.getIid());
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getDistInfo() {
		return distInfo;
	}

	public void setDistInfo(String distInfo) {
		this.distInfo = distInfo;
	}

	public Timestamp getDeliveryD() {
		return deliveryD;
	}

	public void setDeliveryD(Timestamp deliveryD) {
		this.deliveryD = deliveryD;
	}

	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
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

	public Long getSupplyWid() {
		return supplyWid;
	}

	public void setSupplyWid(Long supplyWid) {
		this.supplyWid = supplyWid;
	}

	public SOrder getOrder() {
		return order;
	}

	public void setOrder(SOrder order) {
		this.order = order;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public Long getIid() {
		return iid;
	}

	public void setIid(Long iid) {
		this.iid = iid;
	}
}
