package com.song.demo.controller;

import com.song.demo.domain.City;
import com.song.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value =  "/api/city/{id}",method = RequestMethod.GET)
    public City findOneCity(@PathVariable("id") Long id){
        return cityService.findById(id);
    }

    @RequestMapping(value = "/api/city",method = RequestMethod.GET)
    public List<City> findAllCity() {
        return cityService.findAllCity();
    }

    @RequestMapping(value = "/api/city",method = RequestMethod.POST)
    public void createCity(@RequestBody City city){
        cityService.saveCity(city);
    }

    @RequestMapping(value = "/api/city",method = RequestMethod.PUT)
    public void modifyCity(@RequestBody City city){
        cityService.updateCity(city);
    }

    @RequestMapping(value = "/api/city",method = RequestMethod.DELETE)
    public void deleteCity(@PathVariable("id") Long id){
        cityService.deleteCity(id);
    }

}
