package org.myfly.platform.tools.codebuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class RefListCodeBuilder extends AbstractCodeBuilder<ADReference> {
	@Override
	public void parareData() {
		List<ADReference> refs = getRepository().getReferencesByList();
		refs.forEach(item -> {
			List<ADRefList> refList = getRepository().getRefLists(item.getReferenceID());
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
		buffer.append("import org.myfly.platform.core3.metadata.annotation.FlyRefItem;").append("\n");
		buffer.append("import org.myfly.platform.core3.metadata.annotation.FlyRefList;").append("\n");
		buffer.append("\n");
		buffer.append("public enum RefLists {").append("\n");
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
				buffer.append(", value=\"").append(refItem.getName()).append("\")").append(",").append("\n");
			});
			buffer.append("})").append("\n");
			buffer.append("\t").append(item.getName().replaceAll(" ", "_")).append(",").append("\n");
		});
		buffer.append("}");
		System.out.println(buffer.toString());

		String userDir = System.getProperty("user.dir");
		String fileName = userDir + "/src/test/java/" + getPackageName().replaceAll("\\.", "/") + "/RefLists.java";
		File file = new File(fileName);
		try {
			FileUtils.writeByteArrayToFile(file, buffer.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
