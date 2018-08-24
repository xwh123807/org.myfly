package org.myfly.platform.core.datamodel.builder;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.myfly.platform.core.datamodel.annotation.FlyRefTable;
import org.myfly.platform.core.datamodel.annotation.FlyReferences;
import org.myfly.platform.core.datamodel.define.FRefTable;
import org.myfly.platform.core.datamodel.model.PRefTable;
import org.myfly.platform.core.datamodel.model.PReference;
import org.myfly.platform.core.domain.IFlyEntity;
import org.myfly.platform.core.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core.utils.UUIDUtil;
import org.springframework.util.Assert;

public class RefTableBuilder extends AbstractBuilder<PReference, FRefTable> {

	@Override
	public FRefTable convert(PReference builder) {
		FRefTable result = new FRefTable();
		result.setFromDB(true);
		copyFlyMetaFields(result, builder);
		result.setApiName(builder.getApiName());
		result.setEntityType(builder.getEntityType());
		result.setIsOrderByValue(builder.getIsOrderByValue());
		result.setReferenceID(builder.getReferenceID());
		result.setValidationType(builder.getValidationType());
		result.setvFormat(builder.getvFormat());
		return result;
	}

	@Override
	public List<FRefTable> convertEntityClass(Class<? extends IFlyEntity> entityClass) {
		List<FlyRefTable> annos = new ArrayList<>();
		if (entityClass.getAnnotation(FlyRefTable.class) != null) {
			annos.add(entityClass.getAnnotation(FlyRefTable.class));
		}
		if (entityClass.getAnnotation(FlyReferences.class) != null) {
			for (FlyRefTable anno : entityClass.getAnnotation(FlyReferences.class).references()) {
				annos.add(anno);
			}
		}
		if (CollectionUtils.isEmpty(annos)) {
			// FlyRefTable非必须
			return null;
		}
		Assert.notEmpty(annos, "不是有效的@FlyRefTable, " + entityClass.getName());
		List<FRefTable> list = new ArrayList<>();
		annos.forEach(anno -> {
			FRefTable item = new FRefTable();
			item.setReferenceID(UUIDUtil.newUUID());
			item.setApiName(anno.apiName());
			item.setName(anno.name());
			item.setDescription(anno.description());
			item.setHelp(anno.help());
			item.setEntityType(anno.entityType());
			item.setTableApiName(entityClass.getName());
			item.setKeyColumnName(anno.keyColumn());
			item.setDisplayColumnName(anno.displayColumn());
			FlyEntityUtils.updateFlyEntityForSystem(item);
			PRefTable refTable = new PRefTable();
			refTable.setReferenceID(item.getReferenceID());
			refTable.setDisplaySQL(anno.displaySQL());
			refTable.setEntityType(anno.entityType());
			refTable.setIsAlert(anno.isAlert());
			refTable.setIsDisplayIdentifier(anno.isDisplayIdentifier());
			refTable.setIsValueDisplayed(anno.isValueDisplayed());
			refTable.setOrderByClause(anno.orderByClause());
			refTable.setWhereClause(anno.whereClause());
			FlyEntityUtils.updateFlyEntityForSystem(refTable);
			item.setRefTable(refTable);
			list.add(item);
		});
		return list;
	}

}
