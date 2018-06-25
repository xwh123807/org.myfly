package org.myfly.platform.core3.metadata.builder;

import java.util.HashSet;

import org.myfly.platform.core.utils.UUIDUtil;
import org.myfly.platform.core3.domain.EntityType;
import org.myfly.platform.core3.metadata.internal.FlyMetaDataUtils;
import org.myfly.platform.core3.metadata.service.IFlyDataModel;
import org.myfly.platform.core3.metadata.service.IFlyViewModel;
import org.myfly.platform.core3.metadata.service.IFlyViewTab;
import org.myfly.platform.core3.model.view.WindowType;

public class FlyViewModelBuilder {
	private IFlyViewModel viewModel;

	/**
	 * 从数据模型构建实体显示模型
	 * @param builder
	 */
	public FlyViewModelBuilder(IFlyDataModel builder) {
		viewModel = FlyMetaDataUtils.newFlyViewModelInstance();
		viewModel.setUid(UUIDUtil.newUUID());
		viewModel.setName(builder.getName());
		viewModel.setDescription(builder.getDescription());
		viewModel.setHelp(builder.getHelp());
		viewModel.setWindowType(WindowType.M);
		viewModel.setIsSOTrx(true);
		viewModel.setEntityType(EntityType.D);
		viewModel.setIsDefault(true);
		viewModel.setTabs(new HashSet<>());

		// 主表Tab
		IFlyViewTab tab = FlyMetaDataUtils.newFlyViewTabInstance();
		tab.setWindow(viewModel);
		tab.setName(builder.getName());
		tab.setDescription(builder.getDescription());
		tab.setHelp(builder.getHelp());
		tab.setEntityType(EntityType.D);
		viewModel.getTabs().add(tab);
	}

	public IFlyViewModel getFlyViewModel() {
		return viewModel;
	}
}
