package com.orchard.api.controller;

import com.orchard.api.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/role")
@Controller
public class RoleController {

    @Autowired
    @Qualifier("RoleMapper")
    private RoleMapper roleMapper;

    @RequestMapping("toList")
    public String toList() {
        return "";
    }
}
