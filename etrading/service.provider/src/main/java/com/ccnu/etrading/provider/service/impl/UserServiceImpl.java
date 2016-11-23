package com.ccnu.etrading.provider.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccnu.etrading.provider.dao.UserDao;
import com.ccnu.etrading.provider.domain.User;
import com.ccnu.etrading.provider.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static final Log logger = LogFactory.getLog(UserService.class);

	@Autowired
	private UserDao userDao;

	@Override
	public User queryByName(String name) {
		return userDao.findByName(name);
	}

	@Override
	public Long add(User user) {
		logger.info("新增用户" + user);
		return userDao.insert(user.getName(), user.getAge());
	}

}
