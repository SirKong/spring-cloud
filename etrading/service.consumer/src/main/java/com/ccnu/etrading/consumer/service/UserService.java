package com.ccnu.etrading.consumer.service;

import com.ccnu.etrading.domain.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by gyb on 2016/12/4.
 */
@Service
public class UserService {

    private static final Log logger = LogFactory.getLog(UserService.class);

    @Autowired
    private RestTemplate restTemplate;

    public String addUser(User user) {

        try {
            return restTemplate.postForObject("http://SERVICE.PROVIDER/user/add", user, String.class);
        } catch (Exception e) {
            logger.error("UserService.addUser error" + e);
            return null;
        }
    }
}
