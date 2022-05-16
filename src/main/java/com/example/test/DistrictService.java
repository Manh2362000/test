package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {
    @Autowired
    private DistrictRepository districtRepository;
    public List<District> findAll(){
        return districtRepository.findAll();
    }

    public District save(District district){
        districtRepository.save(district);
        return district;
    }
}