package com.ccnu.etrading.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ccnu.etrading.provider.domain.User;
import com.ccnu.etrading.provider.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/adduser", method = RequestMethod.GET)
	public Long addUser(@RequestParam String name, @RequestParam Integer age) {
		User user = new User();
		user.setAge(age);
		user.setName(name);
		return userService.add(user);
	}
}
