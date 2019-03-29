package com.orchard.api.controller;

import com.orchard.api.mapper.ThresholdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/threshold")
@Controller
public class ThresholdController {

    @Autowired
    @Qualifier("ThresholdMapper")
    private ThresholdMapper thresholdMapper;

    @RequestMapping("toList")
    public String toList() {
        return "";
    }
}
