package org.myfly.platform.tools.codebuilder;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "row")
@XmlAccessorType(XmlAccessType.FIELD)
public class ADEmpiereTrlRow {
	@XmlAttribute
	private String id;
	@XmlAttribute
	private String trl;
	@XmlElement(name = "value")
	private List<ADEmpiereTrlValue> values;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTrl() {
		return trl;
	}

	public void setTrl(String trl) {
		this.trl = trl;
	}

	public List<ADEmpiereTrlValue> getValues() {
		return values;
	}

	public void setValues(List<ADEmpiereTrlValue> values) {
		this.values = values;
	}
}
