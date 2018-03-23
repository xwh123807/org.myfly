package org.myfly.apps.crm.domain;

import java.util.Date;

import javax.persistence.Column;

import org.myfly.platform.system.core.domain.SBaseEntity;
import org.myfly.platform.system.core.domain.SUser;
import org.myfly.platform.system.metadata.annotation.FieldView;

/**
 * 市场活动
 * 
 * 上次修改人 LastModifiedById 查找(用户) <br>
 * 业务机会总值 AmountAllOpportunities 币种(18, 0) <br>
 * 创建人 CreatedById 查找(用户) <br>
 * 发送数 NumberSent 数字(18, 0) <br>
 * 启用 IsActive 复选框 <br>
 * 响应总计 NumberOfResponses 数字(9, 0) <br>
 * 实际成本 ActualCost 币种(18, 0) <br>
 * 层次结构中的业务机会总值 HierarchyAmountAllOpportunities 币种(18, 0) <br>
 * 层次结构中的总响应数 HierarchyNumberOfResponses 数字(9, 0) <br>
 * 层次结构中的赢得客户业务机会总值 HierarchyAmountWonOpportunities 币种(18, 0) <br>
 * 已转换潜在客户 NumberOfConvertedLeads 数字(9, 0) <br>
 * 市场活动名称 Name 文本(80) <br>
 * 市场活动成员类型 CampaignMemberRecordTypeId 查找(记录类型) <br>
 * 市场活动所有人 OwnerId 查找(用户) <br>
 * 开始日期 StartDate 日期 <br>
 * 总业务机会数 NumberOfOpportunities 数字(9, 0) <br>
 * 总层次结构中的业务机会 HierarchyNumberOfOpportunities 数字(9, 0) <br>
 * 总层次结构中的发送数 HierarchyNumberSent 数字(18, 0) <br>
 * 总层次结构中的实际成本 HierarchyActualCost 币种(18, 0) <br>
 * 总层次结构中的潜在客户 HierarchyNumberOfLeads 数字(9, 0)<br>
 * 总层次结构中的联系人 HierarchyNumberOfContacts 数字(9, 0) <br>
 * 总层次结构中的预期收入 HierarchyExpectedRevenue 币种(18, 0) <br>
 * 总层次结构中的预算成本 HierarchyBudgetedCost 币种(18, 0) <br>
 * 总已转换层次结构中的潜在客户 HierarchyNumberOfConvertedLeads 数字(9, 0) <br>
 * 总赢得客户层次结构中的业务机会 HierarchyNumberOfWonOpportunities 数字(9, 0) <br>
 * 描述 Description 长文本区(32000) <br>
 * 潜在客户总计 NumberOfLeads 数字(9, 0) <br>
 * 父级市场活动 ParentId 查找(市场活动) <br>
 * 状态 Status 选项列表 <br>
 * 显示更多信息<br>
 * 类型 Type 选项列表 <br>
 * 显示更多信息<br>
 * 结束日期 EndDate 日期 <br>
 * 联系人总计 NumberOfContacts 数字(9, 0) <br>
 * 赢得客户业务机会总值 AmountWonOpportunities 币种(18, 0) <br>
 * 赢得客户业务机会数 NumberOfWonOpportunities 数字(9, 0) <br>
 * 预期响应百分比 ExpectedResponse 百分比(8, 2) <br>
 * 预期收入 ExpectedRevenue 币种(18, 0) <br>
 * 预算成本 BudgetedCost 币种(18, 0)<br>
 * 
 * @author xiangwanhong
 *
 */
public class Campaign extends SBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8742686734491383849L;
	@FieldView(title = "业务机会总值")
	@Column
	private Long amountAllOpportunities;
	@FieldView(title = "发送数")
	@Column
	private Long numberSent;
	@FieldView(title = "响应总计")
	@Column
	private Long numberOfResponses;
	@FieldView(title = "实际成本")
	@Column
	private Long actualCost;
	@FieldView(title = "层次结构中的业务机会总值")
	@Column
	private Long hierarchyAmountAllOpportunities;
	@FieldView(title = "层次结构中的总响应数")
	@Column
	private Long hierarchyNumberOfResponses;

	@FieldView(title = "层次结构中的赢得客户业务机会总值")
	@Column
	private Long hierarchyAmountWonOpportunities;
	@FieldView(title = "已转换潜在客户")
	@Column
	private Long numberOfConvertedLeads;
	@FieldView(title = "市场活动成员类型")
	@Column
	private String campaignMemberRecordTypeId;
	@FieldView(title = "市场活动所有人")
	@Column
	private SUser owner;
	@FieldView(title = "开始日期")
	@Column
	private Date startDate;
	@FieldView(title = "总业务机会数")
	@Column
	private Long numberOfOpportunities;
	@FieldView(title = "总层次结构中的业务机会")
	@Column
	private Long hierarchyNumberOfOpportunities;
	@FieldView(title = "总层次结构中的发送数")
	@Column
	private Long hierarchyNumberSent;
	@FieldView(title = "总层次结构中的实际成本")
	@Column
	private Long hierarchyActualCost;
	@FieldView(title = "总层次结构中的潜在客户")
	@Column
	private Long hierarchyNumberOfLeads;
	@FieldView(title = "总层次结构中的联系人")
	@Column
	private Long hierarchyNumberOfContacts;
	@FieldView(title = "总层次结构中的预期收入")
	@Column
	private Long hierarchyExpectedRevenue;
	@FieldView(title = "总层次结构中的预算成本")
	@Column
	private Long hierarchyBudgetedCost;
}
