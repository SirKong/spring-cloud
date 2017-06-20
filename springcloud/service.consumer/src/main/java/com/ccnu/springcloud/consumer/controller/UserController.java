package com.ccnu.springcloud.consumer.controller;

import com.ccnu.springcloud.consumer.service.UserService;
import com.ccnu.springcloud.domain.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by gyb on 2016/12/4.
 */
@Controller
@RequestMapping("/client/user")
public class UserController {

    @Autowired
    private UserService userService;

    @HystrixCommand(fallbackMethod = "fallback")
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addUser(@RequestParam("name") String name, @RequestParam("age") String age) {
        User user = new User();
        user.setAge(Integer.parseInt(age));
        user.setName(name);
        return userService.addUser(user);
    }

    public String fallback(String name, String age) {
        return "999";
    }
}
