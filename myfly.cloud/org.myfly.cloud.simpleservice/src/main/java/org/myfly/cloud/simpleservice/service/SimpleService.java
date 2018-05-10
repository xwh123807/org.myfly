package org.myfly.cloud.simpleservice.service;

import java.util.List;

import org.myfly.cloud.simpleservice.domain.SUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleService {
	@Autowired
	private UserRepostory userRepo;

	@RequestMapping("list")
	public List<SUser> list() {
		return userRepo.findAll();
	}
}
