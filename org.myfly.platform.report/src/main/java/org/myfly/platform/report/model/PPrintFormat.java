package org.myfly.platform.report.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.myfly.platform.core3.metadata.annotation.FlyTable;
import org.myfly.platform.core3.model.data.PTable;

/**
 * 打印格式表<br>
 * 1、同AD_PrintFormat
 * 
 * @author xiangwanhong
 *
 */
@Entity
@Table(name = "PT_PrintFormat")
@FlyTable(name = "Print Format", description = "Data Print Format")
public class PPrintFormat {
	@ManyToOne(fetch = FetchType.LAZY)
	private PPrintColor printColor;

	@ManyToOne(fetch = FetchType.LAZY)
	private PPrintFont printFont;

	@ManyToOne(fetch = FetchType.LAZY)
	private PPrintPaper printPaper;

	@ManyToOne(fetch = FetchType.LAZY)
	private PPrintTableFormat printTableFormat;

	@ManyToOne(fetch = FetchType.LAZY)
	private PReportView reportView;

	@ManyToOne(fetch = FetchType.LAZY)
	private PTable table;

	@Column(name = "Args", length = 510)
	private String args;

	@Column(name = "Classname")
	private String classname;

	@Column(name = "CreateCopy")
	private String createCopy;

	@Column
	private String description;

	@Column
	private String footerMargin;

	@Column
	private String headerMargin;

	@Column
	private Boolean isDefault;

	@Column
	private Boolean isForm;

	@Column
	private Boolean isPrintParameters;

	@Column
	private Boolean isStandardHeaderFooter;

	@Column
	private Boolean isSummary;

	@Column
	private Boolean isTableBased;

}
