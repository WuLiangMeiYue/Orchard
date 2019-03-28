package com.orchard.api.controller;

import com.orchard.api.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleMapper roleMapper;

    @RequestMapping("toList")
    public String toList() {
        return "";
    }
}
