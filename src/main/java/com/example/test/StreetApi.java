package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/streets")
public class StreetApi {
    @Autowired
    private StreetService streetService;
    @RequestMapping(method = RequestMethod.GET)
    public Page<Street> getList(@RequestParam(defaultValue = "1") int page,
                                 @RequestParam(defaultValue = "1") int limit) {
        return streetService.findAll(page, limit);
    }


    @RequestMapping(method = RequestMethod.POST)
    public Street save(@RequestBody Street street) {
        streetService.save(street);
        return street;
    }
}