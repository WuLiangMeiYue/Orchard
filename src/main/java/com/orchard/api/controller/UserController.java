package com.orchard.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/")
@Controller
public class UserController {

    @RequestMapping("/")
    public String toLogin() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(name = "userName") String userName, @RequestParam(name = "password") String password) {
        System.out.println();
        System.out.println("账号：" + userName + "\n密码：" + password);
        System.out.println();
        return "dashboard";
    }
}
