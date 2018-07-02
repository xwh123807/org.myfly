package org.myfly.platform.core3.metadata.builder;

import org.myfly.platform.core3.dbinit.TableImporter;
import org.myfly.platform.core3.domain.IFlyEntity;
import org.myfly.platform.core3.metadata.define.FlyDataModel;
import org.myfly.platform.core3.metadata.service.IFlyDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FlyDataModelBuilder2 {
	@Autowired
	private TableImporter tableImporter;

	private IFlyDataModel dataModel;

	public void build(Class<? extends IFlyEntity> entityClass) {
		tableImporter.load(entityClass);
		dataModel = tableImporter.getFlyDataModel();
	}
	
	public FlyDataModel getFlyDataModel() {
		
	}
}
