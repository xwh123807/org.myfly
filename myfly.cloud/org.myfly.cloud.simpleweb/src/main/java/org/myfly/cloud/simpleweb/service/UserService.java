package org.myfly.cloud.simpleweb.service;

import java.util.List;

import org.myfly.cloud.simpleweb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class UserService {
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand
	public List<User> searchAll(){
		return restTemplate.getForObject("http://localhost:9080/user", List.class);
	}
}
