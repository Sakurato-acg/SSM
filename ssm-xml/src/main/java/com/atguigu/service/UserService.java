package com.atguigu.service;

import com.atguigu.pojo.User;

public interface UserService {

    public User login(User user);

    public boolean register(User user);

    public boolean check(String username);

    public boolean checkEmail(String email);

    public void reSet(User user);
}
