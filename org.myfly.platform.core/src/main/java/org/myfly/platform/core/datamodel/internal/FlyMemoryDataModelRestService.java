package org.myfly.platform.core.datamodel.internal;

import java.util.Map;
import java.util.Set;

import org.myfly.platform.core.datamodel.define.FDataType;
import org.myfly.platform.core.datamodel.define.FElement;
import org.myfly.platform.core.datamodel.define.FEntityType;
import org.myfly.platform.core.datamodel.define.FRefList;
import org.myfly.platform.core.datamodel.define.FRefTable;
import org.myfly.platform.core.datamodel.define.FlyColumn;
import org.myfly.platform.core.datamodel.define.FlyDataModel;
import org.myfly.platform.core.datamodel.define.FlyMemoryDataModel;
import org.myfly.platform.core.domain.RestApiInfo;
import org.myfly.platform.core.domain.RestControllerInfo;
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
						new RestApiInfo("elements/{apiName}", "getElementByApiName", HttpMethod.GET),
						new RestApiInfo("datatypes/{apiName}", "getDataTypeByApiName", HttpMethod.GET),
						new RestApiInfo("datatypes", "getDataTypes", HttpMethod.GET),
						new RestApiInfo("entitytypes", "getEntityTypes", HttpMethod.GET),
						new RestApiInfo("reftables", "getRefTables", HttpMethod.GET),
						new RestApiInfo("reftables/{apiName}", "getRefTables", HttpMethod.GET),
						new RestApiInfo("reflists", "getRefLists", HttpMethod.GET),
						new RestApiInfo("reflists/{apiName}", "getRefTables", HttpMethod.GET),
						new RestApiInfo("dm", "getFlyDataModelNames", HttpMethod.GET),
						new RestApiInfo("dm/{entityName}", "getFlyDataModelByName", HttpMethod.GET),
						new RestApiInfo("dm/{entityName}/{columnName}", "getFlyColumnByName", HttpMethod.GET) });
	}

	private FlyMemoryDataModel getFlyMemoryDataModel() {
		return FlyMemoryDataModel.getInstance();
	}

	@GetMapping("datatypes")
	public Map<String, FDataType> getDataTypes() {
		return getFlyMemoryDataModel().getDataTypes();
	}

	@GetMapping("datatypes/{apiName}")
	public FDataType getDataTypeByApiName(@PathVariable("apiName") String apiName) {
		return getDataTypes().get(apiName);
	}

	@GetMapping("elements")
	public Map<String, FElement> getElements() {
		return getFlyMemoryDataModel().getElements();
	}

	@GetMapping("elements/{apiName}")
	public FElement getElementByApiName(@PathVariable("apiName") String apiName) {
		return getElements().get(apiName);
	}

	@GetMapping("entitytypes")
	public Map<String, FEntityType> getEntityTypes() {
		return getFlyMemoryDataModel().getEntityTypes();
	}

	@GetMapping("entitytypes/{apiName}")
	public FEntityType getEntityTypeByApiName(@PathVariable("apiName") String apiName) {
		return getFlyMemoryDataModel().getEntityTypes().get(apiName);
	}

	@GetMapping("reftables")
	public Map<String, FRefTable> getRefTables() {
		return getFlyMemoryDataModel().getRefTables();
	}

	@GetMapping("reftables/{apiName}")
	public FRefTable getRefTableByApiName(@PathVariable("apiName") String apiName) {
		return getRefTables().get(apiName);
	}

	@GetMapping("reflists")
	public Map<String, FRefList> getRefLists() {
		return getFlyMemoryDataModel().getRefLists();
	}

	@GetMapping("reflists/{apiName}")
	public FRefList getRefListByApiName(@PathVariable("apiName") String apiName) {
		return getRefLists().get(apiName);
	}

	@GetMapping("dm/{entityName}")
	public FlyDataModel getFlyDataModelByName(@PathVariable("entityName") String entityName) {
		return getFlyMemoryDataModel().getFlyDataModel(entityName);
	}

	@GetMapping("dm/{entityName}/{columnName}")
	public FlyColumn getFlyColumnByName(@PathVariable("entityName") String entityName,
			@PathVariable("columnName") String columnName) {
		return getFlyMemoryDataModel().getFlyDataModel(entityName).getColumnMap().get(columnName);
	}

	@GetMapping("dm")
	public Set<String> getFlyDataModelNames() {
		return getFlyMemoryDataModel().getFlyDataModels().keySet();
	}
}
