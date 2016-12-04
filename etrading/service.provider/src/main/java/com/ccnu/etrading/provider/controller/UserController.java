package com.ccnu.etrading.provider.controller;

import com.ccnu.etrading.domain.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ccnu.etrading.provider.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final Log logger = LogFactory.getLog(UserController.class);

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Long addUser(User user) {
	    logger.info("UserController.addUser param:"+user);
		return userService.add(user);
	}
}
