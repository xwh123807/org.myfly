package org.myfly.platform.core3.datamodel.repository;

import javax.annotation.Resource;

import org.myfly.platform.core3.model.PTable;
import org.springframework.data.repository.PagingAndSortingRepository;

@Resource
public interface IPTableRepository extends PagingAndSortingRepository<PTable, String>{
	PTable findByApiName(String apiName);
}
