package org.myfly.platform.system.tpcc.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.myfly.platform.core.domain.SchemaConstants;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.TableView;

/**
 * CREATE TABLE C_STOCK ( S_I_ID INT NOT NULL, S_W_ID INT NOT NULL, S_QUANTITY
 * INT NULL, S_DIST_01 CHAR (24) NULL, S_DIST_02 CHAR (24) NULL, S_DIST_03 CHAR
 * (24) NULL, S_DIST_04 CHAR (24) NULL, S_DIST_05 CHAR (24) NULL, S_DIST_06 CHAR
 * (24) NULL, S_DIST_07 CHAR (24) NULL, S_DIST_08 CHAR (24) NULL, S_DIST_09 CHAR
 * (24) NULL, S_DIST_10 CHAR (24) NULL, S_DATA VARCHAR (50) NULL , S_YTD INT
 * NULL, S_ORDER_CNT INT NULL, S_REMOTE_CNT INT NULL, CLUSTER PRIMARY
 * KEY(S_W_ID,S_I_ID))
 * 
 * @author xiangwanhong
 *
 */

@Table(schema = SchemaConstants.PT)
@Entity
@IdClass(StockPK.class)
@MetaDataView(tableView=@TableView(labelField="data"))
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Stock implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8813099454345381943L;

	@Id
	@Column(nullable = false)
	private Long wid;
	@Id
	@Column(nullable = false)
	private Long iid;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "wid", insertable = false, updatable = false, referencedColumnName = "wid")
	private Warehouse warehouse;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "iid", insertable = false, updatable = false, referencedColumnName = "iid")
	private Item item;

	@Column
	private Integer quantity;

	@Column(length = 24)
	private String dist01;

	@Column(length = 24)
	private String dist02;

	@Column(length = 24)
	private String dist03;

	@Column(length = 24)
	private String dist04;

	@Column(length = 24)
	private String dist05;

	@Column(length = 24)
	private String dist06;

	@Column(length = 24)
	private String dist07;

	@Column(length = 24)
	private String dist08;

	@Column(length = 24)
	private String dist09;

	@Column(length = 24)
	private String dist10;

	@Column(length = 50)
	private String data;

	@Column
	private Long ytd;

	@Column
	private Long orderCnt;

	@Column
	private Long remoteCnt;
	
	public Stock() {
	}
	
	public Stock(Warehouse warehouse, Item item) {
		setWid(warehouse.getWid());
		setIid(item.getIid());
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getDist01() {
		return dist01;
	}

	public void setDist01(String dist01) {
		this.dist01 = dist01;
	}

	public String getDist02() {
		return dist02;
	}

	public void setDist02(String dist02) {
		this.dist02 = dist02;
	}

	public String getDist03() {
		return dist03;
	}

	public void setDist03(String dist03) {
		this.dist03 = dist03;
	}

	public String getDist04() {
		return dist04;
	}

	public void setDist04(String dist04) {
		this.dist04 = dist04;
	}

	public String getDist05() {
		return dist05;
	}

	public void setDist05(String dist05) {
		this.dist05 = dist05;
	}

	public String getDist06() {
		return dist06;
	}

	public void setDist06(String dist06) {
		this.dist06 = dist06;
	}

	public String getDist07() {
		return dist07;
	}

	public void setDist07(String dist07) {
		this.dist07 = dist07;
	}

	public String getDist08() {
		return dist08;
	}

	public void setDist08(String dist08) {
		this.dist08 = dist08;
	}

	public String getDist09() {
		return dist09;
	}

	public void setDist09(String dist09) {
		this.dist09 = dist09;
	}

	public String getDist10() {
		return dist10;
	}

	public void setDist10(String dist10) {
		this.dist10 = dist10;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Long getYtd() {
		return ytd;
	}

	public void setYtd(Long ytd) {
		this.ytd = ytd;
	}

	public Long getOrderCnt() {
		return orderCnt;
	}

	public void setOrderCnt(Long orderCnt) {
		this.orderCnt = orderCnt;
	}

	public Long getRemoteCnt() {
		return remoteCnt;
	}

	public void setRemoteCnt(Long remoteCnt) {
		this.remoteCnt = remoteCnt;
	}

	public Long getWid() {
		return wid;
	}

	public void setWid(Long wid) {
		this.wid = wid;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public Long getIid() {
		return iid;
	}

	public void setIid(Long iid) {
		this.iid = iid;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
