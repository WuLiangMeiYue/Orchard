package com.orchard.api.controller;

import com.orchard.api.mapper.FacilityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class FacilityController {

    @Autowired
    private FacilityMapper facilityMapper;

    @RequestMapping("/facility/toList")
    public String toList(){
        return "dashboard";
    }

}
