package org.myfly.platform.visualpage3.builder;

import java.lang.reflect.Field;
import java.util.HashMap;

import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core3.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core3.metadata.builder.AbstractBuilder;
import org.myfly.platform.core3.metadata.define.FlyColumn;
import org.myfly.platform.visualpage3.annotation.FlyFieldGroup;
import org.myfly.platform.visualpage3.annotation.FlyTab;
import org.myfly.platform.visualpage3.annotation.FlyWindow;
import org.myfly.platform.visualpage3.internal.FField;
import org.myfly.platform.visualpage3.internal.FTab;
import org.myfly.platform.visualpage3.internal.FlyViewModel;
import org.myfly.platform.visualpage3.model.PWindow;
import org.springframework.util.Assert;

public class FlyViewModelBuilder extends AbstractBuilder<PWindow, FlyViewModel> {

	@Override
	public FlyViewModel convert(PWindow builder) {
		return null;
	}

	@Override
	public FlyViewModel convertEnum(Field field) {
		FlyViewModel result = new FlyViewModel();
		FlyWindow anno = field.getAnnotation(FlyWindow.class);
		Assert.notNull(anno);
		result.setApiName(field.getName());
		result.setWindowID(UUIDUtil.newUUID());
		result.setName(anno.name());
		result.setDescription(anno.description());
		result.setHelp(anno.help());
		result.setEntityType(anno.entityTpye());
		result.setWindowType(anno.windowType());
		FlyEntityUtils.updateFlyEntityForSystem(result);
		result.setTabs(new HashMap<>());
		FlyTab[] tabAnnos = anno.tabs();
		for (FlyTab tabAnno : tabAnnos) {
			FTab tab = buildTab(tabAnno);
			tab.setWindowID(result.getWindowID());
			result.getTabs().put(tab.getName(), tab);
		}
		return result;
	}

	private FTab buildTab(FlyTab anno) {
		FTab result = new FTab();
		result.setUid(UUIDUtil.newUUID());
		result.setName(anno.name());
		result.setDescription(anno.description());
		result.setHelp(anno.help());
		result.setTable(AppUtil.getFlyDataModel(anno.table()));
		FlyEntityUtils.updateFlyEntityForSystem(result);
		result.setFields(new HashMap<>());
		buildFields(result, anno.fieldGroup());
		return result;
	}

	private void buildFields(FTab result, FlyFieldGroup[] fieldGroup) {
		Assert.notNull(result.getTable());
		result.getTable().getColumnMap().values().forEach(column -> {
			FField field = buildField(column);
			field.setTabID(result.getTabID());
			result.getFields().put(field.getKey(), field);
		});
	}

	private FField buildField(FlyColumn column) {
		FField result = new FField();
		result.setFieldID(UUIDUtil.newUUID());
		result.setName(column.getName());
		result.setDescription(column.getDescription());
		result.setHelp(column.getHelp());
		result.setColumnID(column.getColumnID());
		result.setDataType(column.getDataType());
		result.setEntityType(column.getEntityType());
		result.setReferenceID(column.getReferenceID());
		FlyEntityUtils.updateFlyEntityForSystem(result);
		return result;
	}
}
