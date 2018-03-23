package org.myfly.cloud.simpleweb.service;

import java.util.List;

import org.myfly.cloud.simpleweb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserControl {
	@Autowired
	private UserService userService;
	
	@RequestMapping()
	public List<User> searchAll(){
		return userService.searchAll();
	}
}
