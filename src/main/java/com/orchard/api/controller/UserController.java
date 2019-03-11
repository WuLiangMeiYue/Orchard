package com.orchard.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class UserController {

    @RequestMapping("/")
    public String toLogin() {
        return "login";
    }
}
