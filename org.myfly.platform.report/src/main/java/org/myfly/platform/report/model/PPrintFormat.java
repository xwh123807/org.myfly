package org.myfly.platform.report.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.myfly.platform.core3.metadata.annotation.FlyField;
import org.myfly.platform.core3.metadata.annotation.FlyTable;
import org.myfly.platform.core3.model.data.PTable;
import org.myfly.platform.core3.model.dict.Element;

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
	@FlyField(name = "Print Color", description = "Color used for printing and display")
	@ManyToOne(fetch = FetchType.LAZY)
	private PPrintColor printColor;

	@FlyField(name = "Print Font", description = "Maintain Print Font", help = "Font used for printing")
	@ManyToOne(fetch = FetchType.LAZY)
	private PPrintFont printFont;

	@FlyField(name = "Print Paper", description = "Printer paper definition", help = "Printer Paper Size, Orientation and Margins")
	@ManyToOne(fetch = FetchType.LAZY)
	private PPrintPaper printPaper;

	@FlyField(name = "Print Table Format", description = "Table Format in Reports", help = "Print Table Format determines Fonts, Colors of  the printed Table")
	@ManyToOne(fetch = FetchType.LAZY)
	private PPrintTableFormat printTableFormat;

	@FlyField(name = "Report View", description = "View used to generate this report", help = "The Report View indicates the view used to generate this report.")
	@ManyToOne(fetch = FetchType.LAZY)
	private PReportView reportView;

	@ManyToOne(fetch = FetchType.LAZY)
	private PTable table;

	@FlyField(name = "Args")
	@Column(name = "Args", length = 510)
	private String args;

	@FlyField(name = "Classname", description = "Java Classname", help = "The Classname identifies the Java classname used by this report or process.")
	@Column(name = "Classname")
	private String classname;

	@FlyField(element = Element.CreateCopy)
	@Column(name = "CreateCopy")
	private String createCopy;

	@FlyField(element = Element.Description)
	@Column
	private String description;

	@FlyField(element = Element.FooterMargin)
	@Column
	private String footerMargin;

	@FlyField(element = Element.HeaderMargin)
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
	
	@FlyField(defaultValue="Y")
	@Column
	private Boolean isTableBased;
	
	
}
