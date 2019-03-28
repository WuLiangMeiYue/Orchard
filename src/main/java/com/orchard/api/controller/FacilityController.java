package com.orchard.api.controller;

import com.orchard.api.mapper.FacilityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/facility")
public class FacilityController {

    @Autowired
    private FacilityMapper facilityMapper;

    @RequestMapping("toList")
    public String toList(){
        return "";
    }

}
