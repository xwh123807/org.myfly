package org.myfly.apps.crm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.myfly.platform.system.core.domain.SBaseEntity;
import org.myfly.platform.system.core.domain.SchemaConstants;
import org.myfly.platform.system.metadata.annotation.FieldView;
import org.myfly.platform.system.metadata.annotation.FlyEnum;
import org.myfly.platform.system.metadata.annotation.FlySearchRelation;

/**
 * 客户
 * 
 * D-U-N-S 编号 DunsNumber 文本(9) <br>
 * Data.com 密钥 Jigsaw 文本(20) <br>
 * NAICS 代码 NaicsCode 文本(8) <br>
 * NAICS 描述 NaicsDesc 文本(120) <br>
 * SIC 代码 Sic 文本(20) <br>
 * SIC 描述 SicDesc 文本(80) <br>
 * 上次修改人 LastModifiedById 查找(用户) <br>
 * 传真 Fax 传真 <br>
 * 公司股票代码 TickerSymbol 内容(20) <br>
 * 分级 Rating 选项列表 <br>
 * 显示更多信息<br>
 * 创建人 CreatedById 查找(用户) <br>
 * 发货地址 ShippingAddress 地址 <br>
 * 员工 NumberOfEmployees 数字(8, 0)<br>
 * 客户名 Name 名称 <br>
 * 客户所有人 OwnerId 查找(用户)<br>
 * 客户来源 AccountSource 选项列表<br>
 * 显示更多信息<br>
 * 客户站点 Site 文本(80) <br>
 * 客户编号 AccountNumber 文本(40) <br>
 * 年收入 AnnualRevenue 币种(18, 0) <br>
 * 开单地址 BillingAddress 地址<br>
 * 开始年 YearStarted 文本(4) <br>
 * 所有权 Ownership 选项列表 <br>
 * 显示更多信息<br>
 * 描述 Description 长文本区(32000) <br>
 * 母公司 ParentId 层次结构 <br>
 * 电话 Phone 电话 <br>
 * 类型 Type 选项列表 <br>
 * 显示更多信息<br>
 * 网址 Website URL(255) <br>
 * 行业 Industry 选项列表 <br>
 * 显示更多信息<br>
 * 贸易方式 Tradestyle 文本(255)<br>
 * 
 * @author xiangwanhong
 *
 */
@Table(schema = SchemaConstants.CRM)
@Entity
public class Account extends SBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3929675905674337458L;

	@FieldView(title = "编号")
	@Column
	private String dunsNumber;
	@FieldView(title = "代码")
	@Column
	private String naicsCode;
	@FieldView(title = "描述")
	@Column
	private String naicsDesc;
	@FieldView(title = "代码")
	@Column
	private String sic;
	@FieldView(title = "描述")
	@Column
	private String sicDesc;
	@FieldView(title = "传真")
	@Column
	private String fax;
	@FieldView(title = "公司股票代码")
	@Column
	private String tickerSymbol;
	@FieldView(title = "分级")
	@Column
	@FlyEnum()
	private String rating;
	@FieldView(title = "发货地址")
	@Column
	private String shippingAddress;

	@FieldView(title = "员工")
	@Column
	private Long numberOfEmployees;
	@FieldView(title = "客户所有人")
	@Column
	@FlySearchRelation(entityNames="SUser")
	private String ownerId;
	@FieldView(title = "客户来源")
	@Column
	@FlyEnum()
	private String accountSource;
	@FieldView(title = "客户站点")
	@Column
	private String site;
	@FieldView(title = "客户编号")
	@Column
	private String accountNumber;
	@FieldView(title = "年收入")
	@Column
	private Long annualRevenue;
	@FieldView(title = "开单地址")
	@Column
	private String billingAddress;

	@FieldView(title = "开始年")
	@Column(length=4)
	private String yearStarted;
	@FieldView(title = "所有权")
	@Column
	@FlyEnum()
	private String ownership;
	@FieldView(title = "描述")
	@Column
	private String description;
	@FieldView(title = "母公司")
	@Column
	private Account parent;
	@FieldView(title = "电话")
	@Column
	private String phone;
	@FieldView(title = "类型")
	@Column
	@FlyEnum()
	private String type;
	@FieldView(title = "网址")
	@Column
	private String website;
	@FieldView(title = "行业")
	@Column
	@FlyEnum()
	private String industry;
	@FieldView(title = "贸易方式")
	@Column
	private String tradestyle;
	public String getDunsNumber() {
		return dunsNumber;
	}
	public void setDunsNumber(String dunsNumber) {
		this.dunsNumber = dunsNumber;
	}
	public String getNaicsCode() {
		return naicsCode;
	}
	public void setNaicsCode(String naicsCode) {
		this.naicsCode = naicsCode;
	}
	public String getNaicsDesc() {
		return naicsDesc;
	}
	public void setNaicsDesc(String naicsDesc) {
		this.naicsDesc = naicsDesc;
	}
	public String getSic() {
		return sic;
	}
	public void setSic(String sic) {
		this.sic = sic;
	}
	public String getSicDesc() {
		return sicDesc;
	}
	public void setSicDesc(String sicDesc) {
		this.sicDesc = sicDesc;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getTickerSymbol() {
		return tickerSymbol;
	}
	public void setTickerSymbol(String tickerSymbol) {
		this.tickerSymbol = tickerSymbol;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public Long getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(Long numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	public String getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	public String getAccountSource() {
		return accountSource;
	}
	public void setAccountSource(String accountSource) {
		this.accountSource = accountSource;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Long getAnnualRevenue() {
		return annualRevenue;
	}
	public void setAnnualRevenue(Long annualRevenue) {
		this.annualRevenue = annualRevenue;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getYearStarted() {
		return yearStarted;
	}
	public void setYearStarted(String yearStarted) {
		this.yearStarted = yearStarted;
	}
	public String getOwnership() {
		return ownership;
	}
	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Account getParent() {
		return parent;
	}
	public void setParent(Account parent) {
		this.parent = parent;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getTradestyle() {
		return tradestyle;
	}
	public void setTradestyle(String tradestyle) {
		this.tradestyle = tradestyle;
	}
}
