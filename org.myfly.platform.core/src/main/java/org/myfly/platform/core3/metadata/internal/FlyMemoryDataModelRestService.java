package org.myfly.platform.core3.metadata.internal;

import java.util.Map;
import java.util.Set;

import org.myfly.platform.core.domain.RestApiInfo;
import org.myfly.platform.core.domain.RestControllerInfo;
import org.myfly.platform.core3.metadata.define.FElement;
import org.myfly.platform.core3.metadata.define.FEntityType;
import org.myfly.platform.core3.metadata.define.FRefList;
import org.myfly.platform.core3.metadata.define.FRefTable;
import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.core3.metadata.define.FlyMemoryDataModel;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mdm")
public class FlyMemoryDataModelRestService {
	@GetMapping({ "", "help" })
	public RestControllerInfo help() {
		return new RestControllerInfo("mdm", "模型服务",
				new RestApiInfo[] { new RestApiInfo("elements", "getElements", HttpMethod.GET),
						new RestApiInfo("entitytypes", "getEntityTypes", HttpMethod.GET),
						new RestApiInfo("reftables", "getRefTables", HttpMethod.GET),
						new RestApiInfo("reflists", "getRefLists", HttpMethod.GET),
						new RestApiInfo("datamodel", "getFlyDataModelNames", HttpMethod.GET),
						new RestApiInfo("datamodel/{entityName}", "getFlyDataModelByName", HttpMethod.GET) });
	}

	private FlyMemoryDataModel getFlyMemoryDataModel() {
		return FlyMemoryDataModel.getInstance();
	}

	@GetMapping("elements")
	public Map<String, FElement> getElements() {
		return getFlyMemoryDataModel().getElements();
	}

	@GetMapping("entitytypes")
	public Map<String, FEntityType> getEntityTypes() {
		return getFlyMemoryDataModel().getEntityTypes();
	}

	@GetMapping("reftables")
	public Map<String, FRefTable> getRefTables() {
		return getFlyMemoryDataModel().getRefTables();
	}

	@GetMapping("reflists")
	public Map<String, FRefList> getRefLists() {
		return getFlyMemoryDataModel().getRefLists();
	}

	@GetMapping("datamodel/{entityName}")
	public FlyDataModel getFlyDataModelByName(@PathVariable("entityName") String entityName) {
		return getFlyMemoryDataModel().getFlyDataModel(entityName);
	}

	@GetMapping("datamodel")
	public Set<String> getFlyDataModelNames() {
		return getFlyMemoryDataModel().getFlyDataModels().keySet();
	}
}
