package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/districts")
public class DistrictApi {
    @Autowired
    private DistrictService districtService;

    @RequestMapping(method = RequestMethod.POST)
    public District save(@RequestBody District district){
        return districtService.save(district);
    }


    @RequestMapping(method = RequestMethod.GET)
    public List<District> findAll(){
        return districtService.findAll();
    }
}
