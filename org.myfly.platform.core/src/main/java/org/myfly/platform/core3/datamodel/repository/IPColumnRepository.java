package org.myfly.platform.core3.datamodel.repository;

import java.util.List;

import javax.annotation.Resource;

import org.myfly.platform.core3.model.PColumn;
import org.springframework.data.repository.PagingAndSortingRepository;

@Resource
public interface IPColumnRepository extends PagingAndSortingRepository<PColumn, String>{
	List<PColumn> findByTableID(String tableID);
}
