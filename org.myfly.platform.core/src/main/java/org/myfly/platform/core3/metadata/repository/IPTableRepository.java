package org.myfly.platform.core3.metadata.repository;

import javax.annotation.Resource;

import org.myfly.platform.core3.metadata.service.IFlyDataModel;
import org.myfly.platform.core3.model.data.PTable;
import org.springframework.data.repository.PagingAndSortingRepository;

@Resource
public interface IPTableRepository extends PagingAndSortingRepository<PTable, String>{
	IFlyDataModel findByApiName(String apiName);
}
