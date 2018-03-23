package org.myfly.platform.system.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.myfly.platform.core.domain.DataImportState;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.domain.SBaseEntity;
import org.myfly.platform.core.domain.SchemaConstants;
import org.myfly.platform.core.metadata.annotation.FieldView;
import org.myfly.platform.core.metadata.annotation.FilterView;
import org.myfly.platform.core.metadata.annotation.ListView;
import org.myfly.platform.core.metadata.annotation.MetaDataView;
import org.myfly.platform.core.metadata.annotation.TableView;
import org.myfly.platform.core.metadata.define.SQLOperator;

/**
 * 数据导入日志
 * 
 * @author xiangwanhong
 *
 */
@Table(schema = SchemaConstants.PB)
@MetaDataView(tableView =
//
@TableView(title = "数据导入日志", description = "查看数据导入操作历史") ,
//
listViews = @ListView(name = "default", title = "数据导入日志", fields = { "actionUrl", "created", "createdBy", "importFile",
		"state", "totalCount", "usedtime", "successCount", "faultCount",
		"message" }, enableActions = false, serverSideMode = false, filters = {
				@FilterView(field = "actionUrl", operator = SQLOperator.LIKE),
				@FilterView(field = "createdBy", operator = SQLOperator.EQUAL),
				@FilterView(field = "groupUid", operator = SQLOperator.EQUAL, show = false) }) )
@Entity
public class DataImportLog extends SBaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5560762511595712034L;
	/**
	 * 导入操作URL
	 */
	@FieldView(title = "操作地址")
	@Column
	private String actionUrl;
	/**
	 * 总记录数
	 */
	@Column
	@FieldView(title = "总记录数")
	private Integer totalCount;
	/**
	 * 成功记录数
	 */
	@Column
	@FieldView(title = "成功记录数")
	private Integer successCount;
	/**
	 * 失败记录数
	 */
	@FieldView(title = "失败记录数")
	@Column
	private Integer faultCount;
	/**
	 * 耗时
	 */
	@FieldView(title = "耗时")
	@Column
	private Integer usedtime;
	/**
	 * 导入文件名
	 */
	@FieldView(title = "导入文件名")
	@Column
	private String importFile;

	/**
	 * 错误数据文件名
	 */
	@FieldView(title = "错误数据")
	@Column
	private String errorFile;
	/**
	 * 状态
	 */
	@FieldView(title = "状态")
	@Enumerated(EnumType.STRING)
	@Column
	private DataImportState state;
	/**
	 * 信息
	 */
	@FieldView(title = "信息")
	@Column
	private String message;
	/**
	 * 批操作标示
	 */
	@FieldView(title = "批操作", dataType = FieldDataType.UUID)
	@Column(length = 32)
	private String groupUid;

	public String getActionUrl() {
		return actionUrl;
	}

	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getUsedtime() {
		return usedtime;
	}

	public void setUsedtime(Integer usedtime) {
		this.usedtime = usedtime;
	}

	public String getImportFile() {
		return importFile;
	}

	public void setImportFile(String importFile) {
		this.importFile = importFile;
	}

	public String getErrorFile() {
		return errorFile;
	}

	public void setErrorFile(String errorFile) {
		this.errorFile = errorFile;
	}

	public DataImportState getState() {
		return state;
	}

	public void setState(DataImportState state) {
		this.state = state;
	}

	public Integer getSuccessCount() {
		return successCount;
	}

	public void setSuccessCount(Integer successCount) {
		this.successCount = successCount;
	}

	public Integer getFaultCount() {
		return faultCount;
	}

	public void setFaultCount(Integer faultCount) {
		this.faultCount = faultCount;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getGroupUid() {
		return groupUid;
	}

	public void setGroupUid(String groupUid) {
		this.groupUid = groupUid;
	}

}
