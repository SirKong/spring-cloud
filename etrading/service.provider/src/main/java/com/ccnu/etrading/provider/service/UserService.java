package com.ccnu.etrading.provider.service;

import com.ccnu.etrading.domain.User;

public interface UserService {

	User queryByName(String name);
	
	Long add(User user);
}
