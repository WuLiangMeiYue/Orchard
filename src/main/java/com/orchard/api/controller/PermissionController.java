package com.orchard.api.controller;

import com.orchard.api.mapper.PermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    private PermissionMapper permissionMapper;

    @RequestMapping("toList")
    public String toList() {
        return "";
    }
}
