package org.myfly.platform.core.viewmodel.define;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.myfly.platform.core.datamodel.builder.AbstractBuilder;
import org.myfly.platform.core.datamodel.define.FlyColumn;
import org.myfly.platform.core.datamodel.define.FlyDataModel;
import org.myfly.platform.core.flydata.internal.FlyEntityUtils;
import org.myfly.platform.core.utils.AppUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core.viewmodel.annotation.FlyFieldGroup;
import org.myfly.platform.core.viewmodel.annotation.FlyTab;
import org.myfly.platform.core.viewmodel.annotation.FlyWindow;
import org.myfly.platform.core.viewmodel.annotation.TableStyle;
import org.myfly.platform.core.viewmodel.model.PField;
import org.myfly.platform.core.viewmodel.model.PTab;
import org.myfly.platform.core.viewmodel.model.PWindow;
import org.springframework.util.Assert;

public class FlyViewModelBuilder extends AbstractBuilder<PWindow, FlyViewModel> {

	public FlyViewModel convert(PWindow window, List<PTab> tabs, List<PField> fields) {
		FlyViewModel result = convert(window);
		result.setTabs(new LinkedHashMap<>());
		tabs.forEach(tab -> {
			FTab ftab = convert(tab);
			ftab.setFields(new LinkedHashMap<>());
			fields.stream().filter(item -> item.getTabID().equals(ftab.getTabID())).forEach(field -> {
				ftab.getFields().put(field.getName(), convert(field));
			});
			result.getTabs().put(ftab.getName(), ftab);
		});
		return result;
	}

	@Override
	public FlyViewModel convert(PWindow builder) {
		FlyViewModel result = new FlyViewModel();
		result.setFromDB(true);
		copyFlyMetaFields(result, builder);
		result.setApiName(builder.getApiName());
		result.setEntityType(builder.getEntityType());
		result.setIsBetaFunctionality(builder.getIsBetaFunctionality());
		result.setIsDefault(builder.getIsDefault());
		result.setIsSOTrx(builder.getIsSOTrx());
		result.setProcessing(builder.getProcessing());
		result.setWindowID(builder.getWindowID());
		result.setWindowType(builder.getWindowType());
		result.setWinHeight(builder.getWinHeight());
		result.setWinWidth(builder.getWinWidth());
		return result;
	}

	public FTab convert(PTab builder) {
		FTab result = new FTab();
		result.setFromDB(true);
		copyFlyMetaFields(result, builder);
		result.setCommitWarning(builder.getCommitWarning());
		result.setDisplayLogic(builder.getDisplayLogic());
		result.setEntityType(builder.getEntityType());
		result.setHasTree(builder.getHasTree());
		result.setImageID(builder.getImageID());
		result.setImportFields(builder.getImportFields());
		result.setIncludedTab(builder.getIncludedTab());
		result.setIsAdvancedTab(builder.getIsAdvancedTab());
		result.setIsInfoTab(builder.getIsInfoTab());
		result.setIsInsertRecord(builder.getIsInsertRecord());
		result.setIsReadOnly(builder.getIsReadOnly());
		result.setIsSingleRow(builder.getIsSingleRow());
		result.setIsSortTab(builder.getIsSortTab());
		result.setIsTranslationTab(builder.getIsTranslationTab());
		result.setOrderByClause(builder.getOrderByClause());
		result.setParentColumn(builder.getParentColumn());
		result.setProcessing(builder.getProcessing());
		result.setReadOnlyLogic(builder.getReadOnlyLogic());
		result.setSeqNo(builder.getSeqNo());
		result.setTabID(builder.getTabID());
		result.setTableID(builder.getTableID());
		result.setTableStyle(builder.getTableStyle());
		result.setTabLevel(builder.getTabLevel());
		result.setWhereClause(builder.getWhereClause());
		result.setWindowID(builder.getWindowID());
		return result;
	}

	public FField convert(PField builder) {
		FField result = new FField();
		result.setFromDB(true);
		copyFlyMetaFields(result, builder);
		result.setColumnID(builder.getColumnID());
		result.setDataType(builder.getDataType());
		result.setDefaultValue(builder.getDefaultValue());
		result.setDisplayLength(builder.getDisplayLength());
		result.setDisplayLogic(builder.getDisplayLogic());
		result.setEntityType(builder.getEntityType());
		result.setFieldGroupID(builder.getFieldGroupID());
		result.setFieldID(builder.getFieldID());
		result.setIncludedTab(builder.getIncludedTab());
		result.setInfoFactoryClass(builder.getInfoFactoryClass());
		result.setIsAllowCopy(builder.getIsAllowCopy());
		result.setIsCentrallyMaintained(builder.getIsCentrallyMaintained());
		result.setIsDisplayed(builder.getIsDisplayed());
		result.setIsDisplayedGrid(builder.getIsDisplayedGrid());
		result.setIsEmbedded(builder.getIsEmbedded());
		result.setIsEncrypted(builder.getIsEncrypted());
		result.setIsFieldOnly(builder.getIsFieldOnly());
		result.setIsHeading(builder.getIsHeading());
		result.setIsMandatory(builder.getIsMandatory());
		result.setIsReadOnly(builder.getIsReadOnly());
		result.setIsSameLine(builder.getIsSameLine());
		result.setObscureType(builder.getObscureType());
		result.setPreferredWidth(builder.getPreferredWidth());
		result.setReferenceID(builder.getReferenceID());
		result.setSeqNo(builder.getSeqNo());
		result.setSeqNoGrid(builder.getSeqNoGrid());
		result.setSortNo(builder.getSortNo());
		result.setTabID(builder.getTabID());
		return result;
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
		FlyEntityUtils.updateFlyEntityForSystem(result);
		result.setTabs(new LinkedHashMap<>());
		FlyTab[] tabAnnos = anno.tabs();
		for (FlyTab tabAnno : tabAnnos) {
			FTab tab = buildTab(tabAnno);
			tab.setWindowID(result.getWindowID());
			result.getTabs().put(tab.getName(), tab);
		}
		updateSubTabs(result);
		return result;
	}

	private void updateSubTabs(FlyViewModel result) {
		// 上一次访问节点
		FTab last = result.getMainTab();
		// 上一层节点
		FTab prior = null;
		last.setSubTabs(new String[] {});
		for (FTab item : result.getTabs().values()) {
			if (!item.getTabID().equals(last.getTabID())) {
				if (item.getTabLevel().intValue() > last.getTabLevel().intValue()) {
					// 下一级
					last.setSubTabs(ArrayUtils.add(last.getSubTabs(), item.getName()));
					prior = last;
				} else {
					// 平级
					prior.setSubTabs(ArrayUtils.add(prior.getSubTabs(), item.getName()));
				}
				last = item;
			}
		}
		;
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
		result.setTabLevel(anno.tabLevel());
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
		return result;
	}

	/**
	 * 从数据模型构建显示模型
	 * 
	 * @param dataModel
	 * @return
	 */
	public FlyViewModel loadFromFlyDataModel(FlyDataModel dataModel) {
		FlyViewModel result = new FlyViewModel();
		result.setApiName(dataModel.getApiName());
		result.setWindowID(UUIDUtil.newUUID());
		result.setName(dataModel.getName());
		result.setDescription(dataModel.getDescription());
		result.setHelp(dataModel.getHelp());
		result.setEntityType(dataModel.getEntityType());
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
		result.setTabLevel(0);
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
