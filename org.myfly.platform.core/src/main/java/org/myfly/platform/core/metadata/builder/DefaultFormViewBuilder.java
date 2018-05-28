package org.myfly.platform.core.metadata.builder;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.myfly.platform.core.domain.FieldDataType;
import org.myfly.platform.core.metadata.annotation.ListStyle;
import org.myfly.platform.core.metadata.annotation.SectionType;
import org.myfly.platform.core.metadata.define.FieldSetDefinition;
import org.myfly.platform.core.metadata.define.SectionDefinition;
import org.myfly.platform.core.metadata.define.SubTableDefinition;
import org.myfly.platform.core.metadata.entity.EntityMetaData;
import org.myfly.platform.core.metadata.service.EntityMetaDataConstants;

public class DefaultFormViewBuilder extends FormViewBuilder {
	public DefaultFormViewBuilder(EntityMetaData entityMetaData) {
		setName(EntityMetaDataConstants.DEFAULT_ALL_NAME);
		setSections(buildDefaultSectionDefinitions(entityMetaData).toArray(new SectionDefinition[] {}));
	}

	private List<SectionDefinition> buildDefaultSectionDefinitions(EntityMetaData entityMetaData) {
		List<SectionDefinition> list = new ArrayList<>();
		// 主记录所有属性建立一个Section和二个FieldSet
		SectionDefinition sectionDefinition = new SectionDefinition();
		sectionDefinition.setType(SectionType.CUSTOM);
		sectionDefinition.setTitle("基本信息");
		FieldSetDefinition fieldSetDefinition1 = new FieldSetDefinition();
		fieldSetDefinition1.setTitle("基本信息一");
		fieldSetDefinition1.setFields(
				ArrayUtils.subarray(entityMetaData.getFieldNames(), 0, entityMetaData.getFieldNames().length / 2));
		FieldSetDefinition fieldSetDefinition2 = new FieldSetDefinition();
		fieldSetDefinition2.setTitle("基本信息二️⃣");
		fieldSetDefinition2.setFields(ArrayUtils.subarray(entityMetaData.getFieldNames(),
				entityMetaData.getFieldNames().length / 2, entityMetaData.getFieldNames().length));
		sectionDefinition.setFieldSets(new FieldSetDefinition[] { fieldSetDefinition1, fieldSetDefinition2 });
		list.add(sectionDefinition);
		// 每一个子表建立一个Section
		entityMetaData.getFieldMap().values().stream()
				.filter(item -> FieldDataType.MDRELATION.equals(item.getDataType())).forEach(field -> {
					SubTableDefinition subTableDefinition = new SubTableDefinition();
					subTableDefinition.setTitle(field.getTitle());
					subTableDefinition.setSubTableAttr(field.getName());
					subTableDefinition.setListStyle(ListStyle.TABLE);
					//subTableDefinition.setFields(entityMetaData.getSubEntityMetaData(field.getName()).getFieldNames());
					SectionDefinition sectionDefinition2 = new SectionDefinition();
					sectionDefinition2.setTitle(field.getTitle());
					sectionDefinition2.setType(SectionType.CUSTOM);
					sectionDefinition2.setSubTables(new SubTableDefinition[] { subTableDefinition });
					list.add(sectionDefinition2);
				});
		// 每一个特性(扩展子表)建立一个Section
		return list;
	}

}
