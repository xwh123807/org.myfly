package org.myfly.platform.core.viewmodel.internal;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.lang3.BooleanUtils;
import org.myfly.platform.core.dbinit.ModelImporter;
import org.myfly.platform.core.viewmodel.define.FlyMemoryViewModel;
import org.myfly.platform.core.viewmodel.model.PField;
import org.myfly.platform.core.viewmodel.model.PTab;
import org.myfly.platform.core.viewmodel.model.PWindow;
import org.springframework.stereotype.Component;

@Component
public class FlyViewModelImporter extends ModelImporter {

	@Override
	@Transactional
	public void importAll() {
		importViewModels();
	}

	private void importViewModels() {
		List<PWindow> windowList = new ArrayList<>();
		List<PTab> tabList = new ArrayList<>();
		List<PField> fieldList = new ArrayList<>();
		FlyMemoryViewModel.getInstance().getFlyViewModels().values().forEach(viewModel -> {
			if (!BooleanUtils.isTrue(viewModel.isFromDB())) {
				windowList.add(viewModel.toWindowPO());
			}
			viewModel.getTabs().values().forEach(tab -> {
				if (!BooleanUtils.isTrue(tab.isFromDB())) {
					tabList.add(tab.toTabPO());
				}
				tab.getFields().values().stream().filter(p -> !BooleanUtils.isTrue(p.isFromDB())).forEach(field -> {
					fieldList.add(field.toFieldPO());
				});
			});
		});
		getDataService().batchSaveEntity(windowList);
		getDataService().batchSaveEntity(tabList);
		getDataService().batchSaveEntity(fieldList);
	}
}
