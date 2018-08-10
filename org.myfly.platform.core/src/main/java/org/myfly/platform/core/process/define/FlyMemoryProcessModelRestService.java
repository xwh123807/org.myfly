package org.myfly.platform.core.process.define;

import java.util.Set;

import org.myfly.platform.core.domain.RestApiInfo;
import org.myfly.platform.core.domain.RestControllerInfo;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mpm")
public class FlyMemoryProcessModelRestService {
	@GetMapping({ "", "help" })
	public RestControllerInfo help() {
		return new RestControllerInfo("mvm", "显示模型服务",
				new RestApiInfo[] { new RestApiInfo("list", "getFlyProcessModelNames", HttpMethod.GET),
						new RestApiInfo("{processName}", "getFlyProcessModelByName", HttpMethod.GET)});
	};
	
	@GetMapping("list")
	public Set<String> getFlyProcessModelNames() {
		return getFlyMemoryProcessModel().getProcessModels().keySet();
	}

	private FlyMemoryProcessModel getFlyMemoryProcessModel() {
		return FlyMemoryProcessModel.getInstance();
	}
	
	@GetMapping("{processName}")
	public FlyProcessModel getFlyProcessModelByName(@PathVariable("processName") String processName) {
		return getFlyMemoryProcessModel().getProcessModels().get(processName);
	}
}
