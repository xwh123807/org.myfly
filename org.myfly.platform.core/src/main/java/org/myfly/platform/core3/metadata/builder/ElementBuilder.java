package org.myfly.platform.core3.metadata.builder;

import java.lang.reflect.Field;

import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core3.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core3.metadata.annotation.FlyElement;
import org.myfly.platform.core3.metadata.define.FElement;
import org.myfly.platform.core3.model.dict.PElement;
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
		result.setName(anno.name());
		result.setDescription(anno.description());
		result.setHelp(anno.help());
		result.setEntityType(anno.entityType());
		result.setDataType(anno.dataType());
		result.setColumnName(field.getName());
		result.setPrintName(anno.printName());
		result.setFieldLength(anno.fieldLength());
		result.setReferenceName(anno.referenceName());
		result.setElementID(UUIDUtil.newUUID());
		FlyEntityUtils.updateFlyEntityForSystem(result);
		return result;
	}
}