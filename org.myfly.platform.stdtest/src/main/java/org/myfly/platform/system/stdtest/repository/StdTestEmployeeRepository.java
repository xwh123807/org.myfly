package org.myfly.platform.system.stdtest.repository;

import org.myfly.platform.system.stdtest.domain.StdTestEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StdTestEmployeeRepository extends JpaRepository<StdTestEmployee, String>{

}
