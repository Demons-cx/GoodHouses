package com.xin.controller;

import com.xin.common.model.User;
import com.xin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: ChenXin
 * @time: 2019/12/18 2:45 下午
 */
@Controller
public class HelloController {

    @Autowired
    private UserService userService;


    @RequestMapping("hello")
    public String hello(ModelMap modelMap){
        List<User> users = userService.getUsers();
        User user = users.get(0);
        modelMap.put("user",user);
        return "hello";
    }


    @RequestMapping("index")
    public String index(){
        return "homepage/index";
    }
}
