package org.myfly.platform.visualpage3.define;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;

import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core3.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core3.metadata.builder.AbstractBuilder;
import org.myfly.platform.core3.metadata.define.FlyColumn;
import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.visualpage3.annotation.FlyFieldGroup;
import org.myfly.platform.visualpage3.annotation.FlyTab;
import org.myfly.platform.visualpage3.annotation.FlyWindow;
import org.myfly.platform.visualpage3.model.PWindow;
import org.myfly.platform.visualpage3.model.WindowType;
import org.myfly.platform.visualpage3.service.IFlyViewModel;
import org.myfly.platform.visualpage3.webui.TableStyle;
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
		Assert.notNull(anno, "没有注解@FlyWindow， " + field.toString());
		result.setApiName(field.getName());
		result.setWindowID(UUIDUtil.newUUID());
		result.setName(anno.name());
		result.setDescription(anno.description());
		result.setHelp(anno.help());
		result.setEntityType(anno.entityTpye());
		result.setWindowType(anno.windowType());
		FlyEntityUtils.updateFlyEntityForSystem(result);
		result.setTabs(new LinkedHashMap<>());
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
		result.setKeyColumn(result.getTable().getPrimaryKey().getApiName());
		result.setTableID(result.getTable().getTableID());
		result.setTableStyle(anno.tableStyle());
		FlyEntityUtils.updateFlyEntityForSystem(result);
		result.setFields(new LinkedHashMap<>());
		buildFields(result, anno.fieldGroup());
		return result;
	}

	private void buildFields(FTab result, FlyFieldGroup[] fieldGroup) {
		Assert.notNull(result.getTable(), "属性[table]不能为空");
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
		result.setFlyColumn(column);
		FlyEntityUtils.updateFlyEntityForSystem(result);
		// String model = column.getApiName();
		// if (column.isRefListColumn()) {
		// model += "__name";
		// } else if (column.isRefTableColumn()) {
		// model += "__" + column.getRefDisplayColumn();
		// }
		// result.setModel(model);
		return result;
	}

	/**
	 * 从数据模型构建显示模型
	 * 
	 * @param dataModel
	 * @return
	 */
	public IFlyViewModel loadFromFlyDataModel(FlyDataModel dataModel) {
		FlyViewModel result = new FlyViewModel();
		result.setApiName(dataModel.getApiName());
		result.setWindowID(UUIDUtil.newUUID());
		result.setName(dataModel.getName());
		result.setDescription(dataModel.getDescription());
		result.setHelp(dataModel.getHelp());
		result.setEntityType(dataModel.getEntityType());
		result.setWindowType(WindowType.M);
		FlyEntityUtils.updateFlyEntityForSystem(result);
		result.setTabs(new LinkedHashMap<>());
		FTab tab = buildTab(dataModel);
		tab.setWindowID(result.getWindowID());
		result.getTabs().put(tab.getName(), tab);
		return result;
	}

	private FTab buildTab(FlyDataModel dataModel) {
		FTab result = new FTab();
		result.setUid(UUIDUtil.newUUID());
		result.setName(dataModel.getName());
		result.setDescription(dataModel.getDescription());
		result.setHelp(dataModel.getHelp());
		result.setTable((FlyDataModel) dataModel);
		result.setTableID(dataModel.getTableID());
		result.setKeyColumn(result.getTable().getPrimaryKey().getApiName());
		result.setTableStyle(TableStyle.ELTable);
		FlyEntityUtils.updateFlyEntityForSystem(result);
		result.setFields(new LinkedHashMap<>());
		buildFields(result);
		return result;
	}

	private void buildFields(FTab result) {
		Assert.notNull(result.getTable(), "属性[table]不能为空");
		result.getTable().getColumnMap().values().forEach(column -> {
			FField field = buildField(column);
			field.setTabID(result.getTabID());
			result.getFields().put(field.getKey(), field);
		});
	}
}
