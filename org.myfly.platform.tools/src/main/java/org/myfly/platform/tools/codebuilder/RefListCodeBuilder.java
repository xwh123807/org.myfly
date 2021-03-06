package org.myfly.platform.tools.codebuilder;

import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class RefListCodeBuilder extends AbstractCodeBuilder<ADReference> {
	/**
	 * 只包含指定表的Element
	 */
	private String[] tables;

	@Override
	public void parareData() {
		List<ADReference> refs = ArrayUtils.isNotEmpty(getTables())
				? getRepository().getReferencesByListWithTables(getTables())
				: getRepository().getReferencesByList();
		refs.forEach(item -> {
			item.setApiName(item.getName());
		});
		prepareLanguage("AD_Reference");
		mergeLanguages(refs, "ad_reference_id");
		prepareLanguage("AD_Ref_List");
		refs.forEach(item -> {
			List<ADRefList> refList = getRepository().getRefLists(item.getReferenceID());
			mergeLanguages(refList, "ad_ref_list_id");
			item.setRefLists(refList);
		});
		setSources(refs);
	}

	@Override
	public void generateCodes() {
		validate();
		StringBuffer buffer = new StringBuffer();
		buffer.append("package " + getPackageName() + ";").append("\n");
		buffer.append("\n");
		buffer.append("import org.myfly.platform.core.datamodel.annotation.FlyRefItem;").append("\n");
		buffer.append("import org.myfly.platform.core.datamodel.annotation.FlyRefList;").append("\n");
		buffer.append("\n");
		buffer.append("public enum " + getClassNameWithLanguage() + " {").append("\n");
		getSources().forEach(item -> {
			buffer.append("\t").append("//").append("\n");
			buffer.append("\t").append("@FlyRefList(");
			buffer.append("name=\"" + convertStr(item.getName()) + "\"");
			if (StringUtils.hasLength(item.getDescription())) {
				buffer.append(", description=\"" + convertStr(item.getDescription()) + "\"");
			}
			if (StringUtils.hasLength(item.getHelp())) {
				buffer.append(", help=\"" + convertStr(item.getHelp()) + "\"");
			}
			buffer.append(", items={").append("\n");
			item.getRefLists().forEach(refItem -> {
				buffer.append("\t").append("@FlyRefItem(");
				buffer.append("name=\"").append(refItem.getName()).append("\"");
				buffer.append(", value=\"").append(refItem.getValue()).append("\")").append(",").append("\n");
			});
			buffer.append("})").append("\n");
			buffer.append("\t").append(convertName(item.getApiName())).append(",").append("\n");
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
