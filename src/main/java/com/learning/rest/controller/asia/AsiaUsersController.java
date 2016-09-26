package com.learning.rest.controller.asia;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.rest.User;

//http://localhost:8080/twoServletDispatcher/asia/user/zubin/28/837

@RestController
@RequestMapping(value = "/user")
public class AsiaUsersController {

	@RequestMapping(value = "/{name}/{age}/{salary}", method = RequestMethod.GET, produces = "application/json")
	public User process(
			@PathVariable("name") String name,
			@PathVariable("age") String age,
			@PathVariable("salary") String salary,			
			@RequestParam(value = "id", required = false, defaultValue = "00000") final String id) {
		User user = new User();
		user.setId(Long.valueOf(id));		
		user.setName(name);
		user.setAge(age);
		user.setSalary(salary);
		user.setRegion("Asia");
		return user;
	}
	
}
