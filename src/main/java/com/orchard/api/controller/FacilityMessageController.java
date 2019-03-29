package com.orchard.api.controller;

import com.orchard.api.mapper.FacilityMessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/facilityMessage")
@Controller
public class FacilityMessageController {

    @Autowired
    @Qualifier("FacilityMessageMapper")
    private FacilityMessageMapper messageMapper;

    @RequestMapping("toList")
    public String toList() {
        return "";
    }
}
