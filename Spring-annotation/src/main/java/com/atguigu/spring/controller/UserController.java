package com.atguigu.spring.controller;

import com.atguigu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Date:2022/7/2
 * Author:ybc
 * Description:
 */
@Controller("controller")
public class UserController {

    //@Autowired(required = false)
    //@Qualifier("userServiceImpl")
    @Autowired
    public UserService userService;

    /*public UserController(UserService userService) {
        this.userService = userService;
    }*/

    /*public void setUserService(UserService userService) {
        this.userService = userService;
    }*/

    public void saveUser(){
        userService.saveUser();
    }

}
