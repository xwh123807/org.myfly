package org.myfly.platform.metadata.repository;

import org.myfly.platform.metadata.domain.MView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "mview", path = "mview")
public interface MViewRepository extends JpaRepository<MView, String>{

}
