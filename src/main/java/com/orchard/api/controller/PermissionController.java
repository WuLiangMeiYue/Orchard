package com.orchard.api.controller;

import com.orchard.api.mapper.PermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/permission")
@Controller
public class PermissionController {

    @Autowired
    @Qualifier("PermissionMapper")
    private PermissionMapper permissionMapper;

    @RequestMapping("toList")
    public String toList() {
        return "";
    }
}
