package org.myfly.platform.tools.codebuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.myfly.platform.core.utils.JaxbUtil;

@XmlRootElement(name = "adempiereTrl")
@XmlAccessorType(XmlAccessType.FIELD)
public class ADEmpiereTrl {
	@XmlAttribute
	private String language;
	@XmlAttribute
	private String table;
	@XmlElement(name = "row")
	private List<ADEmpiereTrlRow> rows;
	@XmlTransient
	private Map<String, ADEmpiereTrlRow> rowMap;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	public List<ADEmpiereTrlRow> getRows() {
		return rows;
	}

	public void setRows(List<ADEmpiereTrlRow> rows) {
		this.rows = rows;
	}

	public Map<String, ADEmpiereTrlRow> getRowMap() {
		return rowMap;
	}

	public void setRowMap(Map<String, ADEmpiereTrlRow> rowMap) {
		this.rowMap = rowMap;
	}

	public void index() {
		setRowMap(new HashMap<>());
		rows.forEach(item -> {
			getRowMap().put(item.getId(), item);
		});
	}

	public static void main(String args[]) {
		ADEmpiereTrl trl = new ADEmpiereTrl();
		trl.setLanguage("zh_CN");
		trl.setTable("AD_Element");
		List<ADEmpiereTrlRow> rows = new ArrayList<>();
		ADEmpiereTrlRow row = new ADEmpiereTrlRow();
		row.setId("101");
		row.setTrl("Y");
		List<ADEmpiereTrlValue> values = new ArrayList<>();
		ADEmpiereTrlValue value1 = new ADEmpiereTrlValue();
		value1.setColumn("Name");
		value1.setOriginal("Attachment");
		value1.setValue("附件");
		values.add(value1);
		ADEmpiereTrlValue value2 = new ADEmpiereTrlValue();
		value2.setColumn("Name");
		value2.setOriginal("Attachment");
		value2.setValue("附件");
		values.add(value2);
		row.setValues(values);
		rows.add(row);
		ADEmpiereTrlRow row2 = new ADEmpiereTrlRow();
		row2.setId("101");
		row2.setTrl("Y");
		rows.add(row2);
		trl.setRows(rows);
		trl.index();
		System.out.println(JaxbUtil.toXml(trl));
		System.out.println("-------------------------");
		String xml = JaxbUtil.toXml(trl);
		ADEmpiereTrl trl2 = JaxbUtil.fromXml(xml, ADEmpiereTrl.class);
		System.out.println(JaxbUtil.toXml(trl2));
	}
}
