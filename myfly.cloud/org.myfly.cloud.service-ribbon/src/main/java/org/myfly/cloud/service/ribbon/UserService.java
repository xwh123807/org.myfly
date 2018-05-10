package org.myfly.cloud.service.ribbon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
	@Autowired
	RestTemplate restTemplate;

	public List list() {
		return restTemplate.getForObject("http://SIMPLESERVICE/list", List.class);
	}
}
