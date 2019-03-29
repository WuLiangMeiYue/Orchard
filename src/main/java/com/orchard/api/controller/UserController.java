package com.orchard.api.controller;

import com.orchard.api.entity.Test;
import com.orchard.api.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/")
@Controller
public class UserController {

    @Autowired
    @Qualifier("UserMapper")
    private UserMapper usermapper;

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
    @RequestMapping("/test")
    public void test(){
        List<Test> s=usermapper.findtestAll();
        System.out.println(s);
    }
}
