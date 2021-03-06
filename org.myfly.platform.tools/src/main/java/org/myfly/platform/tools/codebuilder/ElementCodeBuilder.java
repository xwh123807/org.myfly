package org.myfly.platform.tools.codebuilder;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

@Service
public class ElementCodeBuilder extends AbstractCodeBuilder<ADElement> {
	/**
	 * 只包含指定表的Element
	 */
	private String[] tables;

	@Override
	public void parareData() {
		if (ArrayUtils.isNotEmpty(getTables())) {
			setSources(getRepository().getElementsByTables(getTables()));
		} else {
			setSources(getRepository().getElements());
		}
		prepareLanguage("AD_Element");
		mergeLanguages(getSources(), "ad_element_id");
	}

	@Override
	public void validate() {
		super.validate();
		Assert.hasLength(getPackageName(), "属性packageName不能为空");
	}

	@Override
	public void generateCodes() {
		validate();
		StringBuffer buffer = new StringBuffer();
		buffer.append("package " + getPackageName() + ";").append("\n");
		buffer.append("\n");
		buffer.append("import org.myfly.platform.core.domain.FlyDataType;").append("\n");
		buffer.append("import org.myfly.platform.core.datamodel.annotation.FlyElement;").append("\n");
		buffer.append("\n");
		buffer.append("public enum " + getClassNameWithLanguage() + "{").append("\n");
		getSources().forEach(item -> {
			buffer.append("\t").append("//").append("\n");
			buffer.append("\t").append("@FlyElement(");
			buffer.append("columnName=\"" + Util.toFieldName(item.getColumnName()) + "\"");
			buffer.append(", name=\"" + convertStr(item.getName()) + "\"");
			if (StringUtils.hasLength(item.getDescription())) {
				buffer.append(", description=\"" + convertStr(item.getDescription()) + "\"");
			}
			if (StringUtils.hasLength(item.getHelp())) {
				buffer.append(", help=\"" + convertStr(item.getHelp()) + "\"");
			}
			buffer.append(", dataType=FlyDataType." + item.getDataType().name());
			if (StringUtils.hasLength(item.getEntityType())) {
				buffer.append(", entityType=\"" + item.getEntityType() + "\"");
			}
			if (StringUtils.hasLength(item.getPrintName())) {
				buffer.append(", printName=\"" + item.getPrintName() + "\"");
			}
			buffer.append(", fieldLength=" + item.getFieldLength());
			buffer.append(")").append("\n");
			buffer.append("\t").append(item.getApiName()).append(",").append("\n");
		});
		buffer.append("}");
		System.out.println(buffer.toString());

		toFile(getPackageName(), getClassNameWithLanguage(), buffer);
	}

	public String[] getTables() {
		return tables;
	}

	public void setTables(String[] tables) {
		this.tables = tables;
	}
}
