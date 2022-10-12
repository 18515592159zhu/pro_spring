package com.atguigu.spring.controller;

import com.atguigu.spring.service.UserService;

/**
 * @Author zhuchifeng
 * @Date 2022/9/30 6:49
 * @Version 1.0
 */
public class UserController {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser() {
        userService.saveUser();
    }
}
