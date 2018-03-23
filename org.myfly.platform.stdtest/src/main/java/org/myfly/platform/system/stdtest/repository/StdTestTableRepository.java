package org.myfly.platform.system.stdtest.repository;

import org.myfly.platform.system.stdtest.domain.StdTestTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="stdtesttable", path="stdtesttable")
public interface StdTestTableRepository extends JpaRepository<StdTestTable, String>{

}
