package org.myfly.platform.visualpage3.internal;

import java.util.List;

import org.myfly.platform.core.starter.ICodeLevelViewModelRegister;
import org.myfly.platform.visualpage3.define.FlyMemoryViewModel;
import org.myfly.platform.visualpage3.define.FlyViewModel;
import org.myfly.platform.visualpage3.define.FlyViewModelBuilder;
import org.springframework.stereotype.Component;

@Component
public class CodeLevelViewModelRegister implements ICodeLevelViewModelRegister {

	@Override
	public void registerFlyViewModelsFromEnumClass(Class<? extends Enum<?>> enumClass) {
		FlyViewModelBuilder builder = new FlyViewModelBuilder();
		List<FlyViewModel> list = builder.loadFromEnumClass(enumClass);
		FlyMemoryViewModel.getInstance().addViewModels(list);
	}

}
