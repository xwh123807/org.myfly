package org.myfly.platform.core3.metadata.builder;

import java.util.HashSet;
import java.util.Set;

import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.flydata.service.FlyEntityUtils;
import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.core3.metadata.service.IFlyViewField;
import org.myfly.platform.core3.metadata.service.IFlyViewTab;
import org.myfly.platform.core3.model.data.PTable;
import org.myfly.platform.core3.model.view.PField;
import org.myfly.platform.core3.model.view.PTab;
import org.myfly.platform.core3.model.view.PWindow;
import org.myfly.platform.core3.model.view.WindowType;

/**
 * 内建实体显示模型构造器
 * 
 * @author xiangwanhong
 *
 */
public class BuildInFlyViewModelBuilder extends PWindow {
	public BuildInFlyViewModelBuilder(FlyDataModel builder) {
		setUid(UUIDUtil.newUUID());
		setName(builder.getName());
		setDescription(builder.getDescription());
		setHelp(builder.getHelp());
		setWindowType(WindowType.M);
		setIsSOTrx(true);
		setEntityType(EntityType.D);
		setIsDefault(true);
		
		//主表Tab
		IFlyViewTab tab = new PTab();
		tab.setWindow(this);
		tab.setName(builder.getName());
		tab.setDescription(builder.getDescription());
		tab.setHelp(builder.getHelp());
		tab.setEntityType(EntityType.D);
	}

	public static PWindow buildWindow(PTable table) {
		PWindow window = FlyEntityUtils.newFlyEntity(PWindow.class, table);

		window.setName(table.getName());
		window.setDescription(table.getDescription());
		window.setHelp(table.getHelp());
		window.setWindowType(WindowType.M);
		window.setIsSOTrx(true);
		window.setEntityType(EntityType.D);
		window.setProcessing(false);
		window.setIsDefault(true);

		window.setTabs(new HashSet<>());
		// 主表Tab
		PTab tab = FlyEntityUtils.newFlyEntity(PTab.class, table);

		tab.setWindow(window);
		tab.setTable(table);
		tab.setName(table.getName());
		tab.setDescription(table.getDescription());
		tab.setHelp(table.getHelp());
		tab.setEntityType(EntityType.D);
		// Field
		buildField(tab);
		window.getTabs().add(tab);

		// // 子表Tab
		// table.getColumns().stream().filter(item ->
		// FlyDataType.SubTable.equals(item.getDataType())).map(column -> {
		// PTab tab2 = new PTab();
		// tab2.setUid(UUIDUtil.newUUID());
		// tab2.setClient(table.getClient());
		// tab2.setOrg(table.getOrg());
		// tab2.setCreated(DateUtil.nowSqlTimestamp());
		// tab2.setCreatedBy(table.getCreatedBy());
		// tab2.setIsActive(true);
		// tab2.setUpdated(DateUtil.nowSqlTimestamp());
		// tab2.setUpdatedBy(table.getUpdatedBy());
		//
		// tab2.setWindow(window);
		// tab2.setTable(table);
		//
		// return tab2;
		// }).forEach(tab3 -> window.getTabs().add(tab3));

		return window;
	}

	/**
	 * 构建tab的fields
	 * 
	 * @param tab
	 */
	private static void buildField(PTab tab) {
		Set<IFlyViewField> fields = new HashSet<>();
		tab.getTable().getColumns().forEach(column -> {
			PField field = FlyEntityUtils.newFlyEntity(PField.class, tab);

			field.setName(column.getName());
			field.setDescription(column.getDescription());
			field.setHelp(column.getHelp());
			field.setTab(tab);
			field.setColumn(column);
			field.setDisplayLength(column.getFieldLength());
			field.setEntityType(column.getEntityType());

			fields.add(field);
		});
		tab.setFields(fields);
	}

}
