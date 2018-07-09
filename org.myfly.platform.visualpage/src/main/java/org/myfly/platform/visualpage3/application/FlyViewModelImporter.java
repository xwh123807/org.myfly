package org.myfly.platform.visualpage3.application;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.BooleanUtils;
import org.myfly.platform.core3.dbinit.ModelImporter;
import org.myfly.platform.core3.model.PTable;
import org.myfly.platform.visualpage3.internal.FlyMemoryViewModel;
import org.myfly.platform.visualpage3.model.PField;
import org.springframework.stereotype.Component;

@Component
public class FlyViewModelImporter extends ModelImporter {

	@Override
	public void importAll() {
		importViewModels();
	}

	private void importViewModels() {
		List<PTable> tableList = new ArrayList<>();
		List<PTable> tabList = new ArrayList<>();
		List<PField> fieldList = new ArrayList<>();
		FlyMemoryViewModel.getInstance().getFlyViewModels().values().forEach(viewModel -> {
			if (!BooleanUtils.isTrue(viewModel.isFromDB())) {
				tableList.add(viewModel.toTablePO());
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
	}
}
