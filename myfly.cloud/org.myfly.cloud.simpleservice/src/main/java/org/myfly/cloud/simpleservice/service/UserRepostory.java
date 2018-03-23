package org.myfly.cloud.simpleservice.service;

import org.myfly.cloud.simpleservice.domain.SUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepostory extends JpaRepository<SUser, String>{

}
