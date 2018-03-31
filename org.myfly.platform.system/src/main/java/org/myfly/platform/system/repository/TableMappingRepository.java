package org.myfly.platform.system.repository;

import org.myfly.platform.system.domain.TableMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableMappingRepository extends JpaRepository<TableMapping, String>{

	TableMapping findByTableName(String lowerCase);

}
