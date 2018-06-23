package org.myfly.platform.core3.metadata.builder;

import java.util.HashSet;

import org.myfly.platform.core.utils.DateUtil;
import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.domain.FlyDataType;
import org.myfly.platform.core3.model.data.PTable;
import org.myfly.platform.core3.model.view.PTab;
import org.myfly.platform.core3.model.view.PWindow;
import org.myfly.platform.core3.model.view.WindowType;

public class FlyViewModelBuilder {

	public static PWindow buildWindow(PTable table) {
		PWindow window = new PWindow();
		window.setUid(UUIDUtil.newUUID());
		window.setClient(table.getClient());
		window.setOrg(table.getOrg());
		window.setCreated(DateUtil.nowSqlTimestamp());
		window.setCreatedBy(table.getCreatedBy());
		window.setIsActive(true);
		window.setUpdated(DateUtil.nowSqlTimestamp());
		window.setUpdatedBy(table.getUpdatedBy());

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
		PTab tab = new PTab();
		tab.setUid(UUIDUtil.newUUID());
		tab.setClient(table.getClient());
		tab.setOrg(table.getOrg());
		tab.setCreated(DateUtil.nowSqlTimestamp());
		tab.setCreatedBy(table.getCreatedBy());
		tab.setIsActive(true);
		tab.setUpdated(DateUtil.nowSqlTimestamp());
		tab.setUpdatedBy(table.getUpdatedBy());

		tab.setWindow(window);
		tab.setTable(table);
		tab.setName(table.getName());
		tab.setDescription(table.getDescription());
		tab.setHelp(table.getHelp());
		tab.setEntityType(EntityType.D);
		window.getTabs().add(tab);

//		// 子表Tab
//		table.getColumns().stream().filter(item -> FlyDataType.SubTable.equals(item.getDataType())).map(column -> {
//			PTab tab2 = new PTab();
//			tab2.setUid(UUIDUtil.newUUID());
//			tab2.setClient(table.getClient());
//			tab2.setOrg(table.getOrg());
//			tab2.setCreated(DateUtil.nowSqlTimestamp());
//			tab2.setCreatedBy(table.getCreatedBy());
//			tab2.setIsActive(true);
//			tab2.setUpdated(DateUtil.nowSqlTimestamp());
//			tab2.setUpdatedBy(table.getUpdatedBy());
//
//			tab2.setWindow(window);
//			tab2.setTable(table);
//
//			return tab2;
//		}).forEach(tab3 -> window.getTabs().add(tab3));
		
		return window;
	}

}
