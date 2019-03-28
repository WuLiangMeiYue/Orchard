package com.orchard.api.controller;

import com.orchard.api.mapper.FacilityMessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/facilityMessage")
public class FacilityMessageController {

    @Autowired
    private FacilityMessageMapper messageMapper;

    @RequestMapping("toList")
    public String toList() {
        return "";
    }
}
