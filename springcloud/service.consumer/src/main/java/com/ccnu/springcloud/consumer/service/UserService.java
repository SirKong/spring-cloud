package com.ccnu.springcloud.consumer.service;

import com.ccnu.springcloud.domain.User;
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
            return restTemplate.postForObject("http://PROVIDER/user/add", user, String.class);
        } catch (Exception e) {
            logger.error("UserService.addUser error" + e);
            return null;
        }
    }

    public User getUser(Long id) {

        try {

            return restTemplate.getForObject("http://PROVIDER/user/get/" + id, User.class);
            //return restTemplate.postForObject("http://PROVIDER/user/add", user, String.class);
        } catch (Exception e) {
            logger.error("UserService.addUser error" + e);
            return null;
        }
    }
}
