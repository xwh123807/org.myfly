package org.myfly.platform.core.datamodel.builder;

import java.lang.reflect.Field;

import org.myfly.platform.core.datamodel.annotation.FlyElement;
import org.myfly.platform.core.datamodel.define.FElement;
import org.myfly.platform.core.datamodel.model.PElement;
import org.myfly.platform.core.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core.utils.StringUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.springframework.util.Assert;

public class ElementBuilder extends AbstractBuilder<PElement, FElement> {

	@Override
	public FElement convert(PElement builder) {
		return null;
	}

	@Override
	public FElement convertEnum(Field field) {
		FlyElement anno = field.getAnnotation(FlyElement.class);
		Assert.notNull(anno, "不是有效的@FlyElement, " + field.toString());

		FElement result = new FElement();
		result.setApiName(field.getName());
		result.setName(anno.name());
		result.setDescription(anno.description());
		result.setHelp(anno.help());
		result.setEntityType(anno.entityType());
		result.setDataType(anno.dataType());
		result.setColumnName(anno.columnName());
		result.setPrintName(anno.printName());
		result.setFieldLength(anno.fieldLength());
		result.setReferenceName(anno.referenceName());
		result.setElementID(UUIDUtil.newUUID());
		result.setColumnName(StringUtil.addUnderscores(result.getColumnName()));
		FlyEntityUtils.updateFlyEntityForSystem(result);
		return result;
	}
}
