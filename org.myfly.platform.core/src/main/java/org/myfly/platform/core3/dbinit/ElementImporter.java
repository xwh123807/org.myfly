package org.myfly.platform.core3.dbinit;

import java.lang.reflect.Field;

import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core3.domain.Element;
import org.myfly.platform.core3.metadata.annotation.FlyElement;
import org.myfly.platform.core3.model.dict.PElement;
import org.springframework.stereotype.Component;

@Component
public class ElementImporter extends AbstractImporter<Element, PElement> {

	@Override
	public PElement convertField(Field field) {
		PElement result = new PElement();
		result.setElementID(UUIDUtil.newUUID());
		result.setColumnName(field.getName());
		FlyElement flyField = field.getAnnotation(FlyElement.class);
		if (flyField != null) {
			result.setName(flyField.name());
			result.setPrintName(flyField.printName());
			result.setDescription(flyField.description());
			result.setHelp(flyField.help());
			result.setDataType(flyField.dataType());
			result.setFieldLength(flyField.fieldLength());
		}
		return result;
	}

}
