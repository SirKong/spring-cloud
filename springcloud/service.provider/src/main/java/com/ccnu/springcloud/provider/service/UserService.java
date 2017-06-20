package com.ccnu.springcloud.provider.service;

import com.ccnu.springcloud.domain.User;

public interface UserService {

	User queryByName(String name);
	
	Long add(User user);
}
