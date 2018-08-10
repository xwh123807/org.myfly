package org.myfly.platform.core.viewmodel.internal;

import java.util.List;

import org.myfly.platform.core.process.define.FlyMemoryProcessModel;
import org.myfly.platform.core.process.define.FlyProcessModel;
import org.myfly.platform.core.process.define.FlyProcessModelBuilder;
import org.myfly.platform.core.starter.ICodeLevelModelRegister;
import org.myfly.platform.core.viewmodel.define.FlyMemoryViewModel;
import org.myfly.platform.core.viewmodel.define.FlyViewModel;
import org.myfly.platform.core.viewmodel.define.FlyViewModelBuilder;
import org.springframework.stereotype.Component;

@Component
public class CodeLevelModelRegister implements ICodeLevelModelRegister {

	@Override
	public void registerFlyViewModelsFromEnumClass(Class<? extends Enum<?>> enumClass) {
		FlyViewModelBuilder builder = new FlyViewModelBuilder();
		List<FlyViewModel> list = builder.loadFromEnumClass(enumClass);
		FlyMemoryViewModel.getInstance().addViewModels(list);
	}

	@Override
	public void registerFlyProcessModelsFromPackage(String packageName) {
		FlyProcessModelBuilder builder = new FlyProcessModelBuilder();
		List<FlyProcessModel> list  = builder.loadFromProcessPackage(packageName);
		FlyMemoryProcessModel.getInstance().addProcessModels(list);
	}

	@Override
	public void registerFlyReportModelsFromPackage(String packageName) {
		// TODO Auto-generated method stub
	}

}
