package com.example.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.bean.User;
import org.springframework.stereotype.Component;

/**
 * @author lanyang
 * @description:
 * @create: 2019-11-19 20:58
 **/
@Service
@Component
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(int id) {
        User user = new User();
        user.setId(id);
        user.setName("张三");
        user.setUsername("test");
        user.setAddress("青岛");
        return user;
    }
}
