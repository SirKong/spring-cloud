package com.ccnu.etrading.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ccnu.etrading.consumer.service.ComputeService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * Created by gyb on 16/11/21.
 */
@RestController
public class ConsumerController {
	@Autowired
	ComputeService computeService;

	@HystrixCommand(fallbackMethod = "addServiceFallback")
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		return computeService.addService();
	}

	public String addServiceFallback() {
		return "error";
	}
}
