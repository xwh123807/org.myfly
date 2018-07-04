package org.myfly.platform.core3.dbinit;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core3.dbinit.resources.RefLists;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.metadata.annotation.FlyRefList;
import org.myfly.platform.core3.model.data.ValidationType;
import org.myfly.platform.core3.model.dict.PRefList;
import org.myfly.platform.core3.model.dict.PReference;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * 从枚举RefList中导入数据到PRefList中
 * 
 * @author xiangwanhong
 *
 */
@Component
@Scope("prototype")
public class RefListImporter extends AbstractEnumImporter<IFlyEntity, RefLists> {
	private PReference reference;

	private List<PRefList> refLists;

	public PReference getReference() {
		return reference;
	}

	public List<PRefList> getRefLists() {
		return refLists;
	}

	@Override
	public IFlyEntity convertField(Field field) {
		FlyRefList flyRefList = field.getAnnotation(FlyRefList.class);
		Assert.notNull(flyRefList);

		reference = new PReference();
		reference.setReferenceID(UUIDUtil.newUUID());
		reference.setName(flyRefList.name());
		reference.setDescription(flyRefList.description());
		reference.setHelp(flyRefList.help());
		reference.setEntityType(flyRefList.entityType());
		reference.setValidationType(ValidationType.L);
		getTargets().add(reference);

		Assert.notEmpty(flyRefList.items());
		refLists = new ArrayList<>();
		Stream.of(flyRefList.items()).forEach(item -> {
			PRefList refList = new PRefList();
			refList.setReferenceID(reference.getReferenceID());
			refList.setRefListID(UUIDUtil.newUUID());
			refList.setName(item.name());
			refList.setDescription(item.description());
			refList.setHelp(item.help());
			refList.setValue(item.value());
			refList.setValidFrom(item.validFrom());
			refList.setValidTo(item.validTo());
			refList.setEntityType(item.entityType());
			refLists.add(refList);
			getTargets().add(refList);
		});
		return null;
	}

	@Override
	public void save() {
		beforeSave();
		getDataService().saveEntity(getReference());
		getDataService().batchSaveEntity(getRefLists());
	}
}
