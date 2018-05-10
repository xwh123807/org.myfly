package org.myfly.cloud.service.feign;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControler {
	@Autowired
	UserService userService;

	@RequestMapping("/list")
	public List list() {
		return userService.list();
	}
}
