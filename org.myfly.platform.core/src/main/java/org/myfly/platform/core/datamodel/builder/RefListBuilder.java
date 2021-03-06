package org.myfly.platform.core.datamodel.builder;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Stream;

import org.myfly.platform.core.datamodel.annotation.FlyRefList;
import org.myfly.platform.core.datamodel.define.FRefList;
import org.myfly.platform.core.datamodel.define.FRefListItem;
import org.myfly.platform.core.datamodel.model.PRefList;
import org.myfly.platform.core.datamodel.model.PReference;
import org.myfly.platform.core.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core.model.ValidationType;
import org.myfly.platform.core.utils.UUIDUtil;
import org.springframework.util.Assert;

public class RefListBuilder extends AbstractBuilder<PReference, FRefList> {

	public FRefList convert(PReference reference, List<PRefList> items) {
		FRefList result = convert(reference);
		result.setItems(new LinkedHashMap<>());
		items.forEach(item -> {
			result.getItems().put(item.getValue(), convert(item));
		});
		return result;
	}

	@Override
	public FRefList convert(PReference builder) {
		FRefList result = new FRefList();
		result.setFromDB(true);
		result.setApiName(builder.getApiName());
		result.setEntityType(builder.getEntityType());
		result.setIsOrderByValue(builder.getIsOrderByValue());
		result.setReferenceID(builder.getReferenceID());
		result.setValidationType(builder.getValidationType());
		result.setvFormat(builder.getvFormat());
		copyFlyMetaFields(result, builder);
		return result;
	}

	public FRefListItem convert(PRefList builder) {
		FRefListItem result = new FRefListItem();
		result.setFromDB(true);
		copyFlyMetaFields(result, builder);
		result.setEntityType(builder.getEntityType());
		result.setReferenceID(builder.getReferenceID());
		result.setRefListID(builder.getRefListID());
		result.setValidFrom(builder.getValidFrom());
		result.setValidTo(builder.getValidTo());
		result.setValue(builder.getValue());
		return result;
	}

	@Override
	public FRefList convertEnum(Field field) {
		FlyRefList anno = field.getAnnotation(FlyRefList.class);
		Assert.notNull(anno, "不是有效的@FlyRefList, " + field.toString());

		FRefList result = new FRefList();
		result.setReferenceID(UUIDUtil.newUUID());
		result.setApiName(field.getName());
		result.setName(anno.name());
		result.setDescription(anno.description());
		result.setHelp(anno.help());
		result.setValidationType(ValidationType.L);
		result.setEntityType(anno.entityType());
		result.setItems(new LinkedHashMap<>());
		Stream.of(anno.items()).forEach(item -> {
			FRefListItem refList = new FRefListItem();
			refList.setRefListID(UUIDUtil.newUUID());
			refList.setReferenceID(result.getReferenceID());
			refList.setValue(item.value());
			refList.setName(item.name());
			refList.setDescription(item.description());
			refList.setHelp(item.help());
			refList.setEntityType(item.entityType());
			refList.setValidFrom(item.validFrom());
			refList.setValidTo(item.validTo());
			FlyEntityUtils.updateFlyEntityForSystem(refList);
			result.getItems().put(refList.getValue(), refList);
		});
		FlyEntityUtils.updateFlyEntityForSystem(result);
		return result;
	}
}
