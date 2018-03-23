package org.myfly.apps.crm.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.myfly.platform.system.core.domain.EnumValue;
import org.myfly.platform.system.core.domain.SBaseEntity;
import org.myfly.platform.system.core.domain.SUser;
import org.myfly.platform.system.metadata.annotation.FieldView;

/**
 * 业务机会
 * 
 * Budget Confirmed Budget_Confirmed__c 复选框 <br>
 * 显示更多信息<br>
 * Discovery Completed Discovery_Completed__c 复选框 <br>
 * 显示更多信息<br>
 * Loss Reason Loss_Reason__c 选项列表 <br>
 * 显示更多信息<br>
 * ROI Analysis Completed ROI_Analysis_Completed__c 复选框 <br>
 * 显示更多信息<br>
 * 上次修改人 LastModifiedById 查找(用户) <br>
 * 下一步 NextStep 文本(255) <br>
 * 专用 IsPrivate 复选框 <br>
 * 业务机会名称 Name 文本(120)<br>
 * 业务机会所有人 OwnerId 查找(用户) <br>
 * 主要市场活动源 CampaignId 查找(市场活动) <br>
 * 价格手册 Pricebook2Id 查找(价格手册) <br>
 * 创建人 CreatedById 查找(用户) <br>
 * 可能性 (%) Probability 百分比(3, 0) <br>
 * 合同 ContractId 查找(合同) <br>
 * 同步的报价 SyncedQuoteId 查找(报价)<br>
 * 客户名 AccountId 查找(客户) <br>
 * 描述 Description 长文本区(32000) <br>
 * 数量 TotalOpportunityQuantity 数字(16, 2) <br>
 * 潜在客户来源 LeadSource 选项列表 <br>
 * 显示更多信息<br>
 * 类型 Type 选项列表<br>
 * 结束日期 CloseDate 日期 <br>
 * 金额 Amount 币种(16, 2) <br>
 * 阶段 StageName 选项列表 <br>
 * 显示更多信息<br>
 * 预期收入 ExpectedRevenue 币种(16, 2) <br>
 * 预测类别 ForecastCategoryName 选项列表<br>
 * 
 * @author xiangwanhong
 *
 */
public class Opportunity extends SBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9130537894467185819L;
	@FieldView(title = "下一步")
	@Column
	private String nextStep;
	@FieldView(title = "专用")
	@Column
	private Boolean isPrivate;
	@FieldView(title = "业务机会所有人")
	@Column
	private SUser owner;
	@FieldView(title = "主要市场活动源")
	@Column
	private Campaign campaign;
	@FieldView(title = "价格手册")
	@Column
	private Pricebook pricebook;
	@FieldView(title = "可能性")
	@Column
	private Long probability;
	@FieldView(title = "合同")
	@JoinColumn
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	private Contract contract;
	@FieldView(title = "同步的报价")
	@Column
	private SyncedQuote syncedQuote;
	@FieldView(title = "客户名")
	@Column
	private Account account;
	@FieldView(title = "描述")
	@Column
	private String description;
	@FieldView(title = "数量")
	@Column
	private Double totalOpportunityQuantity;
	@FieldView(title = "潜在客户来源")
	@Column
	private EnumValue leadSource;
	@FieldView(title = "类型")
	@Column
	private EnumValue type;
	@FieldView(title = "结束日期")
	@Column
	private Date closeDate;
	@FieldView(title = "金额")
	@Column
	private Double amount;
	@FieldView(title = "阶段")
	@Column
	private EnumValue stageName;
	@FieldView(title = "预期收入")
	@Column
	private Double expectedRevenue;
	@FieldView(title = "预测类别")
	@Column
	private EnumValue forecastCategoryName;
}
