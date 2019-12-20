package com.xin.service.impl;

import com.xin.common.model.User;
import com.xin.mapper.UserMapper;
import com.xin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: ChenXin
 * @time: 2019/11/27 5:24 下午
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.selectUsers();
    }
}
