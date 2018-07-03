package org.myfly.platform.tools.codebuilder;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

@Service
public class ElementCodeBuilder extends AbstractCodeBuilder<ADElement> {
	@Override
	public void parareData() {
		setSources(getRepository().getElements());
	}

	@Override
	public void validate() {
		super.validate();
		Assert.hasLength(getPackageName(), "属性packageName不能为空");
	}

	private String convertStr(String value) {
		String tmp = value.replaceAll("\n", "\t");
		tmp = tmp.replaceAll("\r", "\t");
		tmp = tmp.replaceAll("\"", "'");
		return tmp;
	}

	@Override
	public void generateCodes() {
		validate();
		// Builder builder =
		// TypeSpec.enumBuilder("Element").addModifiers(Modifier.PUBLIC);
		// getSources().forEach(element -> {
		// element.build(builder);
		// });
		// toFile(getPackageName(), builder);

		StringBuffer buffer = new StringBuffer();
		buffer.append("package " + getPackageName() + ";").append("\n");
		buffer.append("\n");
		buffer.append("import org.myfly.platform.core3.domain.FlyDataType;").append("\n");
		buffer.append("import org.myfly.platform.core3.domain.IRefList;").append("\n");
		buffer.append("import org.myfly.platform.core3.metadata.annotation.FlyElement;").append("\n");
		buffer.append("\n");
		buffer.append("public enum Element implements IRefList{").append("\n");
		getSources().forEach(item -> {
			buffer.append("\t").append("//").append("\n");
			buffer.append("\t").append("@FlyElement(");
			buffer.append("name=\"" + convertStr(item.getName()) + "\"");
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

		File file = new File(
				"/Users/xiangwanhong/git/org.myfly/org.myfly.platform.tools/src/test/java/org/myfly/platform/tools/codebuilder/Element.java");
		try {
			FileUtils.writeByteArrayToFile(file, buffer.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
