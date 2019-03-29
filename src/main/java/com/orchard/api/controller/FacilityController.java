package com.orchard.api.controller;

import com.orchard.api.mapper.FacilityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class FacilityController {

    @Autowired
    @Qualifier("FacilityMapper")
    private FacilityMapper facilityMapper;

    @RequestMapping("/toList")
    public String toList(){
            System.out.println(facilityMapper);
        return "dashboard";
    }

}
