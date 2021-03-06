package org.myfly.platform.core.viewmodel.internal;

import java.util.Set;

import org.myfly.platform.core.domain.RestApiInfo;
import org.myfly.platform.core.domain.RestControllerInfo;
import org.myfly.platform.core.viewmodel.define.FTab;
import org.myfly.platform.core.viewmodel.define.FlyMemoryViewModel;
import org.myfly.platform.core.viewmodel.define.FlyViewModel;
import org.myfly.platform.core.viewmodel.service.IFlyViewModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mvm")
public class FlyMemoryViewModelRestService {
	@Autowired
	private IFlyViewModelService viewModelService;

	public IFlyViewModelService getViewModelService() {
		return viewModelService;
	}

	public void setViewModelService(IFlyViewModelService viewModelService) {
		this.viewModelService = viewModelService;
	}

	@GetMapping({ "", "help" })
	public RestControllerInfo help() {
		return new RestControllerInfo("mvm", "显示模型服务",
				new RestApiInfo[] { new RestApiInfo("list", "getFlyViewModelNames", HttpMethod.GET),
						new RestApiInfo("{windowName}", "getFlyViewModelByName", HttpMethod.GET),
						new RestApiInfo("{windowName}/{tabName}", "getFlyColumnByName", HttpMethod.GET) });
	};

	@GetMapping("list")
	public Set<String> getFlyViewModelNames() {
		return getFlyMemoryViewModel().getFlyViewModels().keySet();
	}

	private FlyMemoryViewModel getFlyMemoryViewModel() {
		return FlyMemoryViewModel.getInstance();
	}

	@GetMapping("{windowName}")
	public FlyViewModel getFlyViewModelByName(@PathVariable("windowName") String windowName) {
		return getViewModelService().getFlyViewModelFromBuildIn(windowName);
	}

	@GetMapping("{windowName}/{tabName}")
	public FTab getTabByName(@PathVariable("windowName") String windowName,
			@PathVariable("tabName") String tabName) {
		return getFlyViewModelByName(windowName).getTabs().get(tabName);
	}
}
