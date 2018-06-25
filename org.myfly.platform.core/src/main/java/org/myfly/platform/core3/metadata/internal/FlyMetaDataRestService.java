package org.myfly.platform.core3.metadata.internal;

import java.util.HashMap;
import java.util.Map;

import org.myfly.platform.core3.flydata.service.FlyEntityMap;
import org.myfly.platform.core3.flydata.service.IFlyDataService;
import org.myfly.platform.core3.model.data.PTable;
import org.myfly.platform.core3.model.view.PWindow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController("metadata")
public class FlyMetaDataRestService {
	@Autowired
	private IFlyDataService dataService;

	@GetMapping("data/{uid}")
	public FlyEntityMap getFlyDataModelByUid(@PathVariable("uid") String uid) {
		return dataService.findOne(PTable.class.getName(), uid);
	}
	
	@GetMapping("data/name/{entityName}")
	public FlyEntityMap getFlyDataModelByEntityName(@PathVariable("entityName") String entityName) {
		Map params = new HashMap<>();
		params.put("apiName", entityName);
		return dataService.findOne(PTable.class.getName(), entityName);
	}

	@GetMapping("view/{uid}")
	public FlyEntityMap getFlyViewModelByUid(@PathVariable("uid") String uid) {
		return dataService.findOne(PWindow.class.getName(), uid);
	}
}
