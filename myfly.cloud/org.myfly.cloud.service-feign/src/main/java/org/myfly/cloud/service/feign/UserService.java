package org.myfly.cloud.service.feign;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "SIMPLESERVICE")
public interface UserService {
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List list();
}
