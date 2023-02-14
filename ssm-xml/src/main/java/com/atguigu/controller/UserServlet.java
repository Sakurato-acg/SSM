package com.atguigu.controller;


import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("/user")
public class UserServlet {

    @Autowired
    private UserService userService;


    @PostMapping("/{remember}")
    public User login(@CookieValue(value = "username", required = false) String username,
                      @CookieValue(value = "password", required = false) String password,
                      @RequestBody User user,
                      @PathVariable Boolean remember,
                      HttpServletResponse response,
                      HttpSession session) {
        response.setHeader("Access-Control-Allow-Credentials", "true");
        User login = userService.login(user);
        if (login != null) {
            //登录成功
            if (remember) {
                if ((username == null || !username.equals(login.getUsername())) && (password == null || !password.equals(login.getPassword()))) {
                    Cookie usernameCookie = new Cookie("username", login.getUsername());
                    Cookie passwordCookie = new Cookie("password", login.getPassword());
                    usernameCookie.setMaxAge(60 * 60 * 24*7);
                    passwordCookie.setMaxAge(60 * 60 * 24*7);
                    usernameCookie.setPath("/");
                    passwordCookie.setPath("/");
                    response.addCookie(usernameCookie);
                    response.addCookie(passwordCookie);
                }
            }
            session.setAttribute("user", login);
        }
        return login;
    }


    @GetMapping("/{id}")
    public String logout(@PathVariable("id") String id, HttpSession session) {
        session.invalidate();
        return "success";
    }

    @PostMapping()
    public String register(@RequestBody User user) {
        boolean register = userService.register(user);
        System.out.println(register);
        if (register) {
            //注册成功
            return "success";
        } else {
            return "false";
        }
    }

    @GetMapping("/account")
    public String checkEmail(String email, HttpSession session) {
        boolean checkEmail = userService.checkEmail(email);
        if (checkEmail) {
            session.setAttribute("email", email);
            return "success";
        } else {
            return "false";
        }
    }

    @PostMapping("/account")
    public String reSet(@RequestBody User user, HttpSession session) {

        Object email = session.getAttribute("email");
        user.setEmail((String) email);
        session.invalidate();
        userService.reSet(user);

        return "success";
    }
}
