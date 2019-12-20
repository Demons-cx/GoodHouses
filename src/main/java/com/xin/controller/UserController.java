package com.xin.controller;

import com.xin.common.model.User;
import com.xin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: ChenXin
 * @time: 2019/11/27 5:04 下午
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getUser")
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
