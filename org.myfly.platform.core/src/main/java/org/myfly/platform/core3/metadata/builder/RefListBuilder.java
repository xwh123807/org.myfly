package org.myfly.platform.core3.metadata.builder;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.stream.Stream;

import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core3.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core3.metadata.annotation.FlyRefList;
import org.myfly.platform.core3.metadata.define.FRefList;
import org.myfly.platform.core3.model.data.ValidationType;
import org.myfly.platform.core3.model.dict.PRefList;
import org.myfly.platform.core3.model.dict.PReference;
import org.springframework.util.Assert;

public class RefListBuilder extends AbstractBuilder<PReference, FRefList> {

	@Override
	public FRefList convert(PReference builder) {
		return null;
	}

	@Override
	public FRefList convertEnum(Field field) {
		FlyRefList anno = field.getAnnotation(FlyRefList.class);
		Assert.notNull(anno, "不是有效的@FlyRefList, " + field.toString());

		FRefList result = new FRefList();
		result.setName(anno.name());
		result.setDescription(anno.description());
		result.setHelp(anno.help());
		result.setValidationType(ValidationType.L);
		result.setEntityType(anno.entityType());
		result.setItems(new LinkedHashMap<>());
		Stream.of(anno.items()).forEach(item -> {
			PRefList refList = new PRefList();
			refList.setValue(item.value());
			refList.setName(item.name());
			refList.setDescription(item.description());
			refList.setHelp(item.help());
			refList.setEntityType(item.entityType());
			refList.setValidFrom(item.validFrom());
			refList.setValidTo(item.validTo());
			result.getItems().put(refList.getValue(), refList);
		});
		result.setReferenceID(UUIDUtil.newUUID());
		FlyEntityUtils.updateFlyEntityForSystem(result);
		return result;
	}
}
