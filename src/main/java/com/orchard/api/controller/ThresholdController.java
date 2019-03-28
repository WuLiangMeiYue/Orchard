package com.orchard.api.controller;

import com.orchard.api.mapper.ThresholdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/threshold")
public class ThresholdController {

    @Autowired
    private ThresholdMapper thresholdMapper;

    @RequestMapping("toList")
    public String toList() {
        return "";
    }
}
