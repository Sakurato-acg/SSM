package com.atguigu.service.impl;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.select(user);
    }

    @Override
    @Transactional
    public boolean register(User user) {
        boolean check = check(user.getUsername());
        if (check) {
            userMapper.update(user);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean check(String username) {
        String selectName = userMapper.selectName(username);
        return selectName == null;
    }

    @Override
    public boolean checkEmail(String email) {
        String selectEmail = userMapper.selectEmail(email);
        return selectEmail != null;
    }


    @Transactional
    public void reSet(User user) {
        userMapper.reSet(user);
    }
}
