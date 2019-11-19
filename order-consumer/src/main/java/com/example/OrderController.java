package com.example;

import com.example.bean.User;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lanyang
 * @description:
 * @create: 2019-11-19 21:19
 **/
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("init/{id}")
    public User init(@PathVariable Integer id){
        User user = orderService.initOrder(id);
        return user;
    }
}
