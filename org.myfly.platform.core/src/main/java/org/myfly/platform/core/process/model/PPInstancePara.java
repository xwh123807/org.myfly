package org.myfly.platform.core.process.model;

import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.myfly.platform.core.datamodel.annotation.FlyTable;
import org.myfly.platform.core.domain.FlyEntity;

@Entity
@Table(name = "PT_PInstance_Para")
@FlyTable(name = "AD_PInstance_Para", description = "", help = "")
public class PPInstancePara extends FlyEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7673517893576997665L;
	@Id
	@Column(length = 32)
	private String uid;
	@Column
	private BigDecimal pNumberTo;

	@Column(length = 32)
	private String seqNo;

	@Column
	private Timestamp pDate;

	@Column(length = 60)
	private String infoTo;

	@Column(length = 60)
	private String info;

	@Column(length = 255)
	private String pString;

	@Column
	private BigDecimal pNumber;

	@Column(length = 32)
	private String pinstanceID;

	@Column
	private Timestamp pDateTo;

	@Column(length = 255)
	private String pStringTo;

	@Column(length = 60)
	private String parameterName;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public BigDecimal getpNumberTo() {
		return pNumberTo;
	}

	public void setpNumberTo(BigDecimal pNumberTo) {
		this.pNumberTo = pNumberTo;
	}

	public String getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}

	public Timestamp getpDate() {
		return pDate;
	}

	public void setpDate(Timestamp pDate) {
		this.pDate = pDate;
	}

	public String getInfoTo() {
		return infoTo;
	}

	public void setInfoTo(String infoTo) {
		this.infoTo = infoTo;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getpString() {
		return pString;
	}

	public void setpString(String pString) {
		this.pString = pString;
	}

	public BigDecimal getpNumber() {
		return pNumber;
	}

	public void setpNumber(BigDecimal pNumber) {
		this.pNumber = pNumber;
	}

	public String getPinstanceID() {
		return pinstanceID;
	}

	public void setPinstanceID(String pinstanceID) {
		this.pinstanceID = pinstanceID;
	}

	public Timestamp getpDateTo() {
		return pDateTo;
	}

	public void setpDateTo(Timestamp pDateTo) {
		this.pDateTo = pDateTo;
	}

	public String getpStringTo() {
		return pStringTo;
	}

	public void setpStringTo(String pStringTo) {
		this.pStringTo = pStringTo;
	}

	public String getParameterName() {
		return parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}
}
