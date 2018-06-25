package org.myfly.platform.core3.metadata.internal;

import org.myfly.platform.core3.metadata.service.IFlyViewModel;
import org.myfly.platform.core3.metadata.service.IFlyViewModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/viewmodel")
public class FlyViewModelRestService {
	@Autowired
	private IFlyViewModelService viewModelService;
	
	@RequestMapping("{uid}")
	public IFlyViewModel getFlyViewModelByUid(@PathVariable("uid") String uid) {
		return viewModelService.getFlyViewModelByUid(uid);
	}
}
