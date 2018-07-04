package org.myfly.platform.core3.dbinit;

import org.myfly.platform.core.flydata.service.IJpaDataAccessService;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class ModelImporter {
	@Autowired
	private IJpaDataAccessService dataService;

	public IJpaDataAccessService getDataService() {
		return dataService;
	}

	public void setDataService(IJpaDataAccessService dataService) {
		this.dataService = dataService;
	}
}
