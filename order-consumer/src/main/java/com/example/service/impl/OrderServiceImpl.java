package com.example.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.bean.User;
import com.example.service.OrderService;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author lanyang
 * @description:
 * @create: 2019-11-19 21:12
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    private UserService userService;

    public User initOrder(int userId){

        User user = userService.getUser(userId);
        return user;
    }
}
