package org.myfly.platform.core3.metadata.internal;

import java.util.List;
import java.util.stream.Collectors;

import org.myfly.platform.core.domain.RestApiInfo;
import org.myfly.platform.core.domain.RestControllerInfo;
import org.myfly.platform.core3.flydata.service.FlyEntityMap;
import org.myfly.platform.core3.flydata.service.IFlyDataService;
import org.myfly.platform.core3.metadata.service.IFlyDataModelService;
import org.myfly.platform.core3.metadata.service.IFlyViewModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("metadata")
public class FlyMetaDataRestService {
	@Autowired
	private IFlyDataModelService dataModelService;
	@Autowired
	private IFlyDataService dataService;

	@GetMapping({ "", "help" })
	public RestControllerInfo help() {
		return new RestControllerInfo("metadata", "元模型服务",
				new RestApiInfo[] { new RestApiInfo("help", "帮助", HttpMethod.GET),
						new RestApiInfo("list", "返回实体列表", HttpMethod.GET),
						new RestApiInfo("data/list", "返回数据模型列表", HttpMethod.GET),
						new RestApiInfo("data/uid", "返回指定uid的数据模型", HttpMethod.GET),
						new RestApiInfo("view/list", "返回显示模型列表", HttpMethod.GET),
						new RestApiInfo("view/uid", "返回指定uid的显示模型", HttpMethod.GET) });
	}

	@GetMapping("list")
	public List<String> getAllEntityClassess() {
		return dataModelService.getAllEntityClasses().stream().map(cls -> cls.getName()).collect(Collectors.toList());
	}

	@GetMapping("data/list")
	public List<FlyEntityMap> listFlyDataModel() {
		return dataService.findAll(IFlyDataModelService.IMPLCLASS_FLY_DATA_MODEL.getName(), false, null);
	}

	@GetMapping("data/{uid}")
	public FlyEntityMap getFlyDataModelByUid(@PathVariable("uid") String uid) {
		return dataService.findOne(IFlyDataModelService.IMPLCLASS_FLY_DATA_MODEL.getName(), uid);
	}

	@GetMapping("view/list")
	public List<FlyEntityMap> listFlyViewModel() {
		return dataService.findAll(IFlyViewModelService.IMPLCLASS_FLY_VIEW_MODEL.getName(), false, null);
	}

	@GetMapping("view/{uid}")
	public FlyEntityMap getFlyViewModelByUid(@PathVariable("uid") String uid) {
		return dataService.findOne(IFlyViewModelService.IMPLCLASS_FLY_VIEW_MODEL.getName(), uid);
	}
}
