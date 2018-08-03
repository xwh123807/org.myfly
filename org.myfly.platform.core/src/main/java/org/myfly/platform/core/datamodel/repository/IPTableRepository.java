package org.myfly.platform.core.datamodel.repository;

import javax.annotation.Resource;

import org.myfly.platform.core.model.PTable;
import org.springframework.data.repository.PagingAndSortingRepository;

@Resource
public interface IPTableRepository extends PagingAndSortingRepository<PTable, String>{
	PTable findByApiName(String apiName);
}
