package com.controller;

import com.domain.City;
import com.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public City findOneCity() {
        City city = cityService.findCityByName("石家庄");
        System.out.println(city.getCityName());
        return city;
    }

}
